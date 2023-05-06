package priebehHry;

import elixiry.Elixir;
import elixiry.ElixirStatov;
import elixiry.ElixirZdravia;
import utoky.Utok;
import utoky.OhnivyUtok;
import utoky.VodnyUtok;
import utoky.ZemnyUtok;
import utoky.VzdusnyUtok;

import javax.swing.JOptionPane;

/**
 * Created by IntelliJ IDEA.
 * User: Erik Vrabec
 * Date: 6. 4. 2021
 * Time: 14:57
 */
public class PriebehHry {
    private static Hrac h1;
    private static Elixir zdravia;
    private static Elixir statov;

    public static void main(String[] args) {
        Frame frame = new Frame();
        boolean pravda = false;
        String paMeno = "";
        while (!pravda) {
            paMeno = JOptionPane.showInputDialog(null, "Zadaj prezyvku", "elementalisti", JOptionPane.PLAIN_MESSAGE);
            if (paMeno.length() > 0 && paMeno.length() < 15) {
                pravda = true;
            }
        }
        pravda = false;
        h1 = new Hrac(paMeno);
        statov = new ElixirStatov("statov");
        zdravia = new ElixirZdravia("zdravia");
        Utok obycajny = new Utok("Kopacka na Hlavu", 0);
        Utok ohnivy = new OhnivyUtok("Ohnivy dych", 0);
        Utok vodny = new VodnyUtok("Vodna triska", 0);
        Utok zemny = new ZemnyUtok("Kamena smrst", 0);
        Utok veterny = new VzdusnyUtok("Veterny sek", 0);
        frame.zaciatokFrame();
        while (!pravda) {
            if (frame.getZaciatocnik() != null) {
                obycajny.setSilaUtoku(frame.getZaciatocnik());
                frame.getZaciatocnik().setUtok(obycajny);
                ohnivy.setSilaUtoku(frame.getZaciatocnik());
                frame.getZaciatocnik().setUtok(ohnivy);
                vodny.setSilaUtoku(frame.getZaciatocnik());
                frame.getZaciatocnik().setUtok(vodny);
                zemny.setSilaUtoku(frame.getZaciatocnik());
                frame.getZaciatocnik().setUtok(zemny);
                veterny.setSilaUtoku(frame.getZaciatocnik());
                frame.getZaciatocnik().setUtok(veterny);
                h1.pridajElementalistu(frame.getZaciatocnik());
                pravda = true;
            }
        }
        h1.pridajElixir(zdravia);
        h1.pridajElixir(statov);
    }

    public Hrac getH1() {
        return h1;
    }

    public Elixir getZdravia() {
        return zdravia;
    }

    public Elixir getStatov() {
        return statov;
    }

}
