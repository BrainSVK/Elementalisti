package priebehHry;

/**
 * 6. 4. 2021 - 14:57
 *
 * @author Erik Vrabec
 */
public class PopisHry {
    private String dajPopis;

    public PopisHry() {
    }

    public String dajUvod1() {
        this.dajPopis =
                "<html>Vitam ta v hre s nazvom Elementalisti! <br/> <br/>" +
                "Popis hry: <br/> <br/>" +
                "Tato hra ti ponuka roznych Elementalistov s roznymi elementmi <br/>" +
                "Na zaciatku si budes moct vybrat jedneho Elementalistu ostatnych si budes musiet ziskat sam v divocine <br/>" +
                "V meste budes mat navyber 4 moznosti kam ist: <br/>" +
                "1. moznost je Arena/Stadion - tu mozes vyzvat nahodneho protivnika nasuboj <br/>" +
                "2. moznost je Centrum - tu si budes moct uzdravit popripade ozivit svojich Elementalistov <br/>" +
                "3. moznost je Obchod/Shop - tu si budes moct doplnit Elixiry zdravia/zvysenia statov <br/>" +
                "4. moznost je Divocina - tu sa vydas do divociny kde po ceste stretnes nahodneho Elementalistu </html>";
        return this.dajPopis;
    }

    public String dajVyber() {
        this.dajPopis =
                "<html>" + /*this.frame.getMeno() + */  "<br/>" +
                "Tu si mozes vybrat medzi tymito styrmi Elementalistami <br/>" +
                "Ohnivy je dobry na Veterneho, ale zly na Vodneho <br/>" +
                "Zemny je dobry na Vodneho, ale zly na Veterneho <br/>" +
                "Vodny je dobry na Ohniveho, ale zly na Zemneho <br/>" +
                "Veterny je dobry na Zemneho, ale zly na Ohniveho </html>";
        return this.dajPopis;
    }

}
