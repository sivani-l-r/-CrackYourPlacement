class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1;
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        for (int i = 0; i < rowLen; i++) {
            if (matrix[i][0] == 0)
                col0 = 0;
            for (int j = 1; j < colLen; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < rowLen; i++) {
            for (int j = 1; j < colLen; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        if (matrix[0][0] == 0) {
            for (int j = 0; j < colLen; j++) {
                matrix[0][j] = 0;
            }
        }

        if (col0 == 0) {
            for (int i = 0; i < rowLen; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
