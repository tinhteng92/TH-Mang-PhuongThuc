public class TinhTongCacSoODuongCheoChinh {
    public static void main(String[] args) {
        // Tính tổng 2 đường chéo chính trong ma trận vuông
        int [][] array = {{7, 4, 8},
                {4, 7, 9},
                {9, 12, 10}};

        int sumRightCross = 0;
        int sumLeftCross = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sumRightCross += array[i][j];
                }
                if (i + j == array.length - 1) {
                    sumLeftCross += array[i][j];
                }
            }
        }
        System.out.print("Sum right is: " + sumRightCross + "\n");
        System.out.print("Sum left is: " + sumLeftCross + "\n");
    }
    }




