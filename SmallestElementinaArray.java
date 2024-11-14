package Arrays1;

public class SmallestElementinaArray {
public static void main(String[] args) {
	int a[]= {12324,456,766,33,02};
	int small=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(small>a[i])
		{
			small=a[i];
		}
	}
	System.out.println("Smallest element in the given array is :" +small);
}
}
