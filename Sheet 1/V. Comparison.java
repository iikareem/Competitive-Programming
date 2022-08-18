import java.util.*;
 
public class ppsolving {
 
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int a = input.nextInt();
        char ch = input.next().charAt(0);
        int b = input.nextInt();
 
        if (ch == '>'){
 
            if (a > b){
                System.out.println("Right");
            }
            else{
                System.out.println("Wrong");
            }
 
        }
 
        if (ch == '<') {
            if (a < b) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        }
 
        if (ch == '='){
            if (a == b){
                System.out.println("Right");
            }
            else {
                System.out.println("Wrong");
            }
        }
 
        }
 
 
 
 
    }