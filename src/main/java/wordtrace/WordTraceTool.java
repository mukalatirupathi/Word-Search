package wordtrace;

public class WordTraceTool {
    public static void main(String[] args) throws Exception {
        String fileInputPath = args[0];
        String inputWord = args[1];
        InputFileValidation.validateFilePath(fileInputPath, inputWord);
    }
}