package wordtrace;

/**
 * the main  class starts the wordtracetool
 */
public class WordTraceTool {
    /**
     * main method validate input arguments and start processing
     * @param args
     */
    public static void main(String[] args) {
        InputFileValidation inputFileValidation = new InputFileValidation();
        if (!inputFileValidation.validateArguments(args)) {
        }
    }
}
