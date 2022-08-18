import java.util.Scanner;




public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        long[] arr = new long[51];
        arr[1] = 0;
        arr[2] = 1;

        for (int i =3; i<51; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[x]);








    }






}

 