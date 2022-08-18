import java.util.Scanner;
import java.util.*;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        long[] arr = new long[x];

        for (int i = 0; i < x; i++) {
            arr[i] = input.nextLong();
        }
        for (int z = 0; z < arr.length;z++) {
            if (arr[z] <= 10){
                System.out.println("A["+z+"]"+" ="+" "+ arr[z]);
            }
        }



    }
}

 