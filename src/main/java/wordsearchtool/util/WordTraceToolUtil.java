package util;

import constants.WordSearchConstant;
import dao.WordSearchEntity;

/**
 * Utility class for word search operations.
 */
public class WordTraceToolUtil {
    /**
     * Searches for a word in the specified file and returns the result entity
     */
    public WordSearchEntity wordSearch(String inputFilePath, String inputWord, String resultMsg, int matchingWordCount, String errorMessage) {
        WordSearchEntity entity = new WordSearchEntity();
        entity.setInputFilePath(inputFilePath);
        entity.setInputWord(inputWord);
        entity.setResultMsg(resultMsg);
        entity.setMatchingWordCount(matchingWordCount);
        entity.setErrorMessage(errorMessage);
        return entity;
    }
}
