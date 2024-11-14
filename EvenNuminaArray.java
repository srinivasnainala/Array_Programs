package Arrays1;

import java.util.Arrays;

public class EvenNuminaArray {
public static void main(String[] args) {
	int[] a= {324,45,667,85,78};
    Arrays.sort(a);
	System.out.println("Printing even numbers :");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
	}
}
}
