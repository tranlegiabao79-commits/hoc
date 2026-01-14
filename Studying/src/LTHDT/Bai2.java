package LTHDT;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        float a = sc.nextFloat();
        System.out.println("Nhap b: ");
        float b = sc.nextFloat();
        System.out.println("Nhap c: ");
        float c = sc.nextFloat();
        double delta, can_delta;
        delta= Math.pow(b, 2) - 4*a*c;
        can_delta = Math.sqrt(delta);
        System.out.printf("Delta: %.1f\n", delta);
        System.out.printf("Can Delta: %.1f\n", can_delta);
        sc.close();
    }
}
