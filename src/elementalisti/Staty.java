package elementalisti;

import java.util.Random;

/**
 * 6. 4. 2021 - 14:57
 *
 * @author Erik Vrabec
 */
public class Staty {
    private final int najmensi = 40;
    private final int najvacsi = 60;
    private int sila;
    private final int basicSila;
    private int obrana;
    private final int basicObrana;
    private int rychlost;
    private final int basicRychlost;
    private int presnost;
    private final int basicPresnost;
    private int zivot;
    private final Element element;
    private final int maxZivot;


    public Staty(Element element) {
        this.element = element;
        this.sila = this.setSila();
        this.obrana = this.setObrana();
        this.rychlost = this.setRychlost();
        this.presnost = this.setPresnost();
        this.zivot = this.setZivot();
        this.maxZivot = this.zivot;
        this.basicSila = this.sila;
        this.basicObrana = this.obrana;
        this.basicRychlost = this.rychlost;
        this.basicPresnost = this.presnost;
    }

    public int setSila() {
        Random status = new Random();
        if (this.element.equals(Element.OHEN)) {
            this.sila = status.nextInt((this.najvacsi + 10) - (this.najmensi + 10)) + (this.najmensi + 10);
        } else if (this.element.equals(Element.ZEM)) {
            this.sila = status.nextInt((this.najvacsi - 10) - (this.najmensi - 10)) + (this.najmensi - 10);
        } else {
            this.sila = status.nextInt(this.najvacsi - this.najmensi) + this.najmensi;
        }
        return this.sila;
    }

    public int getSila() {
        return this.sila;
    }

    public int setObrana() {
        Random status = new Random();
        if (this.element.equals(Element.OHEN)) {
            this.obrana = status.nextInt((this.najvacsi - 30) - (this.najmensi - 25)) + (this.najmensi - 25);
        } else if (this.element.equals(Element.ZEM)) {
            this.obrana = status.nextInt((this.najvacsi - 15) - (this.najmensi - 10)) + (this.najmensi - 10);
        } else {
            this.obrana = status.nextInt((this.najvacsi - 25) - (this.najmensi - 20)) + (this.najmensi - 20);
        }
        return this.obrana;
    }

    public int getObrana() {
        return this.obrana;
    }

    public int setRychlost() {
        Random status = new Random();
        if (this.element.equals(Element.VODA)) {
            this.rychlost = status.nextInt((this.najvacsi - 10) - (this.najmensi - 10)) + (this.najmensi - 10);
        } else if (this.element.equals(Element.VZDUCH)) {
            this.rychlost = status.nextInt((this.najvacsi + 10) - (this.najmensi + 10)) + (this.najmensi + 10);
        } else {
            this.rychlost = status.nextInt(this.najvacsi - this.najmensi) + this.najmensi;
        }
        return this.rychlost;
    }

    public int getRychlost() {
        return this.rychlost;
    }

    public int setPresnost() {
        Random status = new Random();
        if (this.element.equals(Element.VODA)) {
            this.presnost = status.nextInt((this.najvacsi + 10) - (this.najmensi + 10)) + (this.najmensi + 10);
        } else if (this.element.equals(Element.VZDUCH)) {
            this.presnost = status.nextInt((this.najvacsi - 10) - (this.najmensi - 10)) + (this.najmensi - 10);
        } else {
            this.presnost = status.nextInt(this.najvacsi - this.najmensi) + this.najmensi;
        }
        return this.presnost;
    }

    public int getPresnost() {
        return this.presnost;
    }

    public int setZivot() {
        Random status = new Random();
        this.zivot = status.nextInt((this.najvacsi + 60) - (this.najmensi + 60)) + this.najmensi + 60;
        return this.zivot;
    }

    public void setAktualnyZivot(int paZivot) {
        this.zivot = paZivot;
    }

    public int getZivot() {
        return this.zivot;
    }

    public String dajStaty() {
        return "<html>Staty: " + "<br/>Sila: " + this.sila + "<br/>Obrana: " + this.obrana + "<br/>Rychlost: " + this.rychlost + "<br/>Presnost: " + this.presnost + "<br/>Zivot: " + this.maxZivot + "/" + this.zivot + "<br/>";
    }

    public int getMaxZivot() {
        return this.maxZivot;
    }

    public void vypis() {
        System.out.println(this.dajStaty());
    }

    public void setSiluPocasBoja(int aktualnaSila) {
        this.sila = aktualnaSila;
    }

    public void setObranuPocasBoja(int aktualnaObrana) {
        this.obrana = aktualnaObrana;
    }

    public void setRychlostPocasBoja(int aktualnaRychlost) {
        this.rychlost = aktualnaRychlost;
    }

    public void setPresnostPocasBoja(int aktualnaPresnost) {
        this.presnost = aktualnaPresnost;
    }

    public int getBasicSila() {
        return this.basicSila;
    }

    public int getBasicObrana() {
        return this.basicObrana;
    }

    public int getBasicRychlost() {
        return this.basicRychlost;
    }

    public int getBasicPresnost() {
        return this.basicPresnost;
    }

}

