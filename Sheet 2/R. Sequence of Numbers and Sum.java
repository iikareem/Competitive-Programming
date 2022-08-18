import java.util.Scanner;

public class PSPS{


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n,m;
        
        while (true){
            n = input.nextInt();
            m = input.nextInt();
            int sum =0;
            if (n  <=0 || m <=0 ){
                break;
            }
            int min = Math.min(n,m);
            int max = Math.max(n,m);
            for (int i = min;  i<=max; i++){
                System.out.print(i+" ");
                sum = sum + i;

            }
            System.out.println("sum ="+sum);

        }













        }
    }