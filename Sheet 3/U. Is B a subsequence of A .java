import java.util.Scanner;

public class PSPS {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int[] A = new int[n];
        int[] B = new int[m];
        int k =0;


        for (int i =0; i<n; i++){
            A[i] = input.nextInt(); }

        for (int i =0; i<m; i++){
            B[i] = input.nextInt(); }


        for (int i =0; i<n; i++){
            if (k <m){
            if (A[i] == B[k]){

                    k++;
            } } }


        if (k == m){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }







    }
}