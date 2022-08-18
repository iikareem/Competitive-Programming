import java.util.Scanner;
import java.util.*;
public class PSPS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        short n = input.nextShort();


       for (int i = 2; i <=n; i++){
           boolean ch = false;
           for (int j =2; j<i; j++ ) {
               if (i % j == 0) {
                   ch = true;
                   break;
               }
           }
               if (ch == false){
                   System.out.print(i+ " ");
               }
           }

       }
    }

 