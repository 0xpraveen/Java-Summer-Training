ArrayList
------------------
import java.util.*;

public class SortArrayList
{
	public static void main(String[] args)
	{
		Integer[] arr={20,10,4,40,1,50,60};
		ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(arr));
		System.out.println(list1);

		Iterator<Integer> it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());	
		}
		it.remove();

		System.out.println(list1);

		for(Integer ele:list1)
		{
			System.out.println(ele);
		}

		System.out.println("Printing data with ListIterator in inverse order:");
		ListIterator<Integer> itr=list1.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Printing data with ListIterator in reverse order:");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		Collections.sort(list1);//sorting arraylist in ascending order
		System.out.println("Printing data ascending order:");
		System.out.println(list1);

		Collections.reverse(list1);
		System.out.println("Printing data descending order:");
		System.out.println(list1);
		
		list1.set(1,100);
		System.out.println("Printing data after modify the 40 to 100:");
		System.out.println(list1);
		
		
	}
}


===========================================================================================================================
Java LinkedList class
========================
Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

The important points about Java LinkedList are:
----------------------------------------------------------------------------------------
Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to occur.
Java LinkedList class can be used as a list, stack or queue.


Methods of Java LinkedList
------------------------------
boolean add(E e)	: It is used to append the specified element to the end of a list.
void add(int index, E element): It is used to insert the specified element at the specified position index in a list.
boolean addAll(Collection<? extends E> c) : It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
boolean addAll(Collection<? extends E> c) :It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
boolean addAll(int index, Collection<? extends E> c) :It is used to append all the elements in the specified collection, starting at the specified position of the list.
void addFirst(E e) :It is used to insert the given element at the beginning of a list.
void addLast(E e) :It is used to append the given element to the end of a list.
void clear() :It is used to remove all the elements from a list.

boolean contains(Object o) :It is used to return true if a list contains a specified element.
Iterator<E> descendingIterator() :It is used to return an iterator over the elements in a deque in reverse sequential order.
E element() :It is used to retrieve the first element of a list.
E get(int index) :It is used to return the element at the specified position in a list.
E getFirst() :It is used to return the first element in a list.
E getLast():It is used to return the last element in a list.
E peekFirst() :It retrieves the first element of a list or returns null if a list is empty.
E peekLast()	:It retrieves the last element of a list or returns null if a list is empty.
E poll()	:It retrieves and removes the first element of a list.
E pollFirst()	:It retrieves and removes the first element of a list, or returns null if a list is empty.
E pollLast()	:It retrieves and removes the last element of a list, or returns null if a list is empty.
E remove()	It is used to retrieve and removes the first element of a list.
E remove(int index)	It is used to remove the element at the specified position in a list.
boolean remove(Object o)	It is used to remove the first occurrence of the specified element in a list.
E removeFirst()	It removes and returns the first element from a list.
boolean removeFirstOccurrence(Object o)	It is used to remove the first occurrence of the specified element in a list (when traversing the list from head to tail).
E removeLast()	It removes and returns the last element from a list.
int size()	It is used to return the number of elements in a list.
====================================================================================================================================


Java LinkedList Example
-------------------------------------------
import java.util.*;  
public class LinkedList1{  
 public static void main(String args[]){  
  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  

Example:
--------------------------------------------------
import java.util.*;
public class LinkedListExample
{
	public static void main(String[] args)
	{
		LinkedList<String> linkedList1=new LinkedList<>();
		linkedList1.add("Tamanna");
		linkedList1.add("Anuj");
		linkedList1.add("Sivani");
		linkedList1.add("Dekshita");

		System.out.println("Linked List data:");
		System.out.println(linkedList1);
		
		linkedList1.add(0,"Nehashree giri");//add element at first position in linkedlist based on index
		System.out.println(linkedList1);
		
		linkedList1.addFirst("Nirbhay Singh");//add element at first position in linkedlist
		System.out.println(linkedList1);

		linkedList1.addLast("Jivan");//add element at first position in linkedlist
		System.out.println(linkedList1);

		ListIterator itr=linkedList1.listIterator();
		System.out.println("Printing data in inverse order");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Iterator<String> itr1=linkedList1.descendingIterator();
		System.out.println("Printing data in reverse order");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("Printing data in reverse order");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		
	}
}

Example2:
import java.util.*;
public class LinkedListExample
{
	public static void main(String[] args)
	{
		LinkedList<String> linkedList1=new LinkedList<>();
		linkedList1.add("Tamanna");
		linkedList1.add("Anuj");
		linkedList1.add("Sivani");
		linkedList1.add("Dekshita");

		System.out.println("Linked List data:");
		System.out.println(linkedList1);
		
		linkedList1.add(0,"Nehashree giri");//add element at first position in linkedlist based on index
		System.out.println(linkedList1);
		
		linkedList1.addFirst("Nirbhay Singh");//add element at first position in linkedlist
		System.out.println(linkedList1);

		linkedList1.addLast("Jivan");//add element at first position in linkedlist
		System.out.println(linkedList1);

		ListIterator itr=linkedList1.listIterator();
		System.out.println("Printing data in inverse order");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Iterator<String> itr1=linkedList1.descendingIterator();
		System.out.println("Printing data in reverse order");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("Printing data in reverse order");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		linkedList1.remove();
		System.out.println(linkedList1);

		linkedList1.remove();
		System.out.println(linkedList1);
		
		linkedList1.remove("Anuj");
		System.out.println(linkedList1);

		
		System.out.println(linkedList1.get(1));
		System.out.println("Print first element :"+linkedList1.getFirst());
		System.out.println("Print last element :"+linkedList1.getLast());

		

	}
}


=====================================================================================================================
Difference Between ArrayList and LinkedList
=====================================================================================================================
1) ArrayList internally uses a dynamic array to store the elements.
	LinkedList internally uses a doubly linked list to store the elements.

2) Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the other elements are shifted in memory.

	Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is 
        required in memory.


3) An ArrayList class can act as a list only because it implements List only.
	LinkedList class can act as a list and queue both because it implements List and Deque interfaces.

4) ArrayList is better for storing and accessing data.	
	LinkedList is better for manipulating data.

5) The memory location for the elements of an ArrayList is contiguous.
	The location for the elements of a linked list is not contagious.

6) Generally, when an ArrayList is initialized, a default capacity of 10 is assigned to the ArrayList.
	There is no case of default capacity in a LinkedList. In LinkedList, an empty list is created when a LinkedList is 
        initialized.
7) To be precise, an ArrayList is a resizable array.
	LinkedList implements the doubly linked list of the list interface.


=========================================================================================================================
Points to Remember
The following are some important points to remember regarding an ArrayList and LinkedList.
------------------------------------------------------------------------------------------------------------------
* When the rate of addition or removal rate is more than the read scenarios, then go for the LinkedList. On the other hand,  
 when the frequency of the read scenarios is more than the addition or removal rate, then ArrayList takes precedence over LinkedList.

* Since the elements of an ArrayList are stored more compact as compared to a LinkedList; therefore, the ArrayList is more  
  cache-friendly as compared to the LinkedList. Thus, chances for the cache miss are less in an ArrayList as compared to a   
  LinkedList. Generally, it is considered that a LinkedList is poor in cache-locality.

* Memory overhead in the LinkedList is more as compared to the ArrayList. It is because, in a LinkedList, we have two extra 
  links (next and previous) as it is required to store the address of the previous and the next nodes, and these links 
  consume extra space. Such links are not present in an ArrayList.

============================================================================================================================
Java Vector
==============
Vector is like the dynamic array which can grow or shrink its size. Unlike array, we can store n-number of elements in it as there is no size limit. It is a part of Java Collection framework since Java 1.2. It is found in the java.util package and implements the List interface, so we can use all the methods of List interface here.

It is recommended to use the Vector class in the thread-safe implementation only. If you don't need to use the thread-safe implementation, you should use the ArrayList, the ArrayList will perform better in such case.

The Iterators returned by the Vector class are fail-fast. In case of concurrent modification, it fails and throws the ConcurrentModificationException.

It is similar to the ArrayList, but with two differences-
* Vector is synchronized.
* Java Vector contains many legacy methods that are not the part of a collections framework.

Java Vector class Declaration
------------------------------------------------------
public class Vector<E>  
extends Object<E>  
implements List<E>, Cloneable, Serializable  


Java Vector Example
--------------------------------
import java.util.*;  
public class VectorExample {  
       public static void main(String args[]) {  
          //Create a vector  
          Vector<String> vec = new Vector<String>();  
          //Adding elements using add() method of List  
          vec.add("Tiger");  
          vec.add("Lion");  
          vec.add("Dog");  
          vec.add("Elephant");  
          //Adding elements using addElement() method of Vector  
          vec.addElement("Rat");  
          vec.addElement("Cat");  
          vec.addElement("Deer");  
            
          System.out.println("Elements are: "+vec);  
       }  
}  


Example:

import java.util.*;
public class VectorExample
{
	public static void main(String[] args)
	{
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(30);
		v.add(20);

		ListIterator<Integer> list=v.listIterator();
		System.out.println("Print Vector list:");
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("Print Vector list in Reverse Order:");
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}

		v.addElement(100);
		list=v.listIterator();
		System.out.println("Print Vector list in Inverse Order:");
		while(list.hasNext())
		{
			System.out.println(list.next());
		}

		System.out.println(list.hasNext());

		//list=v.listIterator();

		System.out.println("Print Vector list in Reverse Order:");
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}
		System.out.println(v);
		
		
	}
}
=========================================================================================================================
Java Stack
========================================================
The stack is a linear data structure that is used to store the collection of objects. It is based on Last-In-First-Out (LIFO). Java collection framework provides many interfaces and classes to store the collection of objects. One of them is the Stack class that provides different operations such as push, pop, search, etc.

In this section, we will discuss the Java Stack class, its methods, and implement the stack data structure in a Java program. But before moving to the Java Stack class have a quick view of how the stack works.

The stack data structure has the two most important operations that are push and pop. The push operation inserts an element into the stack and pop operation removes an element from the top of the stack. 

In Java, Stack is a class that falls under the Collection framework that extends the Vector class. It also implements interfaces List, Collection, Iterable, Cloneable, Serializable. It represents the LIFO stack of objects. Before using the Stack class, we must import the java.util package. The stack class arranged in the Collections framework hierarchy,

Creating a Stack
If we want to create a stack, first, import the java.util package and create an object of the Stack class.

Stack stk = new Stack();  

Or

Stack<type> stk = new Stack<>();  

Methods of the Stack Class
=======================================================
We can perform push, pop, peek and search operation on the stack. The Java Stack class provides mainly five methods to perform these operations. Along with this, it also provides all the methods of the Java Vector class.

Method	Modifier and Type		Method Description
============================		=====================================================================
empty()	boolean				The method checks the stack is empty or not.
push(E item)		E		The method pushes (insert) an element onto the top of the stack.
pop()			E		The method removes an element from the top of the stack and returns the same element 
					as the value of that function.
peek()			E		The method looks at the top element of the stack without removing it.
search(Object o)	int		The method searches the specified object and returns the position of the object

=============================================================================================================================
StackEmptyMethodExample.java

import java.util.Stack;  
public class StackEmptyMethodExample  
{  
public static void main(String[] args)   
{  
//creating an instance of Stack class  
Stack<Integer> stk= new Stack<>();  
// checking stack is empty or not  
boolean result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
// pushing elements into stack  
stk.push(78);  
stk.push(113);  
stk.push(90);  
stk.push(120);  
//prints elements of the stack  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
}  
}  


import java.util.*;  
public class StackPushPopExample   
{  
public static void main(String args[])   
{  
//creating an object of Stack class  
Stack <Integer> stk = new Stack<>();  
System.out.println("stack: " + stk);  
//pushing elements into the stack  
pushelmnt(stk, 20);  
pushelmnt(stk, 13);  
pushelmnt(stk, 89);  
pushelmnt(stk, 90);  
pushelmnt(stk, 11);  
pushelmnt(stk, 45);  
pushelmnt(stk, 18);  
//popping elements from the stack  
popelmnt(stk);  
popelmnt(stk);  
//throws exception if the stack is empty  
try   
{  
popelmnt(stk);  
}   
catch (EmptyStackException e)   
{  
System.out.println("empty stack");  
}  
}  
//performing push operation  
static void pushelmnt(Stack stk, int x)   
{  
//invoking push() method      
stk.push(new Integer(x));  
System.out.println("push -> " + x);  
//prints modified stack  
System.out.println("stack: " + stk);  
}  
//performing pop operation  
static void popelmnt(Stack stk)   
{  
System.out.print("pop -> ");  
//invoking pop() method   
Integer x = (Integer) stk.pop();  
System.out.println(x);  
//prints modified stack  
System.out.println("stack: " + stk);  
}  
}  

Example:
-----------------------
import java.util.*;
public class StackExample
{
	public static void main(String[] args)
	{
		Stack<Integer> stack=new Stack<>();
		stack.push(100);
		stack.push(400);
		stack.push(300);
		stack.push(200);
		stack.push(100);

		System.out.println(stack);
		
		stack.push(1000);//push to top
		System.out.println(stack);

		stack.pop();
		System.out.println(stack);

		int removedele=stack.pop(); //remove from top
		System.out.println("Removed Element:"+removedele);
		System.out.println(stack);
		
		System.out.println("Search element :100 :"+(stack.search(100)));

		System.out.println("Retreive data from top:"+stack.peek());
		
	}
}



=====================================================================================================================================
Queue
==================
Java Queue Interface
The interface Queue is available in the java.util package and does extend the Collection interface. It is used to keep the elements that are processed in the First In First Out (FIFO) manner. It is an ordered list of objects, where insertion of elements occurs at the end of the list, and removal of elements occur at the beginning of the list.

Being an interface, the queue requires, for the declaration, a concrete class, and the most common classes are the LinkedList and PriorityQueue in Java. Implementations done by these classes are not thread safe. If it is required to have a thread safe implementation, PriorityBlockingQueue is an available option.

Methods of Java Queue Interface
---------------------------------------------------
boolean add(object)	It is used to insert the specified element into this queue and return true upon success.
boolean offer(object)	It is used to insert the specified element into this queue.
Object remove()	It is used to retrieves and removes the head of this queue.
Object poll()	It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
Object element()	It is used to retrieves, but does not remove, the head of this queue.
Object peek()	It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

Features of a Queue
------------------------------------------------------------
The following are some important features of a queue.
-------------------------------------------------------------
As discussed earlier, FIFO concept is used for insertion and deletion of elements from a queue.
The Java Queue provides support for all of the methods of the Collection interface including deletion, insertion, etc.
PriorityQueue, ArrayBlockingQueue and LinkedList are the implementations that are used most frequently.
The NullPointerException is raised, if any null operation is done on the BlockingQueues.
Those Queues that are present in the util package are known as Unbounded Queues.
Those Queues that are present in the util.concurrent package are known as bounded Queues.
All Queues barring the Deques facilitates removal and insertion at the head and tail of the queue; respectively. In fact, deques support element insertion and removal at both ends.


PriorityQueue Class
---------------------------------------------------
PriorityQueue is also class that is defined in the collection framework that gives us a way for processing the objects on the basis of priority. It is already described that the insertion and deletion of objects follows FIFO pattern in the Java queue. However, sometimes the elements of the queue are needed to be processed according to the priority, that's where a PriorityQueue comes into action.


Java PriorityQueue Example
---------------------------------------------------------------------
import java.util.*;  
class TestCollection12{  
public static void main(String args[]){  
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Amit");  
queue.add("Vijay");  
queue.add("Karan");  
queue.add("Jai");  
queue.add("Rahul");  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
queue.remove();  
queue.poll();  
System.out.println("after removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
}  
}  


Example:
--------------------------------
import java.util.*;
public class PriorityyQueueExample
{
	public static void main(String[] args)
	{
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Apple");
		pq.add("Banana");
		pq.add("Orange");

		System.out.print("PriorityQueue List: "+pq);
		System.out.println();
		pq.offer("Litchi");//added from last
		System.out.print("PriorityQueue List: "+pq);

		System.out.println();

		String s=pq.poll();//remove from first
		System.out.println("Removed Element :"+s);
		
		System.out.print("After remove PriorityQueue List: "+pq);

		System.out.println();
		System.out.println("Print first element:"+pq.peek());
		
	}
}
Java Deque Interface
---------------------------------------------
The interface called Deque is present in java.util package. It is the subtype of the interface queue. The Deque supports the addition as well as the removal of elements from both ends of the data structure. Therefore, a deque can be used as a stack or a queue. We know that the stack supports the Last In First Out (LIFO) operation, and the operation First In First Out is supported by a queue. As a deque supports both, either of the mentioned operations can be performed on it. Deque is an acronym for "double ended queue".


Methods of Java Deque Interface
------------------------------------
boolean add(object)	It is used to insert the specified element into this deque and return true upon success.
boolean offer(object)	It is used to insert the specified element into this deque.
Object remove()	It is used to retrieve and removes the head of this deque.
Object poll()	It is used to retrieve and removes the head of this deque, or returns null if this deque is empty.
Object element()	It is used to retrieve, but does not remove, the head of this deque.
Object peek()	It is used to retrieve, but does not remove, the head of this deque, or returns null if this deque is empty.
Object peekFirst()	The method returns the head element of the deque. The method does not remove any element from the deque. Null is returned by this method, when the deque is empty.
Object peekLast()	The method returns the last element of the deque. The method does not remove any element from the deque. Null is returned by this method, when the deque is empty.
Boolean offerFirst(e)	Inserts the element e at the front of the queue. If the insertion is successful, true is returned; otherwise, false.
Object offerLast(e)	Inserts the element e at the tail of the queue. If the insertion is successful, true is returned; otherwise, false.

====================================================================================================================================

ArrayDeque class
-----------------------------------------------
We know that it is not possible to create an object of an interface in Java. Therefore, for instantiation, we need a class that implements the Deque interface, and that class is ArrayDeque. It grows and shrinks as per usage. It also inherits the AbstractCollection class.

The important points about ArrayDeque class are:
--------------------------------------------------------------------------------------------------
Unlike Queue, we can add or remove elements from both sides.
Null elements are not allowed in the ArrayDeque.
ArrayDeque is not thread safe, in the absence of external synchronization.
ArrayDeque has no capacity restrictions.
ArrayDeque is faster than LinkedList and Stack.
--------------------------------------------------------------------------------------------------

Example:
-----------------
import java.util.*;  
public class DequeExample {  
public static void main(String[] args) {  
    Deque<String> deque=new ArrayDeque<String>();  
    deque.offer("arvind");  
    deque.offer("vimal");  
    deque.add("mukul");  
    deque.offerFirst("jai");  
    System.out.println("After offerFirst Traversal...");  
    for(String s:deque){  
        System.out.println(s);  
    }  
    //deque.poll();  
    //deque.pollFirst();//it is same as poll()  
    deque.pollLast();  
    System.out.println("After pollLast() Traversal...");  
    for(String s:deque){  
        System.out.println(s);  
    }  
}  
}  

Example:
----------------------------
import java.util.*;
public class ArrayDequeExample
{
	public static void main(String[] args)
	{
		Deque<Integer> dq=new ArrayDeque<>();
		dq.add(100);
		dq.add(200);
		dq.add(300);

		System.out.println(dq);
		dq.offer(10);//add from last
		System.out.println(dq);
		dq.offerFirst(5);//add from first
		System.out.println(dq);

		dq.poll();//delete from last
		System.out.println(dq);
		dq.pollFirst();//delete from first
		System.out.println(dq);
		dq.pollLast();//delete from last
		System.out.println(dq);
	}
}



================================================================================================================================
Java Set Interface
================================================================================================================================
The set is an interface available in the java.util package. The set interface extends the Collection interface. An unordered collection or list in which duplicates are not allowed is referred to as a collection interface. The set interface is used to create the mathematical set. The set interface use collection interface's methods to avoid the insertion of the same elements. SortedSet and NavigableSet are two interfaces that extend the set implementation.


Java LinkedHashSet Class
----------------------------
Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface. It inherits the HashSet class and implements the Set interface.

The important points about the Java LinkedHashSet class are:
--------------------------------------------------------------------------------------------------
Java LinkedHashSet class contains unique elements only like HashSet.
Java LinkedHashSet class provides all optional set operations and permits null elements.
Java LinkedHashSet class is non-synchronized.
Java LinkedHashSet class maintains insertion order.


Note: Keeping the insertion order in the LinkedHashset has some additional costs, both in terms of extra memory and extra CPU cycles. Therefore, if it is not required to maintain the insertion order, go for the lighter-weight HashMap or the HashSet instead.

Example:
----------------
import java.util.*;  
  
public class LinkedHashSet3   
{  
  
// main method  
public static void main(String argvs[])  
{  
  
// Creating an empty LinekdhashSet of string type  
LinkedHashSet<String> lhs = new LinkedHashSet<String>();  
  
// Adding elements to the above Set  
// by invoking the add() method  
lhs.add("Java");  
lhs.add("T");  
lhs.add("Point");  
lhs.add("Good");  
lhs.add("Website");  
  
// displaying all the elements on the console  
System.out.println("The hash set is: " + lhs);  
  
// Removing an element from the above linked Set  
  
// since the element "Good" is present, therefore, the method remove()  
// returns true  
System.out.println(lhs.remove("Good"));  
  
// After removing the element  
System.out.println("After removing the element, the hash set is: " + lhs);  
  
// since the element "For" is not present, therefore, the method remove()  
// returns false  
System.out.println(lhs.remove("For"));  
  
}  
}  

Example:
-----------------------------------------------------------
import java.util.*;
public class LnkedHashSetExample
{
	public static void main(String[] args)
	{
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(100);
		lhs.add(200);
		lhs.add(50);
		lhs.add(10);

		System.out.println("LinkedHashSet :"+lhs);

		lhs.add(10);//adding duplicate value, it will not accept
		lhs.add(1);

		System.out.println("LinkedHashSet :"+lhs);

		Iterator<Integer> listitr=lhs.iterator();
	
		System.out.println("Printing LinkedHash set data:");
		while(listitr.hasNext())
		{
			System.out.println(listitr.next());
		}

		lhs.remove(200);

		System.out.println("LinkedHashSet :"+lhs);

		System.out.println("Remove 300 :"+lhs.remove(300));
		System.out.println("Remove 1 :"+lhs.remove(1));

		System.out.println("LinkedHashSet :"+lhs);
	}
}

Example:
-----------------------------------------------
import java.util.*;
public class LinkedHashSetExample
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("This is good boy.");
		lhs.add("This is good girl.");

		System.out.println(lhs);

		LinkedHashSet<String> lhs2=new LinkedHashSet<>();

		for(String sent:lhs)
		{
			String[] words=sent.split(" ");
			for(String word:words)
			{
				lhs2.add(word);
			}
			
		}

		System.out.println(lhs2);
		
	}
}







===================================================================================================================================
Java TreeSet class
====================================================================================================================================
Java TreeSet class implements the Set interface that uses a tree for storage. It inherits AbstractSet class and implements the NavigableSet interface. The objects of the TreeSet class are stored in ascending order.

The important points about the Java TreeSet class are:
----------------------------------------------------------------------------------------------------
Java TreeSet class contains unique elements only like HashSet.
Java TreeSet class access and retrieval times are quiet fast.
Java TreeSet class doesn't allow null element.
Java TreeSet class is non synchronized.
Java TreeSet class maintains ascending order.
Java TreeSet class contains unique elements only like HashSet.
Java TreeSet class access and retrieval times are quite fast.
Java TreeSet class doesn't allow null elements.
Java TreeSet class is non-synchronized.
Java TreeSet class maintains ascending order.
The TreeSet can only allow those generic types that are comparable. For example The Comparable interface is being implemented by the StringBuffer class.


Methods of Java TreeSet Class
----------------------------------------------------------------------------------------------------------------------
boolean add(E e)	It is used to add the specified element to this set if it is not already present.
boolean addAll(Collection<? extends E> c)	It is used to add all of the elements in the specified collection to this set.
E ceiling(E e)	It returns the equal or closest greatest element of the specified element from the set, or null there is no such element.
Iterator descendingIterator()	It is used to iterate the elements in descending order.
NavigableSet descendingSet()	It returns the elements in reverse order.
E floor(E e)	It returns the equal or closest least element of the specified element from the set, or null there is no such element.
SortedSet headSet(E toElement)	It returns the group of elements that are less than the specified element.
E lower(E e)	It returns the closest least element of the specified element from the set, or null there is no such element.
E first()	It returns the first (lowest) element currently in this sorted set.
E last()	It returns the last (highest) element currently in this sorted set.
int size()	It returns the number of elements in this set.
void clear()	It is used to remove all of the elements from this set.
Object clone()	It returns a shallow copy of this TreeSet instance.
boolean contains(Object o)	It returns true if this set contains the specified element.
boolean isEmpty()	It returns true if this set contains no elements.
boolean remove(Object o)	It is used to remove the specified element from this set if it is present.
==============================================================================================================================
Example:
---------------
import java.util.*;    
class TreeSet3{    
 public static void main(String args[]){    
 TreeSet<Integer> set=new TreeSet<Integer>();    
         set.add(24);    
         set.add(66);    
         set.add(12);    
         set.add(15);    
         System.out.println("Lowest Value: "+set.pollFirst());    
         System.out.println("Highest Value: "+set.pollLast());    
 }    
}    

Example2:
import java.util.*;  
class TreeSet4{  
 public static void main(String args[]){  
  TreeSet<String> set=new TreeSet<String>();  
         set.add("A");  
         set.add("B");  
         set.add("C");  
         set.add("D");  
         set.add("E");  
         System.out.println("Initial Set: "+set);  
           
         System.out.println("Reverse Set: "+set.descendingSet());  
           
         System.out.println("Head Set: "+set.headSet("C", true));  
          
         System.out.println("SubSet: "+set.subSet("A", false, "E", true));  
           
         System.out.println("TailSet: "+set.tailSet("C", false));  
 }  
} 

Example:
------------------------------------------------
import java.util.*;
public class TreeSetExample
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t=new TreeSet<>();
		t.add(10);
		t.add(5);
		t.add(3);
		t.add(100);
		//t.add("Nirbhay Singh");
		System.out.println("Tree set data:");
		System.out.println(t);

		t.add(100);//duplicate data , it will avoid to enter
		t.add(200);
		System.out.println(t);
		
	}
}

Class Assignment:
Wap to print treeset data into descending order

Solution:
-----------------------------
import java.util.*;
public class TreeSetExample
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t=new TreeSet<>();
		t.add(10);
		t.add(5);
		t.add(3);
		t.add(100);
		//t.add("Nirbhay Singh");
		System.out.println("Tree set data:");
		System.out.println(t);

		t.add(100);//duplicate data , it will avoid to enter
		t.add(200);
		System.out.println(t);

		//Collections.reverse(t);
		//System.out.println(t);
		Iterator<Integer> it=t.descendingIterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		//find the smallest element
		int min=t.first();
		System.out.print("Minimum Value from sorted treeset :"+min);
	}
}


Example:
import java.util.*;
public class TreeSetExample
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t=new TreeSet<>();
		t.add(10);
		t.add(5);
		t.add(3);
		t.add(100);
		//t.add("Nirbhay Singh");
		System.out.println("Tree set data:");
		System.out.println(t);

		t.add(100);//duplicate data , it will avoid to enter
		t.add(200);
		System.out.println(t);

		//Collections.reverse(t);
		//System.out.println(t);
		Iterator<Integer> it=t.descendingIterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}

		//find the smallest element
		int min=t.first();
		System.out.println("Minimum Value from sorted treeset :"+min);

		int max=t.last();
		System.out.println("Maximum Value from sorted treeset :"+max);
		
	}
}


 

====================================================================================================================================
Java HashSet
======================
Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.

The important points about Java HashSet class are:
-------------------------------------------------------------------------------------------------------------------
HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.

===================================================================================================================================
Difference between List and Set
------------------------------------------------------------------------------------
A list can contain duplicate elements whereas Set contains unique elements only.


Methods of Java HashSet class
----------------------------------------
1)	boolean	add(E e)	It is used to add the specified element to this set if it is not already present.
2)	void	clear()	It is used to remove all of the elements from the set.
3)	object	clone()	It is used to return a shallow copy of this HashSet instance: the elements themselves are not cloned.
4)	boolean	contains(Object o)	It is used to return true if this set contains the specified element.
5)	boolean	isEmpty()	It is used to return true if this set contains no elements.
6)	Iterator<E>	iterator()	It is used to return an iterator over the elements in this set.
7)	boolean	remove(Object o)	It is used to remove the specified element from this set if it is present.
8)	int	size()	It is used to return the number of elements in the set.
9)	Spliterator<E>	spliterator()	It is used to create a late-binding and fail-fast Spliterator over the elements in the set.

Example:
-------------------
import java.util.*;  
class HashSet3{  
 public static void main(String args[]){  
  HashSet<String> set=new HashSet<String>();  
           set.add("Ravi");  
           set.add("Vijay");  
           set.add("Arun");  
           set.add("Sumit");  
           System.out.println("An initial list of elements: "+set);  
           //Removing specific element from HashSet  
           set.remove("Ravi");  
           System.out.println("After invoking remove(object) method: "+set);  
           HashSet<String> set1=new HashSet<String>();  
           set1.add("Ajay");  
           set1.add("Gaurav");  
           set.addAll(set1);  
           System.out.println("Updated List: "+set);  
           //Removing all the new elements from HashSet  
           set.removeAll(set1);  
           System.out.println("After invoking removeAll() method: "+set);  
           //Removing elements on the basis of specified condition  
           set.removeIf(str->str.contains("Vijay"));    
           System.out.println("After invoking removeIf() method: "+set);  
           //Removing all the elements available in the set  
           set.clear();  
           System.out.println("After invoking clear() method: "+set);  
 }  
}  

Example:
--------------------------------------
import java.util.*;
public class HashSetExample
{
	public static void main(String[] args)
	{
		HashSet<Integer> hs=new HashSet<>();
		hs.add(100);
		hs.add(10);
		hs.add(1);
		hs.add(200);
		hs.add(17);
		hs.add(33);
		hs.add(116);

		System.out.println(hs);
	}
}
Output:
------------
C:\Users\Basavaraju\Desktop\LPU\Core Java>java  HashSetExample
[1, 17, 33, 100, 116, 200, 10]











==================================================================================================================================
Java Map Interface
================================================================================
A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry. A Map contains unique keys.

A Map is useful if you have to search, update or delete elements on the basis of a key.


A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
----------------------------------------------------------------------------------------------------------------------------
Class			Description
===================	=====================================================================================================
HashMap			HashMap is the implementation of Map, but it doesn't maintain any order.
LinkedHashMap		LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
TreeMap			TreeMap is the implementation of Map and SortedMap. It maintains ascending order.


=============================================================================================================================
Useful methods of Map interface
-----------------------------------
V put(Object key, Object value)	It is used to insert an entry in the map.
void putAll(Map map)	It is used to insert the specified map in the map.
V remove(Object key)	It is used to delete an entry for the specified key.
boolean remove(Object key, Object value)	It removes the specified values with the associated specified keys from the map.
Set keySet()	It returns the Set view containing all the keys.
Set<Map.Entry<K,V>> entrySet()	It returns the Set view containing all the keys and values.
void clear()	It is used to reset the map.
boolean containsValue(Object value)	This method returns true if some value equal to the value exists within the map, else return false.
boolean containsKey(Object key)	This method returns true if some key equal to the key exists within the map, else return false.
V get(Object key)	This method returns the object that contains the value associated with the key.
Collection values()	It returns a collection view of the values contained in the map.
int size()	This method returns the number of entries in the map.
==================================================================================================================================
Map.Entry Interface
====================================
Entry is the subinterface of Map. So we will be accessed it by Map.Entry name. It returns a collection-view of the map, whose elements are of this class. It provides methods to get key and value.

Methods of Map.Entry interface
------------------------------------
K getKey()	It is used to obtain a key.
V getValue()	It is used to obtain value.

====================================================================================================================================
Example:
--------------------------
import java.util.*;  
class MapExample2{  
 public static void main(String args[]){  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(101,"Vijay");  
  map.put(102,"Rahul");  
  //Elements can traverse in any order  
  for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  


===================================================================================================================================
Java HashMap
====================
Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique. If you try to insert the duplicate key, it will replace the element of the corresponding key. It is easy to perform operations using the key index like updation, deletion, etc. HashMap class is found in the java.util package.

HashMap in Java is like the legacy Hashtable class, but it is not synchronized. It allows us to store the null elements as well, but there should be only one null key. Since Java 5, it is denoted as HashMap<K,V>, where K stands for key and V for value. It inherits the AbstractMap class and implements the Map interface.

Points to remember
----------------------------------------------------------------------------------------------
Java HashMap contains values based on the key.
Java HashMap contains only unique keys.
Java HashMap may have one null key and multiple null values.
Java HashMap is non synchronized.
Java HashMap maintains no order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.



HashMap class Parameters
Let's see the Parameters for java.util.HashMap class.
---------------------------------------------------------------------------
K: It is the type of keys maintained by this map.
V: It is the type of mapped values.


No Duplicate Key on HashMap
----------------------------------------------------------------------------
You cannot store duplicate keys in HashMap. However, if you try to store duplicate key with another value, it will replace the value.

import java.util.*;  
public class HashMapExample2{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"Mango");  //Put elements in Map  
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(1,"Grapes"); //trying duplicate key  
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  

Example:
-----------------------------------------------------
import java.util.*;

public class HashMapExample
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"Apple");
		hm.put(2,"Banana");
		hm.put(3,"Mango");
		hm.put(4,"Orange");

		System.out.println(hm);

		for(Map.Entry m:hm.entrySet())
		{
			int key=(int)m.getKey();
			String value=(String)m.getValue();

			System.out.println(key+" : "+value);	
		}
	}
}











