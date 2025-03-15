package wordtrace;

import java.io.IOException;
/**
 * The main  class starts the wordtracetool
 */
public class WordTraceTool {
    /**
     * Main method validate input arguments and start processing
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        String inputFilePath = args[0];
        String inputWord = args[1];
        InputFileValidation inputFileValidation = new InputFileValidation();
        if (inputFileValidation.validateArguments(args)) {
            FileWordCounter.findWordCountInFile(args[0],args[1]);
        }
    }
}
