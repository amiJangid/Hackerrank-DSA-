/*
with O(n) complexity:
We need to calculate the sums across the two diagonals of a square matrix. Along the first diagonal of the matrix, 
row index = column index. The second diagonal is at column  for each row . Loop through the rows, summing both values as  increments.
*/
public static int diagonalDifference(List<List<Integer>> arr) {
        
    int lsum=0;
    int rsum=0;
    
    int n=arr.size();

    for (int i=0;i<n;i++)
    {
        
            lsum+=arr.get(i).get(n-i-1);
            
            rsum+=arr.get(i).get(i); 
    }   
        return Math.abs(lsum-rsum);
    }
   
// with O(n^2) complexity:

public static int diagonalDifference(List<List<Integer>> arr) {
    
    int lsum=0;
    int rsum=0;
    
    int n=arr.size();
    int s=n-1;
    for (int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i==j) lsum+=arr.get(i).get(j);
            if(i+j==s)
            rsum+=arr.get(i).get(j);
        }
        
    }   
        return Math.abs(lsum-rsum);
    }
