package wordsearchtool.constants;

/**
 * This class contains constant string values used for error messages,
 * file validation,and success message in the WordSearch application
 */
public class WordSearchConstant {
    public static final String APPERED_WORD = " Times ";
    public static final String APPLICATION_PROPERTIES_PATH = "C:\\tirupathimukala\\WordSearch\\src\\main\\resources\\application.properties";
    public static final String DATABASE_RESULT_MSG = "Success";
    public static final String DATABASE_ERROR_MSG = "Error";
    public static final String EMPTY_FILE = "The entered file is empty";
    public static final String ERROR_INSUFFICIENT_ARGUMENTS = "We accept 2 inputs only. Please provide both the file path and the word to be searched";
    public static final String ERROR_MORE_ARGUMENTS = "The entered more than 2 arguments .please provide 2 arguments only ";
    public static final String ENTERED_INPUT_PATH = "The entered inputfilepath is :";
    public static final String ENTERED_INPUT_WORD = "The entered inputword is :";
    public static final String FILE_NOT_FOUND_MESSAGE = "File doesn't exist ";
    public static final String FILE_NOT_FOUND_ERROR_MESSAGE = "File doesn't exist ";
    public static final String JSON_EXTENSION_MESSAGE = ".json";
    public static final String NOT_FILE_MESSAGE = "The entered path is not a file ";
    public static final String QUERY_CONSTANT ="INSERT INTO audit (filepath, inputWord, search_time, result, wordCount, errorMesage) VALUES (?,?,NOW(),?,?,?)";
    public static final String REPLACING_CHARACTERS = "[^a-zA-Z0-9]";
    public static final String SEARCH_WORD = "The searched word will be appeared in this file is ";
    public static final String SUCCESS_MESSAGE = "Processing";
    public static final String TEXT_EXTENSION_MESSAGE = ".txt";
    public static final String WORD_NOT_FOUND_ERROR_MESSAGE = "Word not found";
    public static final String WRONG_EXTENSION_MESSAGE = "Entered wrong file extension. we accept only .txt and .json files";
}
