import java.util.Scanner;
public class oryantasyon9 {
    //girilen sayının negatif mi pozitif mi olduğunu bulma
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz");

        int sayi = read.nextInt();

        if(sayi>0){
            System.out.println("sayı pozitiftir");
        }else if(sayi<0) {
            System.out.println("sayı negatiftir");
        }else{
            System.out.println("sayı sıfırdır");
        }

    }
}
