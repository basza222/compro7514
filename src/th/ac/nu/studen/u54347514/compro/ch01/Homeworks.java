
package th.ac.nu.studen.u54347514.compro.ch01;
import java.util.Scanner;
public class Homeworks {
public static void main(String[] args) {
  double x;
    double a;
     a = 3.14;
     
   System.out.println("เลือกการคำนวณ");
    System.out.println("1.พื้นที่ผิว 2. ปริมาตรทรงกลม");
    Scanner s = new Scanner(System.in);
       x = s.nextInt();
        if(x<=1){
       System.out.println("หาพื้นที่ผิว");
       x = s.nextDouble();
       System.out.println(4*a*(x*x));
       }
        else{
            if(x>=2)
       System.out.println("หาปริมาตรทรงกลม");
       x = s.nextDouble();
       System.out.println(((x*x*x)*a*4/3));
        }
        }
      }