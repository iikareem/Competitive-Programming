import java.util.*;

public class ppsolving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().charAt(0);

        if (ch >= 65 && ch <= 90){
            // capital ya kemo
            ch = (char)(ch+32);
            System.out.println(ch);
        }
        else if (ch >= 97 && ch <= 122){
            // small ya kemo
            ch = (char)(ch-32);
            System.out.println(ch);
        }

    }
}