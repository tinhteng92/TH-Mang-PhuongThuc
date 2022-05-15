import java.util.Scanner;

public class DemKiTu {
    public static void main(String[] args) {
        //Đếm số lần xuất hiện của ký tự trong chuỗi
        Scanner input = new Scanner(System.in);

        String str = "Welcome to my world.";
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase);
        int count = 0;
//        char c = 'o';
        System.out.println("Enter the character: ");
        char c = input.nextLine().charAt(0);
        char c1 = Character.toLowerCase(c);
        System.out.println(c1);

        for (int i = 0; i < lowerCase.length(); i++) {
            if (lowerCase.charAt(i)==c1) {
                count++;
            }
        }
        System.out.println("Char " + c + " appears " + count + " times.");
    }

}
