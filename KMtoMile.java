import java.util.Scanner;
/**
 * KMtoMIler
 */
public class KMtoMile {

    public static void main(String[] args) {
        
        float km, mile;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Km = ");
        km = sc.nextInt();

        mile = km * 0.621371f;

        System.out.println("KM into mile ="+mile);

    }
}