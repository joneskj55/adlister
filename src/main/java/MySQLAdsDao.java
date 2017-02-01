import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.List;
/**
 * Created by kevinjones on 2/1/17.
 */
public class MySQLAdsDao implements Ads {

    //get a list of all the ads
    public List<Ad> all() {
        // select * from ads
        Config config = new Config();

        String selectQuery = "SELECT * FROM movies";
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
        );

      //create new List
    List<Ad> ads;

    Statement stmt = connection.createStatement();
    ResultSet res = stmt.executeQuery(selectQuery);
    while (rs.next()) {
        //add a new Ad object to the ads list inside this loop

        //use the rs.getLong(), getString, methods to grab values from the row (in the db)
        //use those values to instantiate a new Ad object, passing them to the constructor
        //add that new Ad object to the ads arrayList
    }

    return ads;

    public Long insert(Ad ad) {

    }

    public Ad find(int id) {

    }
}
