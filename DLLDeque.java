/*
Team Name: CollegeTrip
Team Members: Jesse Sit, Lisa Eng
APCS2 pd3
lab2 -- All Hands on Deque!
2017-4-2
*/
public class DLLDeque<T> implements Deque<T> {

    private DLLNode<T> _front, _end; //create _front and _end DLLNode
    private int _size; //keep track of size

    public DLLDeque(){
	_front = _end = null;
	_size = 0;
    }

 
    //add element to front of deque
    public void addFirst(T val){
	if (isEmpty()){ //check is link is empty
	    DLLNode newNode = new DLLNode<T>(null, val, null); //create a new DLLNode with cargo as val and setPrev as _front and setNext as _end
	    _front = newNode;
	    _end = newNode;
	}
	else{
	    DLLNode newNode = new DLLNode<T>(null, val, _front); //create a new DLLNode with cargo as val, setPrev as null and setNext as _front
	    _front.setPrev(newNode); //
	    _front = newNode;
	}
	_size++;
    }
    
    //add element to end of deque
    public void addLast(T val){
	if (isEmpty()){
	    DLLNode newNode = new DLLNode<T>(null, val, null); //same as addFirst(T val) if link is empty
	    _front = newNode;
	    _end = newNode;
	}
	else {
	    DLLNode newNode = new DLLNode<T>(_end, val, null); //create a new DLLNode with cargo as val, setPrev as _end and setNext as null
	    _end.setNext(newNode);
	    _end = newNode;
	}
	_size++;
    }

    //removes and returns element at front of deque. Return null if deque is empty
    public T pollFirst(){
	T retT; //create a temp variable (type T) for return 
	if (isEmpty()){ //check for emptiness
	    return null;
	}
	else{
	    retT = _front.getValue(); //store the first element of link
	    _front = _front.getNext(); //make _front the getNext() of original _front
	    _size--;
	}
	return retT;
    } 

    //removes and returns element at end of deque. Return null if deque is empty
    public T pollLast(){
	T retT; //create a temp variable (type T) for return 
	if (isEmpty()){ //check for emptiness
	    return null;
	}
	else {
	    retT = _end.getValue(); //store the last element of link
	    _end = _end.getPrev(); //make _end the getPrev() of original _end
	    _end.setNext(null);
	    _size--;
	}
	return retT;
    } 

    //returns element at front of deque. Returns null if deque is empty
    public T peekFirst(){
	if (isEmpty()) //check for emptiness
	    return null;
	return _front.getValue(); //return element _front points
    } 

    //returns element at end of deque. Returns null if deque is empty
    public T peekLast(){
	if (isEmpty()) //check for emptiness
	    return null;
	return _end.getValue(); //return element _end points
    }

    //removes the first occurrence of val and returns true if an element was remove
    public boolean removeFirstOccurrence(T val){
        DLLNode newNode = new DLLNode(null, _front.getValue(), null); //create newNode containing the value at _front
	while(_front.getValue() != val){ //checks if the value at _front equals the remove value
	    newNode.setNext(_front.getNext()); //copies next node of _front to newNode
	    _front = _front.getNext(); //changes the pointer _front to the next node
	    if (isEmpty()){ //if _front becomes empty, then that means that the remove value is not in the deque
		_front = newNode; //since every node of _front has been copied to newNode, you can set _front to newNode
		return false;
	    }
	}
        newNode.setNext(_front.getNext());
	_front = newNode;
	return true;
    }

    //removes the last occurrence of val and returns true if an element was removed
    public boolean removeLastOccurrence(T val){
	DLLNode newNode = new DLLNode(null, _end.getValue(), null); //create newNode containing the value at _end
	while(_end.getValue() != val){ //chekcs if the value at _end equals the remove value
	    newNode.setPrev(_end.getPrev()); //copies next node of _end to newNode
	    _end = _end.getPrev(); //changes the pointer _end to previous node
	    _end.setNext(null); 
	    if (isEmpty()){ //if _end becomes empty, then that means the remove value is not in the deque		
		_end = newNode; //since every node of end has been copied to newNode, you can set _front to newNode
	}
	pollLast();
	_end.setNext(newNode);
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
	System.out.println(Lafayette.removeFirstOccurrence("Lisa"));
	System.out.println(Lafayette);
	System.out.println(Lafayette.peekFirst());	
	System.out.println(Lafayette.pollLast());
	System.out.println(Lafayette.pollFirst());
	System.out.println(Lafayette);
	
    }
}
