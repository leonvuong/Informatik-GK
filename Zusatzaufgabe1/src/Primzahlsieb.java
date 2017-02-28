/**
 * Berechnen der ersten n Primzahlen mit dem Sieb des Eratosthenes.
 * 
 * 
 * @author pape
 */
public class Primzahlsieb {

    public boolean[] sieb;

    /**
     * Erzeugt ein Primzahlsieb, mit dem alle Primzahlen
     * von 1 bis n berechnet werden können.
     * 
     * @param n eine positive Zahl, größer 1
     */
    public Primzahlsieb(int n) {
        sieb = new boolean[n + 1];
    }

    /**
     * Berechnet alle Primzahlen von 1 bis zu einer Obergrenze.
     * Zeitaufwand ist O(n log log n).
     * Speicheraufwand O(n).
     */
    public void primzahlenBerechnen() {
        for (int p = 2; p < sieb.length; p++) {
            sieb[p] = true;
        }

        for (int p = 2; p < sieb.length; p++) {
            if (sieb[p]) {
                for (int i = 2 * p; i < sieb.length; i += p) {
                    sieb[i] = false;
                }
            }
        }
    }

    /**
     * Gibt alle Primzahlen von n - 100 bis n aus.
     */
    public void primzahlenAusgeben() {
        for (int p = sieb.length - 100; p < sieb.length; p++) {
            if (sieb[p]) {
                System.out.println(p);
            }
        }
    }

    /**
     * Gibt genau dann true zurück, wenn p eine Primzahl ist.
     * Bevor diese Methode aufgerufen wird, muss
     * {@link #primzahlenBerechnen} einmal aufgerufen werden.
     */
    public boolean isPrim(int p) {
        return sieb[p];
    }

}
