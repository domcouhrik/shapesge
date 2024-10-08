package fri.shapesge;

import fri.shapesge.drawables.TriangularDrawable;

import java.awt.*;

/**
 * Trojuholník je rovnoramenný trojuholník (<b>Δ</b>) sa zobrazí v okne hry (na plátne).
 * Trojuholník má základňu a dve prepony, ktoré smerujú nahor.
 * <p>
 *     <u>DÔLEŽITÉ:</u> Narozdiel od ostatných tvarov, pozícia Trojuholíka sa počíta od
 *     jeho vrchola namiesto ľavého horného rohu.
 * </p>
 *
 * @author original: Michael Kölling and David J. Barnes
 * @author engine: Ján Janech
 * @version 1.1  (July 2024)
 */

@SuppressWarnings("unused")
public class Trojuholnik {
    private final TriangularDrawable drawable;

    /**
     * Vytvorí nový Trojuholník na predvolenej pozícii s predvolenými parametrami.
     * <p>
     *     Predvolené parametre:
     *     <ul>
     *         <li>Šírka: 40 pixelov</li>
     *         <li>Výška: 30 pixelov</li>
     *         <li>Pozícia X: 50 pixelov od ľavého okraja plátna</li>
     *         <li>Pozícia Y: 15 pixelov od horného okraja plátna</li>
     *         <li>Farba: blue (modrá)</li>
     *     </ul>
     *     <p>
     *          Pozíciu, priemer a farbu môžeš zmeniť pomocou metód {@link Trojuholnik#zmenPoziciu(int x, int y)},
     *          {@link Trojuholnik#zmenVelkost(int novaSirka, int novaVyska)} a {@link Trojuholnik#zmenFarbu}.
     *     </p>
     * </p>
     */
    @SuppressWarnings("unused")
    public Trojuholnik() {
        this(50, 15);
    }

    /**
     * Vytvorí nový Trojuholník na danej pozícii s predvolenými parametrami.
     * <p>
     *     Predvolené parametre:
     *     <ul>
     *         <li>Šírka: 40 pixelov</li>
     *         <li>Výška: 30 pixelov</li>
     *         <li>Farba: blue (modrá)</li>
     *     </ul>
     *     <p>
     *          Pozíciu, priemer a farbu môžeš zmeniť pomocou metód {@link Trojuholnik#zmenPoziciu(int x, int y)},
     *          {@link Trojuholnik#zmenVelkost(int novaSirka, int novaVyska)} a {@link Trojuholnik#zmenFarbu}.
     *     </p>
     * </p>
     * @param x pozícia X vrchola trojuholníka.
     * 	 Pozícia X je vzdialenosť od ľavého okraja plátna.
     * @param y pozícia Y vrchola trojuholníka.
     * 	 Pozícia X je vzdialenosť od horného okraja plátna.
     */
    @SuppressWarnings("unused")
    public Trojuholnik(int x, int y) {
        this.drawable = new TriangularDrawable(x, y, 40, 30, Color.green);
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
     * @param novaSirka nová šírka tvaru v <b>pixeloch</b>
     *                Šírka nesmie byť menšia ako 0 ({@code novaSirka < 0}).
     * @param novaVyska nová výška tvaru v <b>pixeloch</b>.
     *                Výška nesmie byť menšia ako 0 ({@code novaVyska < 0}).
     */
    @SuppressWarnings("unused")
    public void zmenVelkost(int novaSirka, int novaVyska) {
        this.drawable.changeSize(novaSirka, novaVyska);
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
     * @param x pozícia X vrchola trojuholníka.
     * 	 Pozícia X je vzdialenosť od ľavého okraja plátna.
     * @param y pozícia Y vrchola trojuholníka.
     * 	 Pozícia X je vzdialenosť od horného okraja plátna.
     */
    @SuppressWarnings("unused")
    public void zmenPoziciu(int x, int y) {
        this.drawable.moveTo(x, y);
    }

    /**
     * @return pozíciu X vrchola trojuholníka.
     * <p>Pozícia X je vzdialenosť (v pixeloch) od ľavého okraja plátna.</p>
     */
    public int getPoziciaX() {
        return this.drawable.getXPosition();
    }

    /**
     * @return pozíciu Y vrchola trojuholníka.
     *      * <p>Pozícia Y je vzdialenosť (v pixeloch) od horného okraja plátna.</p>
     */
    public int getPoziciaY() {
        return this.drawable.getYPosition();
    }

    /**
     * @return šírka tvaru v <b>pixeloch</b>.
     */
    public int getSirka() {
        return this.drawable.getWidth();
    }

    /**
     * @return výška tvaru v <b>pixeloch</b>.
     */
    public int getVyska() {
        return this.drawable.getHeight();
    }
}
