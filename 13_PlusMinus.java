// TC:O(N)
public static void plusMinus(List<Integer> arr) {
        
     int n=arr.size();
     int plus=0;
     int minus=0;
     int zero=0;
     for(int i=0;i<n;i++)
     {
         if(arr.get(i)>0)
         {
           plus++;  
         }
         else if(arr.get(i)<0)
         {
           minus++;  
         }
         else
         {
           zero++;  
         }
     }
     System.out.printf("%.6f\n",(float)plus/(float)n);
     System.out.printf("%.6f\n",(float)minus/(float)n);
     System.out.printf("%.6f\n",(float)zero/(float)n);
    }

}
