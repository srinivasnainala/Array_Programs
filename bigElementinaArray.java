package Arrays1;

import java.util.Arrays;

public class bigElementinaArray {
public static void main(String[] args) {
	int a[]= {34,45,2,635,78};
	System.out.println(Arrays.toString(a));
	int big=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(big<a[i])
		{
			big=a[i];
		}
	}
	System.out.println("Biggest element in the given array is : "+big);
}
}
