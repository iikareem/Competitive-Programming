import java.util.*;

public class ppsolving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        while (x >= 10){
            x /= 10;
        }
        if (x % 2 == 0){
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }


    }
}