import java.util.Scanner;
public class javafunction {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int first_num  = sc.nextInt();
        int second_num = sc.nextInt();
        System.out.println("sum of two number :"+ sum(first_num,second_num));

    }
    public static int sum(int a,int b){
        return a+b;
    }
}
