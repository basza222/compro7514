
package th.ac.nu.studen.u54347514.compro.ch05;
public class Subdemo3 {

    public static void main(String[] args) {
       
        printHello("Hello");
        System.out.println("Java");
        printHello("สวัสดี");
    }
public static void printHello(String value) {
    int counter = 0;
    while (counter<5){
        System.out.println(value);
        counter++;
    }
    
}
}