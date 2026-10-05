import java.util.Scanner;
public class IfElsePratik {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("Kac adet paket taranacak? : ");
        int limit = giris.nextInt();
        for(int i = 1; i<= limit; i++) {
            if (i % 2 == 0) {
                System.out.println("Paket " + i + " -> TEMIZ");
            } else {
                    System.out.println("Paket " + i + " -> SUPHELİ");
                }
                }
                giris.close();
        }
    }