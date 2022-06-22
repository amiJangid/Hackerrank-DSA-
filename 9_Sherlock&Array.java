import java.util.*;
import java.io.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int testCases=Integer.parseInt(scn.nextLine());
        for(int j=0;j<testCases;j++)
        {   
            int n = scn.nextInt();
            String ans="NO";
            if(n==1) 
            {
                ans="YES";
                
               
            }
            else
         {
            int input[]=new int[n];
            int left[]=new int[n];
            int right[]=new int[n];
            for(int i=0;i<n;i++)
            {  
               input[i]=scn.nextInt(); 
              
            }
            
            left[0]=input[0];
            right[n-1]=input[n-1];
            for(int i=1;i<n;i++)
            {  
                left[i]=left[i-1]+input[i];
            }
            
            
            for(int i=n-2; i>=0 ;i--)
            {  
                right[i]=right[i+1]+input[i];
            }
            
            
            for(int i=0;i<n;i++)
            {  
               if(i==0)
               {
                 if(right[i+1]==0)
                   {
                    ans="YES";
                     break; 
                   }
               }
               else if(i==n-1)
                {
                  if(left[i-1]==0)
                   {
                    ans="YES";
                     break; 
                   }
               }
               else
               {
                   if(left[i-1]==right[i+1])
                   {
                    ans="YES";
                     break; 
                   }
               }
            }
         }
            System.out.println(ans);
            
        }
        scn.close();
    }
}
