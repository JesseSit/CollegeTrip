# CollegeTrip

## Using a double linked Node
  
  We decided to use a double linked node because certain methods such as addFirst(), addLast(), pollFirst(), and pollLast() would have a run time of O(1). If we had used ArrayList, many of the methods listed above could have been written using many of the default methods in the ArrayList package, however, the run time would have been O(n). Using an ArrayList based architecture has a run time of O(n) because methods like addFirst() and pollFirst() would cause the array to be shifted one position.
  
## Method Selections
  
  
  ### addFirst()
  addFirst() would be useful for the user to add to the front of the deque. (similar to the push() method)
  
  ### addLast()
  addLast() would be useful for the user to add to the end of the deque. (similar to the add() method)
  
  ### pollFirst()
  pollFirst() would be useful for the user to take out the element from the front of the deque. (similar to the remove() and removeFirst() method)
  
  ### pollLast()
  pollLast() would be useful for the user to take out the element from the end of the deque. (similar to the pop() and removeLast() method)
  
  ### peekFirst()
  peekFirst() would be useful for the user to retrieve the element from the front of the deque. (similar to the peek() and getFirst() method)
  
  ### peekLast()
  peekLast() would be useful for the user to retrieve the element from the end of the deque. (similar to the peek() and getLast() method)
