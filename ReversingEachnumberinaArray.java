package Arrays1;

public class ReversingEachnumberinaArray {
public static void main(String[] args) {
	System.out.println("Transfering each digit to reverse order");
	int a[]= {1213,45,678,432};
	int r;
	for(int i=0;i<a.length;i++)
	{
		int rev=0;
		while(a[i]!=0)
		{
			r=a[i]%10;
			rev=r+rev*10;
			a[i]=a[i]/10;
		}
		System.out.print(rev+" ");
	}
}
}
