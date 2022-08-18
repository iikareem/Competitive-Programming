import java.util.Scanner;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();
        str1.append(input.nextLine());
        str2.append(input.nextLine());

        System.out.println(str1.length()+" "+str2.length());
        System.out.print(str1);
        System.out.println(str2);
        char ch = str1.charAt(0);
        str1.setCharAt(0,str2.charAt(0));
        System.out.print(str1+" ");
        str2.setCharAt(0,ch);
        System.out.print(str2);





    }




        }










 