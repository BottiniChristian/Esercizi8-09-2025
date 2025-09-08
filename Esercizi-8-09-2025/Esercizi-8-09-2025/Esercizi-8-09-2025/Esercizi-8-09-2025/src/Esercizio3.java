public class Esercizio3 {

/*perimetroRettangolo = 2 * (lato1 + lato2),
ho usato double perchè ci possono essere dei decimali
 */
    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

//in pariDispari uso un intero (n) per controllare se pari o dispari
    public static int pariDispari(int n) {
//se (n % 2 == 0) = a 0 pari, se 1 dispari
        return (n % 2 == 0) ? 0 : 1;
    }
}
