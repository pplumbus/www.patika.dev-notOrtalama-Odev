public class patikadev_odev package Giris;

        import java.util.Scanner;


public class hmyoto {
    public static void main(String[] args) {
        int mat, fizik, turkce,tarih, muzik, birinci, ikinci, ucuncu;
        double matOrtalama,muzOrtalama, tumOrtalama;
        String durum;

        Scanner giris = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        birinci = giris.nextInt();
        ikinci = giris.nextInt();
        ucuncu = giris.nextInt();

        matOrtalama = (birinci + ikinci + ucuncu) / 3;


        if(matOrtalama>=70) {
            ;

            System.out.println("Dersi " + matOrtalama + " ile gectiniz");

        }else{
            ;
            System.out.println("Dersten " + matOrtalama + " ile kaldiniz");
        }
        //
        System.out.print("Müzik Notunuz : ");
        birinci = giris.nextInt();
        ikinci = giris.nextInt();
        ucuncu = giris.nextInt();

        muzOrtalama = (birinci + ikinci + ucuncu) / 3;


        if(muzOrtalama>=70) {
            ;

            System.out.println("Dersi " + muzOrtalama + " ile gectiniz");

        }else{
            ;
            System.out.println("Dersten " + muzOrtalama + " ile kaldiniz");
        }

        System.out.print("Sinifi Geçme Durumunuz : ");
        tumOrtalama = (muzOrtalama + matOrtalama) / 2;


        boolean kosul1 = 60 >= tumOrtalama;
        boolean kosul2 = tumOrtalama < 60;



        durum =!(kosul1) ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(durum);
    }
}
{
}
