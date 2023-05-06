package elixiry;

/**
 * 6. 4. 2021 - 14:57
 *
 * @author Erik Vrabec
 */
public class Elixir implements IElixir {
    private final String meno;
    private int mnozstvo;

    public Elixir(String meno) {
        this.meno = meno;
        this.mnozstvo = 0;
    }

//    public int setMnozstvo(int mnozstvo) {
//        if (mnozstvo >= dajKapacitu() || mnozstvo < 1) {
//            this.mnozstvo = mnozstvo;
//        }
//        return this.mnozstvo;
//    }

    public int pridajElixir() {
        if (this.mnozstvo < this.dajKapacitu()) {
            return this.mnozstvo++;
        } else {
            return this.mnozstvo;
        }
    }

    @Override
    public int dajKapacitu() {
        return 10;
    }

    @Override
    public String dajPopis() {
        return "Elixir: " + this.meno + ": " + this.mnozstvo + "ks\n";
    }

    @Override
    public void vypis() {
        System.out.println(this.dajPopis());
    }

    public int getMnozstvo() {
        return this.mnozstvo;
    }

    public int pouziElixir() {
        if (this.mnozstvo > 0) {
            return this.mnozstvo--;
        } else {
            return this.mnozstvo;
        }
    }

}
