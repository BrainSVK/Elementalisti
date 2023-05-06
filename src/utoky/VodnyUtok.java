package utoky;

import elementalisti.Element;
import elementalisti.Elementalista;

/**
 * 6. 4. 2021 - 14:57
 *
 * @author Erik Vrabec
 */
public class VodnyUtok extends Utok {
    private final Element element;

    public VodnyUtok(String meno, int silaUtoku) {
        super(meno, silaUtoku);
        this.element = Element.VODA;
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
        return "Vodny" + super.dajPopisUtoku();
    }

    @Override
    public void vypis() {
        super.vypis();
    }
}
