
/**
 * This class solves Exercise 2 Chapter 8 ["Access Control"] of the
 * book "Thinking in Java"
 * This exercise implements singleton 
 * 
 * @author nwokoyepraise@gmail.com
 */
//import java.util.Vector;

public class Exercise8 {

    public static void main(String[] args) {
        System.out.println(ConnectionManager.getConnection());
        System.out.println(ConnectionManager.getConnection());
        System.out.println(ConnectionManager.getConnection());
    }
}

class ConnectionManager {
    private static int AVAIL_CONN = 2;

    private static Connection[] connArray = new Connection[AVAIL_CONN];

    public static Connection getConnection() {
        for (int i = 0; i < AVAIL_CONN; i++) {
            connArray[i] = new Connection();
        }
     
        if (connArray.length == 0) {
            return null;
        }
        AVAIL_CONN -= 1;
        Connection conn = connArray[0];
        connArray = new Connection[AVAIL_CONN];

        return conn;
    }
}

class Connection {
}