import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interest_rate = 1.0;

        Scanner sc = new Scanner(System.in);
        System.out.printf(" Enter investment amount : ");
        money = sc.nextDouble();

        System.out.printf(" Enter number of months : ");
        month = sc.nextInt();

        System.out.printf(" Enter annual interest rate in percentage : ");
        interest_rate = sc.nextDouble();

        double total_interest = 0;
        for (int i = 0; i < month; i++) {
            total_interest += money * (interest_rate/100) / 12 * month;
        }
        System.out.printf(" Total of interest : " + total_interest);

    }
}
