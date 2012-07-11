/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.studen.u54347514.compro.ch01;

/**
 *
 * @author Acer
 */
public class Associativity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int x, y, z;
 x = y = z = 1;
 System.out.println("x = " + x + ", y = " + y + ", z = " + z);
 System.out.println(32 % 7 % 3); // 1
 System.out.println((32 % 7) % 3); // 1
 System.out.println(32 % (7 % 3)); // 0
    }
}
