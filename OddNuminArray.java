package Arrays1;

import java.util.Arrays;

public class OddNuminArray {
public static void main(String[] args) {
	int a[]= {12,34,566,7678324,32425,67};
    Arrays.sort(a);
    System.out.println("Printing odd numbers from an array :");
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]%2!=0)
    	{
    		System.out.println(a[i]);
    	}
    }
}
}
