
import java.util.Scanner;
public class NotOrtalamasiHesaplayan {


    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz =");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz =");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz =");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz =");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz =");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz =");
        muzik = input.nextInt();

        double ortalama = (mat+fizik+kimya+tarih+muzik+turkce)/6;
        System.out.print("Ortalamanız =" + ortalama);

        boolean kaldiniz = ortalama < 50;
        boolean gectiniz = ortalama >= 50;

        System.out.println("Kaldı mı? " + kaldiniz);
        System.out.println("Geçti mi? " +  gectiniz);

    }
}
