
public interface IList<Item> {
	void add();
	
	Item get(int position);
	
	int size();
	
	boolean contain();
	
	boolean isEmpty();
	
	void printout();
}
