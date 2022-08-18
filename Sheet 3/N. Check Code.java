import java.util.Scanner;
 
 
public class PSPS {
 
    public static void main(String[] args) {
 
 
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        String s = input.next();
        if (s.charAt(a) != '-'){
            System.out.println("No");
        return;}
        boolean ch = false;
        for (int i =0; i<s.length(); i++){
 
            if ((s.charAt(i) < '0' || s.charAt(i) > '9') && i != a) {
                ch = true;
                break;
            }
        }
        if (ch == false){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
            return;
        }
 
 
 
 
 
 
    }}
 