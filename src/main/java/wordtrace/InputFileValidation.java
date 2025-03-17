package wordtrace;

import constants.WordSearchConstant;

import java.io.File;

/**
 * Validate file paths and input arguments
 */
public class InputFileValidation {
    /**
     * Checks the correct number of arguments are provided
     *
     * @param args
     * @return
     */
    public boolean validateArguments(String[] args) {
        if (args.length > 2) {
            System.out.println(WordSearchConstant.ERROR_MORE_ARGUMENTS);
            return false;
        }
        if (args.length < 2) {
            System.out.println(WordSearchConstant.ERROR_INSUFFICIENT_ARGUMENTS);
            return false;
        }
        return validateFilePath(args);
    }

    /**
     * Validate the file's existance ,type,and exension
     *
     * @param args
     * @return
     */
    private boolean validateFilePath(String[] args) {
        String inputFilePath = args[0];
        String inputWord = args[1];
        System.out.println(WordSearchConstant.ENTERED_INPUT_PATH + inputFilePath);
        System.out.println(WordSearchConstant.ENTERED_INPUT_WORD + inputWord);
        File fileCheck = new File(inputFilePath);
        if (!(fileCheck.exists())) {
            System.out.println(WordSearchConstant.FILE_NOT_FOUND_MESSAGE);
            return false;
        }
        if (!(fileCheck.isFile())) {
            System.out.println(WordSearchConstant.NOT_FILE_MESSAGE);
            return false;
        }
        if (!inputFilePath.endsWith(WordSearchConstant.TEXT_EXTENSION_MESSAGE) && !inputFilePath.endsWith(WordSearchConstant.JSON_EXTENSION_MESSAGE)) {
            System.out.println(WordSearchConstant.WRONG_EXTENSION_MESSAGE);
            return false;
        }
        System.out.println(WordSearchConstant.SUCCESS_MESSAGE);
        return true;
    }
}
