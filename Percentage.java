import java.util.Scanner;
public class Percentage{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Maths - ");
        float Maths = sc.nextFloat();

        System.out.print("Science - ");
        float Science = sc.nextFloat();

        System.out.print("Histry - ");
        float Histry = sc.nextFloat();

        System.out.print("Geography - ");
        float Geography = sc.nextFloat();

        System.out.print("English - ");
        float English = sc.nextFloat();

        Float sum, Percent;

        sum = Maths + Science + Histry + Geography + English;
        System.out.println(" Your total marks out of 500 is " + sum);

        Percent = (sum / 500) * 100;
        System.out.println("Your Total Percentage is = " + Percent);



    }
}