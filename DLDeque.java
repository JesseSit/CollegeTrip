
public class DLDeque<T> implements Dequeue {

    private DLLNode<T> _front, _end;
    private int _size;

    public DLDeque(){
	_front, _end = null;
	_size = 0;
    }

 
    //add element to front of deque
    public void addFirst(T val){
	if (isEmpty()){
	    DLLNode node = new DLLNode<T>(null, val, null);
	    _front = node;
	    _end = node;
	    _size++;
	}
	else{
	    DLLNode node = new DLLNode<T>(_front, val, null);
	    _front.setPrev(node);
	    _front = node;
	    _size++;
	}
    }
    
    //add element to end of deque
    public void addLast(T val){

    }

    //removes and returns element at front of deque. Return null if deque is empty
    public T pollFirst(){

	if (isEmpty()){
	    return null;
	}
	else{
	    T retT = _front.getCargo();
	    _front = _front.getNext();
	    _size--;
	    return retT;
	}
    } 

    //removes and returns element at end of deque. Return null if deque is empty
    public T pollLast(){
	
    } 

    //returns element at front of deque. Returns null if deque is empty
    public T peekFirst(){
	return _front.getCargo();
    } 

    //returns element at end of deque. Returns null if deque is empty
    public T peekLast(){

    }
    
    //returns size of deque;
    public int size(){
	return _size;
    }

    public booleand isEmpty(){
	return _size == 0;
    }
}
