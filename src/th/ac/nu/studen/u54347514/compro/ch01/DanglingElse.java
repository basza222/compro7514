
package th.ac.nu.studen.u54347514.compro.ch01;

public class DanglingElse {

    public static void main(String[] args) {
       int x = 5;
         if (x < 5) {
            if (x > 5) {
                 System.out.println('b');
             } else {
                 System.out.println('a');
            }
        }
    }
 }