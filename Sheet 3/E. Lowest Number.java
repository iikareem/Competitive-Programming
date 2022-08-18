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
        int low = arr[1];
        int pos = 1;
        for (int i =1; i <= x; i++){
            if (arr[i] < low){
                low = arr[i];
                pos = i;
            }
        }
        System.out.println(low+" "+pos);





    }
}

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
        int low = arr[1];
        int pos = 1;
        for (int i =1; i <= x; i++){
            if (arr[i] < low){
                low = arr[i];
                pos = i;
            }
        }
        System.out.println(low+" "+pos);





    }
}

 