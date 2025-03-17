package wordtrace;
/**
 * The main  class starts the wordtracetool
 */
public class WordTraceTool {
    /**
     * Main method validate input arguments and start processing
     *
     * @param userArgs
     */
    public static void main(String[] userArgs) {

        InputFileValidation inputFileValidation = new InputFileValidation();
        try{
            if (inputFileValidation.validateArguments(userArgs)) {
                String inputFilePath = userArgs[0];
                String inputWord = userArgs[1];
                FileWordCounter.findWordCountInFile(inputFilePath,inputWord);
            }
        }
        catch(Exception ioexception){
            ioexception.getMessage();
        }
    }
}
