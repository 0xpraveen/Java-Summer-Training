Example of finally block:
------------------------------
public class FinallyBlock
{
	public static void main(String[] args)
	{
		try
		{
			int a=5;
			int b=0;
			int res=a/b;//exception
			System.out.println("Hello Try block.");//this line will not be executed
		}
		catch(Exception e)
		{
				//System.out.println(e);
			System.out.println(e.getMessage());//based on exception raised ,this block executes.
		}
		finally
		{
			System.out.println("Hello finally block.");
			//atleast finally block will be executed. it doesn't depends on try and catch
		}
	}
	
}


Multi Catch block
====================
Example:
public class MultipleCatchBlock
{
	public static void main(String[] args)
	{
		try
		{
			String str=null;
			int len=str.length();//NullPointerException

			int a=5;
			int b=0;
			int res=a/b;//ArithmeticException

			System.out.println("Hello Try block.");
		}
		catch(NullPointerException np)
		{
			System.out.println("Catch block of Null Pointer invoked");
			System.out.println(np);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("Catch block Arithmetic invoked");
		}
		
	}
	
}

Example :
public class MultipleCatchBlock
{
	public static void main(String[] args)
	{
		try
		{
			String str=null;
			int len=str.length();

			int a=5;
			int b=0;
			int res=a/b;

			System.out.println("Hello Try block.");
		}
		catch(NullPointerException np)
		{
			System.out.println("Catch block of Null Pointer invoked");
			System.out.println(np);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("Catch block Arithmetic invoked");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}
Note : Parent Exception should be at last catch block.

==============================================================================================================
Java throw Exception
---------------------------------------
In Java, exceptions allows us to write good quality codes where the errors are checked at the compile time instead of runtime and we can create custom exceptions making the code recovery and debugging easier.

Java throw keyword
-------------------------------------------------------------------
The Java throw keyword is used to throw an exception explicitly.

We specify the exception object which is to be thrown. The Exception has some message with it that provides the error description. These exceptions may be related to user inputs, server, etc.

We can throw either checked or unchecked exceptions in Java by throw keyword. It is mainly used to throw a custom exception. 

The syntax of the Java throw keyword is given below.
---------------------------------------------------------------------
throw Instance i.e.,

throw new exception_class("error message");  
Let's see the example of throw IOException.

throw new IOException("sorry device error");   
Example:
public class ThrowKeywordExample
{
	public void validateAge(int age)
	{
		try
		{
			if(age<18)
			{
				throw new NullPointerException("Invalid Age");
			}
			else
			{
				System.out.println("Welcome to voter list");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args)
	{
		ThrowKeywordExample tke=new ThrowKeywordExample();
		tke.validateAge(15);
	}
}
=============================================================================================================
Java throws keyword
----------------------------------------------------
The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception. So, it is better for the programmer to provide the exception handling code so that the normal flow of the program can be maintained.

Exception Handling is mainly used to handle the checked exceptions. If there occurs any unchecked exception such as NullPointerException, it is programmers' fault that he is not checking the code before it being used.

Syntax of Java throws
return_type method_name() throws exception_class_name{  
//method code  
}  

Q.Which exception should be declared?
Ans: Checked exception only, because:
unchecked exception: under our control so we can correct our code.
error: beyond our control. For example, we are unable to do anything if there occurs VirtualMachineError or StackOverflowError.

Advantage of Java throws keyword
* Now Checked Exception can be propagated (forwarded in call stack).
* It provides information to the caller of the method about the exception.

Example:
------------------
public class ThrowsKeywordExample
{
	public static void main(String... args)throws NullPointerException
	{
		String str=null;
		int len=str.length();
		System.out.println("Hello");
	}
}

Example:
------------------
public class ThrowAndThrowsKeyword
{
	public void ageValidate(int age)throws NullPointerException
	{
		if(age<18)
		{
			throw new NullPointerException("Invalid Age");
		}
		else
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args)//args is command line argument, it is an array type of String
	{
		int age =Integer.parseInt(args[0]);
		ThrowAndThrowsKeyword th=new ThrowAndThrowsKeyword();
		th.ageValidate(age);
	}
}

================================================================================================================
Exception Handling with Method Overriding in Java
================================================================================================================
There are many rules if we talk about method overriding with exception handling.

Some of the rules are listed below:
----------------------------------------------------
If the superclass method does not declare an exception
	* If the superclass method does not declare an exception, subclass overridden method cannot declare the 
	  checked exception but it can declare unchecked exception.

If the superclass method declares an exception
	* If the superclass method declares an exception, subclass overridden method can declare same, subclass 
	  exception or no exception but cannot declare parent exception.
================================================================================================================
Example:
---------------------------
class Student
{
	void fun()
	{
		System.out.println("Parent is invoked");
	}
}

public class OverridingMethodException extends Student
{
	void fun()throws NullPointerException
	{
		System.out.println("Child is invoked");
	}
	
	public static void main(String[] args)
	{
		OverridingMethodException ovt=new OverridingMethodException();
		ovt.fun();
	}
}





=================================================================================================================
			User-defined Custom Exception in Java
=================================================================================================================
An exception is an issue (run time error) that occurred during the execution of a program. When an exception occurred the program gets terminated abruptly and, the code past the line that generated the exception never gets executed.

Java provides us the facility to create our own exceptions which are basically derived classes of Exception. Creating our own Exception is known as a custom exception or user-defined exception. Basically, Java custom exceptions are used to customize the exception according to user needs. In simple words, we can say that a User-Defined Exception or custom exception is creating your own exception class and throwing that exception using the ‘throw’ keyword.

For example, MyException in the below code extends the Exception class. 

Why use custom exceptions?
===================================================================
Java exceptions cover almost all the general types of exceptions that may occur in the programming. However, we sometimes need to create custom exceptions.

Following are a few of the reasons to use custom exceptions:
* To catch and provide specific treatment to a subset of existing Java exceptions.
* Business logic exceptions: These are the exceptions related to business logic and workflow. It is useful for the 
  application users or the developers to understand the exact problem.


In order to create a custom exception, we need to extend the Exception class that belongs to java.lang package.

Example: We pass the string to the constructor of the superclass- Exception which is obtained using the “getMessage()” function on the object created.



// A Class that represents use-defined exception
 
class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
// A Class that uses above MyException
public class Main {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException("lpu");
        }
        catch (MyException ex) {
            System.out.println("Caught");
 
            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}

Output
Caught
lpu


In the above code, the constructor of MyException requires a string as its argument. The string is passed to the parent class Exception’s constructor using super(). The constructor of the Exception class can also be called without a parameter and the call to super is not mandatory.

Example:
-------------------------------------------------------------------------------
class InvalidAgeException extends Exception
{
	
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
	
}

public class CustomExceptionExample 
{
	public void ageValidate(int age)throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Invalid Age");
		}
		else
		{
			System.out.println("Welcome for Vote..");
		}
	}
	public static void main(String[] args) throws InvalidAgeException
	{
		CustomExceptionExample cee=new CustomExceptionExample();
		cee.ageValidate(15);
	}
} 


====================================================================================================================
						Collections in Java
====================================================================================================================
Any group of individual objects which are represented as a single unit is known as a collection of objects. In Java, a separate framework named the “Collection Framework” has been defined in JDK 1.2 which holds all the collection classes and interface in it. 

In Java, Collection interface (java.util.Collection) and Map interface (java.util.Map) are the two main “root” interfaces of Java collection classes.

What is a framework in Java
* It provides readymade architecture.
* It represents a set of classes and interfaces.
* It is optional.

Hierarchy of Collection Framework
==============================================
Let us see the hierarchy of Collection framework. The java.util package contains all the classes and interfaces for the Collection framework.

=>Iterable
	=>Collection
		1. List
		    a. ArrayList
		    b. LinkedList
		    c. Vector
		    d. Stack
		2. Queue
		   a. PriorityQueue
		   b. Deque
		   c. ArrayDeque
		3. Set
		   a. HashSet
		   b. LinkedHashSet
		   c. TreeSet
=>Map
   a. HashMap
   b. LinkedHashMap
   c. SortedMap
   d. TreeMap
====================================================================================================================
=>Iterator interface
Iterator interface provides the facility of iterating the elements in a forward direction only.

Methods of Iterator interface
-------------------------------------
1. public boolean hasNext(): It returns true if the iterator has more elements otherwise it returns false.
2. public Object next(): It returns the element and moves the cursor pointer to the next element.
3. public void remove(): It removes the last elements returned by the iterator. It is less used.

=>Iterable Interface
The Iterable interface is the root interface for all the collection classes. The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface.

It contains only one abstract method. i.e.,
Iterator<T> iterator() 

It returns the iterator over the elements of type T.

=====================================================================================================================
List Interface
====================================
List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.

List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.

To instantiate the List interface, we must use :
* List <data-type> list1= new ArrayList();  
* List <data-type> list2 = new LinkedList();  
* List <data-type> list3 = new Vector();  
* List <data-type> list4 = new Stack();  

There are various methods in List interface that can be used to insert, delete, and access the elements from the list.

ArrayList
====================================================================================================================
The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types. The ArrayList class maintains the insertion order and is non-synchronized. The elements stored in the ArrayList class can be randomly accessed.

The important points about the Java ArrayList class are:
----------------------------------------------------------
* Java ArrayList class can contain duplicate elements.
* Java ArrayList class maintains insertion order.
* Java ArrayList class is non synchronized.
* Java ArrayList allows random access because the array works on an index basis.
* In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to  
  occur if any element is removed from the array list.
* We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the 
  required wrapper class in such cases.

Example:
ArrayList<int> al = ArrayList<int>(); // does not work  
ArrayList<Integer> al = new ArrayList<Integer>(); // works fine  

* Java ArrayList gets initialized by the size. The size is dynamic in the array list, which varies according to the 
  elements getting added or removed from the list.

Methods of ArrayList
===================================
* void add(int index, E element)	It is used to insert the specified element at the specified position in a list.

* boolean add(E e)	It is used to append the specified element at the end of a list.

* boolean addAll(Collection<? extends E> c)	It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.

* boolean addAll(int index, Collection<? extends E> c)	It is used to append all the elements in the specified collection, starting at the specified position of the list.

* void clear()	It is used to remove all of the elements from this list.

* E get(int index)	It is used to fetch the element from the particular position of the list.

* boolean isEmpty()	It returns true if the list is empty, otherwise false.

* int lastIndexOf(Object o)	It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.

* E remove(int index)	It is used to remove the element present at the specified position in the list.
* boolean remove(Object o)	It is used to remove the first occurrence of the specified element.
* boolean removeAll(Collection<?> c)	It is used to remove all the elements from the list.

* protected void removeRange(int fromIndex, int toIndex)	It is used to remove all the elements lies within the given range.

* void retainAll(Collection<?> c)	It is used to retain all the elements in the list that are present in the specified collection.

* E set(int index, E element)	It is used to replace the specified element in the list, present at the specified position.

* void sort(Comparator<? super E> c)	It is used to sort the elements of the list on the basis of the specified comparator.

* int size()	It is used to return the number of elements present in the list.

====================================================================================================================
Java ArrayList Example
FileName: ArrayListExample1.java

import java.util.*;  
 public class ArrayListExample1
{  
 public static void main(String args[])
{  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
      list.add("Mango");//Adding object in arraylist    
      list.add("Apple");    
      list.add("Banana");    
      list.add("Grapes");    
      //Printing the arraylist object   
      System.out.println(list);  
 }  
}  

Example :
----------------------------------
import java.util.*;
public class ArraListExample
{
	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(10);

		System.out.println(list);
		//insert an element after 20
		list.add(3,50);
		System.out.println(list);

		//combine one list to another list this is known as union
		List<Integer> list2=new ArrayList<>();
		list2.add(100);
		list2.add(200);

		list2.addAll(list);
		System.out.println("After combined list2:");
		System.out.println(list2);

		//find the intersection between list and list2
		list2.retainAll(list);
		System.out.println("After retailAll list2:");
		System.out.println(list2);

		int lastElement=list2.get(list2.size()-1);
		System.out.println("Last Element from List2:"+lastElement);

		int firstElement=list2.get(0);
		System.out.println("First Element from List2:"+firstElement);

		int ele=list2.get(3);
		System.out.println("3 index's Element from List2:"+ele);

		list2.remove(list2.size()-1);// to remove last element
		System.out.println(list2);

		list2.clear();
		System.out.println(list2);

	}
}

Iterating ArrayList using Iterator
-----------------------------------------------------------------------------------------
Let's see an example to traverse ArrayList elements using the Iterator interface.

FileName: ArrayListExample2.java

import java.util.*;  
public class ArrayListExample2
{  
 public static void main(String args[])
{  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("Mango");//Adding object in arraylist    
  list.add("Apple");    
  list.add("Banana");    
  list.add("Grapes");    
  //Traversing list through Iterator  
  Iterator itr=list.iterator();//getting the Iterator  
  while(itr.hasNext())
{//check if iterator has the elements  
   System.out.println(itr.next());//printing the element and move to next  
  }  
 }  
}  

Iterating ArrayList using For-each loop
Let's see an example to traverse the ArrayList elements using the for-each loop

FileName: ArrayListExample3.java

import java.util.*;  
public class ArrayListExample3{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("Mango");//Adding object in arraylist    
  list.add("Apple");    
  list.add("Banana");    
  list.add("Grapes");    
  //Traversing list through for-each loop  
  for(String fruit:list)    
    System.out.println(fruit);    
  
 }  
}  


==========================================================================================================================
Java LinkedList class
==============================
Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

The important points about Java LinkedList are:
-----------------------------------------------------------------------------------------
* Java LinkedList class can contain duplicate elements.
* Java LinkedList class maintains insertion order.
* Java LinkedList class is non synchronized.
* In Java LinkedList class, manipulation is fast because no shifting needs to occur.
* Java LinkedList class can be used as a list, stack or queue.

Java LinkedList Example
-----------------------------------------------
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

=========================================================================================================================
Java Stack
==========================
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



