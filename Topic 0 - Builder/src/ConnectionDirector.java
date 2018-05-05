
public class ConnectionDirector {
	private ConnectionBuilder connectionBuilder = null;
	
	public ConnectionDirector(ConnectionBuilder connectionBuilder) {
		this.connectionBuilder = connectionBuilder;
	}
	
	public Connection getConnection() {
		return connectionBuilder.getConnection();
	}
}
