import java.util.Scanner;

public class PSPS {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int i,j,a,b,k,f;
        int sum1 =0;
        int sum2 =0;


        int[][] arr = new int[d][d];
        for (i = 0; i < d; i++) {
            for (j = 0; j < d; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        for (a=0,b=0; a<d && b<d; a++,b++){
            sum1 += arr[a][b];
        }
        for (k=0,f=d-1; k<d && f>=0; k++,f--){
            sum2 += arr[k][f];
        }
        System.out.println(Math.abs(sum1-sum2));







    }
}