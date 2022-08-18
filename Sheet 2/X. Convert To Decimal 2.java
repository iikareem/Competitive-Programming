import java.util.Scanner;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int j =1; j<=x; j++) {
            int i =1;
            int num = input.nextInt();
            int count = 0;
            while (num != 0) {
                int rem = num % 2;
                if (rem == 1){
                    count++;
                }
                num = num / 2;
            }

            int fina =0;
            int p =0;
            for (int f =0; f <count; f++){
                fina += Math.pow(2,p);
                p++;
            }
            System.out.println(fina);
        }

    }






}


 