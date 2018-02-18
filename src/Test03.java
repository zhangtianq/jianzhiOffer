/**
 * @author: ztq
 * @Date: 2018/02/09
 */

/***
 * 1.在一个二维数组中，
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class Test03 {

    public boolean find(int target, int[][] array) {
        int row = array.length; //行数
        int col = array[0].length; //列数
        //二维数组矩阵中，左下角元素的坐标
        int x = row - 1, y = 0;
        while (x >= 0 && y < col) {
            if (target > array[x][y]) {
                y++;
            } else if (target < array[x][y]) {
                x--;
            } else {
                return true;
            }
        }
        return false;
    }
}
