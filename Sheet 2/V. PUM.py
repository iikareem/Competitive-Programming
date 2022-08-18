import java.util.Scanner;


public class PSPS {

    static int getSum(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int counter =0;
        int i =1;

        for (;;){
            if (n == counter)
                break;
            if (i % 4 ==0){
                System.out.println("PUM");
                counter++;
                i++;
                continue;
            }
            System.out.print(i +" ");
            i++;
        }








    }
}









 