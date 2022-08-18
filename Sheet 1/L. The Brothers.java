import java.util.*;

public class ppsolving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fn1 , ln1 , fn2 , ln2;
        fn1 = input.next();
        ln1 = input.next();
        fn2 = input.next();
        ln2 = input.next();


        if (ln1.equals(ln2)){
            System.out.println("ARE Brothers");
        }
        else {
            System.out.println("NOT");
        }
    }
}