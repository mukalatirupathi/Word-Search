package databaseConnection;

import DAO.WordSearchEntity;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 *AuditLogger class handles logging search results into the database
 */
public class AuditLogger {

    /**
     * Logs the search result details into the audit table.
     *
     * @param wordSearchEntity The entity containing search result details.
     * @throws ClassNotFoundException If the JDBC driver is not found.
     * @throws SQLException If a database access error occurs.
     */
    public void logSearchResult(WordSearchEntity wordSearchEntity) throws ClassNotFoundException, SQLException {
        try {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream("C:\\tirupathimukala\\WordSearch\\src\\main\\resources\\application.properties");
            properties.load(fileInputStream);
            String url=properties.getProperty("db.url");
            String username=properties.getProperty("db.username");
            String password=properties.getProperty("db.password");
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO audit (filepath, inputWord, search_time, result, wordCount, errorMesage) VALUES (?,?,NOW(),?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, wordSearchEntity.getInputFilePath());
            preparedStatement.setString(2, wordSearchEntity.getInputWord());
            preparedStatement.setString(3, wordSearchEntity.getResultMsg());
            preparedStatement.setInt(4,wordSearchEntity.getMatchingWordCount());
            preparedStatement.setString(5, wordSearchEntity.getErrorMessage());

           preparedStatement.execute();
            System.out.println("Data inserted into database");
            connection.close();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }
}
