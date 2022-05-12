public class FindMin {
    public static void main(String[] args) {
        int []arr = {5, 8, 9, 13, 11};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public static int minValue(int[] array){
        int index = 0;
        for (int i = 1; i < array.length; i++){
            if(array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}
