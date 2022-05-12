import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int n, i, index_del;
        Scanner input = new Scanner(System.in);
            do {
                System.out.println("Nhập số phần tử của mảng: ");
                n = input.nextInt();
            }while (n <= 0);

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++){
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng trước khi xóa: ");
        for (i = 0; i < n; i++){
            System.out.println(arr[i] + "");
        }

        System.out.println("Nhập số nguyên d: ");
        int d = input.nextInt();

        int count = 0;

        for( i = 0; i < n; i++){
            if (arr[i] == d){
                index_del = i;
                count++;
            }
        }
        if(count == 0){
            System.out.println(d + " ko thuộc mảng");
        } else {
            int[] arr2 = new int[n - count];
            int j = 0;
            for (int k = 0; k < n; k++) {
                if (d != arr[k]) {
                    arr2[j] = arr[k];
                    j++;
                }
            }
            System.out.println("Mảng sau khi xóa: ");
            for (int a : arr2) {
                System.out.println(a);
            }
        }

        // gán lại vị trí index của mảng
//        for (i = j = 0; i < n; i++) {
//            if(arr[i] != d){
//                arr[j] = arr[i];
//                j++;
//            }
//        }
//        n = j;
//        System.out.println("Mảng còn lại sau khi xóa phần tử " + d + " là: ");
//        for (i = 0; i < n; i++){
//            System.out.println(arr[i] + "\t");
//        }
    }
}
