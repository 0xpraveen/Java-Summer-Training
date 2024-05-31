=============================================================================================================
					Abstraction in Java
=============================================================================================================
Abstraction is a process of hiding the implementation details and showing only functionality to the user.
Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.

Abstraction lets you focus on what the object does instead of how it does it.
Ways to achieve Abstraction
-----------------------------------------------------------------
There are two ways to achieve abstraction in java
-----------------------------------------------------------------
* Abstract class (0 to 100%)
* Interface (100%)

Abstract class in Java
-------------------------------------------
A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.

Rules:
---------------------------------------------------------
* An abstract class must be declared with an abstract keyword.
* It can have abstract and non-abstract methods.
* It cannot be instantiated.
* It can have constructors and static methods also.
* It can have final methods which will force the subclass not to change the body of the method.

Example of abstract class
-------------------------------
abstract class A{}  

Abstract Method in Java
-------------------------------
A method which is declared as abstract and does not have implementation is known as an abstract method.

Example of abstract method
-----------------------------
abstract void printStatus();//no method body and abstract  

Example of Abstract class that has an abstract method
In this example, Bike is an abstract class that contains only one abstract method run. Its implementation is provided by the Honda class.

abstract class Bike
{  
  abstract void run();  
}  
class Honda4 extends Bike
{  
void run()
{
	System.out.println("running safely");
}  
public static void main(String args[])
{  
 Bike obj = new Honda4();  
 obj.run();  
}  
}  

Understanding the real scenario of Abstract class
-------------------------------------------------------
In this example, Shape is the abstract class, and its implementation is provided by the Rectangle and Circle classes.

Mostly, we don't know about the implementation class (which is hidden to the end user), and an object of the implementation class is provided by the factory method.

A factory method is a method that returns the instance of the class. We will learn about the factory method later.

In this example, if you create the instance of Rectangle class, draw() method of Rectangle class will be invoked.

File: TestAbstraction1.java

abstract class Shape
{  
abstract void draw();  
}  
//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape
{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape
{  
void draw(){System.out.println("drawing circle");}  
}  
//In real scenario, method is called by programmer or user  
class TestAbstraction1{  
public static void main(String args[]){  
Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
s.draw();  
}  
}  

Abstract class having constructor, data member and methods
------------------------------------------------------------------
An abstract class can have a data member, abstract method, method body (non-abstract method), constructor, and even main() method.

File: TestAbstraction2.java

//Example of an abstract class that has abstract and non-abstract methods  
 abstract class Bike{  
   Bike(){System.out.println("bike is created");}  
   abstract void run();  
   void changeGear(){System.out.println("gear changed");}  
 }  
//Creating a Child class which inherits Abstract class  
 class Honda extends Bike{  
 void run(){System.out.println("running safely..");}  
 }  
//Creating a Test class which calls abstract and non-abstract methods  
 class TestAbstraction2{  
 public static void main(String args[]){  
  Bike obj = new Honda();  
  obj.run();  
  obj.changeGear();  
 }  
}  

Rule: If there is an abstract method in a class, that class must be abstract.
Class Example:
abstract class Printable
{
	String university="LPU";
	public Printable()
	{
		System.out.println("Default Constructor in abstract class.");
	}
	abstract void message();
	public void cube(int num)
	{
		System.out.println("Cube of "+num+": "+(num*num*num));
	}
}
//public class AbstractClassExample extends Printable
public class AbstractClassExample
{
	/*public void message()//Overriding message() from abstract class Printable
	{
		System.out.println("Invoiked Abstract Method message()");
	}*/
	public static void main(String[] args)
	{
		//Printable p=new Printable();//Error
		//p.cube(5);
		/*
		Printable p=new AbstractClassExample();
		p.cube(5);
		System.out.println("University Name :"+p.university);
		p.message();
		*/

		/*
		AbstractClassExample ace=new AbstractClassExample();
		ace.cube(6);
		System.out.println("University Name :"+ace.university);
		ace.message();
		*/

		Printable p=new Printable()//Anonymous class//inner class
		{
			public void message()
			{
			System.out.println("Anonymous method");
			}
		};
		p.message();
		
	}	
}

Example2:
-----------------------
abstract class Vehicle
{
	abstract void changeGear();
	abstract void run();
	abstract void blowHorn();	
}

class Car extends Vehicle
{
	public void changeGear()
	{
		System.out.println("Change gear");
	}
	public void run()
	{
		System.out.println("Start Car");
	}
	public void blowHorn()
	{
		System.out.println("Blow Horn");
	}
}
class Bike extends Vehicle
{
	public void changeGear()
	{
		System.out.println("Change gear");
	}
	public void run()
	{
		System.out.println("Start Bike");
	}
	public void blowHorn()
	{
		System.out.println("Blow Horn");
	}
}


public class Test
{
	public static void main(String[] args)
	{
		Vehicle v=new Car();
		 v.run();
		 v.blowHorn();
		 v.changeGear();

		v=new Bike();
		 v.run();
		 v.blowHorn();
		 v.changeGear();

	}
}
=============================================================================================================
Interface in Java
=============================================================================================================
An interface in Java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.

Java Interface also represents the IS-A relationship.
It cannot be instantiated just like the abstract class.

Since Java 8, we can have default and static methods in an interface.

Since Java 9, we can have private methods in an interface.

-------------------------------------------------------------------------------------------------------------
Why use Java interface?
There are mainly three reasons to use interface. They are given below.
-------------------------------------------------------------------------------------------------------------
* It is used to achieve abstraction.
* By interface, we can support the functionality of multiple inheritance.
* It can be used to achieve loose coupling.

How to declare an interface?
------------------------------------------------------------------------------------------------------------
An interface is declared by using the interface keyword. It provides total abstraction; means all the methods in an interface are declared with the empty body, and all the fields are public, static and final by default. A class that implements an interface must implement all the methods declared in the interface.

Syntax:
interface <interface_name>{  
      
    // declare constant fields  
    // declare methods that abstract   
    // by default.  
}  

Java Interface Example: Bank
---------------------------------------------------------------------------------------------------------
Let's see another example of java interface which provides the implementation of Bank interface.

interface Bank{  
float rateOfInterest();  
}  
class SBI implements Bank{  
public float rateOfInterest(){return 9.15f;}  
}  
class PNB implements Bank{  
public float rateOfInterest(){return 9.7f;}  
}  
class TestInterface2{  
public static void main(String[] args){  
Bank b=new SBI();  
System.out.println("ROI: "+b.rateOfInterest());  
}}  


Multiple inheritance in Java by interface
--------------------------------------------------------------------------------------------------------
If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.

interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class A7 implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
A7 obj = new A7();  
obj.print();  
obj.show();  
 }  
}  
Class Example:
----------------------------------------
interface Drawable
{
	int side=10;//static constant data member
	abstract void draw();
	void show();
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Draw Rectangle");
	}
	public void show()
	{
		System.out.println("Show rectangle");
	}
}
public class InterrfaceExample
{
	public static void main(String[] args)
	{
		Drawable d=new Rectangle();
		d.draw();
		d.show();
		System.out.println("Side :"+d.side);
	}
}


Example2:
-------------------------------------
interface Printable
{
	void fun1();
	void fun2();
	void fun3();
}
class InterfaceExample2 implements Printable
{
	public void fun1()
	{
		System.out.println("Fun1() invoked");
	}
	public void fun2()
	{
		//System.out.println("Fun2() invoked");
	}
	public void fun3()
	{
		//System.out.println("Fun3() invoked");
	}

	public static void main(String[] args)
	{
		Printable p=new InterfaceExample2();
		p.fun1();
		p.fun2();
		p.fun3();
	}
}

Example3:
----------------------------------------------------
interface Printable
{
	void fun1();
	
}
class InterfaceExample3
{
	public static void main(String[] args)
	{
		Printable p=new Printable()
		{
			public void fun1()
			{
				System.out.println("fun1() is invoked");
			}
		};
		p.fun1();

		//lambda expression
		Printable p2=()->{
			System.out.println("Lambda");
		};
		p2.fun1();

	}
} 



Q) Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of ambiguity. However, it is supported in case of an interface because there is no ambiguity. It is because its implementation is provided by the implementation class.

Interface inheritance
--------------------------------------------------------------------------------
A class implements an interface, but one interface extends another interface.

interface Printable{  
void print();  
}  
interface Showable extends Printable{  
void show();  
}  
class TestInterface4 implements Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
TestInterface4 obj = new TestInterface4();  
obj.print();  
obj.show();  
 }  
}  

Java 8 Default Method in Interface
Since Java 8, we can have method body in interface. But we need to make it default method. 

Let's see an example:

interface Drawable{  
void draw();  
default void msg(){System.out.println("default method");}  
}  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class TestInterfaceDefault{  
public static void main(String args[]){  
Drawable d=new Rectangle();  
d.draw();  
d.msg();  
}}  


Java 8 Static Method in Interface
------------------------------------------------------------------------------------------------------
Since Java 8, we can have static method in interface. 

Let's see an example:
---------------------------------
interface Drawable{  
void draw();  
static int cube(int x){return x*x*x;}  
}  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
  
class TestInterfaceStatic{  
public static void main(String args[]){  
Drawable d=new Rectangle();  
d.draw();  
System.out.println(Drawable.cube(3));  
}}  

Class Example:
-----------------------------------
interface Printable
{
	void print();
}
interface Drawable
{
	void draw();
}

class Rectangle implements Printable,Drawable
{
	public void print()
	{
		System.out.println("Print Rectangle");
	}
	public void draw()
	{
		System.out.println("Draw rectangle");
	}
}

public class MupltipleInheritanceExample
{
	public static void main(String[] args)
	{
		/*
		Printable p=new Rectangle();
		p.print();
		p.draw();
		*/
		Rectangle r=new Rectangle();
		r.print();
		r.draw();

	}
}


Class Example of Loose Coupling with factory pattern
--------------------------------------------------------
import java.util.*;

interface Bank
{
	public double getRate();
}
class SBI implements Bank
{
	public double getRate()
	{
		return 6.25;
	}
}
class ICICI implements Bank
{
	public double getRate()
	{
		return 7.20;
	}
}
class HDFC implements Bank
{
	public double getRate()
	{
		return 9.50;
	}
}

public class FactoryDesignPatternWithInterface
{
	public static void main(String[] args)
	{
		Bank b;
		Scanner input=new Scanner(System.in);

		System.out.println("Enter bank name:");
		String bname=input.nextLine();

		if(bname.equalsIgnoreCase("SBI"))
		{
			b=new SBI();
			System.out.println("SBI bank rate :"+b.getRate());
		}
		else if(bname.equalsIgnoreCase("ICICI"))
		{
			b=new ICICI();
			System.out.println("ICICI bank rate :"+b.getRate());
		}
		else if(bname.equalsIgnoreCase("HDFC"))
		{
			b=new HDFC();
			System.out.println("HDFC bank rate :"+b.getRate());
		}
		else
		{
			System.out.println("Wrong bank name.");
		}

	}	
}

Q) What is marker or tagged interface?
-------------------------------------------------------------
An interface which has no member is known as a marker or tagged interface, for example, Serializable, Cloneable, Remote, etc. They are used to provide some essential information to the JVM so that JVM may perform some useful operation.

//How Serializable interface is written?  
public interface Serializable{  
}  

==============================================================================================================
Difference between abstract class and interface
==============================================================================================================
1) Abstract class can have abstract and non-abstract methods.	
	Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
2) Abstract class doesn't support multiple inheritance.	
	Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.	
	Interface has only static and final variables.
4) Abstract class can provide the implementation of interface.	
	Interface can't provide the implementation of abstract class.
5) The abstract keyword is used to declare abstract class.	
	The interface keyword is used to declare interface.
6) An abstract class can extend another Java class and implement multiple Java interfaces.	
	An interface can extend another Java interface only.
7) An abstract class can be extended using keyword "extends".	
	An interface can be implemented using keyword "implements".
8) A Java abstract class can have class members like private, protected, etc.	
	Members of a Java interface are public by default.
9)Example:
public abstract class Shape{
public abstract void draw();
}	

Example:
public interface Drawable{
void draw();
}


==============================================================================================================
					Encapsulation in Java
==============================================================================================================
Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.

The Java Bean class is the example of a fully encapsulated class.


Advantage of Encapsulation in Java
-------------------------------------------------------------
By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.

It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.

It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.

The encapsulate class is easy to test. So, it is better for unit testing.

The standard IDE's are providing the facility to generate the getters and setters. So, it is easy and fast to create an encapsulated class in Java.

Simple Example of Encapsulation in Java
Let's see the simple example of encapsulation that has only one field with its setter and getter methods.

File: Student.java

//A Java class which is a fully encapsulated class.  
//It has a private data member and getter and setter methods.  
package com.lpu;  
public class Student{  
//private data member  
private String name;  
//getter method for name  
public String getName(){  
return name;  
}  
//setter method for name  
public void setName(String name){  
this.name=name  
}  
}  
File: Test.java

//A Java class to test the encapsulated class.  
package com.lpu;  
class Test{  
public static void main(String[] args){  
//creating instance of the encapsulated class  
Student s=new Student();  
//setting value in the name member  
s.setName("vijay");  
//getting value of the name member  
System.out.println(s.getName());  
}  
}  

Class Example:
-------------------------------------
class User 
{
private String name,contact,email;
private int userid;

    public User() {
    }

    public User(String name, String contact, String email, int userid) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.userid = userid;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    } 
    
}
public class EncapsulateExample
{
	public static void main(String[] args)
	{
		User u=new User();
		u.setUserid(1001);
		u.setName("Mohan Kumar");
		u.setContact("9743496260");
		u.setEmail("pk@gmail.com");

		
		System.out.println("User Id:"+u.getUserid());
		System.out.println("User Contact:"+u.getContact());
		System.out.println("User Name:"+u.getName());
		System.out.println("User Email:"+u.getEmail());

	}
}

=============================================================================================================
					Exception Handling in Java
=============================================================================================================
Exception Handling in Java is one of the effective means to handle the runtime errors so that the regular flow of the application can be preserved. Java Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

Exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program’s instructions. Exceptions can be caught and handled by the program. When an exception occurs within a method, it creates an object. This object is called the exception object. It contains information about the exception, such as the name and description of the exception and the state of the program when the exception occurred.

Major reasons why an exception Occurs
===================================================
* Invalid user input
* Device failure
* Loss of network connection
* Physical limitations (out of disk memory)
* Code errors
* Opening an unavailable file

Errors represent irrecoverable conditions such as Java virtual machine (JVM) running out of memory, memory leaks, stack overflow errors, library incompatibility, infinite recursion, etc. Errors are usually beyond the control of the programmer, and we should not try to handle errors.

Let us discuss the most important part which is the differences between Error and Exception 
that is as follows: 
* Error: An Error indicates a serious problem that a reasonable application should not try to catch.
* Exception: Exception indicates conditions that a reasonable application might try to catch.

Exception Hierarchy
-----------------------------------------
All exception and error types are subclasses of class Throwable, which is the base class of the hierarchy. One branch is headed by Exception. This class is used for exceptional conditions that user programs should catch. NullPointerException is an example of such an exception. Another branch, Error is used by the Java run-time system(JVM) to indicate errors having to do with the run-time environment itself(JRE). StackOverflowError is an example of such an error.
------------------------------------------------------------------------------------------
* Object
	* Throwable
		* Exception
			* Checked Exception
			* Un-checked Exception
		* Error
			* Virtual Machine Error
			* Assertion Error

---------------------------------------------------------------------------------------------
Types of Exceptions 
==============================================================================================================
Java defines several types of exceptions that relate to its various class libraries. Java also allows users to define their own exceptions.

Exceptions can be categorized in two ways:
1. Built-in Exceptions
	* Checked Exception
	* Unchecked Exception 
2. User-Defined Exceptions

1. Built-in Exceptions:
Built-in exceptions are the exceptions that are available in Java libraries. These exceptions are suitable to explain certain error situations.

* Checked Exceptions: Checked exceptions are called compile-time exceptions because these exceptions are checked at compile-time by the compiler.
 
* Unchecked Exceptions: The unchecked exceptions are just opposite to the checked exceptions. The compiler will not check these exceptions at compile time. In simple words, if a program throws an unchecked exception, and even if we didn’t handle or declare it, the program would not give a compilation error.


2. User-Defined Exceptions:
Sometimes, the built-in exceptions in Java are not able to describe a certain situation. In such cases, users can also create exceptions, which are called ‘user-defined Exceptions’. 


The advantages of Exception Handling in Java are as follows:
------------------------------------------------------------------------------------------
* Provision to Complete Program Execution
* Easy Identification of Program Code and Error-Handling Code
* Propagation of Errors
* Meaningful Error Reporting
* Identifying Error Types

Methods to print the Exception information:
--------------------------------------------------------------------------------------------
1.printStackTrace()– This method prints exception information in the format of Name of the exception: description of the exception, stacktrace.
Example:
import java.io.*;
 
class LPU {
    public static void main (String[] args) {
      int a=5;
      int b=0;
        try{
          System.out.println(a/b);
        }
      catch(ArithmeticException e){
        e.printStackTrace();
      }
    }
}

Output:

java.lang.ArithmeticException: / by zero
at LPU.main(File.java:10)

2.toString() – This method prints exception information in the format of Name of the exception: description of the exception.

import java.io.*;
 
class LPU1 {
    public static void main (String[] args) {
      int a=5;
      int b=0;
        try{
          System.out.println(a/b);
        }
      catch(ArithmeticException e){
        System.out.println(e.toString());
      }
    }
}


Output:
java.lang.ArithmeticException: / by zero

3.getMessage() -This method prints only the description of the exception.

//program to print the exception information using getMessage() method
 
import java.io.*;
 
class LPU1 {
    public static void main (String[] args) {
      int a=5;
      int b=0;
        try{
          System.out.println(a/b);
        }
      catch(ArithmeticException e){
        System.out.println(e.getMessage());
      }
    }
}


Output:
/ by zero

Class example :
-------------------------
public class ExceptionHandling1
{
	public static void main(String[] args)
	{
		int a=5;
		int b=0;
		int res=a/b;//ArithmeticException->Runtime exception
		System.out.println("res :"+res);

		String name=null;
		int len=name.length();//NullPointerException
		System.out.println("Len :"+len);
	}
}






=============================================================================================================
					How Does JVM handle an Exception?
=============================================================================================================
Default Exception Handling: Whenever inside a method, if an exception has occurred, the method creates an Object known as an Exception Object and hands it off to the run-time system(JVM). The exception object contains the name and description of the exception and the current state of the program where the exception has occurred. Creating the Exception Object and handling it in the run-time system is called throwing an Exception. There might be a list of the methods that had been called to get to the method where an exception occurred. This ordered list of the methods is called Call Stack. Now the following procedure will happen. 

The run-time system searches the call stack to find the method that contains a block of code that can handle the occurred exception. The block of the code is called an Exception handler.
The run-time system starts searching from the method in which the exception occurred, and proceeds through the call stack in the reverse order in which methods were called.

If it finds an appropriate handler, then it passes the occurred exception to it. An appropriate handler means the type of the exception object thrown matches the type of the exception object it can handle.

If the run-time system searches all the methods on the call stack and couldn’t have found the appropriate handler, then the run-time system handover the Exception Object to the default exception handler, which is part of the run-time system. This handler prints the exception information in the following format and terminates the program abnormally.

How to handle the exception:
we can handle the exception by using try,catch and finally block/keyword.
In which code,there is possiblity to raise exception that code will keep inside try block.

After raising the exception from try block. catch block will catch the exception.
-------------------------------------------------------------------------------------------------
Example:
------------------
sequence of try ..catch and finally
try
{

}
catch(Exception e){}
finally{}

try
{}
catch(Exception e){}

try
{}
finally
{}


public class ExceptionHandling1
{
	public static void main(String[] args)
	{
		
		try
		{
			String name=null;
			int len=name.length();
		}
		finally
		{
			System.out.println("Hello finally");
		}
		/*
		catch(NullPointerException e)
		{
			//System.out.println(e.getMessage());
			//System.out.println("Content is empty");
			//e.printStackTrace();//it will print complete info
			//System.out.println(e.toString());// it will show exception's name and message
			//System.out.println(e.getMessage());//it will show only message
			System.out.println("Content is empty");//user define message
		}
		*/
	
	}
}








