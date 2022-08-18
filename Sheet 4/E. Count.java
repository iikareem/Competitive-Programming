import java.util.Scanner;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        int sum =0;
        int l = str.length();
        for (int i =0; i<l; i++){
         sum = sum + str.charAt(i) - '0';
        }
        System.out.println(sum);
        }






    }















 