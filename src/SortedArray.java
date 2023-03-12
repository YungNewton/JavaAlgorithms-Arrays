import java.util.Scanner;
public class SortedArray {
    // write code here
    public static int[] getIntegers(int range){
        Scanner scanner = new Scanner(System.in);
        int[] value = new int[range];
        for (int i = 0; i<range; i++){
            System.out.println("enter array value "+(i+1));
            value[i] = scanner.nextInt();
        }
        return value;
    }
    public static void printArray(int[] input){
        for (int i = 0; i< input.length; i++){
            System.out.println("Element "+i+" contents "+input[i]);
        }
    }
    public static int[] sortIntegers(int[] range){
        int y = 0;
        int temp;
        while (y<range.length){
            for (int i = 0; i<range.length-1; i++){
                if (range[i]<range[i+1]){
                    temp=range[i];
                    range[i]=range[i+1];
                    range[i+1]=temp;
                }
            }
            y++;
        }
        for (int i = 0; i< range.length; i++){
            System.out.println(range[i]);
        }
        return range;
    }
}
