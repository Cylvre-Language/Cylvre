package CylvreCompiler.compiler;

import Cylvre.validation.ARGUMENT_ERRORS;
import CylvreCompiler.bytecodegeneration.BytecodeGenerator;
import Cylvre.domain.CompilationUnit;
import CylvreCompiler.parsing.Parser;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Paths;

public class Forge {
    public File cylvreFile;

    private static final Logger LOGGER = LoggerFactory.getLogger(Forge.class);
    public long start = System.nanoTime();

    public static void main(String[] args) throws Exception {
        try {
            new Forge().compile(args);
        } catch (IOException exception) {
            LOGGER.error("ERROR: " + exception.getMessage());
        }
    }
    public long end = System.nanoTime();

    public void compile(String[] args) throws Exception {
        ARGUMENT_ERRORS argumentsErrors = getArgumentValidationErrors(args);
        if (argumentsErrors != ARGUMENT_ERRORS.NONE) {
            String errorMessage = argumentsErrors.getMessage();
            LOGGER.error(errorMessage);
            return;
        }
        cylvreFile = new File(args[0]);
        String fileAbsolutePath = cylvreFile.getAbsolutePath();
        LOGGER.info("Parsing '{}'...", cylvreFile.getAbsolutePath());
        CompilationUnit compilationUnit = new Parser().getCompilationUnit(fileAbsolutePath);
        LOGGER.info("Finished Parsing. Compiling to bytecode...");
        saveBytecodeToClassFile(cylvreFile.getName(), compilationUnit);
    }

    private ARGUMENT_ERRORS getArgumentValidationErrors(String[] args) {
        if (args.length != 1) {
            return ARGUMENT_ERRORS.NO_FILE;
        }
        String filePath = args[0];
        if (!filePath.endsWith(".cyl")) {
            return ARGUMENT_ERRORS.BAD_FILE_EXTENSION;
        }
        return ARGUMENT_ERRORS.NONE;
    }

    public String time = String.valueOf((end - start) / 1000000);

    private void saveBytecodeToClassFile(String compiledFileName, CompilationUnit compilationUnit) throws IOException {
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator(compiledFileName);
        byte[] bytecode = bytecodeGenerator.generate(compilationUnit);
        String fileName = StringUtils.replace(compiledFileName, ".cyl", ".class");
        LOGGER.info("Finished Compiling. Saving bytecode to '{}'...", Paths.get(fileName).toAbsolutePath());
        OutputStream os = new FileOutputStream(fileName);
        IOUtils.write(bytecode, os);
        LOGGER.info("Successfully compiled in " + time + " ms. To run compiled file execute: 'java {}' in current dir", StringUtils.remove(fileName, ".class"));
    }
}
