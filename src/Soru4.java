import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args){

        //Kullanıcıdan 10 adet kelime alarak bir ArrayList<String> içine ekleyin.
        //Girilen kelimeleri alfabetik sıraya göre sıralayan bir Java programı yazın.

        Scanner scanner=new Scanner(System.in);

        ArrayList<String> kelimeler =new ArrayList<>();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i+". kelimeyi girin: ");
            kelimeler.add(scanner.nextLine());
        }

        Collections.sort(kelimeler);

        System.out.println("Albetik sıralanmış hali: ");
        for (String kelime:kelimeler){
            System.out.print(kelime+" ");
        }
    }
}
