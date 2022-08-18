import java.util.*;

public class ppsolving {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int n;
        int max =0;
        int num;
        n = input.nextInt();
        for (int i=1; i<=n; i++){
            num = input.nextInt();
           if (num>max){
               max = num;
           }
        }
        System.out.println(max);


        }




    }
 