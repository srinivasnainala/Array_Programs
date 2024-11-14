package Arrays1;

public class StringPallindromePairsinArray {
	public static boolean isPallindrome(String n)
	{
		int i=0,j=n.length()-1;
		while(i<j)
		{
			if(n.charAt(i)!=n.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
public static void main(String[] args) {
	System.out.println("Printing pallindrome pairs");
	String s[]= {"vsau","sai","abc","mom","mo"};
	String temp="";
	for(int i=0;i<s.length;i++)
	{
		for(int j=1;j<s.length;j++)
		{
			temp=s[i]+s[j];
			if(isPallindrome(temp))
			{
				System.out.println(temp);
			}
		}
	}
}
}
