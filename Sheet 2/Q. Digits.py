import java.util.Scanner;

public class PSPS{


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        short sh = input.nextShort();
        for (int i=1; i <=sh; i++){
            num = input.nextInt();
            if (num == 0){
                System.out.print("0");
            }
            while (num > 0){
                System.out.print(num%10 +" ");
                num /= 10;
            }
            System.out.println("");


        }











        }
    }