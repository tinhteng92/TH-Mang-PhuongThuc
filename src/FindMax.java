import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
//        int[][]arr = {
//                {3, 4, 6, 7},
//                {9, 7, 5, 4}
//        };
//        int max = arr[0][0];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if(max < arr[i][j]){
//                    max = arr[i][j];
//                }
//            }
//
//        }
//        System.out.println("Phần tử lớn nhất trong ma trận: " + max);
        int m, n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();

        int[][] A = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                System.out.println("A[" + i + "][" + j + "] =");
                A[i][j] = scanner.nextInt();
            }
        }
        int max = A[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]){
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }

}
