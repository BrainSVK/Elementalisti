package priebehHry;

import elementalisti.Elementalista;
import elixiry.Elixir;

import java.util.ArrayList;

/**
 * 6. 4. 2021 - 14:57
 *
 * @author Erik Vrabec
 */
public class Hrac {
    private final String meno;
    private final ArrayList<Elementalista> elementalista;
    private final ArrayList<Elixir> elixir;

    public Hrac(String meno) {
        this.meno = meno;
        this.elementalista = new ArrayList<>();
        this.elixir = new ArrayList<>();
    }


    public void pridajElementalistu(Elementalista elementalista) {
        if (this.elementalista.size() > 2) {
            System.out.println("Nemozes pouzit viacej ako 3 Elementalistov");
        } else if (this.elementalista.size() == 0) {
            this.elementalista.add(elementalista);
        } else {
            int kontrola = this.elementalista.size();
            for (Elementalista elem: this.elementalista) {
                if (elementalista.getTypElementu() == elem.getTypElementu()) {
                    kontrola++;
                }
            }
            if (kontrola == this.elementalista.size()) {
                this.elementalista.add(elementalista);
            } else {
                System.out.println("Elementaristu s tymto elementom uz mas");
            }
        }
    }

    public Elementalista getElementalistu(int cislo) {
        int poradie = 0;
        Elementalista elem = null;
        if (cislo >= 0 && cislo < 3) {
            for (Elementalista value : this.elementalista) {
                if (cislo == poradie) {
                    elem = value;
                }
                poradie++;
            }
        }
        return elem;
    }


    public void odoberElementalistu(Elementalista elementalista) {
        for (int i = 0; i < this.elementalista.size(); i++) {
            if (this.elementalista.get(i).equals(elementalista)) {
                this.elementalista.remove(i);
                System.out.println("Uspesne si odobral Elementalistu");
            }
        }
    }

    public String dajElementalistov() {
        StringBuilder x = new StringBuilder();
        for (Elementalista value : this.elementalista) {
            x.append(value.dajElementalistu());
        }
        return x.toString();
    }

//    public void vypisElementaristov() {
//        System.out.println(this.dajElementalistov());
//    }

    public void pridajElixir(Elixir elixir) {
        if (this.elixir.size() > elixir.dajKapacitu()) {
            System.out.println("Nemozes mat viac ako 5 Elixirov");
        } else {
            this.elixir.add(elixir);
        }
    }

//    public boolean odoberElixir(Elixir elixir) {
//        boolean pravda = false;
//        for (int i = 0; i < this.elixir.size(); i++) {
//            if (this.elixir.get(i) == elixir) {
//                this.elementalista.remove(i);
//                System.out.println("Uspesne si odobral Elixir");
//                pravda = true;
//            }
//        }
//        return pravda;
//    }

    public void pridajJedenElixir(Elixir elixir) {
        for (Elixir value : this.elixir) {
            if (value.equals(elixir)) {
                value.pridajElixir();
            }
        }

    }

//    public void odoberJedenElixir(Elixir elixir) {
//        for (Elixir value : this.elixir) {
//            if (value.equals(elixir)) {
//                value.pouziElixir();
//            }
//        }
//    }

    public String dajElixiry() {
        StringBuilder x = new StringBuilder();
        for (Elixir value : this.elixir) {
            x.append(value.dajPopis());
        }
        return x.toString();
    }

    public String getMeno() {
        return this.meno;
    }

//    public void vypisElixiry() {
//        System.out.println(this.dajElixiry());
//    }

    public String dajHraca() {
        return "Hrac: " + this.meno + "\n" + this.dajElixiry() + "Elementalisti: \n" + this.dajElementalistov();
    }

    public void vypis() {
        System.out.println(this.dajHraca());
    }

    public void doplnZivotElementalistom() {
        for (Elementalista value : this.elementalista) {
            if (value.getZivot() < value.getMaxZivot()) {
                value.setAktualnyZivot(value.getMaxZivot());
            }
        }
    }

    public boolean skontrolujCiElementalistiMajuMaxHp() {
        boolean maju = false;
        int pom = 0;
        for (Elementalista value : this.elementalista) {
            if (value.getZivot() == value.getMaxZivot()) {
                pom++;
            }
        }
        if (pom == this.elementalista.size()) {
            maju = true;
        }
        return maju;
    }

    public int dajKolkoMaElementalistov() {
        return this.elementalista.size();
    }

}
