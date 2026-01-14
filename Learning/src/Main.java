import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thoigian = sc.nextInt();
        int gio = thoigian/3600;
        int phut = (thoigian%3600)/60;
        int giay = ((thoigian%3600)%60);
        System.out.println(gio + " gio " + phut + " phut " + giay + " giay ");
        sc.close();
    }
}