
package th.ac.nu.studen.u54347514.compro.ch01;
import java.util.Scanner;
public class Switch2 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
         char grade = in.next().charAt(0);
        switch (grade) {
             case 'A':
                 System.out.println("Excellent");
                 break;
             case 'B':
                 System.out.println("Good");
                 break;
             case 'C':
                 System.out.println("So so");
                 break;
             case 'D':
                 System.out.println("Fails");
                 break;
             case 'F':
                 System.out.println("Get lost");
                 break;
             default:
                 System.out.println("Invalid");
                break;
        }
     }
}
