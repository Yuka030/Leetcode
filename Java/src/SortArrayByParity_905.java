public class SortArrayByParity_905 {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;

        while(i < j){
            if(A[i] % 2 == 0){
                i++;
            }else{
                if(A[j] %2 != 0){
                    j--;
                }
                else{
                    swap(A, i, j);
                    i++;
                    j--;
                }
            }
        }

        return A;
    }

    public void swap(int[] num, int i, int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
