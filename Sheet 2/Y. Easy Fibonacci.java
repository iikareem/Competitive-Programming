import java.util.Scanner;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int fib;
         int num1 = 0, num2 = 1;

        for (int i = 1; i <= x; ++i)
        {

            int sumOfPrevTwo = num1 + num2;
            System.out.print(num1+" ");

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */

            num1 = num2;
            num2 = sumOfPrevTwo;
        }

    }






}


 