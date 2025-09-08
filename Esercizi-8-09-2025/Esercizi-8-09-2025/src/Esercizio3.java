import java.util.Scanner;

public class Esercizio3 {

    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    public static int pariDispari(int n) {
        return (n % 2 == 0) ? 0 : 1;
    }

    public static double areaTriangolo(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("I lati devono essere positivi.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("I lati non soddisfano la disuguaglianza triangolare.");
        }
        double p = (a + b + c) / 2.0; // semiperimetro
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Rettangolo ---
        System.out.print("Inserisci il primo lato del rettangolo (decimale): ");
        double r1 = Double.parseDouble(sc.nextLine().replace(',', '.'));
        System.out.print("Inserisci il secondo lato del rettangolo (decimale): ");
        double r2 = Double.parseDouble(sc.nextLine().replace(',', '.'));

        double perimetroRett = perimetroRettangolo(r1, r2);
        System.out.println("Perimetro del rettangolo: " + perimetroRett);

        // --- Pari/Dispari ---
        System.out.print("Inserisci un numero intero: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        int risultatoPariDispari = pariDispari(n);
        System.out.println("Risultato pariDispari (0=pari, 1=dispari): " + risultatoPariDispari);

        // --- Triangolo (area con Erone) ---
        System.out.print("Inserisci il lato a del triangolo (decimale): ");
        double a = Double.parseDouble(sc.nextLine().replace(',', '.'));
        System.out.print("Inserisci il lato b del triangolo (decimale): ");
        double b = Double.parseDouble(sc.nextLine().replace(',', '.'));
        System.out.print("Inserisci il lato c del triangolo (decimale): ");
        double c = Double.parseDouble(sc.nextLine().replace(',', '.'));

        try {
            double area = areaTriangolo(a, b, c);
            System.out.println("Area del triangolo (Erone): " + area);
        } catch (IllegalArgumentException ex) {
            System.out.println("Errore: " + ex.getMessage());
        }

        sc.close();
    }
}
