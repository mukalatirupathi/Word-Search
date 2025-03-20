package wordtrace;

import DAO.WordSearchEntity;
import constants.WordSearchConstant;
import databaseConnection.AuditLogger;

import java.sql.SQLException;

/**
 * The main  class starts the wordtracetool
 */
public class WordTraceTool {
    /**
     * Main method validate input arguments and start processing
     *
     * @param userArgs
     */
    public static void main(String[] userArgs) {
        String inputFilePath = userArgs[0];
        String inputWord = userArgs[1];
        InputFileValidation inputFileValidation = new InputFileValidation();
        WordSearchEntity entity = new WordSearchEntity();
        AuditLogger auditLogger = new AuditLogger();
        try {
            int searchedWordCount = 0;
            if (inputFileValidation.validateArguments(userArgs)) {
                searchedWordCount = FileWordCounter.findWordCountInFile(inputFilePath, inputWord);
                if (searchedWordCount > 0) {
                    entity.setInputFilePath(inputFilePath);
                    entity.setInputWord(inputWord);
                    entity.setResultMsg(WordSearchConstant.DATABASE_RESULT_MSG);
                    entity.setMatchingWordCount(searchedWordCount);
                    auditLogger.logSearchResult(entity);
                }
                entity.setInputFilePath(inputFilePath);
                entity.setInputWord(inputWord);
                entity.setResultMsg(WordSearchConstant.DATABASE_RESULT_MSG);
                entity.setMatchingWordCount(searchedWordCount);
                entity.setErrorMessage(WordSearchConstant.WORD_NOT_FOUND_ERROR_MESSAGE);
                auditLogger.logSearchResult(entity);
            } else {
                entity.setInputFilePath(inputFilePath);
                entity.setInputWord(inputWord);
                entity.setResultMsg(WordSearchConstant.DATABASE_ERROR_MSG);
                entity.setMatchingWordCount(searchedWordCount);
                entity.setErrorMessage(WordSearchConstant.FILE_NOT_FOUND_ERROR_MESSAGE);
                auditLogger.logSearchResult(entity);
            }
        } catch (SQLException sqlException) {
            sqlException.getMessage();
        } catch (Exception exception) {
            exception.getMessage();
        }
    }
}
