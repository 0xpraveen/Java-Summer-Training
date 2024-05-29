=========================================================================================
					Programming Practices
=========================================================================================
1. WAP to check given number is armstromg number or not.

import java.util.*;
public class ArmstrongNumber
{
	public static int length(int num)
	{
		int len=0;
		while(num!=0)
		{
			num=num/10;
			len++;
		}
		return len;
	}

	public static boolean isArmstrong(int num)
	{
		int power=length(num);
		int temp=num;
		double sum=0;

		while(temp!=0)
		{
			int rem=temp%10;
			double poweredValue=Math.pow(rem,power);
			sum+=poweredValue;
			temp=temp/10;
		}
		if(sum==num)
			return true;
		else
			return false;
		
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=input.nextInt();
		if(isArmstrong(num))
		{
			System.out.println(num+" is Armstrong number");
		}
		else
		{
			System.out.println(num+" is not Armstrong number");
		}
		
	}
}

2. WAP to generate Random number.
import java.util.*;
public class RamdomNumberExample
{
	public static void main(String[] args)
	{
		Random r=new Random();
		System.out.println("OTP :"+r.nextInt(1000));
	}
}

============================================================================================
					Arrays
============================================================================================
Decalartion of an array:

int[] arr;
int arr[];
int  []arr;

Declaration with initialization:
int[] arr=new int[5];

Assign value to array:
------------------------
arr[0]=5;
arr[1]=10;
arr[2]=2;
arr[3]=4;
arr[4]=100;

Printing an array:
System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
System.out.println(arr[3]);
System.out.println(arr[4]);

int[] arr={10,20,30,40};


------------------------------------------------------------------------------------------
Class Assignment:
Wap to take an array with 5 size , assign value to all index . and print the array value.
-------------------------------------------------------------------------------------------

int[][] arr;
int arr[][];
int [][]arr;

Declaration with initialization
-------------------------------
int[][] arr=new int[2][3];

Row :1
arr[0][0]=50;
arr[0][1]=40;
arr[0][2]=10;

Row :2
arr[1][0]=300;
arr[1][1]=200;
arr[1][2]=100;


System.out.println(arr[0][0]);
System.out.println(arr[0][1]);
System.out.println(arr[0][2]);
System.out.println(arr[1][0]);
System.out.println(arr[1][1]);
System.out.println(arr[1][2]);


============================================================================================
Class Assignment:
Wap to insert data in 2d array and print it .

=============================================================================================
import java.util.*;
class TwoDArrayExample
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		int[][] arr=new int[2][3];
		
		// To insert data in 2 d array
		for(int row=0;row<2;row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.println("Enter data arr["+row+"]["+col+"] :");
				arr[row][col]=input.nextInt();
			}
		}

		//Print 2 d array
		for(int row=0;row<2;row++)
		{
			System.out.print("Row No :"+row+" : ");
			for(int col=0;col<3;col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
	}
}




=======================================================================================




Output:

C:\Users\Basavaraju\Desktop\LPU\Core Java>java  TwoDArrayExample
Enter data arr[0][0] :
10
Enter data arr[0][1] :
20
Enter data arr[0][2] :
30
Enter data arr[1][0] :
100
Enter data arr[1][1] :
200
Enter data arr[1][2] :
300
Row No :0 : 10 20 30
Row No :1 : 100 200 300

============================================================================================
String[] arr={"Tamanna","Sivani","Subham","Nehashree Giri"};
//for each loop
for(String str:arr)
{
	System.out.println(str);
}


============================================================================================
Class Assignment:
Wap to insert 5 elements in an array. print the sum of odd index value and even index value.

============================================================================================= 

=========================================================================================
jshell> long d=System.currentTimeMillis();
d ==> 1686654471693

jshell> java.sql.Date date=new java.sql.Date(d);
date ==> 2023-06-13

jshell> java.sql.Time time=new java.sql.Time(d);
time ==> 16:37:51


===========================================================================================
Class Assignment:
Wap to take dob of user and print their year of age.
Example:
Input:
Enter your dob:1960-01-01

output:
You are 63 years old.

==========================================================================================
int year=(2023-06-13)-(1960-01-01);
==========================================================================================
import java.text.*;
import java.util.*;
public class FindAgeYearFromDOB
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		SimpleDateFormat sdf=new SimpleDateFormat("MM-DD-YYYY HH:MM:SS");
		
		System.out.println("Enter your dob:");
		String dob=input.nextLine();

		long d=System.currentTimeMillis();

		Date todaydate=new Date(d);

		Date date1=sdf.parse(todaydate);
		Date date2=sdf.parse(dob);

		long difference=date1.getTime()-date2.getTime();
		
		int year=(difference/60*60*24)%365;

		System.out.println("Your are "+year+" old");
				
	}
}


























































