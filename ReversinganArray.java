package Arrays1;

import java.util.Arrays;

public class ReversinganArray {
public static void main(String[] args) {
	int a[]= {34543,546,234,767,787};
	Arrays.sort(a);
	System.out.println("Reversing an array: ");
	for(int j=a.length-1;j>=0;j--)
	{
		System.out.print(a[j]+" ");
	}
}
}
