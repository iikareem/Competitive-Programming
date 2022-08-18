import java.util.*;

public class ppsolving {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        a = a%100;
        b = b%100;
        c = c%100;
        d = d%100;

        long mul = a * b * c * d;
        int x;
        x= (int) mul%100;
        if (x < 10){
            System.out.println("0"+ x);
        }


        else {
            System.out.println(x);
        }

        }




    }
 