import java.util.Scanner;
import java.util.*;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        boolean t = false;
        long[] arr = new long[x];

        for (int i =0; i<x; i++){
            arr[i] = input.nextLong();
        }
        int y = input.nextInt();
        for (int z = 0; z < x; z++){
            if (y == arr[z]){
                System.out.println(z);
                t = true;
                break;
            }

        }
        if (t == false){
            System.out.println("-1");
        }












    }


}