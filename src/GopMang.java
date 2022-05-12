import java.util.Scanner;

public class GopMang {
//    public void taoMang(){
//        Scanner input = new Scanner(System.in);
//        int size, i, element;
//        do{
//            System.out.println("Nhập số lượng phần tử của mảng: ");
//            size = input.nextInt();
//        }while (size <= 0);
//
//        int[] arr = new int[size];
//        System.out.println("Nhập các phần tử cho mảng:");
//        for (i = 0; i < size; i++){
//            System.out.println("Nhập phần tử thứ" + (i + 1) + ":");
//            element = input.nextInt();
//        }
//        System.out.println("Mảng trước khi gộp: ");
//        for (i = 0; i < size; i++){
//            System.out.print(arr[i] + " ");
//        }
//
//    }
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 7, 8};
        int[] arr2 = {6, 7, 9, 4};
        int[] arr3 = new int[arr1.length + arr2.length];

        for(int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i] = arr2[i];
        }
        System.out.println("Mảng sau khi gộp: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
        }


    }


    }

