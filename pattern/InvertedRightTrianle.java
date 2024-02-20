package pattern;
import java.util.Scanner;
public class InvertedRightTrianle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=(n+1-i);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
}
