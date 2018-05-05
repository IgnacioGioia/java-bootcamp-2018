
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectionFactory connectionFactory;
		connectionFactory = new MySqlConnectionFactory();
		connectionFactory.getConnection().connect();
	}

}
