import java.util.Scanner;
public class oryantasyon5 {
    //girilen sayının tek mi çift mi olduğunu bulma
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz");
        int sayi = read.nextInt();

        int kalan = sayi%2 ;
        if(kalan==0){
            System.out.println("sayı çifttir");
        }else{
            System.out.println("sayı tektir");
        }
    }
}
