import java.io.*;
import java.util.*;
class Solution
{
    public static void main(String gg[])
    {
        Scanner scn=new Scanner(System.in);
        int n=Integer.parseInt(scn.nextLine());
        String strings[]=new String[n];
        for(int i=0;i<n;i++)
        {
            strings[i]=scn.nextLine();
        }
        int q=Integer.parseInt(scn.nextLine());
        String queries[]=new String[q];
        for(int i=0;i<q;i++)
        {
            queries[i]=scn.nextLine();
        }
        int []ans=new int[q];
        for(int i=0;i<q;i++)
        {
            String query=queries[i];
            for(int j=0;j<n;j++)
            {
                if(strings[j].equals(query))
                 ans[i]++;
            }
        }
        for(int x : ans)
        {
            System.out.println(x);
        }
        
    }
}
