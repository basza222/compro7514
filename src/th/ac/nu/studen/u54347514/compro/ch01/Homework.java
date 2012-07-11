
package th.ac.nu.studen.u54347514.compro.ch01;
import java.util.Scanner;
public class Homework {

    public static void main(String[] args) {
    double x;
    double a;
     a = 3.14;
    System.out.println("เลือกการคำนวณ");
    System.out.println("1.พื้นที่ 2. เส้นรอบวง");
    Scanner s = new Scanner(System.in);
       x = s.nextInt();
        if(x<=1){
       System.out.println("หาพื้นที่");
       x = s.nextDouble();
       System.out.println(a*(x*x));
       }
        else{
            if(x>=2)
       System.out.println("เส้นรอบวง");
       x = s.nextDouble();
       System.out.println(2*(a*x));
        }
        }
      }
    

