public interface Deque<T>{
    
    public int size(); //returns size of deque;
    
    public void addFirst(T val); //add element to front of deque;

    public void addLast(T val); //add element to end of deque;

    public T pollFirst(); //removes and returns element at front of deque. Return null if deque is empty;

    public T pollLast(); //removes and returns element at end of deque. Return null if deque is empty;

    public T peekFirst(); //returns element at front of deque. Returns null if deque is empty;

    public T peekFirst(); //returns element at end of deque. Returns null if deque is empty;

}
    
