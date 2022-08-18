import java.util.Scanner;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StringBuffer str = new StringBuffer();
        str.append(input.nextLine());

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                str.replace(i, i + 1,
                        Character.toUpperCase(c) + "");
            }
            else if (Character.isUpperCase(c)){
                str.replace(i, i + 1,
                        Character.toLowerCase(c) + "");
            }
            else {
                str.replace(i, i+1," ");
            }

        }
        System.out.println(str);




        }

        }






















 