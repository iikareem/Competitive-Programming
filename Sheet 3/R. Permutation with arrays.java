import java.util.Arrays;
import java.util.Scanner;

public class PSPS {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int[] arr1 = new int[s];
        int[] arr2 = new int[s];

        for (int i =0; i<s; i++){
            arr1[i] = input.nextInt();
        }
        for (int i =0; i<s; i++){
            arr2[i] = input.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int cont = 0;
        int i,j;
        for (i =0,j = 0; i<s || j<s; i++,j++ ){
            if (arr1[i] == arr2[j]){
                cont++;
            }
        }
        if (cont == s){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }



    }


}