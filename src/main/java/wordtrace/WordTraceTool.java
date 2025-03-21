package wordtrace;

import dao.WordSearchEntity;
import constants.WordSearchConstant;
import databaseConnection.AuditWordSearch;
import util.WordTraceToolUtil;

import java.sql.SQLException;

/**
 * The main  class starts the wordtracetool
 */
public class WordTraceTool {
    /**
     * Main method validate input arguments and start processing
     * @param userArgs
     */
    public static void main(String[] userArgs) {
        String inputFilePath = userArgs[0];
        String inputWord = userArgs[1];
        InputFileValidation inputFileValidation = new InputFileValidation();
        WordSearchEntity entity;
        AuditWordSearch auditWordSearch = new AuditWordSearch();
        WordTraceToolUtil wordTraceToolUtil = new WordTraceToolUtil();
        try {
            int searchedWordCount = 0;
            if (inputFileValidation.validateArguments(userArgs)) {
                searchedWordCount = FileWordCounter.findWordCountInFile(inputFilePath, inputWord);
                if (searchedWordCount != 0) {
                    entity = wordTraceToolUtil.wordSearch(inputFilePath, inputWord, WordSearchConstant.DATABASE_RESULT_MSG, searchedWordCount, null);
                    auditWordSearch.auditResult(entity);
                } else {

                    entity = wordTraceToolUtil.wordSearch(inputFilePath, inputWord, WordSearchConstant.DATABASE_RESULT_MSG, searchedWordCount, WordSearchConstant.WORD_NOT_FOUND_ERROR_MESSAGE);
                    auditWordSearch.auditResult(entity);
                }

            } else {
                entity = wordTraceToolUtil.wordSearch(inputFilePath, inputWord, WordSearchConstant.DATABASE_ERROR_MSG, searchedWordCount, WordSearchConstant.FILE_NOT_FOUND_ERROR_MESSAGE);
                auditWordSearch.auditResult(entity);
            }
        } catch (SQLException sqlException) {
            sqlException.getMessage();
        } catch (Exception exception) {
            exception.getMessage();
        }
    }
}
