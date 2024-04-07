import java.util.Scanner;
public class Grading{
    public static void main(String[] argh){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Percentage ");
        Float marks = sc.nextFloat();

        if(marks < 35){
            System.out.println("Fail");

        }else if(marks >= 35 && marks < 50 ){
            System.out.println("D grade");

        }else if(marks >= 50 && marks < 60 ){
            System.out.println("C grade");

        }else if(marks >= 60 && marks < 70){
            System.out.println("B grade");

        }else if(marks >= 70 && marks < 80){
            System.out.println("A grade");

        }else if (marks >= 81 && marks < 100){
            System.out.println("A+ grade");

        }else{
            System.out.println("Invalid");
        }
            
        }
    }
