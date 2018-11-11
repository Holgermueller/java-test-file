import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the first number : ");
            double a;
            a = in.nextDouble();
            System.out.println("Enter the second number : ");
            double b;
            b = in.nextDouble();
            double sum;
            sum = a+b;
            System.out.println("The sum of the numbers is :" +sum);
        } finally {
        in.close();
        }
    }
}