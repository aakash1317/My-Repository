    import java.util.Scanner;
    public class GrossSalary {

        public static void main(String[] args) {
            
        float bs, da, ra, total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary ");
        bs = sc.nextFloat();

        da = (bs * 40) / 100;
        ra = (bs * 20) / 100;
        total = bs + da + ra;

        System.out.println("Your Total salary is " +total);
        }
    }