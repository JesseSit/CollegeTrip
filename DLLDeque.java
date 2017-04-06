/*
Team Name: CollegeTrip
Team Members: Jesse Sit, Lisa Eng
APCS2 pd3
lab2 -- All Hands on Deque!
2017-4-2
*/
public class DLLDeque<T> implements Deque<T> {

    private DLLNode<T> _front, _end;
    private int _size;

    public DLLDeque(){
	_front = _end = null;
	_size = 0;
    }

 
    //add element to front of deque
    public void addFirst(T val){
	if (isEmpty()){
	    DLLNode node = new DLLNode<T>(null, val, null);
	    _front = node;
	    _end = node;
	}
	else{
	    DLLNode node = new DLLNode<T>(null, val, _front);
	    _front.setPrev(node);
	    _front = node;
	}
	_size++;
    }
    
    //add element to end of deque
    public void addLast(T val){
	if (isEmpty()){
	    DLLNode node = new DLLNode<T>(null, val, null);
	    _front = node;
	    _end = node;
	}
	else {
	    DLLNode node = new DLLNode<T>(_end, val, null);
	    _end.setNext(node);
	    _end = node;
	}
	_size++;
    }

    //removes and returns element at front of deque. Return null if deque is empty
    public T pollFirst(){
	T retT;
	if (isEmpty()){
	    return null;
	}
	else{
	    retT = _front.getValue();
	    _front = _front.getNext();
	    _size--;
	}
	return retT;
    } 

    //removes and returns element at end of deque. Return null if deque is empty
    public T pollLast(){
	T retT;
	if (isEmpty()){
	    return null;
	}
	else {
	    retT = _end.getValue();
	    _end = _end.getPrev();
	    _end.setNext(null);
	    _size--;
	}
	return retT;
    } 

    //returns element at front of deque. Returns null if deque is empty
    public T peekFirst(){
	if (isEmpty())
	    return null;
	return _front.getValue();
    } 

    //returns element at end of deque. Returns null if deque is empty
    public T peekLast(){
	if (isEmpty())
	    return null;
	return _end.getValue();
    }

    //removes the first occurrence of val and returns true if an element was remove
    public boolean removeFirstOccurrence(T val){
        DLLNode node = new DLLNode(null, _front.getValue(), null);
	while(_front.getValue() != val){
	    node.setNext(_front.getNext());
	    _front = _front.getNext();
	    if (isEmpty()){
		_front = node;
		return false;
	    }
	}
        node.setNext(_front.getNext());
	_front = node;
	return true;
    }

    //removes the last occurrence of val and returns true if an element was removed
    public boolean removeLastOccurrence(T val){
	DLLNode node = new DLLNode(null, _end.getValue(), null);
	while(_end.getValue() != val){
	    node.setPrev(_end.getPrev());
	    _end = _end.getPrev();
	    _end.setNext(null);
	    if (isEmpty()){
		_end = node;
		return false;
	    }
	}
	pollLast();
	//node.setPrev(_end.getPrev());
	_end.setNext(node);
	return true;
    }
	    
    //returns emptiness of deque;
    public boolean isEmpty(){
	return _size == 0;
    }

    public String toString(){
	String retStr = "head -> ";
	DLLNode<T> temp = _front;
	while (temp != null){
	    retStr += temp.getValue() + " -> ";
	    temp = temp.getNext();
	}
	retStr += "tail";
	return retStr;
    }
    public static void main(String[] args){
	
	DLLDeque<String> Lafayette = new DLLDeque<String>();

	System.out.println(Lafayette.isEmpty());
	System.out.println(Lafayette.peekFirst());
	System.out.println(Lafayette.pollFirst());
	Lafayette.addFirst("Jesse");
	Lafayette.addLast("Sit");
	Lafayette.addLast("Lisa");
	Lafayette.addLast("Sit");
	System.out.println(Lafayette);
	System.out.println(Lafayette.removeLastOccurrence("Lisa"));
	System.out.println(Lafayette);
	System.out.println(Lafayette.peekFirst());	
	System.out.println(Lafayette.pollLast());
	System.out.println(Lafayette.pollFirst());
	System.out.println(Lafayette);
	
    }
}
