/**
 * Wtite a program to display 1st N even and odd numbers.
 */
import java.util.Scanner;
public class NevenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of N : ");
        int n = sc.nextInt();
        int i;
        sc.close();
        System.out.println("1st "+n+" even number are : ");
        for (i = 2 ; i <= 2*n ; i=i+2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("1st "+n+" odd numbers are : ");
        for (i = 1 ; i <= 2*n+1 ; i=i+2){ 
            System.out.print(i+" ");
        } 
    }
}
