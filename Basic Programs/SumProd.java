/**
 * Write a program to find sum and product of 1st 'n' natural numbers.
 */
import java.util.Scanner;
public class SumProd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , n , sum = 0 , prod = 1;
        System.out.println("Enter the Value of N :");
        n = sc.nextInt();
        sc.close();
        for (i=1;i<=n;i++){
            sum=sum+i;
            prod=prod*i;
        }
        System.out.println("The sum of 1st "+n+" natural numbers = "+sum);
        System.out.println("The product of "+n+" natural numbers = "+prod);
    }
}
