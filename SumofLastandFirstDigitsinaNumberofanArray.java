package Arrays1;

public class SumofLastandFirstDigitsinaNumberofanArray {
public static void main(String[] args) {
	int a[]= {234,5464,6765,373};
    System.out.println("Adding first and last digit of each number ");
    for(int i=0;i<a.length;i++)
    {
    	int sum=0,r;
    	int last=a[i]%10;
    	int first=a[i];
    	while(first>=10)
    	{
    		first=first/10;
    		sum=last+first;
    	}
    	System.out.println(sum);
    }
}
}
