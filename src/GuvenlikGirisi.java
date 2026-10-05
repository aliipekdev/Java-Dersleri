import java.util.Scanner;
public class GuvenlikGirisi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        String dogruSifre = "tubitak123";
        int kalanHak = 3;
        while (kalanHak > 0) {
            System.out.print("Sistem sifresini girin: ");
            String girilenSifre = giris.next();
            if (girilenSifre.equals(dogruSifre)) {
                System.out.println("GIRIS BASARILI! Ssteme hosgeldiniz.");
                break;
            } else {
                kalanHak--;
                System.out.println("HATALI SIFRE! Kalan hak: " + kalanHak);
            }
        }
        if (kalanHak == 0) {
            System.out.println("HAKKINIZ BİTTİ! Sistem kilitlendi.");
        }
        giris.close();
    }
}