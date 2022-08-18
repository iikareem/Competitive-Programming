import java.util.*;

public class ppsolving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int min =0;
        int mid =0;
        int max =0;
        if (a <= b && a <= c){
            min = a;
            if (b < c){
                max = c;
                mid = b;
            }
            else {
                max = b;
                mid = c;
            }

        }
        else if (b <= a && b <= c){
        min = b;
        if (a < c){
            max = c;
            mid = a;
        }
        else {
            max = a;
            mid = c;
        }
        }
        else if (c <= a && c <=b){
            min = c;
            if (a < b){
                max = b;
                mid = a;
            }
            else {
                max = a;
                mid = b;
            }
        }
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
        System.out.println("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);




    }
}