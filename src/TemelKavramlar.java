public class TemelKavramlar {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        System.out.println(a / b);
        int toplamInches = 76;
        int feet = toplamInches / 12;
        int inches = toplamInches % 12;
        System.out.println(toplamInches + " inç = " + feet + " feet ve " + inches + " inç");
        double kesirliSayi = 9.99;
        int tamKisim = (int) kesirliSayi;
        System.out.println("Orijinal sayı: " + kesirliSayi + " ->Tam sayıya çevrilmiş hali: " + tamKisim);
    }
}