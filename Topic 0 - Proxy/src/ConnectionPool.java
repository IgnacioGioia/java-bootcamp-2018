
public class ConnectionPool {
	private static PoolManager pool = new PoolManager();
	
	public ConnectionPool() {
		
	}
	
	public static void addConnections(int number) {
		for(int i = 0; i < number; i++) {
			pool.add(new ConnectionImplementation());
		}
	}
	public static Connection getConnection() {
		ReleasableReference rr = (ReleasableReference) pool.get();
		if(rr == null) {
			return null;
		}
		return new ConnectionProxy(rr);
	}
}
