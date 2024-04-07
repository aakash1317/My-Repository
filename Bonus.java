//A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {
        
        int Salary, years, bonus, gloss;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your Salary - ");
        Salary = sc.nextInt();

        System.out.print("Years of service - ");
        years = sc.nextInt();

        if (years >= 5) {
            bonus = (Salary * 5) / 100;
            gloss = Salary + bonus;

            System.out.print("Your salary with bonus will be - "+gloss);
            
        } else {
            System.out.print("Your salary without bonus will be - "+Salary);
            
        }
    }
}