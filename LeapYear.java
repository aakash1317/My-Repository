import java.util.Scanner;
/**
 * LeapYear
 */
public class LeapYear {

    public static void main(String[] args) {
        
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the year ");
        year = sc.nextInt();

        if(((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0))){
            System.out.println("This year is a leap year");
        }else{
            System.out.println("This is not a leap Year");
        }
    }
}