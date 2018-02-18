/**
 * @author: ztq
 * @Date: 2018/02/17
 */

import java.util.ArrayList;

/***
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵：
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 * 则依次打印出数字 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Test20 {

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return list;
        }
        int start = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        while (rows > 2 * start && cols > 2 * start) {
            list = printOneCircle(matrix, start, rows, cols, list);
            start++;
        }
        return list;
    }

    private ArrayList<Integer> printOneCircle(int[][] matrix, int start, int rows, int cols, ArrayList<Integer> list) {
        //终止列号
        int endCol = cols - 1 - start;
        //终止行号
        int endRow = rows - 1 - start;
        //从左到右
        for (int i = start; i <= endCol; i++) {
            list.add(matrix[start][i]);
        }
        //从上到下 终止行号>起始行号
        if (endRow > start) {
            for (int i = start + 1; i <= endRow; i++) {
                list.add(matrix[i][endCol]);
            }
        }
        //从右到左 至少有2行2列，即终止行号>起始行号 && 终止列号>起始列号
        if (endRow > start && endCol > start) {
            for (int i = endCol - 1; i >= start; i--) {
                list.add(matrix[endRow][i]);
            }
        }
        //从下到上 至少有3行2列，即终止行号比起始行号至少大2 && 终止列号>起始列号
        if (endRow > start + 1 && endCol > start) {
            for (int i = endRow - 1; i > start ; i--) {
                list.add(matrix[i][start]);
            }
        }
        return list;
    }

}
