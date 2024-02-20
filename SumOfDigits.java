import java.util.Scanner;
public class SumOfDigits {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the ");
    int n = sc.nextInt();
    int sum = 0;
    int r;
    sc.close();
    while (n!=0) {
            r = n%10;
            sum = sum + r;
            n = n/10;
        }
        System.out.println("The Sum of Digits is :"+ sum);
    }
}

