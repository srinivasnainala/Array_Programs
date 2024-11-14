package Arrays1;

public class FrequencyofNumber {
public static void main(String[] args) {
	int a[]= {12,34,57,12,3,5,2,2,12};
	int freq[]=new int[a.length];
	int repeated=-1;
	for(int i=0;i<a.length;i++)
	{
		int count=1;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
				freq[j]=repeated;
			}   
		}
		if(freq[i]!=repeated)
		{
			freq[i]=count;
		}
	}
	for(int i=0;i<freq.length;i++)
	{
		if(freq[i]!=repeated)
		{
			System.out.println(a[i]+" count is "+freq[i]);
		}
	}
}
}
