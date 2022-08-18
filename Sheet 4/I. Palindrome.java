import java.util.Scanner;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String rev ="";
        for (int i = str.length() -1 ; i >= 0; i--){
            rev += str.charAt(i); }
        if (str.equals(rev)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    } }






















 