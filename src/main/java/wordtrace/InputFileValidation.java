package wordtrace;
import constants.LogArgumentConstants;
import java.io.File;
import java.io.IOException;
public class InputFileValidation {
    public static void validateFilePath(String inputFilePath, String inputWord) throws IOException {
        System.out.println(LogArgumentConstants.ENTERED_INPUT_PATH + inputFilePath);
        System.out.println(LogArgumentConstants.ENTERED_INPUT_WORD + inputWord);
        File fileCheck = new File(inputFilePath);
        if(!inputFilePath.endsWith(LogArgumentConstants.TEXT_EXTENSION_MESSAGE) && !inputFilePath.endsWith(LogArgumentConstants.JSON_EXTENSION_MESSAGE))
        {
            System.out.println(LogArgumentConstants.WRONG_EXTENSION_MESSAGE);
            return;
        }
        if(!(fileCheck.isFile())) {
            System.out.println(LogArgumentConstants.NOT_FILE_MESSAGE);
            return;
        }
        if (!(fileCheck.exists())){
            System.out.println(LogArgumentConstants.FILE_NOT_FOUND_MESSAGE);
            return;
        }
        System.out.println(LogArgumentConstants.SUCCESS_MESSAGE);
        WordCount.matchingWordCount(inputFilePath, inputWord);
    }
}