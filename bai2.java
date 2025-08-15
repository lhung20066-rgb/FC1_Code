
package baitap1;
import java.util.Scanner;
public class bai2 {
    public static void main( String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhập tên của bạn :");
        String name = sc.nextLine();
        Scanner gs = new Scanner (System.in);
        System.out.print("Nhập tuổi của bạn :");
        String tuoi = gs.nextLine();
             
        
        System.out.println("Xin chào " + name + " Năm nay tôi " + tuoi + " Tuổi");
    
}
}
