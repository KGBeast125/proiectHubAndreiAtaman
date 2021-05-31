import java.util.Arrays;
class Ex1 {
    public static void main(String[] args) {
        int[] arr = {90, 80, 70, 60, 50, 40, 30, 20, 10};
        for(int x = arr.length - 1; x >= 0; x--)
            System.out.print(arr[x] + " ");
    }
}