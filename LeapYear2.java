import java.util.Scanner;
public class LeapYear2 {
    public static void main(String[] argh){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year ");

        int year = sc.nextInt();

        if(((year % 4 == 0) && (year % 100 != 0 ) || (year % 400 == 0))){
            System.out.println("This year is Leap Year");
        }else{
            System.out.println("This year is not a Leap Year");

        }

    
    }
    
}
