package Arrays1;

import java.util.Arrays;

public class PerfectNuminaArray {
public static void main(String[] args) {
int a[]= {1234,435,556,28,212,546,6};
Arrays.sort(a);
System.out.println("Printing perfect numbers from an array : ");
for(int i=0;i<a.length;i++)
{
	int sum=0;
	for(int j=1;j<a[i];j++)
	{
		if(a[i]%j==0)
		{
			sum=sum+j;
		}
	}
	if(a[i]==sum)
	{
		System.out.println(a[i]+" is a perfect number");
	}
}
}
}
