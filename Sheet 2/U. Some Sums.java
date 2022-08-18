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
        int a = input.nextInt();
        int b = input.nextInt();
        int t_sum =0;

        for (int i =1; i<=n; i++){

            if (getSum(i) >= a && getSum(i) <= b){
                t_sum += i;
            }

        }
        System.out.println(t_sum);



    }
}









 