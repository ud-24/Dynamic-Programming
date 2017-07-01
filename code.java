/* https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/intelligent-girl-1/*/
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TestClass
{
	 public static void main(String args[] ) throws Exception {
       Scanner s= new Scanner(System.in);
       String str=s.nextLine();
       print(str);
    }
    public static void print(String str)
    {
        int l=str.length();
        char[] a=str.toCharArray();
        int[] b= new int[l];
        for(int i=0;i<l;i++){
        b[i]=a[i]-48;}
        for(int i=0;i<l;i++)
        {
           int r= print1(b,i);
           System.out.print(r+" ");
        }
    }
    public static int print1(int[] b,int i)
    {
        //int i=0;
        //int j=b.length-1;
       if(i==b.length-1)
       {
           if(b[i]%2==0)
           return 1;
           else
           return 0;
       }
       else
       {
           if(b[i]%2==0)
           return 1+print1(b,i+1);
           else
           return print1(b,i+1);
       }
    }
}
