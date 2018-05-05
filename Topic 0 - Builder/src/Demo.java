
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectionDirector connectionDirector;
		ConnectionBuilder connectionBuilder = new ConnectionBuilderImplementation();
		connectionDirector = new ConnectionDirector(connectionBuilder);
		connectionDirector.getConnection().connect();
	}

}
