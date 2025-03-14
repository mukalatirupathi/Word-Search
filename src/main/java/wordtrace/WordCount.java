package wordtrace;

import constants.FileInputConstant;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;
/**
 * The class provides amethod to count occurances of a specfic word in a given text file
 * this class reads the filecontent and tokenizes the words
 * ensuring proper word comparsion by ignoring case sensitivity
 */
public class WordCount {
    /**
     * The method reads the content of the file,tokenizes the words
     * removes the non-alphanumeric characters,and counts how many times
     *
     * @param inputFilePath
     * @param inputWord
     * @throws IOException
     */
    public static void matchingWordCount(String inputFilePath, String inputWord) throws IOException {
        int MatchingWordCount = 0;
        String contents = Files.readString(Paths.get(inputFilePath));
        StringTokenizer stringTokenizer = new StringTokenizer(contents);
        while (stringTokenizer.hasMoreTokens()) {
            String tokens = stringTokenizer.nextToken().replaceAll("[^a-zA-z0-9]", "");
            if ((tokens.equalsIgnoreCase(inputWord))) {
                MatchingWordCount += 1;
            }
        }
        System.out.println(FileInputConstant.SEARCH_WORD + MatchingWordCount + FileInputConstant.APPERED_WORD);
    }
}
