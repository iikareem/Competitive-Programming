import java.util.Scanner;

public class PSPS {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t > 0) {
            t--;
            int x = input.nextInt();
            int arr[] = new int[x];
            for (int i=0; i<x; i++){
                arr[i] = input.nextInt(); }
            for (int i=0; i<x; i++){
                System.out.print(arr[i]+" "); }

            for (int i =0; i<x; i++){
                int max = arr[i];
                for (int j = i+1; j<x; j++){
                    max = Math.max(max,arr[j]);
                    System.out.print(max+" ");
                }
            }
            System.out.println("");

        }
    }
}