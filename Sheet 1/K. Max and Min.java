import java.util.*;

public class ppsolving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, z,max,min;
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        if (x <= y && x <= z) {
            min = x;
        } else if (y <= x && y <= z) {
            min = y;
        } else {
            min = z;
        }

        if (x >= y && x >= z){
            max = x;
        }
        else if (y >= x && y >= z){
            max = y;
        }
        else {
            max = z;
        }
        System.out.println(min+" "+max);
    }
}