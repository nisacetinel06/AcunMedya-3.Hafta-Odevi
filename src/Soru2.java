public class Soru2 {
    public static void main(String[] args){
        // Bir dizide tekrar eden elemanları bulan bir program yazın.
        // (Örnek giriş: [5, 3, 8, 3, 1, 5, 8] → Çıktı: Tekrar eden sayılar: 3, 5, 8)

        int[] sayilar={5,3,8,3,1,5,8};
        for (int i = 0; i <sayilar.length; i++) {
            for (int j = i+1 ; j < sayilar.length; j++) {
                if (sayilar[i]==sayilar[j]){
                    System.out.print(sayilar[i]+" ");
                    break;
                }
            }
        }
    }
}
