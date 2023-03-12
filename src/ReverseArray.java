import java.util.Arrays;
public class ReverseArray {
    private static void reverse(int[] count) {
        int d = 0;
        int[] val = new int[count.length];
        for (int i = count.length - 1; i >= 0; i--) {
            val[d]=count[i];
            d++;
        }
        System.out.println("Array = "+Arrays.toString(count));
        System.out.println("Reversed array = "+Arrays.toString(val));
    }
}