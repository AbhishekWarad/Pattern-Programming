import java.util.Scanner;
public class SumOfDigits {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the ");
    int n = sc.nextInt();
    int sum = 0;
    int r;
    sc.close();
    for ( ;n!=0;n=n/10){
        r = n%10;
        sum = sum + r;
    }
        System.out.println("The Sum of Digits is :"+ sum);
    }
}

