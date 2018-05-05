
public class ConnectionProxy implements Connection {
	private ReleasableReference implementation;
	
	public ConnectionProxy(ReleasableReference rr) {
		implementation = rr;
	}
	
	@Override
	public Object get() {
		return ((Connection) implementation.getReference()).get();
	}

	@Override
	public void set(Object x) {
		((Connection) implementation.getReference()).set(x);
	}

	@Override
	public void release() {
		implementation.release();
	}

}
