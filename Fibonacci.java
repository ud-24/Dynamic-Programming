import java.io.*;
import java.util.*;
public class Fibonacci{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int r=fibo(n);
        System.out.println(r);
    }
    public static int  fibo(int n)
    {
        if(n==0)
        return 0;
        else if(n==1)
        return 1;
        else 
        return(fibo(n-1)+fibo(n-2));
    }
}