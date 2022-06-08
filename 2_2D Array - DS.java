
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution
{
     public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
     int maxSum=Integer.MIN_VALUE;
     for(int i=0;i<arr.size()-2;i++)
     {
         for(int j=0;j<arr.size()-2;j++)
         {   int hourGlass=0;
             int k=j;
             while(k<=j+2)
             {
                hourGlass+= arr.get(i).get(k)+arr.get(i+2).get(k);
                 k++;
             }
            hourGlass+=arr.get(i+1).get(j+1);
            maxSum=Math.max(maxSum,hourGlass);
         }
     }
     return maxSum;

    }
    public static void main (String[] args) throws java.lang.Exception
    {   Scanner scn=new Scanner(System.in);
        List<List<Integer>> arr;
        arr=new ArrayList<>();
        for(int i=0;i<6;i++)
        {   List<Integer> row=new ArrayList<>();
            for(int j=0;j<6;j++)
            {
               row.add(scn.nextInt());
            }
            arr.add(row);
        }
        System.out.println(hourglassSum(arr));
    }
}

