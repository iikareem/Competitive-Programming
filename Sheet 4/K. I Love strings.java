import java.io.IOException;
import java.util.Scanner;


public class PSPS {


    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            String value1 = input.next();
            String value2 = input.next();
            for (int j = 0, k = 0; j < value1.length() || k < value2.length(); j++, k++) {
                if (j < value1.length()) {
                    System.out.print(value1.charAt(j));
                }
                if (k < value2.length()) {
                    System.out.print(value2.charAt(k));
                }
            }
            System.out.println("");
        }
    }

        }

 