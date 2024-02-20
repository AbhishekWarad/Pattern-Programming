package pattern;

/**
 *   print * * * * * *
 */
import java.util.Scanner;
public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of starts to be printed : ");
        int n = sc.nextInt();
        int i;
        sc.close();
        for(i=1;i<=n;i++){
            System.out.print("* ");
        }
    }  
}