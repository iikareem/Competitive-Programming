import java.util.Scanner;

public class PSPS {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int i,j;
        int[][] arr = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int x = input.nextInt();
        boolean found = false;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (arr[i][j] == x){
                    found = true;
                    break;
                }
            }
        }
        if (found == true){
            System.out.println("will not take number");
        }
        else {
            System.out.println("will take number");
        }



    }
}