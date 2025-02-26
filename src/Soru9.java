import javax.xml.transform.Source;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Soru9 {
    public static void main(String[] args){
        //Aşağıdaki dizilerle ilgili metodları araştırın ve her biri için açıklama ve örnek kod yazın:
        //	•	Arrays.sort()
        //	•	Arrays.binarySearch()
        //	•	Arrays.copyOfRange()
        //	•	Arrays.equals()
        //	•	Arrays.fill()

        int[] sayilar ={10,40,80,60,50,30,20,90,70};

        /* Array.sort() => diziyi artan sırada sıralar. */
        Arrays.sort(sayilar);
        System.out.println("Sıralanmış dizi: "+Arrays.toString(sayilar));

        /* Arrays.binarySearch() => Dizide aranan elemanın indeksini bulur*/
        int index=Arrays.binarySearch(sayilar,40);
        System.out.println("40 sayısının indexi: "+index);

        /* Arrays.copyOfRange() => Belirli aralıktaki elemanları başka diziye kopyalama*/
        int[] yeniDizi=Arrays.copyOfRange(sayilar,1,4);
        System.out.println("Kopyalanan dizi: "+Arrays.toString(yeniDizi));

        /* Arrays.equals İki diziyi karşılaştırma*/
        System.out.println("İki dizi eşit mi? "+Arrays.equals(sayilar,yeniDizi));

        /*Diziyi belirli bir değerle doldurma*/
        Arrays.fill(sayilar,100);
        System.out.println("Yeni dizi: "+Arrays.toString(sayilar));


    }
}
