
package baitap1;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhập số đầu tiên :");
        int a = sc.nextInt();
        Scanner rx = new Scanner (System.in);
        System.out.println("Nhập số thứ hai :");
        int b = rx.nextInt();
        int tong = a + b;
        System.out.print(tong);
    }
}
