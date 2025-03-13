package wordtrace;

import constants.FileInputConstant;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

    public static void matchingWordCount(String inputFilePath, String inputWord) throws IOException {
        BufferedReader bufferedReader = null;
        int matchingWordCount = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader(inputFilePath));
            String text = "";
            String line;
                while ((line = bufferedReader.readLine()) != null) {
                    text += line;
                }
                String[] Words = text.split("\\s+");
                for (int i = 0; i < Words.length; i++) {
                    if (Words[i].equalsIgnoreCase(inputWord)) {
                        matchingWordCount += 1;
                    }
                }
                System.out.println(FileInputConstant.SEARCH_WORD + matchingWordCount + FileInputConstant.APPERED_WORD);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            bufferedReader.close();
        }
    }
}