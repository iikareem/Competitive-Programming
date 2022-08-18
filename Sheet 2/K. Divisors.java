import java.util.Scanner;
import java.util.*;
public class PSPS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        short n = input.nextShort();


       for (int i = 1; i <=n; i++){

           if (n % i == 0){
               System.out.println(i);
           }

           }

       }
    }

 