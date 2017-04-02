//Team CollegeTrip -- Lisa Eng & Jesse Sit
//APCS2 pd3
//Lab 02 -- All Hands on Dequeue!
//2017-04-02


import java.util.ArrayList;

public class ALDeque<T> implements Dequeue<T>{

    private ArratList<T> dequeue;
    
    public ALDequeue<T> {
	dequeue = new ArrayList<T>();
    }

    //add element to front of deque;
    public void addFirst(T val){
	dequeue.add(val, 0);
    }

    //add element to end of deque;
    public void addLast(T val){

    } 

    //removes and returns element at front of deque. Return null if deque is empty;
    public T pollFirst(){
	return dequeue.remove(0);
    }

    //removes and returns element at end of deque. Return null if deque is empty;
    public T pollLast(){

    }

    //returns element at front of deque. Returns null if deque is empty;
    public T peekFirst(){
	return dequeue.get(0);
    }

    //returns element at end of deque. Returns null if deque is empty;
    public T peekFirst(){

    }
    
    //returns size of deque;
    public int size(){
	return dequeue.size();
    }

    public String toString(){
	return dequeue.toString();
    }

    public static void main(String[] args){

    }
}
