import java.util.Scanner;
public class Yourself{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name - ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age - ");
        int age = sc.nextInt();

        System.out.print("Enter your Percentage - ");
        Float percentage = sc.nextFloat();

        if((age >=25) && (percentage >= 70) && (age <=32)){
            System.out.print("You Apply for this job");
        }else if((age >= 25) && (percentage >=60) && (age <=32)){
            System.out.print(" Cut off is 70 percentage You can apply for Lower position");
        }else{
            System.out.print("Better Luck next time");
        }
    }
}