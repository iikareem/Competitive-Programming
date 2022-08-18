import java.util.Scanner;

public class PSPS {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int value =0;
        while (t > 0) {
            t--;
            int x = input.nextInt();
            int arr[] = new int[x + 1];
            for (int i = 1; i <= x; i++) {
                arr[i] = input.nextInt();
            }
            int mini = 2147483647;
            for (int i = 1; i < x; i++) {

                for (int j = i+1; j <= x; j++) {
                    mini = Math.min(mini,arr[i]+arr[j] + j - i);
                }
            }
            System.out.println(mini);
        }
    }
}