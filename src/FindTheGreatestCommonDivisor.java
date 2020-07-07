import java.util.Scanner;

public class FindTheGreatestCommonDivisor {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.printf(" Enter a : ");
        a = sc.nextInt();

        System.out.printf(" Enter b : ");
        b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.printf(" No greatest common factor ");
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.printf("Greatest common factor : " + a);

    }
}

