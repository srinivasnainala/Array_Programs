package Arrays1;

public class PallindromeStringsinArray {
	public static boolean isPallindrome(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
public static void main(String[] args) {
	String a[]= {"abc","usu","mom","dad"};
	for(int i=0;i<a.length;i++)
	{
		if(isPallindrome(a[i]))
		{
			System.out.println(a[i]+" is pallindrome");
		}
	}
}
}
