package LTHDT;

import java.util.Scanner;

public class delta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a, b, c: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Vo nghiem");
        } else if (delta == 0) {
            System.out.println("Nghiem kep");
        } else System.out.println("2 nghiem");
        sc.close();
    }
}
