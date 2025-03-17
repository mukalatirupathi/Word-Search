package constants;

/**
 * The class defines all the constants used for file input validation and error handling
 * it includes messages for success,error,etc...
 */

public class FileInputConstant {
    public static final String ERROR_INSUFFICIENT_ARGUMENTS = "we accept 2 inputs only. Please provide both the file path and the word to be searched";
    public static final String ERROR_MORE_ARGUMENTS = "The entered more than 2 arguments .please provide 2 arguments only ";
    public static final String ENTERED_INPUT_PATH = "The entered inputfilepath is ---> ";
    public static final String ENTERED_INPUT_WORD = "The entered inputword is ----> ";
    public static final String FILE_NOT_FOUND_MESSAGE = "file doesn't exist ";
    public static final String JSON_EXTENSION_MESSAGE = ".json";
    public static final String NOT_FILE_MESSAGE = "The entered path is not a file ";
    public static final String SUCCESS_MESSAGE = "Processing";
    public static final String TEXT_EXTENSION_MESSAGE = ".txt";
    public static final String WRONG_EXTENSION_MESSAGE = "Entered wrong file extension. we accept only .txt and .json files";
}
