import java.util.Scanner;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StringBuffer str = new StringBuffer();
        str.append(input.nextLine());

        for (int i =0; i<str.length(); i++){
            if (str.charAt(i) == '\\' ){
                str.delete(i, str.length());

            }
        }
        System.out.println(str);



        }

    }









 