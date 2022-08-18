import java.util.Scanner;

public class PSPS{


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int x = input.nextInt();
        int y = input.nextInt();
        int counter =0;
        for (int i=x; i <= y; i++){
            boolean lucky = false;
            int n =i;
            while (n > 0){
                int digit = n%10;
                 n /= 10;
                 if (digit != 4 && digit != 7){
                  lucky = true;
                 }
            }
            if (lucky == false){
                System.out.print(i +" ");
                counter++;
            }
        }
        if (counter ==0){
            System.out.println("-1");
        }








        }
    }