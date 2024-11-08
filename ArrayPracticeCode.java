1 ) AvargeOfArray

package Array;

import java.util.Scanner;

public class AvargeOfArray {
	
	static void  AvarageOffArrays (int arr[],int n)
	
	{
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		double avg = (double)sum/arr.length;
		System.out.printf("%.2f",avg);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();	
		}
		AvarageOffArrays(arr,n);
		scan.close();
	
		
		
	}

}

2) ABS Sum


package Array;

import java.util.Scanner;

public class absSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum =sum+Math.abs(arr[i]);
		}
		System.out.println(sum);

	}

}

3) Largest Elements In Array

package Array;

import java.util.Scanner;

public class BigeestElementArray {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for( int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int Largest = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>Largest)
			{
				Largest = arr[i];
			}
		}
		 System.out.println("The smallest element in the array is: " +Largest);
		 scan.close();
	}
}
4) EVEN and Odd Index Array

package Array;

import java.util.Scanner;

public class EvenIndexElements {
	static void EvenIndexArrayElements(int arr[],int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}
	
	
	
	static void OddIndexArrayElements(int arr[],int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==1)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for( int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		OddIndexArrayElements(arr,n);
		EvenIndexArrayElements(arr, n);

	}

}
5) Last Accurance OF index 
package Array;

import java.util.Scanner;

public class LastAccucarenceindexfinder {
	
	public static void Lastaccarence(int arr[],int n,int k)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==k)
			{
				System.out.println(i);
			}
		}
		System.out.println(-1);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for( int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int k =scan.nextInt();
		Lastaccarence(arr,n,k);
		scan.close();

	}

}

6) Print Array Elements 
package Array;

import java.util.Scanner;

public class PrintArrayELements {
	
	
	static void ArrayElement(int arr[],int n)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==count)
			{
			 count=count +arr[i];
			}
			System.out.print(arr[i] +" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for( int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		ArrayElement(arr,n);
		

	}

}

7) Start To Middle / Middle To End Idex Array 


package Array;

import java.util.Scanner;

public class PrintOddELementsStartToEnd {
	
	static void StartToEnd(int[]arr,int n)
	{
		for(int i=0;i<arr.length/2;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
	
	
	static void miidle(int[]arr,int n)
	{
		for(int i=arr.length/2;i>0;i--)
		{
			System.out.println(arr[i]+" ");
		}
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for( int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		miidle(arr,n);
		StartToEnd(arr,n);
	}

}

8 ) sum and Product of Array 

package Array;

import java.util.Scanner;

public class ProductOfArrayELements {
	
	static void  ProductArray(int[]  arr,int n)
	{
		int product =1;
		for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
		}
		System.out.println(product);
			
	}



static void SumOfArray(int arr[],int n)
	{
		int sum=0;
	
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for( int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		ProductArray(arr,n);
                SumOfArray(arr,n);
	}

}

