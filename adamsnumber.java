import java.util.*;
class adamsnumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int square=n*n;
        int reverseSquare=reverseNumber(square);
        int squareReverse = reverseNumber(n)*reverseNumber(n);
        if(reverseSquare==squareReverse){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }
    }
    public static int reverseNumber(int num){
        int reverse =0;
        int temp=num;
        while(temp!=0){
            int rem=temp%10;
            reverse=reverse*10+rem;
            temp/=10; 
        }
        return reverse;
    }
}