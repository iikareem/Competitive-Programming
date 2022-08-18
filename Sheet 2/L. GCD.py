import java.util.Scanner;
import java.util.*;
public class PSPS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int gcd =1;
       int x = input.nextInt();
       int y = input.nextInt();
       for (int i =1; i<=x && i <=y; i++){
           if (x%i == 0 && y%i == 0){
               gcd = i;
           }

           }
        System.out.println(gcd);


       }
    }

 