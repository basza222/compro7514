
package th.ac.nu.studen.u54347514.compro.ch05;
public class Subdemo4 {

  public static void main(String[] args) {
       
        printHello("Hello",5);
        System.out.println("Java");
        printHello("สวัสดี",2);
    }
public static void printHello(String value,int max) {
    int counter = 0;
    while (counter<max){
        System.out.println(value);
        counter++;
    }
    
}
}