import java.util.Scanner;
public class Voiting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = sc.nextInt();   
             
        if(age>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
        sc.close();
    }
}

