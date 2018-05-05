

public class SingletonConnection {
	   private static Connection connection = null;
	   public static Connection getConnection(){
	   if(connection == null) {
		   connection = new Connection();
	   }
	    return connection;
	   }
}
