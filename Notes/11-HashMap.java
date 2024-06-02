==================================================================================================================================
Java LinkedHashMap class
=============================
Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface, with predictable iteration order. It inherits HashMap class and implements the Map interface.

Points to remember
-------------------------------------------------------------------------------------------------
Java LinkedHashMap contains values based on the key.
Java LinkedHashMap contains unique elements.
Java LinkedHashMap may have one null key and multiple null values.
Java LinkedHashMap is non synchronized.
Java LinkedHashMap maintains insertion order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

LinkedHashMap class Parameters
Let's see the Parameters for java.util.LinkedHashMap class.
------------------------------------------------------------------------------------------------
* K: It is the type of keys maintained by this map.
* V: It is the type of mapped values.

Methods of Java LinkedHashMap class
-----------------------------------------------------------------------------------------------
V get(Object key)	It returns the value to which the specified key is mapped.
void clear()	It removes all the key-value pairs from a map.
boolean containsValue(Object value)	It returns true if the map maps one or more keys to the specified value.
Set<Map.Entry<K,V>> entrySet()	It returns a Set view of the mappings contained in the map.
void forEach(BiConsumer<? super K,? super V> action)	It performs the given action for each entry in the map until all entries have been processed or the action throws an exception.
V getOrDefault(Object key, V defaultValue)	It returns the value to which the specified key is mapped or defaultValue if this map contains no mapping for the key.
Set<K> keySet()	It returns a Set view of the keys contained in the map
protected boolean removeEldestEntry(Map.Entry<K,V> eldest)	It returns true on removing its eldest entry.
void replaceAll(BiFunction<? super K,? super V,? extends V> function)	It replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
Collection<V> values()	It returns a Collection view of the values contained in this map

=====================================================================================================================================
Example:
---------------
Java LinkedHashMap Example: Key-Value pair
----------------------------------------------
import java.util.*;  
class LinkedHashMap2{  
 public static void main(String args[]){  
   LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();           
      map.put(100,"Amit");    
     map.put(101,"Vijay");    
     map.put(102,"Rahul");    
       //Fetching key  
       System.out.println("Keys: "+map.keySet());  
       //Fetching value  
       System.out.println("Values: "+map.values());  
       //Fetching key-value pair  
       System.out.println("Key-Value pairs: "+map.entrySet());  
 }  
}  

Java LinkedHashMap Example:remove()
---------------------------------------------------------------------------------
import java.util.*;  
public class LinkedHashMap3 {  
   public static void main(String args[]) {  
    Map<Integer,String> map=new LinkedHashMap<Integer,String>();        
     map.put(101,"Amit");    
     map.put(102,"Vijay");    
     map.put(103,"Rahul");    
     System.out.println("Before invoking remove() method: "+map);     
    map.remove(102);  
    System.out.println("After invoking remove() method: "+map);    
   }      
}  

Example:
----------------------------------
import java.util.*;
public class LinkedHashMapExample
{
	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		lhm.put(1,"Apple");
		lhm.put(2,"Mango");
		lhm.put(3,"Banana");
		lhm.put(4,"Litchi");

		System.out.println(lhm);

		System.out.println("Only Keys :"+lhm.keySet());
		System.out.println("Only values :"+lhm.values());
		System.out.println("Key and Values :"+lhm.entrySet());

		String replacedValue=lhm.replace(2,"Orange");
		System.out.println("After Replacement of Mango to Orange :"+lhm.entrySet());
		System.out.println("Replaced Value:"+replacedValue);
		
	}
}


Class Assignment:
Wap to accept product name,price and productid and return to the function. after return to function. take product details from function and store in linkedhashmap and print it.
Solution:
-----------------------------
import java.util.*;
class Product
{
	int pid;
	String pname;
	double price;
	Product(int pid,String pname,double price)
	{
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
}
public class LinkedHashMapExample
{
	public LinkedHashMap<Integer,Product> getProductDetails(int noOfProduct)
	{
		LinkedHashMap<Integer,Product> lhm=new LinkedHashMap<>();
		Scanner input=new Scanner(System.in);
		for(int i=0;i<noOfProduct;i++)
		{
			System.out.println("Enter Product id:");
			int pid=input.nextInt();

			System.out.println("Enter Product Name:");
			input.nextLine();
			String pname=input.nextLine();

			System.out.println("Enter Product Price:");
			double price=input.nextDouble();

			Product p=new Product(pid,pname,price);
			lhm.put(pid,p);
		}
	return lhm;
	}
	public static void main(String[] args)
	{
		LinkedHashMapExample obj=new LinkedHashMapExample();
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter number of product:");
		int numOfProduct=scan.nextInt();

		LinkedHashMap<Integer,Product> lhm=new LinkedHashMap<>();
		
		lhm=obj.getProductDetails(numOfProduct);

		for(Map.Entry m:lhm.entrySet())
		{
			int key=(int)m.getKey();
			Product p=(Product)m.getValue();
			System.out.println(key+" :"+p.pname+" ,Price :"+p.price);
		}
		
		
	}
}








==================================================================================================================================
Java TreeMap class
------------------------------
Java TreeMap class is a red-black tree based implementation. It provides an efficient means of storing key-value pairs in sorted order.

The important points about Java TreeMap class are:
-------------------------------------------------------------------------------
Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
Java TreeMap contains only unique elements.
Java TreeMap cannot have a null key but can have multiple null values.
Java TreeMap is non synchronized.
Java TreeMap maintains ascending order.


TreeMap class Parameters
Let's see the Parameters for java.util.TreeMap class.
----------------------------------------------------------------
K: It is the type of keys maintained by this map.
V: It is the type of mapped values.


Methods of Java TreeMap class
------------------------------------------------------------------
Map.Entry<K,V> ceilingEntry(K key)	It returns the key-value pair having the least key, greater than or equal to the specified key, or null if there is no such key.
K ceilingKey(K key)	It returns the least key, greater than the specified key or null if there is no such key.
void clear()	It removes all the key-value pairs from a map.

NavigableSet<K> descendingKeySet()	It returns a reverse order NavigableSet view of the keys contained in the map.
NavigableMap<K,V> descendingMap()	It returns the specified key-value pairs in descending order.
Map.Entry firstEntry()	It returns the key-value pair having the least key.
Map.Entry<K,V> lastEntry()	It returns the key-value pair having the greatest key, or null if there is no such key.
Map.Entry<K,V> pollFirstEntry()	It removes and returns a key-value mapping associated with the least key in this map, or null if the map is empty.
Map.Entry<K,V> pollLastEntry()	It removes and returns a key-value mapping associated with the greatest key in this map, or null if the map is empty.
V put(K key, V value)	It inserts the specified value with the specified key in the map.
void putAll(Map<? extends K,? extends V> map)	It is used to copy all the key-value pair from one map to another map.
V replace(K key, V value)	It replaces the specified value for a specified key.
boolean replace(K key, V oldValue, V newValue)	It replaces the old value with the new value for a specified key.
void replaceAll(BiFunction<? super K,? super V,? extends V> function)	It replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
boolean containsKey(Object key)	It returns true if the map contains a mapping for the specified key.
boolean containsValue(Object value)	It returns true if the map maps one or more keys to the specified value.
K firstKey()	It is used to return the first (lowest) key currently in this sorted map.
V get(Object key)	It is used to return the value to which the map maps the specified key.
K lastKey()	It is used to return the last (highest) key currently in the sorted map.
V remove(Object key)	It removes the key-value pair of the specified key from the map.
Set<Map.Entry<K,V>> entrySet()	It returns a set view of the mappings contained in the map.
int size()	It returns the number of key-value pairs exists in the hashtable.
Collection values()	It returns a collection view of the values contained in the map.
===================================================================================================================================
Example:
----------------------
import java.util.*;  
class TreeMap3{  
 public static void main(String args[]){  
   NavigableMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Amit");    
      map.put(102,"Ravi");    
      map.put(101,"Vijay");    
      map.put(103,"Rahul");    
      //Maintains descending order  
      System.out.println("descendingMap: "+map.descendingMap());  
      //Returns key-value pairs whose keys are less than or equal to the specified key.  
      System.out.println("headMap: "+map.headMap(102,true));  
      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
      System.out.println("tailMap: "+map.tailMap(102,true));  
      //Returns key-value pairs exists in between the specified key.  
      System.out.println("subMap: "+map.subMap(100, false, 102, true));   
 }  
}  

What is difference between HashMap and TreeMap?
------------------------------------------------------------------------------------------------------------------
HashMap							TreeMap
==============================================		==========================================================
1) HashMap can contain one null key.			TreeMap cannot contain any null key.
2) HashMap maintains no order.				TreeMap maintains ascending order.
==================================================================================================================
Example:
-----------------------------
import java.util.*;
public class TreeMapExample
{
	public static void main(String[] args)
	{
		TreeMap<String,String> tm=new TreeMap<>();
		tm.put("USN001","Tamanna");
		tm.put("USN002","Madhav");
		tm.put("USN003","Acharya");
		tm.put("USN004","Tharun Kumar");

		System.out.println(tm);

		System.out.println("Participated Student's USN NO:");
		
		for(Map.Entry usn:tm.entrySet())
		{
			System.out.println(usn.getKey());
		}

		System.out.println("Participated Student's Names:");
		for(Map.Entry usn:tm.entrySet())
		{
			System.out.println(usn.getValue());
		}

		System.out.println("Participated Student's USN no and Names:");
		for(Map.Entry usn:tm.entrySet())
		{
			System.out.println(usn.getKey()+" : "+usn.getValue());
		}

		//code here print last key value and print first key value
		System.out.println("First Key and Value:"+tm.firstEntry());
		System.out.println("Last Key and Value:"+tm.lastEntry());

		//Last key and first key
		System.out.println("First Key:"+tm.firstKey());
		System.out.println("Last Key:"+tm.lastKey());
		
		//Replace the name where USN003
		String values=tm.replace("USN003","Ronak");
		System.out.println("Replace Participant Name whose USN no is USN003: "+values+" to Ronak:");
		System.out.println("New List of Participated Student's USN no and Names:");
		for(Map.Entry usn:tm.entrySet())
		{
			System.out.println(usn.getKey()+" : "+usn.getValue());
		}
		
	}
}


==================================================================================================================================
								Threads
==================================================================================================================================
A thread is a lightweight subprocess, the smallest unit of processing. It is a separate path of execution.
Threads are independent. If there occurs exception in one thread, it doesn't affect other threads. It uses a shared memory area.

Note: At least one process is required for each thread.

A thread is executed inside the process. There is context-switching between the threads. There can be multiple processes inside the OS, and one process can have multiple threads.

Java Thread class
---------------------------------------------------
Java provides Thread class to achieve thread programming. Thread class provides constructors and methods to create and perform operations on a thread. Thread class extends Object class and implements Runnable interface.


Java Thread Methods
------------------------------------------------------------------------------------------------
1)	void	start()			It is used to start the execution of the thread.
2)	void	run()			It is used to do an action for a thread.
3)	static void sleep()		It sleeps a thread for the specified amount of time.
4)	static Thread currentThread()	It returns a reference to the currently executing thread object.
5)	void	join()			It waits for a thread to die.
6)	int	getPriority()		It returns the priority of the thread.
7)	void	setPriority()		It changes the priority of the thread.
8)	String	getName()		It returns the name of the thread.
9)	void	setName()		It changes the name of the thread.
10)	long	getId()			It returns the id of the thread.
11)	boolean	isAlive()		It tests if the thread is alive.
12)	static void yield()		It causes the currently executing thread object to pause and allow other threads to execute 
					temporarily.
13)	void	suspend()		It is used to suspend the thread.
14)	void	resume()		It is used to resume the suspended thread.
15)	void	stop()			It is used to stop the thread.
16)	void	destroy()		It is used to destroy the thread group and all of its subgroups.

====================================================================================================================================
Life cycle of a Thread (Thread States)
===========================================
In Java, a thread always exists in any one of the following states. 
These states are:
---------------------------------------------
1. New
2. Active
3. Blocked / Waiting
4. Timed Waiting
5. Terminated

-----------------------------------------------------------------------------------------------------------------------------------
Explanation of Different Thread States
===================================================================================================================================
* New: Whenever a new thread is created, it is always in the new state. For a thread in the new state, the code has not been run yet 
       and thus has not begun its execution.

* Active: When a thread invokes the start() method, it moves from the new state to the active state. The active state contains two 
          states within it: one is runnable, and the other is running.

	* Runnable: A thread, that is ready to run is then moved to the runnable state. In the runnable state, the thread may be 
                    running or may be ready to run at any given instant of time. It is the duty of the thread scheduler to provide the 
                    thread time to run, i.e., moving the thread the running state.

	    	A program implementing multithreading acquires a fixed slice of time to each individual thread. Each and every thread 		runs for a short span of time and when that allocated time slice is over, the thread voluntarily gives up the CPU to 
		the other thread, so that the other threads can also run for their slice of time. Whenever such a scenario occurs, all 
		those threads that are willing to run, waiting for their turn to run, lie in the runnable state. In the runnable 
                state, there is a queue where the threads lie.

	* Running: When the thread gets the CPU, it moves from the runnable to the running state. Generally, the most common change in 
		   the state of a thread is from runnable to running and again back to runnable.

* Blocked or Waiting: Whenever a thread is inactive for a span of time (not permanently) then, either the thread is in the blocked 
		      state or is in the waiting state.

* Timed Waiting: Sometimes, waiting for leads to starvation. For example, a thread (its name is A) has entered the critical section of 
		 a code and is not willing to leave that critical section. In such a scenario, another thread (its name is B) has to 
		 wait forever, which leads to starvation. To avoid such scenario, a timed waiting state is given to thread B. Thus, 
		 thread lies in the waiting state for a specific span of time, and not forever. A real example of timed waiting is 
		 when we invoke the sleep() method on a specific thread. The sleep() method puts the thread in the timed wait state. 
		 After the time runs out, the thread wakes up and start its execution from when it has left earlier.

* Terminated: A thread reaches the termination state because of the following reasons:
	* When a thread has finished its job, then it exists or terminates normally.
	* Abnormal termination: It occurs when some unusual events such as an unhandled exception or segmentation fault.

A terminated thread means the thread is no more in the system. In other words, the thread is dead, and there is no way one can respawn (active after kill) the dead thread.

======================================================================================================================================
Java Program for Demonstrating Thread States
======================================================================================================================================
The following Java program shows some of the states of a thread defined above.
----------------------------------------------------------------------------------
// ABC class implements the interface Runnable  
class ABC implements Runnable  
{  
public void run()  
{  
  
// try-catch block  
try  
{  
// moving thread t2 to the state timed waiting  
Thread.sleep(100);  
}  
catch (InterruptedException ie)  
{  
ie.printStackTrace();  
}  
  
  
System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -"+ ThreadState.t1.getState());  
  
// try-catch block  
try  
{  
Thread.sleep(200);  
}  
catch (InterruptedException ie)  
{  
ie.printStackTrace();  
}     
}  
}  
  
// ThreadState class implements the interface Runnable  
public class ThreadState implements Runnable  
{  
public static Thread t1;  
public static ThreadState obj;  
  
// main method   
public static void main(String argvs[])  
{  
// creating an object of the class ThreadState  
obj = new ThreadState();  
t1 = new Thread(obj);  
  
// thread t1 is spawned   
// The thread t1 is currently in the NEW state.  
System.out.println("The state of thread t1 after spawning it - " + t1.getState());  
  
// invoking the start() method on   
// the thread t1  
t1.start();  
  
// thread t1 is moved to the Runnable state  
System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());  
}  
  
public void run()  
{  
ABC myObj = new ABC();  
Thread t2 = new Thread(myObj);  
  
// thread t2 is created and is currently in the NEW state.  
System.out.println("The state of thread t2 after spawning it - "+ t2.getState());  
t2.start();  
  
// thread t2 is moved to the runnable state  
System.out.println("the state of thread t2 after calling the method start() on it - " + t2.getState());  
  
// try-catch block for the smooth flow of the  program  
try  
{  
// moving the thread t1 to the state timed waiting   
Thread.sleep(200);  
}  
catch (InterruptedException ie)  
{  
ie.printStackTrace();  
}  
  
System.out.println("The state of thread t2 after invoking the method sleep() on it - "+ t2.getState() );  
  
// try-catch block for the smooth flow of the  program  
try  
{  
// waiting for thread t2 to complete its execution  
t2.join();  
}  
catch (InterruptedException ie)  
{  
ie.printStackTrace();  
}  
System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());  
}  
  
}  

===================================================================================================================================
Java Threads | How to create a thread in Java
===================================================
There are two ways to create a thread:
	1. By extending Thread class
	2. By implementing Runnable interface.

Commonly used methods of Thread class:
------------------------------------------------------------------------------------------------------------------------------------
public void run(): is used to perform action for a thread.
public void start(): starts the execution of the thread.JVM calls the run() method on the thread.
public void sleep(long miliseconds): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
public void join(): waits for a thread to die.
public void join(long miliseconds): waits for a thread to die for the specified miliseconds.
public int getPriority(): returns the priority of the thread.
public int setPriority(int priority): changes the priority of the thread.
public String getName(): returns the name of the thread.
public void setName(String name): changes the name of the thread.
public Thread currentThread(): returns the reference of currently executing thread.
public int getId(): returns the id of the thread.
public Thread.State getState(): returns the state of the thread.
public boolean isAlive(): tests if the thread is alive.
public void yield(): causes the currently executing thread object to temporarily pause and allow other threads to execute.
public void suspend(): is used to suspend the thread(depricated).
public void resume(): is used to resume the suspended thread(depricated).
public void stop(): is used to stop the thread(depricated).
public boolean isDaemon(): tests if the thread is a daemon thread.
public void setDaemon(boolean b): marks the thread as daemon or user thread.
public void interrupt(): interrupts the thread.
public boolean isInterrupted(): tests if the thread has been interrupted.
public static boolean interrupted(): tests if the current thread has been interrupted.

======================================================================================================================================
1) Java Thread Example by extending Thread class

class Multi extends Thread
{  
public void run()
{  
System.out.println("thread is running...");  
}  
public static void main(String args[])
{  
Multi t1=new Multi();  
t1.start();  
 }  
}  

2) Java Thread Example by implementing Runnable interface
class Multi3 implements Runnable
{  
public void run()
{  
System.out.println("thread is running...");  
}  
  
public static void main(String args[])
{  
Multi3 m1=new Multi3();  
Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
t1.start();  
 }  
}  


3) Using the Thread Class: Thread(String Name)
We can directly use the Thread class to spawn new threads using the constructors defined above.

public class MyThread1  
{  
// Main method  
public static void main(String argvs[])  
{  
// creating an object of the Thread class using the constructor Thread(String name)   
Thread t= new Thread("My first thread");  
  
// the start() method moves the thread to the active state  
t.start();  
// getting the thread name by invoking the getName() method  
String str = t.getName();  
System.out.println(str);  
}  
}  

4) Using the Thread Class: Thread(Runnable r, String name)
Observe the following program.

public class MyThread2 implements Runnable  
{    
public void run()  
{    
System.out.println("Now the thread is running ...");    
}    
    
// main method  
public static void main(String argvs[])  
{   
// creating an object of the class MyThread2  
Runnable r1 = new MyThread2();   
  
// creating an object of the class Thread using Thread(Runnable r, String name)  
Thread th1 = new Thread(r1, "My new thread");    
  
// the start() method moves the thread to the active state  
th1.start();   
  
// getting the thread name by invoking the getName() method  
String str = th1.getName();  
System.out.println(str);  
}    
}    

----------------------------------------------------------------------------------------------------------------------------------
Example:
---------------------------
public class FirstThread extends Thread  // by extending Thread
{	
	public void run()
	{
		System.out.println("Thread is running");
	}

	public static void main(String[] argsa)
	{
		FirstThread fth=new FirstThread();
		fth.setName("'Java Program'");
		System.out.println("Running Thread Name: "+fth.getName());
		fth.start();
		
	}
}

Example2:
---------------
public class ThreadExampleWithRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Running threads");
	}

	public static void main(String[] args)
	{
		ThreadExampleWithRunnable obj1=new ThreadExampleWithRunnable();
		
		Thread th1=new Thread(obj1);

		th1.start();
	}
}

Example 3:
----------------------
public class PrintingCountValueWithThread implements Runnable 
{	
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread :"+(i+1));
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] argsa)throws InterruptedException
	{
		PrintingCountValueWithThread th1=new PrintingCountValueWithThread();
		Thread t1=new Thread(th1);
		Thread t2=new Thread(th1);
		t1.start();
		t1.join();
		t2.start();
		
	}
}





======================================================================================================================================
Multithreading in Java
=============================
Multithreading in Java is a process of executing multiple threads simultaneously.

A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.

However, we use multithreading than multiprocessing because threads use a shared memory area. They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.

Java Multithreading is mostly used in games, animation, etc.

Advantages of Java Multithreading
==========================================================================
1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.

2) You can perform many operations together, so it saves time.

3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.


=====================================================================================================================================
Example:
class Rabit extends Thread
{
	static String name;
	Rabit(String nam)
	{
		name=nam;
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=20;i++)
			{
				System.out.println(name+":"+i);	
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Tortoise extends Thread
{
	static String name;
	Tortoise(String nam)
	{
		name=nam;
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=20;i++)
			{
				System.out.println(name+":"+i);	
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

public class MultiThreadingExample
{
	public static void main(String[] args)
	{
		Rabit r=new Rabit("Rabit");
		Tortoise t=new Tortoise("Tortoise");

		r.start();
		t.start();
		
	}
}
====================================================================================================================================
public class PrintingCountValueWithThread implements Runnable 
{	
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread :"+(i+1));
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] argsa)throws InterruptedException
	{
		PrintingCountValueWithThread th1=new PrintingCountValueWithThread();
		Thread t1=new Thread(th1);
		Thread t2=new Thread(th1);
		t1.start();
		t1.join();
		t2.start();
		
	}
}


public class ThreadExampleWithRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Running threads");
	}

	public static void main(String[] args)
	{
		ThreadExampleWithRunnable obj1=new ThreadExampleWithRunnable();
		
		Thread th1=new Thread(obj1);

		th1.start();
	}
}















