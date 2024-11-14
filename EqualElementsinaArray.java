package Arrays1;

public class EqualElementsinaArray {
public static void main(String[] args) {
	int a[]= {12,12,354,56,12,56,3,12};
	int equal=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				equal=a[i];
			}
		}
	}
	System.out.println("Equal elements in a given array is: "+equal);
}
}
