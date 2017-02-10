# Dal-CSCI2110-Assignment2

<h2>Assignment 2 for CSCI 2110 (Computer Science 3 / Data Structures).</h2>

<p>This is a program to create and test abstract data structures, all to do with double ended queues (deques). There is an array and a linked list implementation of deques. There are also stacks and queues that implement the linked list deques.</p>

Sample output:
<pre>
FOR ARRAY_DEQUE: Of size 10 (default)
new: {}
insertFirst(3): {3}
insertFirst(5): {5,3}
isEmpty(): false
removeFirst(): {3} Output: 5
insertLast(7): {3,7}
removeFirst(): {7} Output: 3
removeLast(): {} Output: 7
lastElement(): error
removeFirst(): error
isEmpty(): true
insertFirst(9): {9}
insertLast(8): {9,8}
insertFirst(7): {7,9,8}
insertLast(6): {7,9,8,6}
insertFirst(5): {5,7,9,8,6}
size(): 5
insertLast(4): {5,7,9,8,6,4}
insertFirst(3): {3,5,7,9,8,6,4}
insertLast(2): {3,5,7,9,8,6,4,2}
insertFirst(1): {1,3,5,7,9,8,6,4,2}
insertLast(0): {1,3,5,7,9,8,6,4,2,0}
insertFirst(4): error

FOR LINKED_LIST_DEQUE:
new: {}
insertFirst(3): {3}
insertFirst(5): {5,3}
isEmpty(): false
removeFirst(): {3} Output: 5
insertLast(7): {3,7}
removeFirst(): {7} Output: 3
removeLast(): {} Output: 7
lastElement(): error
removeFirst(): error
isEmpty(): true
insertFirst(9): {9}
insertLast(8): {9,8}
insertFirst(7): {7,9,8}
insertLast(6): {7,9,8,6}
insertFirst(5): {5,7,9,8,6}
size(): 5
insertLast(4): {5,7,9,8,6,4}
insertFirst(3): {3,5,7,9,8,6,4}
insertLast(2): {3,5,7,9,8,6,4,2}
insertFirst(1): {1,3,5,7,9,8,6,4,2}
insertLast(0): {1,3,5,7,9,8,6,4,2,0}
insertFirst(4): {4,1,3,5,7,9,8,6,4,2,0}

FOR DEQUE_QUEUE:
new: {}
enqueue(3): {3}
enqueue(5): {5,3}
isEmpty(): false
deque(): {5} Output: 3
enqueue(7): {7,5}
deque(): {7} Output: 5
deque(): {} Output: 7
deque(): error
deque(): error
isEmpty(): true
enqueue(9): {9}
enqueue(8): {8,9}
enqueue(7): {7,8,9}
enqueue(6): {6,7,8,9}
enqueue(5): {5,6,7,8,9}
size(): 5
enqueue(4): {4,5,6,7,8,9}
enqueue(3): {3,4,5,6,7,8,9}
enqueue(2): {2,3,4,5,6,7,8,9}
enqueue(1): {1,2,3,4,5,6,7,8,9}
enqueue(0): {0,1,2,3,4,5,6,7,8,9}

FOR DEQUE_STACK:
new: {}
push(3): {3}
push(5): {3,5}
isEmpty(): false
pop(): {3} Output: 5
push(7): {3,7}
pop(): {3} Output: 7
pop(): {} Output: 3
pop(): error
pop(): error
isEmpty(): true
push(9): {9}
push(8): {9,8}
push(7): {9,8,7}
push(6): {9,8,7,6}
push(5): {9,8,7,6,5}
size(): 5
push(4): {9,8,7,6,5,4}
push(3): {9,8,7,6,5,4,3}
push(2): {9,8,7,6,5,4,3,2}
push(1): {9,8,7,6,5,4,3,2,1}
push(0): {9,8,7,6,5,4,3,2,1,0}

FOR MAX_STACK:
{} Max: -
push(55): {55} Max: 55
push(23): {55,23} Max: 55
push(76): {55,23,76} Max: 76
pop(): {55,23} Max: 55
push(76): {55,23,76} Max: 76
push(76): {55,23,76,76} Max: 76
pop(): {55,23,76} Max: 76
pop(): {55,23} Max: 55
pop(): {55} Max: 55
pop(): {} Max: -
pop(): error
pop(): {} Max: -
pop(): error
pop(): {} Max: -
push(-99): {-99} Max: -99
push(0): {-99,0} Max: 0</pre>