import java.util.Scanner;

public class DemSvThiDo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng sinh viên: ");
            size = input.nextInt();
            if (size > 30){
                System.out.println("Số lượng sinh viên không nên quá 30");
            }
        }while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Nhập điểm của sinh viên thứ " + (i + 1)  + ":");
            array[i] = input.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("Danh sách điểm của sinh viên: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
            if(array[j] >= 5 && array[j] <= 10){
                count++;
            }
        }
        System.out.println("Số các sinh viên thi đỗ là: " + count);

    }
}
