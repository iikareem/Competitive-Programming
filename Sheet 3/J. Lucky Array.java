import java.util.Arrays;
import java.util.Scanner;


public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] arr = new int[x];
        int count =0;
        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt(); }
             Arrays.sort(arr);
        int min = arr[0];

        for (int j =0; j<x; j++){
        if (arr[j] == min){
            count++;
        }
        }
        if (count % 2 == 0){
            System.out.println("Unlucky");
        }
        else {
            System.out.println("Lucky");
        }


    }






}

 