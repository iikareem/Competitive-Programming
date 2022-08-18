import java.util.Scanner;
import java.util.*;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] arr = new int[x];


        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < x; i++){
            int min = i;
            for (int j = i+1; j < x; j++)
                if (arr[j] < arr[min])
                    min = j;


            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i=0; i<x; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }






    }


 