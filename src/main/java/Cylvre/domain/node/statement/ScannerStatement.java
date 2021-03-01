package Cylvre.domain.node.statement;

import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;

public class ScannerStatement implements Statement{
    public ScannerStatement(){
        //empty as scanner is just a field
    }

    @Override
    public void accept(StatementGenerator generator){generator.generate(this);}
}
