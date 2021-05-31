import java.util.Arrays;
public class Ex2 {
    public static void main(String[] args) {
        int arr[] = {3,1,2,9,5,4,7,6,8};
        Arrays.sort(arr);
        for(int k = 0; k < arr.length; k++)
            System.out.print(arr[k] + " ");
    }
}
