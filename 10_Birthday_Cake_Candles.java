class Result {

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Single Traversal Solution
    // TC=O(n) SC=O(1)
    int max=Integer.MIN_VALUE;
    int count=0;
    for(int i=0;i<candles.size();i++)
    {
       if(candles.get(i)>max)
       {
           max=candles.get(i);
           count=1;
       }  else if(candles.get(i)==max)
       {
           count++;
       }
    }

      return count;
    }

}
