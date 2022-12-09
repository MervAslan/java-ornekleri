import java.util.Scanner;
public class oryantasyon7 {
    // girilen vize ve final notuna göre sonucun hesaplanması
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("vize notunu giriniz");
        int v = read.nextInt();

        System.out.println("final notunu giriniz");
        int v2 = read.nextInt();

        double vize = v*0.4;
        double vize2 = v2*0.6;

        double sonuc= vize+vize2;
        System.out.println(sonuc);

        
        
    }
}
