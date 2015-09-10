public class LRUCache {
    
	private class Node{
	   	private Node prev; 
       	private Node next; 
       	private int key; 
       	private int val; 
       	public Node(int key, int val){
       		this.key = key; 
       		this.val = val; 
       		this.prev = null; 
       		this.next = null; 
    	}
    }

    private int capacity; 
    private HashMap<Integer, Node> hs; 
    private Node head; 
    private Node tail; 

    public LRUCache(int capacity) {
    	this.capacity = capacity;     
    	this.hs = new HashMap<Integer, Node>(); 
    	this.head = new Node(-1, -1); 
    	this.tail = new Node(-1, -1); 
    	tail.prev = head; 
    	head.next = tail; 
    }

    private void move_to_tail(Node cur){
    	cur.prev = tail.prev; 
    	tail.prev = cur; 
    	cur.prev.next = cur; 
    	cur.next = tail; 
    }
    
    public int get(int key) {
        if (!hs.containsKey(key)){
        	return -1; 
        }
        Node cur = hs.get(key); 
        cur.prev.next = cur.next; 
        cur.next.prev = cur.prev; 
        move_to_tail(cur); 
        return hs.get(val).val; 
    }
    
    public void set(int key, int value) {
        if (this.get(key) != -1){
        	hs.get(key).val = value; 
        	return; 
        }
        if (hs.size() == capacity){
        	hs.remove(head.next.key); 
        	head.next = head.next.next; 
        	head.next.prev = head; 
        }
        Node to_insert = new Node(key, value);
        hs.put(key, insert); 
        move_to_tail(to_insert);  
    }


}