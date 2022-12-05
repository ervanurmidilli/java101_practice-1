import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Turkce notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Muzik notunuz : ");
        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ort = toplam / 6;
        System.out.println("Ortalamaniz : "+ ort);

        String durum = (ort >= 60)? "Sinifi gecti" : "Sinifta kaldi";
        System.out.println(durum);
    }
}