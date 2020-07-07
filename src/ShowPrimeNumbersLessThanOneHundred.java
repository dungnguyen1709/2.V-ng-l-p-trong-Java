import java.util.Scanner;

public class ShowPrimeNumbersLessThanOneHundred {
    public static void main(String[] args) {
        int number = 100;
        int j = 2;
        while (j < number) {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i == 0){
                    prime = false;
                    break;
                }
            }
            if (prime) {

                System.out.println(j);
            }
            j++;
        }
    }
}
