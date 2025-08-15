
package baitap1;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá trị boolean (true hoặc false): ");
        boolean value = sc.nextBoolean(); // nhập true/false

        if (value) {
            System.out.println("Bạn đã nhập: true");
        } else {
            System.out.println("Bạn đã nhập: false");
        }

        sc.close();
    }
}


