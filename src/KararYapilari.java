import  java.util.Scanner;
public class KararYapilari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Vize notunuzu girin: ");
        double vize1 = input.nextDouble();
        System.out.print("2. Vize notunuzu girin: ");
        double vize2 = input.nextDouble();
        System.out.print("Final notunuzu girin: ");
        double finalNotu = input.nextDouble();
        double ortalama = (vize1 * 0.30) +  (vize2 * 0.30) + (finalNotu * 0.40);
        System.out.println("Hesaplanan Ortalama: " + ortalama);
        if(finalNotu < 50) {
            System.out.println("Sonuç: Kaldı (Final notu 50'ninn altında!)");
        }else if(ortalama >= 85) {
            System.out.println("Harf Notu: AA - Üstün Başarı");
        }else if(ortalama >= 70) {
            System.out.println("Harf Notu:BB - Başarılı");
        }else if(ortalama>= 50) {
            System.out.println("Harf Notu:CC - Geçti");
        } else {
            System.out.println("Harf Notu:FF - Kaldı(Ortalama Yetersiz)");
        }
        input.close();
    }
}