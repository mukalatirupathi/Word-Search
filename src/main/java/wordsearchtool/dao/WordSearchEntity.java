package wordsearchtool.dao;

import lombok.Data;

/**
 * Represents details of a word search operation, including input file path,
 * search word, search time, result message, matching word count, and error message.
 */
@Data
public class WordSearchEntity {
    private String inputFilePath;
    private String inputWord;
    private String search_time;
    private String resultMsg;
    private int matchingWordCount;
    private String errorMessage;
}
