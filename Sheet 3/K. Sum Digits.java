import java.util.*;
import java.util.Scanner;




public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        String s = input.next();
        int sum =0;

        for (int i =0; i<x; i++){
            sum += (s.charAt(i) - '0');
        }
        System.out.println(sum);


    }






}

 