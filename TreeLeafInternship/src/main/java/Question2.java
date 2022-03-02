import java.util.Random;
import java.util.Scanner;

public class Question2 {
    Question2() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter nth value ");
        int n = sc.nextInt();
        System.out.println("enter the specific sum value ");
        int sum = sc.nextInt();
        findNDigitNums(n, sum);

    }
        public void findNDigitNumsUtil(int n, int sum, char out[], int index)
        {
            if (index > n || sum < 0)
                return;
            if (index == n){
                if(sum == 0){
                    out[index] = '\0' ;
                    System.out.print(out);
                    System.out.print(" ");
                }
                return;
            }
            for (int i = 0; i <= 9; i++){
                out[index] = (char)(i + '0');
                findNDigitNumsUtil(n, sum - i, out, index + 1);
            }
        }
        public void findNDigitNums(int n, int sum){
            char[] out = new char[n + 1];
            for (int i = 1; i <= 9; i++){
                out[0] = (char)(i + '0');
                findNDigitNumsUtil(n, sum - i, out, 1);
            }
        }
}

