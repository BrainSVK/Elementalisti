package utoky;


import elementalisti.Element;
import elementalisti.Elementalista;


/**
 * 6. 4. 2021 - 14:57
 *
 * @author Erik Vrabec
 */
public class Utok implements IUtok {
    private final String meno;
    private int silaUtoku;


    public Utok(String meno, int silaUtoku) {
        this.meno = meno;
        this.silaUtoku = silaUtoku;

    }

    public String getMeno() {
        return this.meno;
    }

    public int setSilaUtoku(Elementalista elementalista) {
        this.silaUtoku = elementalista.getSilu();
        return elementalista.getSilu();
    }


    public int getSilaUtoku() {
        return this.silaUtoku;
    }

    public Element getElement() {
        return null;
    }

    @Override
    public String dajPopisUtoku() {

        return "<html>Utok: " + this.meno + " ma silu: " + this.silaUtoku + "<br/>";
    }

    @Override
    public void vypis() {
        System.out.println(this.dajPopisUtoku());
    }
}
