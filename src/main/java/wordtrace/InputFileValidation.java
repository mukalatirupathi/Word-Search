package wordtrace;

import constants.FileInputConstant;

import java.io.File;

/**
 * validate file paths and input arguments
 */
public class InputFileValidation {
    /**
     * checks the correct number of arguments are provided
     *
     * @param args
     * @return
     */
    public boolean validateArguments(String[] args) {
        if (args.length > 2) {
            System.out.println(FileInputConstant.ERROR_MORE_ARGUMENTS);
            return false;
        }
        if (args.length < 2) {
            System.out.println(FileInputConstant.ERROR_INSUFFICIENT_ARGUMENTS);
            return false;
        }
        return validateFilePath(args);
    }

    /**
     * validate the file's existance ,type,and extension
     *
     * @param args
     * @return
     */
    private boolean validateFilePath(String[] args) {
        String inputFilePath = args[0];
        String inputWord = args[1];
        System.out.println(FileInputConstant.ENTERED_INPUT_PATH + inputFilePath);
        System.out.println(FileInputConstant.ENTERED_INPUT_WORD + inputWord);
        File fileCheck = new File(inputFilePath);
        if (!(fileCheck.exists())) {
            System.out.println(FileInputConstant.FILE_NOT_FOUND_MESSAGE);
            return false;
        }
        if (!(fileCheck.isFile())) {
            System.out.println(FileInputConstant.NOT_FILE_MESSAGE);
            return false;
        }
        if (!inputFilePath.endsWith(FileInputConstant.TEXT_EXTENSION_MESSAGE) && !inputFilePath.endsWith(FileInputConstant.JSON_EXTENSION_MESSAGE)) {
            System.out.println(FileInputConstant.WRONG_EXTENSION_MESSAGE);
            return false;
        }
        System.out.println(FileInputConstant.SUCCESS_MESSAGE);
        return true;
    }
}
