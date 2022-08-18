import java.util.Scanner;
import java.util.*;
public class PSPS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int num = i;
        int rev = 0;

        while(i != 0) {
            int digit = i % 10;
            rev = rev * 10 + digit;
            i /= 10;
        }


        if (num == rev){
            System.out.println(rev);
            System.out.println("YES");
        }
        else {
            System.out.println(rev);
            System.out.println("NO");
        }
    }
    }
 