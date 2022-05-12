import java.util.Scanner;

public class BtFindMin {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập sồ lượng phần tử: ");
            size = input.nextInt();
        }while (size <= 0);
        int[] arr = new int [size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);

    }
}
