package Arrays1;

import java.util.Scanner;

public class DuplicatesinArray {
public static void main(String[] args) {
//	String s[]={"vasu","sai","vasu","sai","naveen"};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String values :");
	String s[]=new String[4];
	for(int k=0;k<s.length;k++)
	{
		s[k]=sc.nextLine();
	}
	for(int i=0;i<s.length;i++)
	{
		for(int j=s.length-1;j>=0;j--)
		{
         if(i<j)
         {
        	 if(s[i].equals(s[j]))
        	 {
        		 System.out.println(s[i]+" is a duplicate");
//        		 break;
        	 }
         }
		}
	}
	sc.close();
}
}
