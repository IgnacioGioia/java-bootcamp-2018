

public class SingletonConnection {
	   private static SingletonConnection singletonConnection = null;
	   
	   private SingletonConnection() {
		   System.out.println("Connected");
	   }
	   
	   public static SingletonConnection getConnection(){
	   if(singletonConnection == null) {
		   singletonConnection = new SingletonConnection();
	   }
	    return singletonConnection;
	   }
}
