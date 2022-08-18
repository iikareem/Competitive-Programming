import java.util.Scanner;

public class PSPS {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[n][m];
        int i ;
        int j ;

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        for (int k = 0; k<n; k++){
            for (int y =m-1; y>=0; y--){
                System.out.print(arr[k][y]+" ");
            }
            System.out.println();
        }






    }
}