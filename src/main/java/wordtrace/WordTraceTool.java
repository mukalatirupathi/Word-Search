package wordtrace;

import constants.InputFileConstants;

import java.io.File;
public class WordTraceTool {
    public static void main(String[] args) {
        String path = args[0];
        String word = args[1];
        System.out.println(InputFileConstants.EnteredPath + path);
        System.out.println(InputFileConstants.EnteredWord + word);
        File fileCheck = new File(path);
        if (fileCheck.exists() && fileCheck.isFile() && (path.endsWith(InputFileConstants.TextExtensionMessage) || path.endsWith(InputFileConstants.JsonExtensionMessage))) {
            System.out.println(InputFileConstants.TextMessage);
        } else {
            System.out.println(InputFileConstants.ErrorMessage);
        }
    }
}
