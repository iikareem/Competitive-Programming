import java.util.Scanner;

public class PSPS {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = input.nextInt();
        }
       int[] farr = new int[m+1];
        for (int i =0; i<n; i++){
            farr[arr[i]]++;
        }
        for (int i =1; i<=m; i++){
            System.out.println(farr[i]);
        }





    }
}