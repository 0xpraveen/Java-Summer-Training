==============================================================================================
Java StringBuffer Class
---------------------------
Java StringBuffer class is used to create mutable (modifiable) String objects. The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.

Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. So it is safe and will result in an order.

Important methods of StringBuffer class
----------------------------------------
append(String s):
It is used to append the specified string with this string. The append() method is overloaded like append(char), append(boolean), append(int), append(float), append(double) etc.

insert(int offset, String s):	
It is used to insert the specified string with this string at the specified position. The insert() method is overloaded like insert(int, char), insert(int, boolean), insert(int, int), insert(int, float), insert(int, double) etc.

replace(int startIndex, int endIndex, String str):
It is used to replace the string from specified startIndex and endIndex.

delete(int startIndex, int endIndex):
It is used to delete the string from specified startIndex and endIndex.

reverse():
is used to reverse the string.

public String	substring(int beginIndex):
It is used to return the substring from the specified beginIndex.

public String	substring(int beginIndex, int endIndex)	:
It is used to return the substring from the specified beginIndex and endIndex.
===================================================================================================
Example :
public class StringBuffersExamples
{
	public static void main(String[] args)
	{
		StringBuffer buffers=new StringBuffer();
		buffers.append("Sivani ");
		buffers.append("Kalra ");
		buffers.append("Jiwan ");
		System.out.println(buffers);

		buffers.insert(7,"Ronak ");
		System.out.println(buffers);

		buffers.insert(0,"Anuj ");
		System.out.println(buffers);

		int len=buffers.length();
		System.out.println("Length of buffers :"+len);
		
		buffers.insert(len-1," Shubham ");
		System.out.println(buffers);

		len=buffers.length();
		System.out.println("Length of buffers :"+len);


		buffers.reverse();
		System.out.println(buffers);
		
		
	}
}

Class Assignment:
Wap to reverse the word at given position from the given string.
=================================================================================================
Example :
String str="This is good"
	str="sihT si doog";
Time :10 min
Solution:
-------------------
import java.util.*;

public class ReverseTheWords
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		System.out.println("Enter sentence :");
		String sentence=input.nextLine();

		String[] words=sentence.split(" ");

		String output="";
		for(int i=0;i<words.length;i++)
		{
			StringBuffer word=new StringBuffer();
			word.append(words[i]);
			word.reverse();
			output=output+word.toString()+" ";
			//words[i]=String.valueOf(word);	
		}
		System.out.println(output);
		
		
	}
}

===================================================================================================
Java StringBuilder Class
-----------------------------------
Java StringBuilder class is used to create mutable (modifiable) String. The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized. It is available since JDK 1.5.

Important methods of StringBuilder class
------------------------------------------------------
public StringBuilder append(String s):
It is used to append the specified string with this string. The append() method is overloaded like append(char), append(boolean), append(int), append(float), append(double) etc.

public StringBuilder insert(int offset, String s):
It is used to insert the specified string with this string at the specified position. The insert() method is overloaded like insert(int, char), insert(int, boolean), insert(int, int), insert(int, float), insert(int, double) etc.

public StringBuilder replace(int startIndex, int endIndex, String str):
It is used to replace the string from specified startIndex and endIndex.

public StringBuilder delete(int startIndex, int endIndex):
It is used to delete the string from specified startIndex and endIndex.

public StringBuilder reverse():
It is used to reverse the string.

public int length():
It is used to return the length of the string i.e. total number of characters.

public String substring(int beginIndex):
It is used to return the substring from the specified beginIndex.

public String substring(int beginIndex, int endIndex):
It is used to return the substring from the specified beginIndex and endIndex.

==================================================================================================
Examples:
public class StringBilderExample
{
	public static void main(String[] args)
	{
		
		StringBuilder sb=new StringBuilder();
		sb.append("Purushottam ");
		sb.append("Priyanshu ");
		sb.append("Abhishek ");
		System.out.println(sb);

		String w=String.valueOf(sb);
		System.out.println(w);

		String words=sb.toString();
		System.out.println(words);

		sb.reverse();
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);

		sb.delete(0,12);
		System.out.println(sb);
		
		//System.out.println(sb.contains("Priyanshu"));
		System.out.println(words.contains("Priyanshu"));
		System.out.println(words.contains("raju"));

		int index=sb.indexOf("Abhishek");
		System.out.println(words);
		System.out.println(index);
		
	}
}

==================================================================================================
			Difference between String and StringBuffer
==================================================================================================
	String					StringBuffer
==========================================	==================================================

1)The String class is immutable.		The StringBuffer class is mutable.
2)String is slow and consumes more memory 
when we concatenate too many strings because 
every time it creates new instance.		StringBuffer is fast and consumes less memory when 
						we concatenate t strings.
3)String class overrides the equals() method 
of Object class. So you can compare the 
contents of two strings by equals() method.	StringBuffer class doesn't override the equals() 
						method of Object class.
4)String class is slower while performing 
concatenation operation.			StringBuffer class is faster while performing 
						concatenation operation.
5)String class uses String constant pool.	StringBuffer uses Heap memory

===================================================================================================
Performance Test of String and StringBuffer
------------------------------------------------------
Example:
public class StringAndStringBufferPerformanceExample
{
	public static String getString()
	{
		String str="Java ";
		for(int i=0;i<10000;i++)
		{
			str=str+"Program";
		}
		return str;
	}
	public static String getBuffer()
	{
		StringBuffer str=new StringBuffer("Java ");
		for(int i=0;i<10000;i++)
		{
			str.append("Program");
		}
		return str.toString();
	}
	public static String getBuilder()
	{
		StringBuilder str=new StringBuilder("Java ");
		for(int i=0;i<10000;i++)
		{
			str.append("Program");
		}
		return str.toString();
	}


	
	public static void main(String[] args)
	{
		long startTime=System.currentTimeMillis();
		String strString=getString();
	System.out.println("Time taken by String :"+(System.currentTimeMillis()-startTime)+" ms.");

		startTime=System.currentTimeMillis();
		String strBuffer=getBuffer();
System.out.println("Time taken by StringBuffer :"+(System.currentTimeMillis()-startTime)+" ms.");
	
		startTime=System.currentTimeMillis();
		String strBuilder=getBuilder();
System.out.println("Time taken by StringBuilder :"+(System.currentTimeMillis()-startTime)+" ms.");
	
		
	}
}


===================================================================================================
String and StringBuffer HashCode Test
--------------------------------------
As we can see in the program given below, String returns new hashcode while performing concatenation but the StringBuffer class returns same hashcode.

InstanceTest.java

public class InstanceTest{  
    public static void main(String args[]){  
        System.out.println("Hashcode test of String:");  
        String str="java";  
        System.out.println(str.hashCode());  
        str=str+"Program";  
        System.out.println(str.hashCode());  
   
        System.out.println("Hashcode test of StringBuffer:");  
        StringBuffer sb=new StringBuffer("java");  
        System.out.println(sb.hashCode());  
        sb.append("Program");  
        System.out.println(sb.hashCode());  
    }  
}  

Output:
Hashcode test of String:
3254818
229541438

Hashcode test of StringBuffer:
118352462
118352462

==================================================================================================
Difference between StringBuffer and StringBuilder
==================================================================================================
A list of differences between StringBuffer and StringBuilder is given below:
--------------------------------------------------------------------------------------------------
	StringBuffer				StringBuilder
===========================================	==================================================
1)StringBuffer is synchronized i.e. 
thread safe.It means two threads can't call 
the methods of StringBuffer simultaneously.	StringBuilder is non-synchronized i.e. not thread  
						safe. It means two threads can call the methods of 						StringBuilder simultaneously.

2)StringBuffer is less efficient 
than StringBuilder.				StringBuilder is more efficient than StringBuffer.

3)StringBuffer was introduced in Java 1.0	StringBuilder was introduced in Java 1.5

==================================================================================================
Performance Test of StringBuffer and StringBuilder
-------------------------------------------------------------------------------------
Let's see the code to check the performance of StringBuffer and StringBuilder classes.
-----------------------------------------------------------------------------------------
//Java Program to demonstrate the performance of StringBuffer and StringBuilder classes.  
public class ConcatTest{  
    public static void main(String[] args){  
        long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Java");  
        for (int i=0; i<10000; i++){  
            sb.append("Program");  
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Java");  
        for (int i=0; i<10000; i++){  
            sb2.append("Program");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
    }  
}  


==================================================================================================
Output:

Time taken by StringBuffer: 16ms
Time taken by StringBuilder: 0ms

Example2:
public class StringAndStringBufferPerformanceExample
{
	public static String getString()
	{
		String str="Java ";
		for(int i=0;i<10000;i++)
		{
			str=str+"Program";
		}
		return str;
	}
	public static String getBuffer()
	{
		StringBuffer str=new StringBuffer("Java ");
		for(int i=0;i<10000;i++)
		{
			str.append("Program");
		}
		return str.toString();
	}
	public static String getBuilder()
	{
		StringBuilder str=new StringBuilder("Java ");
		for(int i=0;i<10000;i++)
		{
			str.append("Program");
		}
		return str.toString();
	}


	
	public static void main(String[] args)
	{
		long startTime=System.currentTimeMillis();
		String strString=getString();
	System.out.println("Time taken by String :"+(System.currentTimeMillis()-startTime)+" ms.");

		startTime=System.currentTimeMillis();
		String strBuffer=getBuffer();
System.out.println("Time taken by StringBuffer :"+(System.currentTimeMillis()-startTime)+" ms.");
	
		startTime=System.currentTimeMillis();
		String strBuilder=getBuilder();
System.out.println("Time taken by StringBuilder :"+(System.currentTimeMillis()-startTime)+" ms.");
	
		
	}
}

=================================================================================================
How to create Immutable class?
------------------------------
There are many immutable classes like String, Boolean, Byte, Short, Integer, Long, Float, Double etc. In short, all the wrapper classes and String class is immutable. We can also create immutable class by creating final class that have final data members as the example given below:

Example to create Immutable class
In this example, we have created a final class named Employee. It have one final datamember, a parameterized constructor and getter method.

public final class Employee  
{    
final String pancardNumber;    
public Employee(String pancardNumber)  
{    
this.pancardNumber=pancardNumber;    
}  
public String getPancardNumber()
{    
return pancardNumber;    
}    
} 
   
public class ImmutableDemo  
{  
public static void main(String ar[])  
{  
Employee e = new Employee("44544545");  
String s1 = e.getPancardNumber();  
System.out.println("Pancard Number: " + s1);  
}  
}  

================================================================================================
Output:
Pancard Number: 44544545

Example 2:
final class ImmutableExample
{
	final String adharNo;
	public ImmutableExample(String adharNo)
	{
		this.adharNo=adharNo;
	}

	public String getAdhar()
	{
		return adharNo;
	}
}

public class CustomizeImmutableExample
{
	public static void main(String[] args)
	{
		ImmutableExample im=new ImmutableExample("1000000");
		String adharno=im.getAdhar();
		System.out.println("Adhar Number:"+adharno);
	}	
}

================================================================================================
				Method in Java
================================================================================================
In general, a method is a way to perform some task. Similarly, the method in Java is a collection of instructions that performs a specific task. It provides the reusability of code. We can also easily modify code using methods. In this section, we will learn what is a method in Java, types of methods, method declaration, and how to call a method in Java.

What is a method in Java?
----------------------------------------
A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation. It is used to achieve the reusability of code. We write a method once and use it many times. We do not require to write code again and again. It also provides the easy modification and readability of code, just by adding or removing a chunk of code. The method is executed only when we call or invoke it.

The most important method in Java is the main() method.

Method Declaration
-------------------------------------------------------------------
The method declaration provides information about method attributes, such as visibility, return-type, name, and arguments. It has six components that are known as method header,

Method Signature: Every method has a method signature. It is a part of the method declaration. 
It includes the method name and parameter list.

* Access Specifier: Access specifier or modifier is the access type of the method. It specifies the   
  visibility of the method. 

	Java provides four types of access specifier:
	------------------------------------------------------------------------
	1.	Public: The method is accessible by all classes when we use public specifier in our 		application.

	2.	Private: When we use a private access specifier, the method is accessible only in 		the classes in which it is defined.

	3.	Protected: When we use protected access specifier, the method is accessible within 		the same package or subclasses in a different package.

	4.	Default: When we do not use any access specifier in the method declaration, Java 		uses default access specifier by default. It is visible only from the same package 		only.

* Return Type: Return type is a data type that the method returns. It may have a primitive data  
  type, object, collection, void, etc. If the method does not return anything, we use void keyword.

* Method Name: It is a unique name that is used to define the name of a method. It must be 
  corresponding to the functionality of the method. Suppose, if we are creating a method for 
  subtraction of two numbers, the method name must be subtraction(). A method is invoked by its 
  name.

* Parameter List: It is the list of parameters separated by a comma and enclosed in the pair of 
  parentheses. It contains the data type and variable name. If the method has no parameter, left 
  the parentheses blank.

* Method Body: It is a part of the method declaration. It contains all the actions to be performed. 
  It is enclosed within the pair of curly braces.

=================================================================================================
Types of Method
----------------------------------------------
There are two types of methods in Java:
	*	Predefined Method
	*	User-defined Method

Static Method
------------------------------------------------
A method that has static keyword is known as static method. In other words, a method that belongs to a class rather than an instance of a class is known as a static method. We can also create a static method by using the keyword static before the method name.

The main advantage of a static method is that we can call it without creating an object. It can access static data members and also change the value of it. It is used to create an instance method. It is invoked by using the class name. The best example of a static method is the main() method.

Example of static method
------------------------------------------------




-----------------------------------------------------------
Instance Method
-----------------
The method of the class is known as an instance method. It is a non-static method defined in the class. Before calling or invoking the instance method, it is necessary to create an object of its class. 
-----------------------------------------------------------
Let's see an example of an instance method.

class Student
{
	Student()
	{
		NonStaticMethodExample.msg1();
	}
}

public class NonStaticMethodExample
{
	public void msg()
	{
		System.out.println("Welcome to non-static method msg()");
	}
	public static void msg1()
	{
		System.out.println("Welcome to static method msg1()");
	}

	public static void main(String[] args)
	{
		NonStaticMethodExample nsme=new NonStaticMethodExample();
		nsme.msg();
		
		msg1();
		NonStaticMethodExample.msg1();

		Student st=new Student();
		nsme.msg1();
		
	}
}



=================================================================================================
There are two types of instance method:
------------------------------------------------------------
1. Accessor Method
2. Mutator Method

1. Accessor Method: The method(s) that reads the instance variable(s) is known as the accessor method. We can easily identify it because the method is prefixed with the word get. It is also known as getters. It returns the value of the private field. It is used to get the value of the private field.

Example

public int getId()    
{    
return Id;    
}  

2. Mutator Method: The method(s) read the instance variable(s) and also modify the values. We can easily identify it because the method is prefixed with the word set. It is also known as setters or modifiers. It does not return anything. It accepts a parameter of the same data type that depends on the field. It is used to set the value of the private field.

Example
public void setRoll(int roll)   
{  
this.roll = roll;  
}  

Example of Static and instance block
----------------------------------------
class Student
{
	{
		System.out.println("Instance Block");
	}
	static
	{
		System.out.println("static Block");
	}
}

public class InstanceAndStaticBlock
{
	static
	{
		System.out.println("main static Block");
	}
	public static void main(String[] atr)
	{
		Student st=new Student();
	}
}


=======================================

















==================================================================================================
Constructors in Java
==================================================================================================
In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.

It is a special type of method which is used to initialize the object.

Every time an object is created using the new() keyword, at least one constructor is called.

It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.

There are two types of constructors in Java: 
1. no-arg constructor, and 
2. parameterized constructor.

Note: It is called constructor because it constructs the values at the time of object creation. It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn't have any.

Rules for creating Java constructor
---------------------------------------------------------------------------------------------------
There are two rules defined for the constructor.
--------------------------------------------------------------------------------------------------
*	Constructor name must be the same as its class name
*	A Constructor must have no explicit return type
*	A Java constructor cannot be abstract, static, final, and synchronized

Note: We can use access modifiers while declaring a constructor. It controls the object creation. In other words, we can have private, protected, public or default constructor in Java.

Java Default Constructor
------------------------------------------------------------------------------------
A constructor is called "Default Constructor" when it doesn't have any parameter.

Syntax of default constructor:
----------------------------------
<class_name>(){}  

Example:
---------------------------------



Rule: If there is no constructor in a class, compiler automatically creates a default constructor.

Q) What is the purpose of a default constructor?
The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.


==================================================================================================
Java Parameterized Constructor
--------------------------------------------------------------------------------------------------
A constructor which has a specific number of parameters is called a parameterized constructor.

Q.Why use the parameterized constructor?
The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.

Constructor Overloading in Java
--------------------------------------------------------------------------------------------------
In Java, a constructor is just like a method but without return type. It can also be overloaded like Java methods.

Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.

Example of Constructor Overloading
-----------------------------------------
public class ConstructorExample
{
	public ConstructorExample()
	{
		System.out.println("Default constructor");
	}
	public ConstructorExample(String msg)
	{
		System.out.println("Parameterized constructor(msg):"+msg);
	}
	public ConstructorExample(String name,int roll)
	{
		System.out.println("Parameterized constructor(name):"+name+", Roll:"+roll);
	}
	public ConstructorExample(int roll)
	{
		System.out.println("Parameterized constructor(roll):"+roll);
	}
	public static void main(String atr[])
	{
		ConstructorExample obj1=new ConstructorExample();//default construtot will be called
		ConstructorExample obj2=new ConstructorExample("Hello Java");
		ConstructorExample obj3=new ConstructorExample(101);
		ConstructorExample obj4=new ConstructorExample("Rishabh",103);
	}		
}



==================================================================================================
Difference between constructor and method in Java
==================================================================================================
Java Constructor				Java Method
=========================================	==================================================
A constructor is used to initialize the
state of an object.				A method is used to expose the behavior of an 
						object.

A constructor must not have a return type.	A method must have a return type.

The constructor is invoked implicitly.		The method is invoked explicitly.

The Java compiler provides a default 
constructor if you don't have any 
constructor in a class.				The method is not provided by the compiler in any 
						case.

The constructor name must be same as 
the class name.					The method name may or may not be same as the class 
						name.

===================================================================================================
Java Copy Constructor
---------------------------------
There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor in C++.

There are many ways to copy the values of one object into another in Java. They are:
1. By constructor
2. By assigning the values of one object into another
3. By clone() method of Object class

In this example, we are going to copy the values of one object into another using Java constructor.
---------------------------------------------------------------------------------------------------




Q) Does constructor return any value?
Yes, it is the current class instance (You cannot use return type yet it returns a value).

Q)Can constructor perform other tasks instead of initialization?
Yes, like object creation, starting a thread, calling a method, etc. You can perform any operation in the constructor as you perform in the method.

Q) Is there Constructor class in Java?
Yes.


Q) What is the purpose of Constructor class?
Java provides a Constructor class which can be used to get the internal information of a constructor in the class. It is found in the java.lang.reflect package.


===================================================================================================
					Java static keyword
===================================================================================================
The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.

The static can be:
------------------------------------------------------------------
1. Variable (also known as a class variable)
2. Method (also known as a class method)
3. Block
4. Nested class
Example of static
------------------------------------------------------------------





Q) Why is the Java main method static?
Ans) It is because the object is not required to call a static method. If it were a non-static method, JVM creates an object first then call main() method that will lead the problem of extra memory allocation.

==================================================================================================


