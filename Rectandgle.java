//Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.Scanner;
public class Rectandgle {
    public static void main(String[] args) {
        
        float length, width;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length - ");
        length = sc.nextFloat();

        System.out.print("Enter the width - ");
        width = sc.nextFloat();

        if (length == width) {
           System.out.println("This is square.");
            
        } else {
            System.out.println("This is rectangle.");
            
        }
    }
    
}
