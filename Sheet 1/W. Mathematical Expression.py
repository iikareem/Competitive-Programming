import java.util.*;

public class ppsolving {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        char ch = input.next().charAt(0);
        int b = input.nextInt();
        char ch1 = input.next().charAt(0);
        int c = input.nextInt();

        if (ch == '+'){
            if (a+b == c){
                System.out.println("Yes");
            }
            else {
                System.out.println(a+b);
            }
        }
        if (ch == '-'){
            if (a-b == c){
                System.out.println("Yes");
            }
            else {
                System.out.println(a-b);
            }
        }
        if (ch == '*'){
            if (a*b == c){
                System.out.println("Yes");
            }
            else {
                System.out.println(a*b);
            }
        }

        }




    }
 