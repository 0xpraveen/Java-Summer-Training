Inheritance Example
---------------------------------------------------
Java Inheritance (Subclass and Superclass)
In Java, it is possible to inherit attributes and methods from one class to another. 

We group the "inheritance concept" into two categories:
	* subclass (child) - the class that inherits from another class
	* superclass (parent) - the class being inherited from

To inherit from a class, use the extends keyword.

Q. Why And When To Use "Inheritance"?
Ans : It is useful for code reusability: reuse attributes and methods of an existing class when you  
      create a new class.

--------------------------------------------------------------------------------------------------
Example:
class Animal//parent class
{
	public void eat()
	{
		System.out.println("Animal is eating..");
	}
}
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Dog is barking..");
	}
}

public class SingleInheritanceExample
{
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.eat();
		d.bark();
	}
}


--------------------------------------------------------------------------------------------------
The final Keyword
--------------------------------------------------------------------------------------------------
If you don't want other classes to inherit from a class, use the final keyword:

If you try to access a final class, Java will generate an error:

final class Vehicle {
  ...
}

class Car extends Vehicle {
  ...
}

The output will be something like this:

Main.java:9: error: cannot inherit from final Vehicle
class Main extends Vehicle {
                  ^
1 error)

Example:
------------------------------
//final class Animal// final class can not be inherited
class Animal
{
	public final void eat()
	{
		System.out.println("Eating");
	}
}
//class Dog extends Animal // it will give error
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Barking");
	}
	/*public void eat()  // can't override
	{

	}*/
}

public class FinalKeywordInheritance
{
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.eat();// can be inherited
		d.bark();
	}
}


Another Example:
class Animal
{
	final String college="LPU";
	public void eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Barking");
	
	}
	/*public void eat()  // can't override
	{

	}*/
}

public class FinalKeywordInheritance
{
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.eat();// can be inherited
		d.bark();
		// d.college="BNMIT";// We can't redefine the final
		System.out.println("College:"+d.college);
	}
}

final for method/variable:
Set a variable to final, to prevent it from being overridden/modified:

public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}

Definition and Usage
-------------------------------
The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override).

The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

The final keyword is called a "modifier".
---------------------------------------------------------
The final keyword in java is used to restrict the user. The java final keyword can be used in many context. 

Final can be:
-----------------------------------
1. variable
2. method
3. class

The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only. We will have detailed learning of these.

Example :
class BlankFinalVariables
{
	final String adhar;//Blank final variable
	public BlankFinalVariables(String adhar)
	{
		this.adhar=adhar;// Constructor can assign value to blank final variable
	}
	public String getAdhar()
	{
		return adhar;
	}
	
	/*
	public void setAdhar(String adhar)
	{
		this.adhar=adhar;//can't assign the value to the blank final variable
	}
	*/

	public static void main(String[] args)
	{
		BlankFinalVariables bfv=new BlankFinalVariables("1664354654");
		//bfv.setAdhar("1664354654");
		System.out.println("Adhar No:"+bfv.getAdhar());
		
	}
}


Q) Is final method inherited?
Ans) Yes, final method is inherited but you cannot override it.


Q) What is blank or uninitialized final variable?
A final variable that is not initialized at the time of declaration is known as blank final variable.

If you want to create a variable that is initialized at the time of creating object and once initialized may not be changed, it is useful. For example PAN CARD number of an employee.

It can be initialized only in constructor.

Example of blank final variable
class Student{  
int id;  
String name;  
final String PAN_CARD_NUMBER;  
...  
}  

Que) Can we initialize blank final variable?
Yes, but only in constructor. For example:

class Bike10{  
  final int speedlimit;//blank final variable  
    
  Bike10(){  
  speedlimit=70;  
  System.out.println(speedlimit);  
  }  
  
  public static void main(String args[]){  
    new Bike10();  
 }  
}  

static blank final variable
------------------------------------
A static final variable that is not initialized at the time of declaration is known as static blank final variable. It can be initialized only in static block.

Example of static blank final variable
class A{  
  static final int data;//static blank final variable  
  static{ data=50;}  
  public static void main(String args[]){  
    System.out.println(A.data);  
 }  
}  

Q) What is final parameter?
If you declare any parameter as final, you cannot change the value of it.

class Bike11{  
  int cube(final int n){  
   n=n+2;//can't be changed as n is final  
   n*n*n;  
  }  
  public static void main(String args[]){  
    Bike11 b=new Bike11();  
    b.cube(5);  
 }  
}  

Q) Can we declare a constructor final?
No, because constructor is never inherited.

=================================================================================================


=================================================================================================
Multilevel Inheritance Example
--------------------------------------------------
When there is a chain of inheritance, it is known as multilevel inheritance. As you can see in the example given below, BabyDog class inherits the Dog class which again inherits the Animal class, so there is a multilevel inheritance.

Example:
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog{  
void weep(){System.out.println("weeping...");}  
}  
class TestInheritance2{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}  

class Animal
{
	public void eat()
	{
		System.out.println("Eating");
	}	
}
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("barking");
	}
}
class Cat extends Dog
{
	public void mew()
	{
		System.out.println("mewing");
	}
}
class Baby extends Cat
{
	public void cry()
	{
		System.out.println("crying");
	}
}
public class MultilevelInheritance
{
	public static void main(String[] args)
	{
		 Baby b=new Baby();
		b.eat();
		b.bark();
		b.mew();
		b.cry();
		
		/*Animal a=new Animal();
		a.eat();
		a.bark();//error
		*/
		/*Animal a=new Dog();
		a.bark();
		*/
		/*
		Dog d=new Animal();// parent class can't convert to child
		d.eat();
		d.bark();
		*/
			
	}
}

-------------------------------------------------------------------------------------------------
Hierarchical Inheritance Example
-------------------------------------------------------------
When two or more classes inherits a single class, it is known as hierarchical inheritance. In the example given below, Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.

class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  
class TestInheritance3{  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();  
c.eat();  
//c.bark();//C.T.Error  
}}  

class Animal
{
	public void eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Barking");
	}
}
class Cat extends Animal
{
	public void mew()
	{
		System.out.println("Mewing");
	}
}
public class HierarchicalInheritance
{
	public static void main(String[] args)
	{
		Dog d=new Dog();
			d.eat();
			d.bark();
		Cat c=new Cat();
			c.eat();
			c.mew();
	
	}
}

--------------------------------------------------------------------------------------------------
Q) Why multiple inheritance is not supported in java?
Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.

Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. So whether you have same method or different, there will be compile time error.

class A{  
void msg(){System.out.println("Hello");}  
}  
class B{  
void msg(){System.out.println("Welcome");}  
}  
class C extends A,B{//suppose if it were  
   
 public static void main(String args[]){  
   C obj=new C();  
   obj.msg();//Now which msg() method would be invoked?  
}  
}  


===================================================================================================
Aggregation in Java
--------------------------
If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.

Consider a situation, Employee object contains many informations such as id, name, emailId etc. It contains one more object named address, which contains its own informations such as city, state, country, zipcode etc. as given below.

class Employee{  
int id;  
String name;  
Address address;//Address is a class  
...  
}  

In such case, Employee has an entity reference address, so relationship is Employee HAS-A address.

Why use Aggregation?
* For Code Reusability.

Simple Example of Aggregation
------------------------------------------------
In this example, we have created the reference of Operation class in the Circle class.

class Operation{  
 int square(int n){  
  return n*n;  
 }  
}  
  
class Circle{  
 Operation op;//aggregation  
 double pi=3.14;  
    
 double area(int radius){  
   op=new Operation();  
   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
   return pi*rsquare;  
 }  
  
     
    
 public static void main(String args[]){  
   Circle c=new Circle();  
   double result=c.area(5);  
   System.out.println(result);  
 }  
}  


When use Aggregation?
---------------------------------------------------------------------
Code reuse is also best achieved by aggregation when there is no is-a relationship.
Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved; otherwise, aggregation is the best choice.

===================================================================================================
					PolyMorphism
===================================================================================================
Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object. Any Java object that can pass more than one IS-A test is considered to be polymorphic.

Types of Java polymorphism
===========================================================================================
In Java polymorphism is mainly divided into two types: 
-------------------------------------------------------------------------------------------
* Compile-time Polymorphism
* Runtime Polymorphism

1.Compile-Time Polymorphism
It is also known as static polymorphism. This type of polymorphism is achieved by function overloading or operator overloading. 

Note: But Java doesn’t support the Operator Overloading.



Method Overloading in Java
--------------------------------------
If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

If we have to perform only one operation, having same name of the methods increases the readability of the program.

Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs.

So, we perform method overloading to figure out the program quickly.

Example :
public class MethodOverloading
{
	public int add(int num1,int num2)
	{
		return num1+num2;
	}
	public long add(int num1,long num2,int num3)
	{
		return (long)(num1+num2+num3);
	}
	public long add(long num1,long num2,long num3,long num4)
	{
		return (long)(num1+num2+num3+num4);
	}

	public static void main(String[] args)
	{
		MethodOverloading mo=new MethodOverloading();
		System.out.println(mo.add(10,20));
		System.out.println(mo.add(10,20,30));
		System.out.println(mo.add(10,20,30,40));

	}
}

Example 2:
------------------
public class MethodOverloading
{
	public int add(int... num)//var-args parameter by default it's single dimension array 
	{
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
		
			sum=sum+num[i];
		}
		return sum;	
	}

	public static void main(String[] args)
	{
		MethodOverloading mo=new MethodOverloading();
		System.out.println(mo.add(10,20,30,10,10,10,100));

	}
}



















Subtypes of Compile-time Polymorphism:
===================================================================================================
i. Function Overloading
It is a feature in C++ where multiple functions can have the same name but with different parameter lists. The compiler will decide which function to call based on the number and types of arguments passed to the function.

ii. Operator Overloading
It is a feature in C++ where the operators such as +, -, *, etc. can be given additional meanings when applied to user-defined data types.

iii. Template
it is a powerful feature in C++ that allows us to write generic functions and classes. A template is a blueprint for creating a family of functions or classes.


Runtime Polymorphism
===================================================================================================
It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding. Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class. That base function is said to be overridden.

Example
------------------------------------------
class Rectangle
{
	public double area(double side1,double side2)
	{
		return side1*side2;
	}
}

class Square extends Rectangle
{
	public double area(double side1,double side2)//overriden 
	{
		return side1*side2;
	}
}
public class MethodOverriden
{
	public static void main(String... args)
	{
		Square s=new Square();
		double a=s.area(4,4);
		System.out.println(a);
	}
}




Subtype of Run-time Polymorphism
===================================================================================================================
i. Virtual functions
---------------------------------------
It allows an object of a derived class to behave as if it were an object of the base class. The derived class can override the virtual function of the base class to provide its own implementation. The function call is resolved at runtime, depending on the actual type of the object.

Polymorphism in Java is a concept that allows objects of different classes to be treated as objects of a common class. It enables objects to behave differently based on their specific class type.

Advantages of Polymorphism in Java
=================================================================================================
* Increases code reusability by allowing objects of different classes to be treated as objects of a common class.
* Improves readability and maintainability of code by reducing the amount of code that needs to be written and maintained.
* Supports dynamic binding, enabling the correct method to be called at runtime, based on the actual class of the object.
Enables objects to be treated as a single type, making it easier to write generic code that can handle objects of different types.


Disadvantages of Polymorphism in Java
===================================================================================================
* Can make it more difficult to understand the behavior of an object, especially if the code is complex.
* This may lead to performance issues, as polymorphic behavior may require additional computations at runtime.


===================================================================================================
