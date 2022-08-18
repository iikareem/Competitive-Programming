import java.util.Scanner;

public class PSPS {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        while (t > 0) {
            t--;
            int counter = 0;
            int n = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                counter++;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] >= arr[j - 1]) {
                        counter++;
                    } else {
                        break;
                    }
                }
            }
                System.out.println(counter);




        }
    }
}