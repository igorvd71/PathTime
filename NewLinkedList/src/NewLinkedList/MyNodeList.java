package NewLinkedList;

public class MyNodeList<Item> implements IList<Item> {

	Node first;
	
	public MyNodeList(){
		Node first = null;
	}
	
	@Override
	public void addFirst(Item item) {
		Node newNode = new Node();
		newNode.next = first;
		first = newNode;
		
	}

	@Override
	public boolean contain(Item item) {
		Node curr = first;
        while (curr.item != item) {
         if (curr.next == null) {
             return false; 
         } else {
             curr = curr.next;
         }
        }
        return true;
    }
	
	@Override
	public boolean remove(Item item) {
		Node curr = first;
		Node prev = first;
		
		while (curr.next != null) {
            if (curr.next == null) {
                return false;
            } else {
                prev = curr;
                curr = curr.next;
            }
            
            if (curr == first) {
                first = first.next;
            } else {
                prev.next = curr.next;
            }
        }
        return true;	
	}

	private class Node {
		Item item;
		Node next;
	}
	

}
