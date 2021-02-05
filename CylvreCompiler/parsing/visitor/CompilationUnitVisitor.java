package CylvreCompiler.parsing.visitor;

import Cylvre.antlr.gen.CylvreBaseVisitor;
import Cylvre.antlr.gen.CylvreParser;
import Cylvre.domain.CompilationUnit;
import Cylvre.domain.FileDeclaration;
import org.antlr.v4.runtime.misc.NotNull;

public class CompilationUnitVisitor extends CylvreBaseVisitor<CompilationUnit> {

    @Override
    public CompilationUnit visitCompilationUnit(@NotNull CylvreParser.CompilationUnitContext ctx) {
        FileVisitor fileVisitor = new FileVisitor();
        CylvreParser.FileDeclarationContext fileDeclarationContext = ctx.fileDeclaration();
        FileDeclaration fileDeclaration = fileDeclarationContext.accept(fileVisitor);
        return new CompilationUnit(fileDeclaration);
    }
}
