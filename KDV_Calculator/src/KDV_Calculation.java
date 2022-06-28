import java.util.Scanner;

public class KDV_Calculation {
    public static void main(String[] args) {

        double KDVsiz_fiyat;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyatı giriniz: ");
        KDVsiz_fiyat = input.nextDouble();

        boolean condition = KDVsiz_fiyat < 1000;
        double KDV_oran = condition ? 0.18 : 0.08;

        double KDV_tutar = KDVsiz_fiyat * KDV_oran;
        double KDVli_fiyat = KDV_tutar + KDVsiz_fiyat;

        System.out.println("KDVli fiyat: " + KDVli_fiyat);
        System.out.println("KDV tutarı: " + KDV_tutar);
        System.out.println("KDV oranı: " + KDV_oran);
    }
}
