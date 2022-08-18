import java.util.*;
 
public class ppsolving {
    static boolean isInteger(double N)
    {
 
        int X = (int)N;
        double temp2 = N - X;
 
        if (temp2 > 0)
        {
            return false;
        }
        return true;
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        Double d = input.nextDouble();
        if (isInteger(d)){
 
            System.out.println("int "+ (int)+d);
        }
        else {
            double doubleNumber = d;
            int intPart = (int) doubleNumber;
            System.out.print("float "+ (int)+d +" ");
            System.out.printf("%.3f",doubleNumber - intPart);
        }
 
 
 
    }
}