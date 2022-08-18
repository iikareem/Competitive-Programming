import java.util.Scanner;
import java.util.*;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] arr = new int[x];
        int flag =0;

        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }
        for (int j = 0;  j<= x/2 && x !=0; j++){
            if (arr[j] != arr[x - j - 1]){
                flag =1;
                break;
            }
        }
        if (flag == 0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }





    }
}

 