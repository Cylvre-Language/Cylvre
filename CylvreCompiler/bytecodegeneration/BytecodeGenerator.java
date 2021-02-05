package CylvreCompiler.bytecodegeneration;

import Cylvre.domain.CompilationUnit;
import Cylvre.domain.FileDeclaration;
import CylvreCompiler.parsing.visitor.FileVisitor;

public class BytecodeGenerator {
    String fileName;

    public BytecodeGenerator(String fileName){
        this.fileName = fileName;
    }
    public byte[] generate(CompilationUnit compilationUnit) {
        FileDeclaration fileDeclaration = compilationUnit.getFileDeclaration();
        FileBytecodeGenerator fileBytecodeGenerator = new FileBytecodeGenerator();
        FileVisitor fileVisitor = new FileVisitor();
        fileVisitor.initializeFileVisitor(fileName);
        return fileBytecodeGenerator.generate(fileName,fileDeclaration).toByteArray();
    }
}
