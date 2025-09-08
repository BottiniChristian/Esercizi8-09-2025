import java.util.Arrays;

public class Esercizio1 {

    //moltiplico due interi (a, b) e ritorna il loro prodotto
    public static int moltiplica(int a, int b) {
        return a * b;
    }

    //concateno una stringa (s) e un intero (n) e restituisce una stringa concatenata di elementi
    public static String concatena(String s, int n) {
        return s + n;
    }

    /*questo inserisciInArray:
       è un array di 5 stringhe e una stringa da inserire (s),
       restituisce un array di 6 stringhe con la stringa inserita (s) al terzo posto (indice 2),
       sposto gli elementi precedenti in 4 e 5 posizione che diventano rispettivamente 5 e 6.
    */
    public static String[] inserisciInArray(String[] arr5, String s) {
        if (arr5 == null || arr5.length != 5) {
            throw new IllegalArgumentException("L'array deve avere esattamente 5 elementi.");
        }
        String[] out = new String[6];
        out[0] = arr5[0];       // 1°
        out[1] = arr5[1];       // 2°
        out[2] = s;             // 3° (inserito)
        out[3] = arr5[2];       // 4° (vecchio 3°)
        out[4] = arr5[3];       // 5° (vecchio 4°)
        out[5] = arr5[4];       // 6° (vecchio 5°)
        return out;
    }

    public static void main(String[] args) {

    //chiamo il metodo 'moltiplica' con 3 e 4 e salva il risultato nella variabile 'prodotto'
        int prodotto = moltiplica(3, 4);
        System.out.println("Prodotto: " + prodotto);

    //chiamo il metodo 'concatena' passando la stringa "numero:" e l'intero 42
        String concatenata = concatena("numero:", 42);
        System.out.println("Concatena: " + concatenata);

    //creo un array di 5 stringhe
        String[] base = {"uno", "due", "tre", "quattro", "cinque"};
    //inserisce la stringa "INSERITO" al 3 posto (indice 2) creando un nuovo array di 6 elementi
        String[] risultato = inserisciInArray(base, "INSERITO");
    //converte l'array in una stringa leggibile e lo stampa
        System.out.println("Array risultante: " + Arrays.toString(risultato));
    }
}
