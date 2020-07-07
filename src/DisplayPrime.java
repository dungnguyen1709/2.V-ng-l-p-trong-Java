import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a amount : ");
        int amount = sc.nextInt();
        int  number = 2;
        int count = 0;

        while ( count < amount) {
            boolean prime = true;
            for (int i=2;i<=Math.sqrt(number);i++){
                if(number % i == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                count++;
                System.out.println(number);
            }
            number++;
        }
    }
}
