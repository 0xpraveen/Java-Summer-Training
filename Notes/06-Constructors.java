==================================================================================================
Constructors in Java
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
Example:

class Student implements Cloneable
{
	String name;
	int roll;
	public Student()
	{

	}

	public Student(String n,int r)
	{
		name=n;
		roll=r;
	}
	public Student(Student st)
	{
		name=st.name;
		roll=st.roll;
	}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}

public class CopyConstructorExample 
{
	
	public static void main(String[] args)throws CloneNotSupportedException
	{
		Student obj1=new Student("Tamanna",101);
		Student obj2=new Student(obj1);

		Student obj3=new Student();
		obj3.name=obj2.name;
		obj3.roll=obj2.roll;

		Student obj4=new Student();
		obj4=(Student)obj2.clone();

		System.out.println("Obj1 = obj1.name :"+obj1.name);
		System.out.println("Obj1 = obj1.roll :"+obj1.roll);
		
		System.out.println("Obj2 = obj2.name :"+obj2.name);
		System.out.println("Obj2 = obj2.roll :"+obj2.roll);

		System.out.println("Obj3 = obj3.name :"+obj3.name);
		System.out.println("Obj3 = obj3.roll :"+obj3.roll);

		System.out.println("Obj4 = obj4.name :"+obj4.name);
		System.out.println("Obj4 = obj4.roll :"+obj4.roll);
		
	}
}

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


Q) Can we execute a program without main() method?
Ans) No, one of the ways was the static block, but it was possible till JDK 1.6. Since JDK 1.7, it is not possible to execute a Java class without the main method.

class StaticBlockWithoutMainFunction{  
  static{  
  System.out.println("static block is invoked");  
  System.exit(0);  
  }  
}  



===================================================================================================
this keyword in Java
===========================================================
There can be a lot of usage of Java this keyword. In Java, this is a reference variable that refers to the current object.


Usage of Java this keyword
==========================================================
Here is given the 6 usage of java this keyword.
--------------------------------------------------------------------
1. this can be used to refer current class instance variable.
2. this can be used to invoke current class method (implicitly)
3. this() can be used to invoke current class constructor.
4. this can be passed as an argument in the method call.
5. this can be passed as argument in the constructor call.
6. this can be used to return the current class instance from the method.

Suggestion: If you are beginner to java, lookup only three usages of this keyword.


1) this: to refer current class instance variable
The this keyword can be used to refer current class instance variable. If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.

Example:

class Student
{
	String name;
	int roll;
	Student(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}

	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Roll :"+roll);
	}
}

public class ThisReferenceVariableExample
{
	public static void main(String[] args)
	{
		Student st=new Student("Subham",101);
		st.display();
	}
}




Note:It is better approach to use meaningful names for variables. So we use same name for instance variables and parameters in real time, and always use this keyword.


2) this: to invoke current class method
You may invoke the method of the current class by using the this keyword. If you don't use the this keyword, compiler automatically adds this keyword while invoking the method. 


Let's see the example
----------------------------------
class Student
{
	String name;
	int roll;
	Student(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}

	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Roll :"+roll);
	}

	public void callBack()
	{
		this.display();
		System.out.println("Called display()");
	}
	
}

public class ThisReferenceVariableExample
{
	public static void main(String[] args)
	{
		Student st=new Student("Subham",101);
		st.callBack();
	}
}


3) this() : to invoke current class constructor
The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.
Example:
----------------
class Student
{
	
	public Student()
	{
		System.out.println("Default Constructor");
	}
	public Student(String msg)
	{
		this();	//calling default constructor using this keyword
		System.out.println("MSG :"+msg);
		
	}
	public Student(int roll)
	{
		this("Mohan Kumar");
		System.out.println("Roll No :"+roll);
	}

	public void display()
	{
		System.out.println("Display");
	}

	
}

public class ThisReferenceVariableForConstructor
{
	public static void main(String[] args)
	{
		Student st=new Student(100);
		st.display();
	}
}




Note:Rule: Call to this() must be the first statement in constructor.



4) this: to pass as an argument in the method
Example:
class Student
{
	
	public Student()
	{
		System.out.println("Default Constructor");
	}
	public Student(String msg)
	{
		this();	//calling default constructor using this keyword
		System.out.println("MSG :"+msg);
		
	}
	public Student(int roll)
	{
		this("Mohan Kumar");
		System.out.println("Roll No :"+roll);
	}

	public void display()
	{
		System.out.println("Display");
	}

	
}

public class ThisReferenceVariableForConstructor
{
	public static void main(String[] args)
	{
		Student st=new Student(100);
		st.display();
	}
}





5) this: to pass as argument in the constructor call
We can pass the this keyword in the constructor also. It is useful if we have to use one object in multiple classes. Let's see the example:

Example:
class Student
{
	public Student()
	{
		Student st=this.getStudentObj(this);//passing argument by this keyword
		System.out.println("Default Constructor ");
	}
	public Student getStudentObj(Student st)
	{
		System.out.println("Invoked getStudentObj(new Student())");
		return st;
	}

	
}

public class ThisReferenceVariableWithArgument
{
	public static void main(String[] args)
	{
		Student st=new Student();
	}
}




6) this keyword can be used to return current class instance
We can return this keyword as an statement from the method. In such case, return type of the method must be the class type (non-primitive). Let's see the example:
Example:
final class Student
{
	//Singleton design pattern
	private static Student obj;
	private Student()
	{
		System.out.println("Default Constructor");
	}
	public static Student getObject()
	{
		if(obj==null)
			return new Student();
		else
			return obj;
	}
}

public class ThisForReturnObject
{
	public static void main(String[] args)
	{
		Student st=Student.getObject();
	}
}

===================================================================================================
						OOPS Concepts
===================================================================================================
Inheritance in Java
-----------------------
Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).

Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

Why use inheritance in java
* For Method Overriding (so runtime polymorphism can be achieved).
* For Code Reusability.

Terms used in Inheritance
-----------------------------------------------------------------------------------
* Class: A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.

* Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.

* Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.

* Reusability: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class. You can use the same fields and methods already defined in the previous class.

=====================================================================================================================
The syntax of Java Inheritance
--------------------------------------------------
class Subclass-name extends Superclass-name  
{  
   //methods and fields  
}  


The extends keyword indicates that you are making a new class that derives from an existing class. The meaning of "extends" is to increase the functionality.

In the terminology of Java, a class which is inherited is called a parent or superclass, and the new class is called child or subclass.


=====================================================================================================================
Types of inheritance in java
=====================================================================================================================
On the basis of class, there can be three types of inheritance in java: single, multilevel and hierarchical.

In java programming, multiple and hybrid inheritance is supported through interface only. We will learn about interfaces later.


Note: Multiple inheritance is not supported in Java through class.

When one class inherits multiple classes, it is known as multiple inheritance. 

For Example:
Single Inheritance Example
------------------------------------------------------------------------------------------------------------------
When a class inherits another class, it is known as a single inheritance. In the example given below, Dog class inherits the Animal class, so there is the single inheritance.
Example:
----------------------

class Teacher
{
	public String getTutorial()
	{
		return "Black Book Of Java";
	}
}
class Student extends Teacher
{
	public Student()
	{
		String book=new Teacher().getTutorial();
		System.out.println("Java Book Name :"+book);
	}
}

public class IS_A_RelationShip
{
	public static void main(String[] args)
	{
		Student st=new Student();
	}
}

HAS-A:
class Teacher
{
	public String getTutorial()
	{
		return "Black Book Of Java";
	}
}
class Student
{
	Teacher teach=null;// Has-A relationship
	public Student()
	{
		teach=new Teacher();
		String book=teach.getTutorial();
		System.out.println("Java Book Name :"+book);
	}
}

public class IS_A_RelationShip
{
	public static void main(String[] args)
	{
		Student st=new Student();
	}
}



