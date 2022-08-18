import java.util.Scanner;

public class PSPS {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int n, m;
        int x = input.nextInt();

        for (int i = 1; i <= x; i++) {
            n = input.nextInt();
            m = input.nextInt();


            int min = Math.min(n, m);
            int max = Math.max(n, m);
            int sum = 0;
            for (int j = min+1; j < max; j++) {
                if (j % 2 != 0) {
                    sum = j + sum;

                }

            }
            System.out.println(sum);

        }
    }


}










 