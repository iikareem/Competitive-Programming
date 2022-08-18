import java.util.Scanner;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();
        str1.append(input.nextLine());
        str2.append(input.nextLine());

        if (str1.compareTo(str2) < 0){
            System.out.println(str1);

        }
        else {
            System.out.println(str2);
        }



    }




        }










 