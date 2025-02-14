import java.util.Arrays;

public class TopluTasimaPlanlayici {
    public static void main(String[] args) {

        String[] mahalleIsimleri = {"Karakas Mahallesi", "Pinar Mahallesi", "Istasyon Mahallesi"};

        double[][] mahalleler = {
                {700, 7, 200000, 6, 6}, // Karakaş Mahallesi
                {500, 5, 150000, 6, 8}, // Pınar Mahallesi
                {1000, 6, 250000, 4, 9}  // İstasyon Mahallesi
        };

        double[] agirliklar = softmax(mahalleler);

        int enIyiMahalle = enIyiGuzergah(agirliklar);

        System.out.println("Kırklareli için en uygun toplu taşıma güzergahı: " + mahalleIsimleri[enIyiMahalle]);
        System.out.println("Ağırlık Dağılımı: " + Arrays.toString(agirliklar));
    }


    public static double[] softmax(double[][] veriler) {
        double[] puanlar = new double[veriler.length];
        double toplamExp = 0;


        for (int i = 0; i < veriler.length; i++) {
            puanlar[i] = veriler[i][0] * 0.3 + // Nüfus Yoğunluğu
                    veriler[i][1] * 0.2 + // Ulaşım Altyapısı
                    (1.0 / veriler[i][2]) * 50000 + // Maliyet
                    veriler[i][3] * 0.15 + // Çevresel Etki
                    veriler[i][4] * 0.25; // Sosyal Fayda
            toplamExp += Math.exp(puanlar[i]);
        }


        double[] olasiliklar = new double[veriler.length];
        for (int i = 0; i < veriler.length; i++) {
            olasiliklar[i] = Math.exp(puanlar[i]) / toplamExp;
        }
        return olasiliklar;
    }


    public static int enIyiGuzergah(double[] agirliklar) {
        int indeks = 0;
        double maxAgirlik = agirliklar[0];
        for (int i = 1; i < agirliklar.length; i++) {
            if (agirliklar[i] > maxAgirlik) {
                maxAgirlik = agirliklar[i];
                indeks = i;
            }
        }
        return indeks;
    }
}
