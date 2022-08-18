import java.util.*;

public class ppsolving {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        if (c >= a && c <= b){
            if (d >= b){
                System.out.println(c + " "+b);
            }
            else if (b >= d){
                System.out.println(c +" "+ d);
            }
        }
        else if (a >= c && a <=d){
            if (b >= d){
                System.out.println(a +" " + d);
            }
            else if (d >= b){
                System.out.println(a +" "+ b);
            }
        }
        else {
            System.out.println("-1");
        }


        }




    }
 