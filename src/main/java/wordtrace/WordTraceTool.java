package wordtrace;

import java.io.IOException;
/**
 * the main  class starts the wordtracetool
 */
public class WordTraceTool {
    /**
     * main method validate input arguments and start processing
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        InputFileValidation inputFileValidation = new InputFileValidation();
        if (inputFileValidation.validateArguments(args)) {
            WordCount.matchingWordCount(args[0],args[1]);
        }
    }
}