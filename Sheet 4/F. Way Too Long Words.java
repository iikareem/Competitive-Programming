import java.util.Scanner;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        for (int i =1; i<=x; i++){
            String str = input.next();
            if (str.length() <= 10 ){
                System.out.println(str);
            }
            else {
                char ch1 = str.charAt(0);
                char ch2 = str.charAt(str.length()-1);
                int m = str.length() - 2;
                System.out.print(ch1);
                System.out.print(m);
                System.out.print(ch2);
                System.out.println("");
            }

        }

        }






    }















 