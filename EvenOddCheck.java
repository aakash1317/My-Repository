import java.util.Scanner;
/**
 * EvenOddCheck
 */
public class EvenOddCheck {

    public static void main(String[] args) {
        
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        a = sc.nextInt();

        if (a % 2 == 0) {

            System.out.println("The given number is even number");
            
        } else {
            System.out.println("The given number is odd number");
            
        }
    }
}