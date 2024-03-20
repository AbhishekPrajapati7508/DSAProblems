import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner class used for use input
        System.out.println("Enter number");
        int n=sc.nextInt();

        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter floating point number");
        float x = sc.nextFloat();

        System.out.println("Enter double number");
        double y=sc.nextDouble();
        
        System.out.println("Enter long number");
        long z=sc.nextLong();

        System.out.println();

        System.out.println(n);
        System.out.println( name);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    
}
