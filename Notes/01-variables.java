============================================================
			Variables
============================================================
Name of memory where ,we can store the value.
Types of variable in java:
--------------------------------
1.Local Variable
2.Instance Variable
3.Static Variable
===========================================================
1. Local Variable:
it is accessible within the block. it can not accessible out of the declared block.
Example :
public class LocalVariableExample
{
	public void msg(String name,int num2,int num3)//name is local variable
	{
		int num1=100;
		System.out.println("Number 1:"+num1);
		System.out.println("Number 2:"+num2);
		System.out.println("Number 3:"+num3);
		System.out.println("Name "+name);
	}
	public static void main(String[] args)
	{
		LocalVariableExample lve=new LocalVariableExample();
		lve.msg("Nishant",200,300);
		//num1=200;  not accessible because local variable
	}
}

2. Instance variable
it is declared outside of the block but inside the class. it is accessible within the class and non-static method.
Example:
public class InstanceVariableExample
{
	String college;//instance variable
	int num1;//instance variable
	public void fun1()
	{
		college="LPU";
		System.out.println("College :"+college);
	}
	public void fun2()
	{
		System.out.println("College :"+college);
	}
	public static void main(String[] args)
	{
		//System.out.println("College :"+college);
		InstanceVariableExample ive=new InstanceVariableExample();
		ive.fun1();
		ive.fun2();
	}
}
3. Static Variable :
Which variable is declared with static keyword that is static variable.
its class level member, so the memory and value will be initialized during the loading class. it remains until program executing. its accessible from non-static and static context both. always it keeps updated value.

Example:
public class StaticVariableExample
{
	static int num;
	public void fun1()
	{
		num=100;
		System.out.println("Number :"+num);
	}
	public static void main(String[] args)
	{
		System.out.println("Number in main() :"+num);
		StaticVariableExample sve=new StaticVariableExample();
		sve.fun1();
		System.out.println("Number in main() :"+num);
	}	
}

Example 2:
public class StaticCounter
{
	static int count=0;
	public StaticCounter()
	{
		count++;
		
	}

	public static void main(String[] args)
	{
		StaticCounter obj1=new StaticCounter();
		StaticCounter obj2=new StaticCounter();
		StaticCounter obj3=new StaticCounter();

		System.out.println(obj3.count);
	
	}
}

=======================================================================================
Data Types:
---------------------------------------------------------------------------------------
There are two types of data types:
1.Primitive data types
	=>There are 8 primitive data types
		1. byte
		2. short
		3. int
		4. long
		5. float
		6. double
		7. boolean
		8. char

2.Non-Primitive data types
	1. All Wrapper class
		a. Integer
		b. Float
		c. Double
		d. Boolean
		e. Short
		f. Byte
		g. Char /Character
		h. Long
	2. String
	3. All class types
		
