import java.util.Scanner;
public class oryantasyon10 {
  //girilen sayının faktöriyelini hesaplama
    public static void main(String [] args){
      Scanner read = new Scanner(System.in);

      System.out.println("bir sayı giriniz");
      int sayi = read.nextInt();
      int çarpma=1;

      for(int i=1; i<=sayi; i++){

        çarpma = çarpma*i;

      } 
      System.out.println(çarpma);
    }



}
