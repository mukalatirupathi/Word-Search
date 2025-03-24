package databaseConnection;

import constants.DataBaseConstants;
import constants.WordSearchConstant;
import dao.WordSearchEntity;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * AuditLogger class handles logging search results into the database
 */
public class AuditWordSearch {
    /**
     * Establishes a connection to the database using properties from a file.
     */
    private Connection auditGetConnection() throws SQLException, IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(WordSearchConstant.APPLICATION_PROPERTIES_PATH);
        properties.load(fileInputStream);
        String url = properties.getProperty(DataBaseConstants.URL_NAME);
        String username = properties.getProperty(DataBaseConstants.USER_NAME);
        String password = properties.getProperty(DataBaseConstants.PASSWORD_NAME);
        return DriverManager.getConnection(url, username, password);
    }
    /**
     * This  method inserts search results into a database table using a prepareStatement.
     */
    public void auditResult(WordSearchEntity wordSearchEntity) {
        try (Connection connection = auditGetConnection();) {
            PreparedStatement preparedStatement = connection.prepareStatement(WordSearchConstant.QUERY_CONSTANT);
            preparedStatement.setString(1, wordSearchEntity.getInputFilePath());
            preparedStatement.setString(2, wordSearchEntity.getInputWord());
            preparedStatement.setString(3, wordSearchEntity.getResultMsg());
            preparedStatement.setInt(4, wordSearchEntity.getMatchingWordCount());
            preparedStatement.setString(5, wordSearchEntity.getErrorMessage());
            preparedStatement.execute();
            System.out.println(DataBaseConstants.INSERTION_MESSAGE);
        } catch (SQLException sQLException) {
            System.out.println(sQLException.getMessage());
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
