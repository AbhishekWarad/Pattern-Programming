/**
 * Write a program to print N Natural Numbers
 */
import java.util.Scanner;
public class Nnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        int i;
        sc.close();
        System.out.println("The 1st "+n+" natural numbers are: ");
        for(i=1 ;i<=n; i++){
            System.out.print(i+" ");
        }
    }
}
