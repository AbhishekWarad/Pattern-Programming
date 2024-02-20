package pattern;

import java.util.Scanner;
public class VerticalStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of vertical stars to be printed :");
        int n = sc.nextInt();
        sc.close();
        int i;
        for(i=1;i<=n;i++){
            System.out.println("* ");
        }
    }
}
