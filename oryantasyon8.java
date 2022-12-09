import java.util.Scanner;
public class oryantasyon8 {
    // girilen pay ve payda değerine göre basit-bileşik kesir veya tam sayı olduğunu bulma
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);

        System.out.println("pay değerini giriniz");
        int pay = read.nextInt();

        System.out.println("payda değerini giriniz");
        int payda = read.nextInt();

        if(payda>pay){
            System.out.println("basit kesir girdiniz");

        }else if (pay==payda){
            System.out.println("tam sayı girdiniz");

        }else {
            int tam = pay/payda;
            pay= pay-(tam*payda);
            System.out.println("bileşik kesir girdiniz " + tam + " tam " + pay +"/" + payda);
        }
    }
}
