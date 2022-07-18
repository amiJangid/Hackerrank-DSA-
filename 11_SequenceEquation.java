import java.io.*;
import java.util.*;


class Solution {

  
    public static void main (String gg[]) 
    {   try
       {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        ArrayList<Integer>input=new ArrayList<>();
        for(int i=0;i<str.length;i++)
        {
            input.add(Integer.parseInt(str[i]));
        }
         
        int ans[]=new int[n];
        for(int i=1;i<=n;i++)
        {  int indexOfi=input.indexOf(i)+1;
           int PofY=input.indexOf(indexOfi);
           ans[i-1]=PofY+1; 
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(ans[i]);
        }
       }catch(Exception e)
       {
           
       }
    }

}

