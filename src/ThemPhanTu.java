import java.util.Scanner;

public class ThemPhanTu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size, i, element, index;
        do {
            System.out.println("Nhập số lượng phần tử mảng: ");
            size = input.nextInt();
        }while ( size <= 0 );

        int[] arr = new int[size];
        System.out.println("Nhập các phần tử cho mảng:");
        for (i = 0; i < size ; i++){
            System.out.println("Nhập phần tử thứ " + (i +1) + ":");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng trước khi thêm: ");
        for (i = 0; i < size; i++){
            System.out.print(arr[i] + "\n");
        }

        System.out.println("Nhập số cần chèn: ");
        element = input.nextInt();
        System.out.println("Nhập vị trí số cần chèn: ");
        index = input.nextInt();

        if (index < 0 || index >arr.length){
            System.out.println("Không chèn được phần tử vào mảng!");
        }else {
            add(arr, index, element);
        }
    }
    public static void add (int[]arr, int index, int element){
        int[] arrNew = new int[arr.length + 1];
        for (int i = 0; i < arrNew.length; i++){
            if(i < index){
                arrNew[i] = arr[i];
            }
            if(i > index){
                arrNew[i] = arr[i - 1];
            }
            arrNew[index] = element;
        }
    }
}
