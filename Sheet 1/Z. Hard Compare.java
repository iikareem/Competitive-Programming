import java.util.*;

public class ppsolving {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double a = input.nextDouble();
        Double b = input.nextDouble();
        Double c = input.nextDouble();
        Double d = input.nextDouble();


        if (b*Math.log10(a) > d*Math.log10(c)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        }




    }
 