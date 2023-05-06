package elementalisti;

import utoky.Utok;
import utoky.OhnivyUtok;
import utoky.VodnyUtok;
import utoky.ZemnyUtok;
import utoky.VzdusnyUtok;

import java.util.ArrayList;

/**
 * 6. 4. 2021 - 14:57
 *
 * @author Erik Vrabec
 */
public class Elementalista {
    private final Staty staty;
    private final String meno;
    private final Element typElementu;
    private final ArrayList<Utok> utok;
    private Elementalista ohnivyElem;
    private Elementalista vodnyElem;
    private Elementalista zemnyElem;
    private Elementalista veternyElem;

    public Elementalista(String meno, Element typElementu) {
        this.utok = new ArrayList<>();
        this.meno = meno;
        this.typElementu = typElementu;
        this.staty = new Staty(typElementu);
    }

    public String getMeno() {
        return this.meno;
    }

    public Element getTypElementu() {
        return this.typElementu;
    }

    public int getSilu() {
        return this.staty.getSila();
    }

    public int getObranu() {
        return this.staty.getObrana();
    }

    public int getRychlost() {
        return this.staty.getRychlost();
    }

    public int getPresnost() {
        return  this.staty.getPresnost();
    }

    public int getZivot() {
        return this.staty.getZivot();
    }

    public void setAktualnyZivot(int paZivot) {
        this.staty.setAktualnyZivot(paZivot);
    }

    public void setSiluPocasBoja(int aktualnaSila) {
        this.staty.setSiluPocasBoja(aktualnaSila);
    }

    public void setObranuPocasBoja(int aktualnaObrana) {
        this.staty.setObranuPocasBoja(aktualnaObrana);
    }

    public void setRychlostPocasBoja(int aktualnaRychlost) {
        this.staty.setRychlostPocasBoja(aktualnaRychlost);
    }

    public void setPresnostPocasBoja(int aktualnaPresnost) {
        this.staty.setPresnostPocasBoja(aktualnaPresnost);
    }

    public int getBasicSila() {
        return this.staty.getBasicSila();
    }

    public int getBasicObrana() {
        return this.staty.getBasicObrana();
    }

    public int getBasicRychlost() {
        return this.staty.getBasicRychlost();
    }

    public int getBasicPresnost() {
        return this.staty.getBasicPresnost();
    }

    public int getMaxZivot() {
        return this.staty.getMaxZivot();
    }

    public String dajElementalistu() {
        return "<html>Elementalista: " + this.getMeno() + "<br/>Element: " + this.getTypElementu() + "<br/>" + this.staty.dajStaty() + this.dajUtoky() + "</html>";
    }

    public void vypis() {
        System.out.println(this.dajElementalistu());
    }

    public void setUtok(Utok utok) {
        if (utok.getElement() == this.typElementu || utok.getElement() == null) {
            if (this.utok.size() < 2) {
                this.utok.add(utok);
            }
        }
    }

    public String dajUtoky() {
        StringBuilder x = new StringBuilder("<html>Utoky: <br/>");
        for (Utok value : this.utok) {
            x.append(value.dajPopisUtoku());
        }
        x.append("</html>");
        return x.toString();
    }

    public Utok getUtok(int cislo) {
        Utok ut = null;
        for (int i = 0; i < this.utok.size(); i++) {
            if (i == cislo) {
                ut = this.utok.get(i);
            }
        }
        return ut;
    }

    public void ohnivyElementalista() {
        this.ohnivyElem = new Elementalista("Zijuci Plamen", Element.OHEN);
        Utok obycajny = new Utok("Kopacka na Hlavu", 0);
        Utok ohnivy = new OhnivyUtok("Ohnivy dych", 0);
        obycajny.setSilaUtoku(this.ohnivyElem);
        ohnivy.setSilaUtoku(this.ohnivyElem);
        this.ohnivyElem.setUtok(obycajny);
        this.ohnivyElem.setUtok(ohnivy);
    }

    public Elementalista getOhnivyElem() {
        return this.ohnivyElem;
    }

    public void vodnyElementalista() {
        this.vodnyElem = new Elementalista("Vodny Drak", Element.VODA);
        Utok obycajny = new Utok("Kopacka na Hlavu", 0);
        Utok vodny = new VodnyUtok("Vodna triska", 0);
        obycajny.setSilaUtoku(this.vodnyElem);
        vodny.setSilaUtoku(this.vodnyElem);
        this.vodnyElem.setUtok(obycajny);
        this.vodnyElem.setUtok(vodny);
    }

    public Elementalista getVodnyElem() {
        return this.vodnyElem;
    }

    public void zemnyElementalista() {
        this.zemnyElem = new Elementalista("Golem", Element.ZEM);
        Utok obycajny = new Utok("Kopacka na Hlavu", 0);
        Utok zemny = new ZemnyUtok("Kamena smrst", 0);
        obycajny.setSilaUtoku(this.zemnyElem);
        zemny.setSilaUtoku(this.zemnyElem);
        this.zemnyElem.setUtok(obycajny);
        this.zemnyElem.setUtok(zemny);
    }

    public Elementalista getZemnyElem() {
        return this.zemnyElem;
    }

    public void veternyElementalista() {
        this.veternyElem = new Elementalista("Pegas", Element.VZDUCH);
        Utok obycajny = new Utok("Kopacka na Hlavu", 0);
        Utok veterny = new VzdusnyUtok("Veterny sek", 0);
        obycajny.setSilaUtoku(this.veternyElem);
        veterny.setSilaUtoku(this.veternyElem);
        this.veternyElem.setUtok(obycajny);
        this.veternyElem.setUtok(veterny);
    }

    public Elementalista getVeternyElem() {
        return this.veternyElem;
    }

}
