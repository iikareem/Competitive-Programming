import java.util.Scanner;

public class PSPS{


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        char ch = input.next().charAt(0);
        short sh = input.nextShort();
        int x;
        for (int i = 1; i<=sh; i++){
            x= input.nextInt();
            for (int j =1; j <=x; j++){
                System.out.print(ch);
            }
            System.out.println("");

        }











        }
    }