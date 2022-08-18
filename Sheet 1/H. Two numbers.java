import java.util.*;

public class ppsolving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a,b,result;
        a = input.nextDouble();
        b = input.nextDouble();
        result = a/b;
        System.out.println("floor " +(int)a+" / "+(int)b+" = "+ (int)Math.floor(result));
        System.out.println("ceil " +(int)a+" / "+(int)b+" = "+ (int)Math.ceil(result));
        System.out.println("round " +(int)a+" / "+(int)b+" = "+ (int)Math.round(result));




    }
}