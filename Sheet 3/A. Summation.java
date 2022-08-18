import java.util.Scanner;
import java.util.*;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        long[] arr = new long[x];
        long sum =0;


        for (int i = 0; i<x; i++ ){
            arr[i] = input.nextLong();
            sum += arr[i];
        }

        System.out.println(Math.abs(sum));







    }


}