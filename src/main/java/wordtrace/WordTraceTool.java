package wordtrace;
import constants.LogArgumentConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class WordTraceTool {
    public static void main(String[] args) throws Exception {
        int count = 0;
        String path = args[0];
        String word = args[1];
        System.out.println(LogArgumentConstants.EnteredPath +path );
        System.out.println(LogArgumentConstants.EnteredWord + word);
        File filecheck = new File(path);
        if (filecheck.exists()&& filecheck.isFile() && (path.endsWith(LogArgumentConstants.TextExtensionMessage) || path.endsWith(LogArgumentConstants.JsonExtensionMessage))) {
            System.out.println(LogArgumentConstants.TextMessage);
        } else {
            System.out.println(LogArgumentConstants.ErrorMessage);
        }
        try {
            BufferedReader bufferedReader= new BufferedReader(new FileReader(path) );
            String Text ="";
            String Line ;
            while ((Line = bufferedReader.readLine())!=null) {
                Text += Line;
            }
            String[] Words = Text.split("\\s+");
            for (int i = 0; i < Words.length; i++) {
                if (Words[i].equals(word)) {
                    count += 1;
                }
            }
4            System.out.println(LogArgumentConstants.SearchedWord+ count + LogArgumentConstants.ApperedWord);
            //fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception();
        } finally {
        }
    }
}





