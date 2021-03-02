package CylvreCompiler.parsing.visitor.statement;

import gen.CylvreBaseVisitor;
import gen.CylvreParser;
import Cylvre.domain.node.statement.ScannerStatement;
import org.jetbrains.annotations.NotNull;

public class ScannerStatementVisitor extends CylvreBaseVisitor<ScannerStatement> {
    public ScannerStatementVisitor(){
        //left empty because ScannerStatement Doesn't need any external Visitors
    }

    @Override
    public ScannerStatement visitScannerStatement(@NotNull CylvreParser.ScannerStatementContext ctx){
        return new ScannerStatement();
    }

}
