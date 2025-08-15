
package baitap1;
import java.util.Scanner;
public class bai4 {
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Nhập số đầu tiên : ");
     int a = sc.nextInt();
     Scanner dc = new Scanner(System.in);
     System.out.println("Nhập số thứ hai : ");
     int b = dc.nextInt();
     int tong = (a + b)/2;
     System.out.print(tong);
     
}
}
