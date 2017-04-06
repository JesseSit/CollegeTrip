# CollegeTrip

## Using a double linked Node
  
  We decided to use a double linked node because certain methods such as addFirst(), addLast(), pollFirst(), and pollLast() would have a run time of O(1). If we had used ArrayList, many of the methods listed above could have been written using many of the default methods in the ArrayList package, however, the run time would have been O(n). Using an ArrayList based architecture has a run time of O(n) because methods like addFirst() and pollFirst() would cause the array to be shifted one position.
  
## Method Selections
  
  
  ### addFirst(T element)
  #### return: void
  addFirst() would be useful for the user to add to the front of the deque. (similar to the push() method)
  
  ### addLast(T element)
  #### return: void
  addLast() would be useful for the user to add to the end of the deque. (similar to the add() method)
  
  ### pollFirst()
  #### return: element (type T) removed 
  pollFirst() would be useful for the user to take out the element from the front of the deque. (similar to the remove() and removeFirst() method)
  
  ### pollLast()
  #### return: element (type T) removed 
  pollLast() would be useful for the user to take out the element from the end of the deque. (similar to the pop() and removeLast() method)
  
  ### peekFirst()
  #### return: element (type T) at the front of the link
  peekFirst() would be useful for the user to retrieve the element from the front of the deque. (similar to the peek() and getFirst() method)
  
  ### peekLast()
  #### return: element (type T) at the end of link  
  peekLast() would be useful for the user to retrieve the element from the end of the deque. (similar to the peek() and getLast() method)
  
  ### removeFirstOccurance(T element)
  #### return: boolean
  removeFirstOccurrance() would be useful for the user to remove the first occurrance of an element. returns true if the element was successfully removed, false otherwise.
  
  ### removeLastOccurrance(T element)
  #### return: boolean
  removeLastOccurrance() would be useful for the user to remove the last occurrance of an element. returns true if the element was successfully removed, false otherwise.


## Changes made

- made inline comments and provided parameter Types to the methods mentioned in the readMe
- improved robustness by linking the nodes both ways when adding a node by setting both previous and front node. so methods such as removeLastOccurance() and pollLast would appear to be working properly.
- used better varaible names (i.e node ---> newNode)
