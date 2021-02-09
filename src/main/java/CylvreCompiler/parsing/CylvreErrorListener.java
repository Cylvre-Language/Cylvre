package CylvreCompiler.parsing;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CylvreErrorListener extends BaseErrorListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(CylvreErrorListener.class);

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String errorFormat = "Syntax error (line %d char %d) (;_;). Details: %n%s";
        String errorMsg = String.format(errorFormat, line, charPositionInLine, msg);
        LOGGER.error(errorMsg);
    }
}
