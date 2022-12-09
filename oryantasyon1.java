public class oryantasyon1 {
// fibonacci sayı dizisi
    public static void main(String [] args) {
   
        int birinci_sayi=0, ikinci_sayi=1, toplam=0;

        System.out.println(birinci_sayi+ikinci_sayi);

        for (int i=0; i<15; ++i){
            toplam= birinci_sayi+ikinci_sayi;
            System.out.println(toplam);

            birinci_sayi= ikinci_sayi;
            ikinci_sayi=toplam;


        }
   }
}