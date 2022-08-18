import java.util.*;

public class ppsolving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int x,y;
       x = input.nextInt();
       y= input.nextInt();
       if (x >= y && x%y ==0){
           System.out.println("Multiples");
       }
       else if (y >= x && y%x == 0 ){
           System.out.println("Multiples");
       }
       else {
           System.out.println("No Multiples");
       }





    }
}