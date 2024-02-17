/**
 * Write a program to find sum and product of 1st 'n' natural numbers.
 */
import java.util.Scanner;
public class SumProd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of N :");
        int n = sc.nextInt();
        int i;
        int sum = 0;
        int prod = 1;
        sc.close();
        for (i=1;i<=n;i++){
            sum=sum+1;
        }
        System.out.println("The sum of 1st "+n+" natural numbers = "+sum);
        for (i=1;i<=n;i++){
            prod=prod*i;
        }
        System.out.println("The product of "+n+" natural numbers = "+prod);
    }
}
