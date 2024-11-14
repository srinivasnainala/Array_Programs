package Arrays1;

import java.util.Arrays;

public class PallindromeinArray 
{
	public static void main(String[] args) {
		int a[]= {23,43543,444,757,1232,121};
		Arrays.sort(a);
		int r;
		for(int i=0;i<a.length;i++)
		{
			int rev=0,temp=0;
			temp=a[i];
			while(a[i]!=0)
			{
				r=a[i]%10;
				rev=r+rev*10;
				a[i]=a[i]/10;
			}
			if(temp==rev)
			{
				System.out.println(temp+" is a pallindrome");
			}
			else
			{
				System.out.println(temp+" is not a pallindrome");
			}
		}
	}
//	public static boolean isPallindrome(int n)
//	{
//		int temp=0,rev=0,r;
//		temp=n;
//		while(n!=0)
//		{
//			r=n%10;
//			rev=r+rev*10;
//			n=n/10;
//		}
//		return temp==rev;
//	}
//public static void main(String[] args) {
//	int a[]= {2134,434,56657,121,666,858};
//	Arrays.sort(a);
//	for(int num:a)
//	{
//		if(isPallindrome(num))
//		{
//			System.out.println(num+" is a pallindrome");
//		}
//	}
//}
}

