import java.util.Scanner;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        String sub1 = "010";
        String sub2 = "101";

        for (int i = 1; i <= x; i++) {
            boolean c = true;
            String str = input.next();

            if (str.contains(sub1) || str.contains(sub2)) {
                c = false;
            }
            if (c == false) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }


        }

    } }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 