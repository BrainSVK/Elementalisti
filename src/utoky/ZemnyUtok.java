package utoky;

import elementalisti.Element;
import elementalisti.Elementalista;


/**
 * 6. 4. 2021 - 14:57
 *
 * @author Erik Vrabec
 */
public class ZemnyUtok extends Utok {
    private final Element element;

    public ZemnyUtok(String meno, int silaUtoku) {
        super(meno, silaUtoku);
        this.element = Element.ZEM;
    }

    public Element getElement() {
        return this.element;
    }

    @Override
    public String getMeno() {
        return super.getMeno();
    }

    @Override
    public int getSilaUtoku() {
        return super.getSilaUtoku();
    }

    @Override
    public int setSilaUtoku(Elementalista elementalista) {
        return super.setSilaUtoku(elementalista);
    }

    @Override
    public String dajPopisUtoku() {
        return "Zemny" + super.dajPopisUtoku();
    }

    @Override
    public void vypis() {
        super.vypis();
    }
}
