import java.util.Scanner;
public class MinimumElement {
    // write code here
    private static int readInteger(){
        Scanner scanner= new Scanner(System.in);
        int count = scanner.nextInt();

        scanner.close();
        return count;
    }
    private static int[] readElements(int count){
        Scanner scanner = new Scanner(System.in);
        int[] value = new int[count];
        for (int i = 0; i<count; i++){
            System.out.println("enter value "+(i+1));
            value[i] = scanner.nextInt();
        }
        scanner.close();
        return value;
    }
    private static int findMin(int [] value){
        int min;
        min = value[0];
        for (int i = 0; i< value.length; i++){
            if(value[i]<min){
                min = value[i];
            }
        }
        return min;
    }
}
