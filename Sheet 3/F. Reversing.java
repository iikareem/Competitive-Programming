import java.util.Scanner;
import java.util.*;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] arr = new int[x+1];

        for (int i = 1; i <= x; i++) {
            arr[i] = input.nextInt();
        }
        for (int j = x; j>0; j-- ){
            System.out.print(arr[j]+" ");
        }





    }
}

 