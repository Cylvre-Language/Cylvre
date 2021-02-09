package Cylvre.domain.node.statement;

import CylvreCompiler.bytecodegeneration.statement.StatementGenerator;
import Cylvre.domain.node.Node;

@FunctionalInterface
public interface Statement extends Node {
    void accept(StatementGenerator generator);
}
