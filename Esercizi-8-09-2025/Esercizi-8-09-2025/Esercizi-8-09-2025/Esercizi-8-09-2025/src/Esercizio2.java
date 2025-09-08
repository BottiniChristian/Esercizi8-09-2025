import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in); lo uso usiamo per leggere dalla tastiera
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci la prima stringa: ");
    //nextLine legge una riga intera
        String s1 = sc.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        String s2 = sc.nextLine();

        System.out.print("Inserisci la terza stringa: ");
        String s3 = sc.nextLine();

    //creo due stringhe, una concatenando (inOrdine) s1, s2, s3; (inverso) e l'atra in ordine contrario
        String inOrdine = s1 + s2 + s3;
        String inverso  = s3 + s2 + s1;

        //stampa entrambe le versioni
        System.out.println("Concatenazione (ordine di inserimento): " + inOrdine);
        System.out.println("Concatenazione (ordine inverso): " + inverso);

        sc.close();
    }
}
