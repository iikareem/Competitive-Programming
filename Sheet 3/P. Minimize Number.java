import java.util.Scanner;

public class PSPS {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int arr[] = new int[x];
        for (int i =0; i<x; i++){
            arr[i] = input.nextInt(); }
        int num =0,minn = 2147483647;
        for (int i =0; i<x; i++){
            num =0;
            while (arr[i] % 2 == 0){
                num++;
                arr[i] /=2;
            }
            minn = Math.min(num,minn);
        }
        System.out.println(minn);


    }
}