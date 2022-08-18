import java.util.Scanner;

public class PSPS {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch = '*';
        int k=1;
        int sp =1;
        int x = input.nextInt();
        int space = x-1;
        for (int i =1; i<=x; i++){

            for (int m = space; m>0; m--){
                System.out.print(" ");
            }
            space--;
            for (int j =1; j<=k; j++ ){
            System.out.print(ch);
        }
         k +=2;
            System.out.println(""); }
        k -=2;
        for (int i =1; i<= x; i++){
            for (int t = 1; t<sp; t++){
                System.out.print(" ");
            }
            sp++;

            for (int j =k; j>0; j--){
                System.out.print(ch);
            }
            k -=2;
            System.out.println("");
        }

    }


}