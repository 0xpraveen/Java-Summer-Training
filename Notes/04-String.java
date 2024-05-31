==================================================================================================
				String
==================================================================================================
String s1=new String("Java");
How many object are created here?
Ans : Two object
one inside String constnat pool memory
and
another inside heap memory but outside string constant pool memory.

=================================================================================================
String s2="Hello";
One object will ne created in string constant pool memory.

Example :
public class StringExample
{
	public static void main(String[] args)
	{
		String s1="Java";
		String s2=new String("Hello");
		String s3="Java";
		String s4="Java";
		String s5=new String("Hello");
		String s6=new String("hello");

		System.out.println("S1 :"+s1+" :"+s1.hashCode());
		System.out.println("S2 :"+s2+" :"+s2.hashCode());
		System.out.println("S3 :"+s3+" :"+s3.hashCode());
		System.out.println("S4 :"+s4+" :"+s4.hashCode());
		System.out.println("S5 :"+s5+" :"+s5.hashCode());
		System.out.println("S6 :"+s6+" :"+s6.hashCode());

		s4="Java124";
		System.out.println("S4 :"+s4+" :"+s4.hashCode());
		s3="pava";
		System.out.println("S3 :"+s3+" :"+s3.hashCode());

		System.out.println(s2.concat(s1).hashCode());
		String s7=s2.concat(s1);
		System.out.println("S7 :"+s7+" :"+s7.hashCode());

		System.out.println("Java "+(5+6+2));
		System.out.println((5+6+2));	

		System.out.println(5+6+"Java "+6+2));
		







		

		
		
	}
}


================================================================================================
Methods of String
------------------------------------------------------------------------------------------------
Example:
----------------------
public class StringMethods
{
	public static void main(String[] args)
	{
		String s1="Hello";
		char firstchar=s1.charAt(0);
		System.out.println("First Character of Hello:"+firstchar);

		char lastChar=s1.charAt(s1.length()-1);
		System.out.println("Last Character of Hello:"+lastChar);

		char[] ch=s1.toCharArray();
		System.out.println("Printing char array:");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(" "+ch[i]);
		}

		char[] chArray={'A','P','P','L','E'};
		String word=new String(chArray);
		System.out.println("\nPrinting word of char array:"+word);

		String sent="Hello I am good";
		String[] words=sent.split(" ");
		System.out.println("Print words:");
		for(String w:words)
		{
			System.out.println(w);
		}
		
		
	}
}


================================================================================================
Java String compare
=================================================================================================
There are three ways to compare String in Java:
1.By Using equals() Method  =>it is used to compare with content and it compares case also.
	equalsIgnoreCase()=> it is used to compare with content and it doesn't compare with case.
2.By Using == Operator      => it is used to compare with address or references.
3.By compareTo() Method	    => it is used to compare with content but based on ASCII values.
				if both string are equals then it will return 0,
				if s1 is greater than s2 then it will return 1,
				if s1 is smaller than s2 then it will return -1
 

Example:
public class StringCompareExample
{
	public static void main(String[] args)
	{
		String s1="Java";
		String s2="java";
		String s3=new String("Java");
		
		System.out.println("s1==s3 :"+(s1==s3));
		System.out.println("s1==s2 :"+(s1==s2));
		
		System.out.println("s1.equals(s3) :"+(s1.equals(s3)));
		System.out.println("s1.equalsIgnoreCase(s2) :"+(s1.equalsIgnoreCase(s2)));
		
		System.out.println("s1.compareTo(s2)"+(s1.compareTo(s2)));
		String a="A";
		String b="B";
		String c="A";
		System.out.println("a.compareTo(b)"+(a.compareTo(b)));
		System.out.println("a.compareTo(c)"+(a.compareTo(c)));
		System.out.println("b.compareTo(a)"+(b.compareTo(a)));

	}
}

================================================================================================
Java String intern()
The Java String class intern() method returns the interned string. It returns the canonical representation of string.

It can be used to return string from memory if it is created by a new keyword. It creates an exact copy of the heap string object in the String Constant Pool.
Example :
public class StringInternMethod
{
	public static void main(String[] args)
	{
		String s=new String("Hello");
		String s1="Hello";
		String s2=s.intern();//fetch data from SCP

		System.out.println("s1==s2 :"+(s1==s2));
	}
}
---------------------------------------------------------------------------------------------------
Problem:
String senetence="Hi this is java programming language";
Wap to convert first character in upper case of each words.
Input should be enterde from users.
Time:10
Solution:
import java.util.*;
 import java.util.stream.*;
public class CapitalizEachWords
{
	public static String getCapitalized(String str)
	{
		return Arrays.stream(str.split("\\s")).map(ele->ele.substring(0,1).toUpperCase()+ele.substring(1)).collect(Collectors.joining(" "));
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter sentence :");
		String senetence=input.nextLine();

		String s1=getCapitalized(senetence);
		System.out.println(s1);
		
	}
}




