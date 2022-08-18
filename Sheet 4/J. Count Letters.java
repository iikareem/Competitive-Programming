import java.util.Scanner;

public class PSPS {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int[] arr = new int[27];

        for (int i =0; i< str.length(); i++){
            arr[ (int)str.charAt(i) - 97 ]++;
        }
        for ( int i =0; i< arr.length; i++ ){
            if (arr[i] > 0){
                System.out.println((char)(i+97)+" "+":"+" "+arr[i]);
            }
        }



    }
}






















 