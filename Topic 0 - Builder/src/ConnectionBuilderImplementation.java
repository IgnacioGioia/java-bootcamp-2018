
public class ConnectionBuilderImplementation implements ConnectionBuilder{
	private Connection con;
	
	public ConnectionBuilderImplementation() {
		con = new Connection();
	}
	
	public Connection getConnection() {
		return con;
	}
}
