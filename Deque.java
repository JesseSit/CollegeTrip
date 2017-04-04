public interface Deque<T>{
    
    public void addFirst(T val); //add element to front of deque;

    public void addLast(T val); //add element to end of deque;

    public T pollFirst(); //removes and returns element at front of deque. Return null if deque is empty;

    public T pollLast(); //removes and returns element at end of deque. Return null if deque is empty;

    public T peekFirst(); //returns element at front of deque. Returns null if deque is empty;

    public T peekLast(); //returns element at end of deque. Returns null if deque is empty;

    public boolean removeFirstOccurrence(T val); //removes the first occurrence of val and returns true if an element was removed;

    public boolean removeLastOccurrence(T val); //removes the last occurrence of val and returns true if an element was removed;
}
    
