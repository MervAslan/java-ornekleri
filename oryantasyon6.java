import java.util.Scanner;
public class oryantasyon6 {
    //girilen dört basamaklı sayının basamak değerlerini bulma
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("4 basamaklı bir sayı giriniz");
        int sayi = read.nextInt();

        int birler_basamagi= sayi%10;
        int onlar_basamagi= (sayi%100) /10;
        int yüzler_basamagi= (sayi%1000)/100 ;
        int binler_basamagi= sayi/1000;

        System.out.println("birler basamağı= " + birler_basamagi);
        System.out.println("onlar basamağı= " + onlar_basamagi);
        System.out.println("yüzler basamağı= " + yüzler_basamagi);
        System.out.println("binler basamağı= " + binler_basamagi);


    }
}
