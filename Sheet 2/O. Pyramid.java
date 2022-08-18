import java.util.Scanner;

public class PSPS{


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        short sh = input.nextShort();
        char ch = '*';
        for (int i =1; i<=sh; i++){
            for (int j =1; j<=i; j++){
                System.out.print(ch);
            }
            System.out.println("");
        }











        }
    }