import java.util.Scanner;

public class oryantasyon3 {

    public static void main(String [] args) {
        //dairenin alan ve çevre hesabı
        Scanner read = new Scanner(System.in);
        final double PI = 3.14;
        System.out.println("lütfen bir yaricap değeri giriniz");
        int yaricap = read.nextInt();

        double daire_alani = PI*yaricap*yaricap;
        double çevre = 2*PI*yaricap;

        System.out.println("alan hesabı için 1 e çevre hesabı için 2 ye tıklayınız");

        int sayi=read.nextInt();

        if(sayi==1){
            System.out.println(daire_alani);
        }else if (sayi==2){
            System.out.println(çevre);

        }else {
            System.out.println("lütfen geçerli bir sayı giriniz");
        }
    } 
}
    
        
