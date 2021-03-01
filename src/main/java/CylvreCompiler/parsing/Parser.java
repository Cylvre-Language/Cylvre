package CylvreCompiler.parsing;

import Cylvre.domain.CompilationUnit;
import CylvreCompiler.parsing.visitor.CompilationUnitVisitor;
import gen.CylvreLexer;
import gen.CylvreParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Paths;

public class Parser {
    public CompilationUnit getCompilationUnit(String fileAbsolutePath) throws IOException {
        CharStream charStream = CharStreams.fromPath(Paths.get(fileAbsolutePath));
        CylvreLexer lexer = new CylvreLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CylvreParser parser = new CylvreParser(tokenStream);

        CompilationUnitVisitor compilationUnitVisitor = new CompilationUnitVisitor();
        return parser.compilationUnit().accept(compilationUnitVisitor);
    }
}
