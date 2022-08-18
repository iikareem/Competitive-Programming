import java.util.Scanner;
public class PSPS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean check = false;
        int x = input.nextInt();
        for (int i =2; i < x; i++){
            if (x % i == 0){
                check = true;
            }
        }
            if (check == false){
                System.out.println("YES");
                }
            if (check == true){
                System.out.println("NO");

            }

        }
    }
 