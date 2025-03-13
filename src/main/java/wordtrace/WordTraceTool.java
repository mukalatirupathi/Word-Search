package wordtrace;

import constants.LogArgumentConstants;
import java.io.File;

public class WordTraceTool {
    public static void main(String[] args){
        String path = args[0];
        String word = args[1];
        System.out.println(LogArgumentConstants.EnteredPath + path);
        System.out.println(LogArgumentConstants.EnteredWord + word);
        File fileCheck = new File(path);
        if (fileCheck.exists() && fileCheck.isFile() && (path.endsWith(LogArgumentConstants.TextExtensionMessage) || path.endsWith(LogArgumentConstants.JsonExtensionMessage))) {
            System.out.println(LogArgumentConstants.TextMessage);
        } else {
            System.out.println(LogArgumentConstants.ErrorMessage);
        }
    }
}
