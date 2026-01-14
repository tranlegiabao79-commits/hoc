import java.util.Scanner;

public class Chuoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hh = new int[5];
        for(int x : hh){
            hh[x] = sc.nextInt();
            System.out.println(x);
        }
        int[] a = {4, 24 ,6 ,2, 7, 1};
        for(int x : a){
            System.out.println(x);
        }
    }
}
