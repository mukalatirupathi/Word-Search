package wordtrace;

import constants.WordSearchConstant;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;
/**
 * The class provides amethod to count occurances of a specfic word in a given text file
 * This class reads the filecontent and tokenizes the words
 * Ensuring proper word comparsion by ignoring case sensitivity
 */
public class FileWordCounter {
    /**
     * The method reads the content of the file,tokenizes the words
     * Removes the non-alphanumeric characters,and counts how many times
     *
     * @param inputFilePath
     * @param inputWord
     * @throws IOException
     */
    public static void findWordCountInFile(String inputFilePath, String inputWord) throws IOException {
        int MatchingWordCount = 0;
        String fileContents = Files.readString(Paths.get(inputFilePath));
        StringTokenizer stringTokenizer = new StringTokenizer(fileContents);
        while (stringTokenizer.hasMoreTokens()) {
            String tokens = stringTokenizer.nextToken().replaceAll("[^a-zA-z0-9]", "");
            if ((tokens.equalsIgnoreCase(inputWord))) {
                MatchingWordCount += 1;
            }
        }
        System.out.println(WordSearchConstant.SEARCH_WORD + MatchingWordCount + WordSearchConstant.APPERED_WORD);
    }
}
