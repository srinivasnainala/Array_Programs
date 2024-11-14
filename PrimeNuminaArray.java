package Arrays1;

import java.util.Arrays;

public class PrimeNuminaArray {
public static void main(String[] args) {
	int a[]= {213,11,97,34,46,5656,23,3};
	System.out.println("Printing prime numbers from an array : ");
	Arrays.sort(a);
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		for(int j=1;j<=a[i];j++)
		{
			if(a[i]%j==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			sum=sum+a[i];
			System.out.println(a[i]+ " is a prime number");
		}
//		else
//		{
//			System.out.println(a[i]+" is not a prime number");
//		}
	}
	System.out.println("Sum of prime numbers in a given array is : "+sum);
}
}
