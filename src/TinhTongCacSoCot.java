import java.util.Scanner;

public class TinhTongCacSoCot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {
                {4, 5, 6, 7},
                {6, 9, 4, 3},
                {9, 7, 4, 3, 2}
        };
        System.out.println("Nhập cột muốn tính tổng:");
        int i = input.nextInt();

        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j][i];
        }
        System.out.println("Tổng phần tử của cột " + i + " là: " + sum);
    }
}
