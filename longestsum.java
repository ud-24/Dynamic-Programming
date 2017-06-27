// code for kadane algorithm

import java.io.*;
import java.util.*;
public class longestsum{
    public static void main(String args[]){
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    int[] a= new int[n];
    for(int i=0;i<n;i++)
    a[i]=s.nextInt();
    int sum=0;
    int max=0;
    for(int j=1;j<n;j++)
    {
        sum=sum+a[j];
        if(sum<0)
        sum=0;
        if(max<sum)
        max=sum;
    }
    System.out.println(max);
}}