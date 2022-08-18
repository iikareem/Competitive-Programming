import java.util.*;

public class ppsolving {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int num;
        int even=0;
        int odd=0;
        int pos=0;
        int neg=0;
        n = input.nextInt();
        for (int i = 1; i<=n; i++ ){
        num = input.nextInt();
        if (num % 2 == 0){
          even++;
        }
        else {
            odd++;
        }
        if (num > 0){
            pos++;
        }
        else if (num < 0){
            neg++;
        }


        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
        System.out.println("Positive: "+pos);
        System.out.println("Negative: "+neg);

        }




    }
 