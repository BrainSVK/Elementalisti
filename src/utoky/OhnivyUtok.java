package utoky;

import elementalisti.Element;
import elementalisti.Elementalista;

/**
 * 6. 4. 2021 - 14:57
 *
 * @author Erik Vrabec
 */
public class OhnivyUtok extends Utok {
    private final Element element;

    public OhnivyUtok(String meno, int silaUtoku) {
        super(meno, silaUtoku);
        this.element = Element.OHEN;
    }

    public Element getElement() {
        return this.element;
    }

    @Override
    public String getMeno() {
        return super.getMeno();
    }

    @Override
    public int setSilaUtoku(Elementalista elementalista) {
        return super.setSilaUtoku(elementalista);
    }

    @Override
    public int getSilaUtoku() {
        return super.getSilaUtoku();
    }

    @Override
    public String dajPopisUtoku() {
        return "Ohnivy" + super.dajPopisUtoku();
    }

    @Override
    public void vypis() {
        super.vypis();
    }
}
