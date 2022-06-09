import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String gg[])
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int q=scn.nextInt();
        int lastAnswer=0;
        List<Integer>[] arr=new List[n];
        // This line creates an array of size n each arr element points
        // to a List of integers.
        for(int i=0;i<n;i++)
        {
            arr[i]=new ArrayList<>();
        }
        
        for(int j=0;j<q;j++)
        {
          int type=scn.nextInt();
          int x=scn.nextInt();
          int y=scn.nextInt();
          List<Integer> sequence=arr[(x ^ lastAnswer)%n];
          if(type==1)
          {
            sequence.add(y);
          }
         else if(type==2)
          {
            lastAnswer = sequence.get(y % sequence.size());
            System.out.println(lastAnswer);
          }
        }
    } 
}
