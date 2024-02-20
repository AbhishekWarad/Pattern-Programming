/**
 * PassFail
 */
import java.util.Scanner;
class PassFail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        int m = sc.nextInt();
        sc.close();
        if (m>=35){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}