/*****************************************************
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 *****************************************************/

public class DLNode<T> {

    private T _cargo;    //cargo may only be of type T
    private DLNode<T> _nextNode; //pointer to next DLNode
    private DLNode<T> _prevNode; //pointer to prev DLNode


    // constructor -- initializes instance vars
    public DLNode( DLNode<T> prev, T value, DLNode<T> next ) {
	_prevNode = prev;
	_cargo = value;
	_nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public DLNode<T> getPrev() { return _prevNode; }
    
    public T getValue() { return _cargo; }

    public DLNode<T> getNext() { return _nextNode; }

    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setValue( T newCargo ) {
	T foo = getValue();
	_cargo = newCargo;
	return foo;
    }

    public DLNode<T> setNext( DLNode<T> newNext ) {
	DLNode<T> foo = getNext();
	_nextNode = newNext;
	return foo;
    }
    
    public DLNode<T> setPrev( DLNode<T> newPrev ) {
	DLNode<T> foo = getPrev();
	_prevNode = newPrev;
	return foo;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }


    //main method for testing
    public static void main( String[] args ) {
	/******************************
	//Below is an exercise in creating a linked list...

	//Create a node
	LLNode<String> first = new LLNode<String>( "cat", null );

	//Create a new node after the first
	first.setNext( new LLNode<String>( "dog", null ) );

	//Create a third node after the second
	first.getNext().setNext( new LLNode<String>( "cow", null ) );

	LLNode temp = first; 
	while( temp != null ) {
	    System.out.println( temp );
	    temp = temp.getNext();
	}
	********************************/
    }//end main

}//end class LLNode
