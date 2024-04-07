import java.util.Scanner;
/**
 * AdditionOfTwoNumers
 */
public class AdditionOfTwoNumers {

    public static void main(String[] args) {
        int a,b,sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        a = sc.nextInt();

        System.out.print("Enter second number = ");
        b = sc.nextInt();
        
        sum = a + b;
        System.out.print("Sum of to numbers = " + sum);

    }
}