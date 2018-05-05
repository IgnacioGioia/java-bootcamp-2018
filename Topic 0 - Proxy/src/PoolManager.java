import java.util.ArrayList;

public class PoolManager {
	private ArrayList<PoolItem> items = new ArrayList<PoolItem>();
	
	public void add(Object item) {
		items.add(new PoolItem(item));
	}
	public ReleasableReference get() {
		for (int i = 0; i < items.size(); i++) {
			PoolItem pitem = (PoolItem) items.get(i);
			if (pitem.getInUse() == false) {
				pitem.setInUse(true);
				return new ReleasableReference(pitem);
			}
		}
		return null;
	}
}
