package LTHDT;

import java.util.Scanner;

public class Dientich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu dai, chieu rong: ");
        float dai = sc.nextFloat();
        float rong = sc.nextFloat();
        float chuvi = (dai + rong ) * 2;
        float dientich = dai * rong;
        float min = Math.min(dai, rong);
        System.out.printf("Chu vi: %.1f",  chuvi);
        System.out.printf("\nDien tich: %.1f", dientich);
        System.out.printf("\nCanh nho nhat: %.1f", min);
        sc.close();
    }
}
