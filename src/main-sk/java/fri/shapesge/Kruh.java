package fri.shapesge;

import fri.shapesge.drawables.EllipticalDrawable;

import java.awt.Color;

/**
 * Kruh, ktorý sa zobrazí v okne hry (na plátne).
 *
 * @author original: Michael Kölling and David J. Barnes
 * @author engine: Ján Janech
 * @version 1.1 (July 2024)
 */

@SuppressWarnings("unused")
public class Kruh {
    private final EllipticalDrawable drawable;

    /**
     * Vytvorí nový kruh na predvolenej pozícii s predvolenými parametrami.
     * <p>
     *     Predvolené parametre:
     *     <ul>
     *         <li>Priemer: 30 pixelov</li>
     *         <li>Pozícia X: 20 pixelov od ľavého okraja plátna</li>
     *         <li>Pozícia Y: 60 pixelov od horného okraja plátna</li>
     *         <li>Farba: blue (modrá)</li>
     *     </ul>
     *     <p>
     *          Pozíciu, priemer a farbu môžeš zmeniť pomocou metód {@link Kruh#zmenPoziciu(int x, int y)},
     *          {@link Kruh#zmenPriemer(int novyPriemer)} a {@link Kruh#zmenFarbu}.
     *     </p>
     * </p>
     */
    @SuppressWarnings("unused")
    public Kruh() {
        this(20, 60);
    }

    /**
     * Vytvorí nový Kruh na danej pozícii s predvolenými parametrami.
     * <p>
     *     Predvolené parametre:
     *     <ul>
     *         <li>Priemer: 30 pixelov</li>
     *         <li>Farba: blue (modrá)</li>
     *     </ul>
     *     <p>
     *          Pozíciu, priemer a farbu môžeš zmeniť pomocou metód {@link Kruh#zmenPoziciu(int x, int y)},
     *          {@link Kruh#zmenPriemer(int novyPriemer)} a {@link Kruh#zmenFarbu}.
     *     </p>
     * </p>
     * @param x pozícia X ľavého horného rohu tvaru.
     * 	 Pozícia X je vzdialenosť od ľavého okraja plátna.
     * @param y pozícia Y ľavého horného rohu tvaru.
     * 	 Pozícia X je vzdialenosť od horného okraja plátna.
     */
    @SuppressWarnings("unused")
    public Kruh(int x, int y) {
        this.drawable = new EllipticalDrawable(x, y, 30, 30, Color.blue);
    }

    /**
     * Zobraz tvar na plátne. Ak už bol viditeľný, nič sa nestane.
     * @implNote Ak sa prekrýva viacero tvarov na sebe,
     * tvary budú zobrazované v takom poradí, v akom sú poslané správy.
     * <p>
     *     Napríklad, ak chceš {@link Kruh} viditeľný na štvorci ({@link Stvorec}), správy pošli v tomto poradí:
     *     <blockquote><pre>
     *         tvojStvorec.zobraz();
     *         tvojKruh.zobraz();
     *     </pre></blockquote>
     *     Ak tieto správy pošleš v opačnom poradí, {@link Kruh} sa ti skryje pod {@link Stvorec}.</b>
     * </p>
     */
    @SuppressWarnings("unused")
    public void zobraz() {
        this.drawable.makeVisible();
    }

    /**
     * Skry tvar z plátna. Ak už skrytý bol, nič sa nestane.
     */
    @SuppressWarnings("unused")
    public void skry() {
        this.drawable.makeInvisible();
    }

    /**
     * Posuň tvar o niekoľko pixelov vpravo.
     * Táto metóda vždy posúva tvar o 20 pixelov.
     */
    @SuppressWarnings("unused")
    public void posunVpravo() {
        this.drawable.moveBy(20, 0);
    }

    /**
     * Posuň tvar o niekoľko pixelov vľavo.
     * Táto metóda vždy posúva tvar o 20 pixelov.
     */
    @SuppressWarnings("unused")
    public void posunVlavo() {
        this.drawable.moveBy(-20, 0);
    }

    /**
     * Posuň tvar o niekoľko pixelov hore.
     * Táto metóda vždy posúva tvar o 20 pixelov.
     */
    @SuppressWarnings("unused")
    public void posunHore() {
        this.drawable.moveBy(0, -20);
    }

    /**
     * Posuň tvar o niekoľko pixelov dolu.
     * Táto metóda vždy posúva tvar o 20 pixelov.
     */
    @SuppressWarnings("unused")
    public void posunDole() {
        this.drawable.moveBy(0, 20);
    }

    /**
     * Posuň tvar o daný počet pixelov vodorovne.
     * @param vzdialenost o koľko <b>pixelov</b> sa má tvar posunúť.
     * Kladné čísla ({@code vzdialenost > 0}) posunú tvar doprava.
     * Záporné čísla ({@code vzdialenost < 0}) posunú tvar doľava.
     * Nula ({@code vzdialenost == 0} tvar nikam neposunie.
     */
    @SuppressWarnings("unused")
    public void posunVodorovne(int vzdialenost) {
        this.drawable.moveBy(vzdialenost, 0);
    }

    /**
     * Posuň tvar o daný počet pixelov zvisle.
     * @param vzdialenost o koľko <b>pixelov</b> sa má tvar posunúť.
     * Kladné čísla ({@code vzdialenost > 0}) posunú tvar doprava.
     * Záporné čísla ({@code vzdialenost < 0}) posunú tvar doľava.
     * Nula ({@code vzdialenost == 0} tvar nikam neposunie.
     */
    @SuppressWarnings("unused")
    public void posunZvisle(int vzdialenost) {
        this.drawable.moveBy(0, vzdialenost);
    }

    /**
     * Zmeň veľkosť tvaru.
     * @param novyPriemer nový priemer kruhu.
     *                Priemer musí byť väčší než 0 ({@code priemer < 0}).
     */
    @SuppressWarnings("unused")
    public void zmenPriemer(int novyPriemer) {
        this.drawable.changeSize(novyPriemer, novyPriemer);
    }

    /**
     * Zmeň farbu tvaru.
     * @param novaFarba nová farba zo sekcie <b>Colors v sbge.ini</b> alebo v <b>surovom formáte #rrggbb</b>, v {@link String}u (napr. {@code "blue"}, {@code "yellow"}, {@code "#ba9000"}).
     *                 <h3>Sekcia Colors v sbge.ini:</h3>
     *                 <p>Predvolené podporované farby sú {@code "red"}, {@code "blue"}, {@code "yellow"}, {@code "green"}, {@code "magenta"}, {@code "white"}, {@code "brown"} a {@code "black"}</p>
     *                 <p>Viac info na <a href="https://github.com/infjava/shapesge/wiki">ShapesGE Wiki na GitHub</a>e</p>
     *                 <h3>Surový formát #rrggbb:</h3>
     *                 <p>
     *                     Toto je tzv. kód farby HEX. Tento kód sa dá vyhľadať pre každú farbu použitím zmiešavača (Color picker,
     *                     napr. takom, ako je na <a href="https://g.co/kgs/RmaEk8D">Googli</a>, <a href="https://www.bing.com/search?q=hex+color+picker">Bingu</a>, ap.)
     *                 </p>
     */
    @SuppressWarnings("unused")
    public void zmenFarbu(String novaFarba) {
        this.drawable.changeColor(novaFarba);
    }

    /**
     * Zmeň pozíciu podľa parametrov.
     * @param x pozícia X ľavého horného rohu tvaru.
     * 	 Pozícia X je vzdialenosť od ľavého okraja plátna.
     * @param y pozícia Y ľavého horného rohu tvaru.
     * 	 Pozícia X je vzdialenosť od horného okraja plátna.
     */
    @SuppressWarnings("unused")
    public void zmenPoziciu(int x, int y) {
        this.drawable.moveTo(x, y);
    }

    /**
     * @return pozíciu X ľavého horného rohu tvaru.
     * <p>Pozícia X je vzdialenosť (v pixeloch) od ľavého okraja plátna.</p>
     */
    public int getPoziciaX() {
        return this.drawable.getXPosition();
    }

    /**
     * @return pozíciu Y ľavého horného rohu tvaru.
     *      * <p>Pozícia Y je vzdialenosť (v pixeloch) od horného okraja plátna.</p>
     */
    public int getPoziciaY() {
        return this.drawable.getYPosition();
    }

    /**
     * @return priemer tvaru v <b>pixeloch</b>.
     */
    public int getPriemer() {
        return this.drawable.getDiameterX();
    }
}
