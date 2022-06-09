import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String gg[])
    {
        Scanner scn=new  Scanner(System.in);
        int n=scn.nextInt();
        int d=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        d=d%n;
        int temp[]=new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        int i=0;
        while(i<n-d)
        {   
           
           arr[i]=arr[i+d];
           i++;
        }
        
        int j=0;
        while( i<n )
        {
            arr[i]=temp[j];//i=3 d=2 -1
            i++;
            j++;
        }
        for(int x : arr)
        {
            System.out.print(x+" ");
        }
        
        
        
    }
}
