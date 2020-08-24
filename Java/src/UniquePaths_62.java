public class UniquePaths_62 {
    public int uniquePaths(int m, int n) {
        int[][] array = new int[m][n];
        for(int i = 0; i < n; i++){
            array[m-1][i] = 1;
        }

        for(int i = 0; i < m; i++){
            array[i][n-1] = 1;
        }

        return getNumUniquePathsDP(0, 0, m, n, array);

    }

    static int getNumUniquePathsDP(int i, int j, int m, int n, int[][] array){
        // basecase
        if(i == m - 1){
            array[i][j] = 1;
            return 1;
        };
        if(j == n - 1) {
            array[i][j] = 1;
            return 1;
        };

        if(array[i][j]!= 0){
            return array[i][j];
        }

        array[i][j] = getNumUniquePathsDP(i + 1, j, m, n, array) + getNumUniquePathsDP(i, j + 1, m, n, array);
        return array[i][j];
    }
}
