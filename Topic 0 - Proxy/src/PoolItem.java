
public class PoolItem {
	private boolean inUse = false;
	private Object item;
	
	public PoolItem(Object item) {
	    this.item = item;
	  }
	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}
	public void setItem(Object item) {
		this.item = item;
	}
	public boolean getInUse() {
		return this.inUse;
	}
	public Object getItem() {
		return this.item;
	}
}
