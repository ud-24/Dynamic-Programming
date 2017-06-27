import java.io.*;
import java.util.*;
public class longestcommonsub{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        char[] x=a.toCharArray();
        int m=x.length;
        char[] y=b.toCharArray();
        int n=y.length;
        int[][] l= new int[m+1][n+1];
        for(int i=0;i<m+1;i++)
        l[i][0]=0;
        for(int i=0;i<n+1;i++)
        l[0][i]=0;
        for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(x[i-1]==y[j-1])
                l[i][j]=1+l[i-1][j-1];
                else
                {
                    if(l[i][j-1]>l[i-1][j])
                    l[i][j]=l[i][j-1];
                    else
                    l[i][j]=l[i-1][j];
                }
            }
        }
        System.out.println("The longest common subsequence is of length "+l[m][n]);
}
}