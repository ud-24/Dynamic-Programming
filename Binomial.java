import java.io.*;
import java.util.*;
public class Binomial{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int r=C(n,k);
        System.out.println(r);
    }
    public static int C(int n,int k)
    {
        if(k==0 || k==n)
        return 1;
        else
        {
            return(C(n-1,k-1)+C(n-1,k));
        }
    }
}