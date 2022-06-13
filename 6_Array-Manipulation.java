import java.io.*;
import java.util.*;
public class Solution 
{
    public static void main(String gg[])
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int q=scn.nextInt();
        ArrayList<Integer> []queries=new ArrayList[3];
        long ans[]=new long[n+2];
        for(int i=0;i<q;i++)
        {
            int a=scn.nextInt();
            int b=scn.nextInt();
            int k=scn.nextInt();
            ans[a]+=k;
            ans[b+1]+=-k;  
        }
        //Now apply prefix sum algorithm
        for(int i=1;i<n+2;i++)
        {
            ans[i]=ans[i]+ans[i-1];
        }
        long max=Integer.MIN_VALUE;
        for(int i=0;i<ans.length;i++)
        {
            max=Math.max(max,ans[i]);
        }
        System.out.println(max);
    }
}
