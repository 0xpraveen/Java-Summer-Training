====================================================================================
bitwise XOR(^)  operator
--------------------------
This operator is a binary operator, denoted by ‘^.’ It returns bit by bit XOR of input values, i.e., if corresponding bits are different, it gives 1, else it shows 0. 

Example:
4 ^ 5=1
100
101
---------
001
--------
ans :1
------------------

Wap to add two integer number using bitwise operator.
----------------------------------------------------------
public class AdditionProgramWithoutArithmeticOperator
{
	public int getResult(int num1,int num2)
	{
	
		while(num2!=0)
		{
			int carry=(num1&num2);
			num1=(num1^num2);
			num2=carry<<1;
		}
	   return num1;

	}
	public static void main(String[] args)
	{
		AdditionProgramWithoutArithmeticOperator apwao=new AdditionProgramWithoutArithmeticOperator();
		int res=apwao.getResult(10,-5);
		System.out.println("The Addition of Two numbers(10,-5):"+res);
	}
}


=============================================================================================================
Ternary Operator
----------------------
it is used for substitute of if..else.
it is also known like if..else condition.

Example:
public class TernaryOperatorExample
{
	public static void main(String[] args)
	{
		//(5>4)?System.out.println("True"):System.out.println("False"); invalid statement
		
		String msg=(5>4)?"True":"False";

		System.out.println(msg);	
	}
}


Wap to find the largest number among three numbers.
--------------------------------------------------------
public class LargestNumberAmongThreeNumbers
{
	public static void main(String[] args)
	{
		int num1=100;
		int num2=500;
		int num3=30;

		int temp=(num1>num2)?num1:num2;

		int largest=num3>temp?num3:temp;

		System.out.println(largest);	
	}
}

=============================================================================================================
Short hand assignment operator:
---------------------------------
+=,-=,/=,*=,%= etc

====================================
Example:
int marksoforganicchemistry=10;

marksoforganicchemistry=marksoforganicchemistry+20;

marksoforganicchemistry += 20;

=============================================================================================================
Java Control Statement
------------------------------
if,if..else,if..else if... so on.
break, continue
--------------------------------------
if :it is used to evaluate the condition, if condition is true it will execute true block or if block.
    it has not else block. it is used only true block.

Example:
if(5>4)
{
	//true block will be executed once condition is true.
}

=> if...else : it is used to provide the true and false block. 

if(4>5)
{
	true block
}
else
{
	false block
}

if..else if lader :it is used to provide multiple conditions
Example
char grade='C';

if(grade=='A')
{
	A block
}
else if(grade=='B')
{
	B block
}
else if(grade=='C')
{
	C block
}
else
{
	invalid
}
===========================================================================================================
public class IfElseExample
{
	public static void main(String[] args)
	{
		int num=5;

		if(num%2!=0)
			System.out.println("Odd");
			System.out.println("Hello");
			
		
	}
}

===========================================================================================================
Switch..Case
------------------------------------------------
Float or double value is not acceptable in switch case.
Example:
public class SwicthCaseExample
{
	public static void main(String[] args)
	{
		char grade='E';
		switch(grade)
		{
			default:System.out.println("invalid");break;
			case 'A':System.out.println("A");break;
			case 'B':System.out.println("B");break;
			case 'C':System.out.println("C");break;
			case 'D':System.out.println("D");
			
			
		}
	}
}




============================================================================================================
Loop:
----------------
while		:
do..while
for
foreach
labelled for loop



=============================================================================================================
Wap to print fibonacci series upto 200 limit.
-----------------------------------------------------
public class FibonacciSearies
{
	public static void main(String[] args)
	{
		int num1=0,num2=1;
		System.out.print(num1+",");
		System.out.print(num2+",");
		while(num2<200)
		{
			num2=num1+num2;
			System.out.print(num2+",");
			num1=num2-num1;
		}
	}
}




Labelled for loop Example:
public class LabelledForLoopExample
{

	public static void main(String[] args)
	{
		
		outer:
		for(int i=0;i<5;i++)
		{
			System.out.println("I :"+i);

			inner:
			for(int j=0;j<5;j++)
			{
				System.out.println("J :"+j);
				
				if(i==2 && j==2)
				{
					break outer;
				}
				
			}
			
		}
	}
}

=========================================================================================
Scanner Class
-----------------------------------------------------------------------------------------
it is a class , which is used to take input from users.
it has following methods to get respective types of data.
1.nextInt();
2.nextFloat();
3.nextDouble();
4.next();		:
5.nextLine();
6.charAt();
7.nextChar();
8.nextLong();
etc..


=============================================================================================
next();


















































































































