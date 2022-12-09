import java.util.Scanner;
public class oryantasyon2 {
    //kütle boy indeksi
    public static void main(String [] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("boyunuzu cm cinsinden giriniz");

        int boy = read.nextInt();

        System.out.println("kilonuzu kg cinsinden giriniz");

        int kilo = read.nextInt();

        if((boy/kilo) <3) {
            System.out.println("şişmansınız");

        }else if((boy/kilo) <3.5){
            System.out.println("normalsiniz");
        }else {
            System.out.println("zayıfsınız");
        }
    }

      
        
}
