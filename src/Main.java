import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int broj1;
        int broj2;
        int zbroj;
        int razlika;
        int umnozak;
        double kolicnik;

        System.out.println("Unesite prvi broj: ");
        broj1 = sc.nextInt();

        System.out.println("Unesite drugi broj: ");
        broj2 = sc.nextInt();

        zbroj = broj1+broj2;
        razlika = broj1-broj2;
        umnozak = broj1*broj2;
        kolicnik = (double)broj1/broj2;

        System.out.println("Zbroj brojeva " + broj1 + " i " + broj2 + " iznosi: " + zbroj);
        System.out.println("Razllika brojeva " + broj1 + " i " + broj2 + " iznosi: " + razlika);
        System.out.println("Umnozak brojeva " + broj1 + " i " + broj2 + " iznosi: " + umnozak);
        System.out.println("Kolicnik brojeva " + broj1 + " i " + broj2 + " iznosi: " + kolicnik);

    }
}