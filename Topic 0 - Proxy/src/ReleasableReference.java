
public class ReleasableReference {
	private PoolItem reference;
	private boolean released = false;
	
	public ReleasableReference(PoolItem reference) {
		this.reference = reference;
	}
	
	public Object getReference() {
		if (released) {
	    	throw new RuntimeException("Tried to use reference after it was released");
		}
	    return reference.getItem();
	}

	  public void release() {
		  released = true;
		  reference.setInUse(false);
	  }
}
