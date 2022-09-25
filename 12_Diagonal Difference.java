/*
with O(n) complexity:
We need to calculate the sums across the two diagonals of a square matrix. Along the first diagonal of the matrix, 
row index = column index. The second diagonal is at column  for each row . Loop through the rows, summing both values as  increments.
*/
int primaryDigonal = 0, secondDigonal = 0;
    int k = 0, arrCount = arr_columns - 1;
    for(int i = 0; i< arr_columns; ++i) {
        primaryDigonal += arr[i][i];
        secondDigonal += arr[i][arrCount - k];
        k++;
    }
// with O(n^2) complexity:

for(int i = 0; i< arr_columns; ++i) {
        primaryDigonal += arr[i][i];
}

for(int i = 0; i < arr_columns; ++i) {
        for(int j = arr_rows - 1; j >= 0; --j) {
            secondDigonal += arr[i][j];
             i++;
             continue;
         }
     }
