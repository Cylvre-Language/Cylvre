package Cylvre.domain.node.expression;

import java.util.List;

public interface Call extends Expression {
    List<Argument> getArguments();
    String getIdentifier();
}
