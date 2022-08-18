import java.util.Scanner;




public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] arr = new int[x];



        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt(); }
        int min = arr[0];
        int max = arr[1];
        int posM = 0;
        int posX = 1;
        int t=0;

        for (int i = 0; i<x; i++){
            if (min > arr[i]){
                min = arr[i];
                posM = i;
            }
            if (max < arr[i]){
                max = arr[i];
                posX = i;
            }


        }
         t = arr[posM];
        arr[posM] = arr[posX];
        arr[posX] = t;

        for (int i = 0; i < x; i++) {
            System.out.print(arr[i]+" "); }




    }






}

 