import java.util.Arrays;
import java.util.Scanner;

public class PSPS {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int x = input.nextInt();
        for (int i =0; i<size; i++){
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        for (int i =1; i<=x; i++){
            boolean tf = false;
            int num = input.nextInt();
            int low = 0;
            int high = arr.length - 1;
            while (low <= high){
                int mid = (low + high) / 2;
                if (arr[mid] == num){
                tf = true;
                break; }
                else if (arr[mid] < num){
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
            if (tf == true){
                System.out.println("found");
            }
            else {
                System.out.println("not found");
            }
        }







    }
}