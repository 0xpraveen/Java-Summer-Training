=======================================================================
			Data Types
=======================================================================
Example of primitives data types
---------------------------------
public class PrimitiveDataTypesExam
{
	public static void main(String[] args)
	{
		short s=100;
		System.out.println("Size of Short data type :"+(Short.SIZE/8)+" bytes");
		System.out.println("short s:"+s);

		byte b=9;
		System.out.println("Size of Byte data type :"+(Byte.SIZE/8)+" bytes");
		System.out.println("Byte b:"+b);

		int i=10;
	System.out.println("Size of Integer data type :"+(Integer.SIZE/8)+" bytes");
		System.out.println("Integer i:"+i);

		long l=8989;
		System.out.println("Size of Long data type :"+(Long.SIZE/8)+" bytes");
		System.out.println("Long l:"+l);

		float f=4500.00f;
		System.out.println("Size of Float data type :"+(Float.SIZE/8)+" bytes");
		System.out.println("Float f:"+f);

		double d=4500.00;
	System.out.println("Size of Double data type :"+(Double.SIZE/8)+" bytes");
		System.out.println("Double d:"+d);

		char ch='A';
	System.out.println("Size of Character data type :"+(Character.SIZE/8)+" bytes");
		System.out.println("Char ch:"+ch);

		boolean bool=true;
	//System.out.println("Size of Boolean data type :"+(Boolean.SIZE/8)+" bytes");
		System.out.println("Boolean bool:"+bool);
		
	}
}

public class TrickyQuestionOnPrimitiveDataType
{
	public static void main(String[] args)
	{
		byte b1=10;
		byte b2=20;
		byte b3=(byte)(b1+b2);
		System.out.println("Result of b1+b2 :"+b3);

		float f1=20.00f;
		float f2=20.00f;
		float f3=f1+f2;
		System.out.println("Result of f1+f2 :"+f3);

		float num=0.7f;
		if(num<=0.7)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}

		char alpha='A';
		alpha=(char)(alpha+1);
		System.out.println(alpha);


	}
}

=========================================================================================
			Operators
=========================================================================================
arithmetic 
logical
unary
bitwise
assignment
ternary
relational
short hand assignment
misc

=========================================================================================
+,-,/,*,%

Example of Arithmetic Operator:
=================================================
public class ArithmeticOperatorExample
{
	public static void main(String[] args)
	{
		long mbno=919743496260L;
		System.out.println("Mobile No. :"+mbno);

		long countrycode=mbno/10000000000L;
		long mobilenumber=mbno%10000000000L;

		System.out.println("Country Code:"+countrycode);
		System.out.println("Mobile Number :"+mobilenumber);
	}
}

Unary Operators:
------------------------
--,++,-,~,!
==============================================================================
int x=10;
++x;// pre-increment
x++;//post-increment

int sum=3;
int num=5;

sum=num++;
sum=++num;

output:
sum=?
num=?


=========================================================================================
Bitwise Operator
-------------------
&,|,<<,>>,^ etc
----------------------

4|5=?
public class NegationOperatorExample
{
	public static void main(String[] args)
	{
		System.out.println("~10 :"+(~10));
		System.out.println("~-10 :"+(~-10));
		//System.out.println("!=10"+(!=10));
		//System.out.println("!1"+(!1));
		boolean st=true;
		System.out.println("!st :"+(!st));

		System.out.println("4 | 5 :"+(4|5));
		System.out.println("5 | 6 :"+(5|6));

		System.out.println("4 & 5 :"+(4&5));//4
		System.out.println("5 & 6 :"+(5&6));//4

		System.out.println("4 << 5 :"+(4<<2));//16
		System.out.println("4 >> 5 :"+(4>>2));//1
	}
}

























































