package wordtrace;

import constants.LogArgumentConstants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

    public static void matchingWordCount(String inputFilePath, String inputWord) throws IOException {
        BufferedReader bufferedReader = null;
        int MatchingWordCount = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader(inputFilePath));
            String text = "";
            String Line;
            while ((Line = bufferedReader.readLine()) != null) {
                text += Line;
            }
            String[] Words = text.split("\\s+");
            for (int i = 0; i < Words.length; i++) {
                if (Words[i].equalsIgnoreCase(inputWord)) {
                    MatchingWordCount += 1;
                }
            }
            System.out.println(LogArgumentConstants.SEARCH_WORD + MatchingWordCount + LogArgumentConstants.APPERED_WORD);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            bufferedReader.close();
        }
    }
}