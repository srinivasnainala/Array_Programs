package Arrays1;

public class BigdigitinaNumberOfanArray {
public static void main(String[] args) {
	System.out.println("Printing biggest digit in a given number :");
	int a[]= {123,4654,6778,346789};
	int r;
	for(int i=0;i<a.length;i++)
	{
		int big=0;
		int n=a[i];
		while(n!=0)
		{
			r=n%10;
			if(big<r) 
			{
				big=r;
			}
			n=n/10;
		}
		System.out.println(big+" is biggest digit in "+a[i]);
	}
}
}
