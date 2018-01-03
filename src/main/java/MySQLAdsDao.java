import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.List;


public class MySQLAdsDao implements Ads {

    public static void main(String[] args) throws SQLException {
        public MySQLAdsDao(Config config) {
            try {

            } catch () {

            }

        }
        Config config = new Config();
        DriverManager.registerDriver(new Driver());

        Connection connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
git sttsa
        showAds(connection);

        addAds(connection, 1, "playstation for sale", "This is a slightly used playstation");
        addAds(connection, 2, "Super Nintendo", "Get your game on with this old-school classic!");
        addAds(connection, 3, "Junior Java Developer Position", "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript");

        showAds(connection);
    }

    public List<Ad> all() {
        String selectQuery = "SELECT * FROM ads";

        // iterator
        while (rs.next()) {
            System.out.println("id: " + rs.getLong("id"));
            System.out.println("title: " + rs.getString("name"));
        }
    }

    public addAds(Connection connection, long userId, String title, String description) throws SQLException {

        String query = "INSERT INTO ads (userId, title, description) VALUES (userId, '" + title + "', '" + description + "');";

        Statement stmt = connection.createStatement();

        stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
    }

}
