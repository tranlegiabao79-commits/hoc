package BT;

import java.util.Scanner;

public class ChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhap so nguyen: ");
        a = sc.nextInt();
        if(a % 2 == 0){
            System.out.printf("So %d la so chan", a);
        }else System.out.printf("So %d la so le", a);
    }
}
