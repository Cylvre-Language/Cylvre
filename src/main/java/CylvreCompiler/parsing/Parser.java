package CylvreCompiler.parsing;

import Cylvre.antlr.gen.CylvreLexer;
import Cylvre.antlr.gen.CylvreParser;
import Cylvre.domain.CompilationUnit;
import CylvreCompiler.parsing.visitor.CompilationUnitVisitor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Parser {
    public CompilationUnit getCompilationUnit(String fileAbsolutePath) throws IOException {
        CharStream charStream = new ANTLRFileStream(fileAbsolutePath);
        CylvreLexer lexer = new CylvreLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CylvreParser parser = new CylvreParser(tokenStream);

        CompilationUnitVisitor compilationUnitVisitor = new CompilationUnitVisitor();
        return parser.compilationUnit().accept(compilationUnitVisitor);
    }
}
