public class CountNegativeNumbersInASortedMatrix_1351 {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int r = 0;
        int c = n - 1;
        int cnt = 0;

        while (r < m && c >= 0) {
            System.out.println("\n" + "current grid[r][c] is " + grid[r][c]);

            if (grid[r][c] < 0) {
                System.out.println("grid[r][c] is " + grid[r][c]);
                cnt += m - r; // there are m - r negative numbers in current column.
                System.out.println("current count is " + cnt);
                --c;
            }else {
                ++r;
            }
        }
        System.out.println("cnt is " + cnt);
        return cnt;
    }
}
