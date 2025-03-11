package wordtrace;

import constants.LogArgumentConstants;

import java.io.File;
import java.io.IOException;

public class IunputFileValidation {
    public static void inputFileCheck(String FileInputPath, String InputWord) throws IOException {
        System.out.println(LogArgumentConstants.ENTERED_INPUT_PATH + FileInputPath);
        System.out.println(LogArgumentConstants.ENTERED_INPUT_WORD + InputWord);
        File fileCheck = new File(FileInputPath);
        if (!(fileCheck.exists())){
            System.out.println(LogArgumentConstants.FILE_NOT_FOUND_MESSAGE);
            return;
        }
        if(!(fileCheck.isFile())) {
            System.out.println(LogArgumentConstants.NOT_FILE_MESSAGE);
            return;
        }
        if(!FileInputPath.endsWith(LogArgumentConstants.TEXT_EXTENSION_MESSAGE) && !FileInputPath.endsWith(LogArgumentConstants.JSON_EXTENSION_MESSAGE))
        {
            System.out.println(LogArgumentConstants.WRONG_EXTENSION_MESSAGE);
            return;
        }
        System.out.println(LogArgumentConstants.SUCCESS_MESSAGE);
        WordCount.matchingWordCount(FileInputPath, InputWord);



    }
}
