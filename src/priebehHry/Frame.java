package priebehHry;


import elementalisti.Element;
import elementalisti.Elementalista;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

/**
 * 6. 4. 2021 - 14:57
 *
 * @author Erik Vrabec
 */
public class Frame implements ActionListener {
    private JButton fire;
    private JButton water;
    private JButton earth;
    private JButton wind;
    private JButton centerB;
    private JButton shopBhp;
    private JButton shopBst;
    private JButton wildB;
    private JButton pokracovat;
    private JButton infoF;
    private JButton vratitSa;
    private JButton vyber1;
    private JButton vyber2;
    private JButton vyber3;
    private JButton utok1;
    private JButton utok2;
    private JButton elixirZd;
    private JButton elixirSt;
    private JButton vymena;
    private JButton utiect;
    private JButton prevziat;
    private JButton ponechat;
    private JButton prevziat1;
    private JButton prevziat2;
    private JButton nezmenit;
    private JFrame frame;
    private JFrame bFrame;
    private JFrame zaciatok;
    private JFrame nastav;
    private JFrame infFrame;
    private String vypis;
    private final ImageIcon elemfire = new ImageIcon("elemfire.png");
    private final ImageIcon elemwater = new ImageIcon("elemwater.png");
    private final ImageIcon elemearth = new ImageIcon("elemearth.png");
    private final ImageIcon elemwind = new ImageIcon("elemwind.png");
    private Elementalista zaciatocnik;
    private PriebehHry hrac;
    private JLabel elem1;
    private JLabel elem2;
    private JLabel elem3;
    private JLabel hracPopis;
    private JLabel popisElem1;
    private JLabel popisElem2;
    private JLabel stupienok1;
    private JLabel stupienok2;
    private JLabel bojElem1;
    private JLabel bojElem2;
    private JLabel prevzatie;
    private JLabel prevzatie1;
    private JLabel prevzatie2;
    private JLabel vyPrevzatie;
    private Elementalista vybrany;
    private Elementalista vOponent;

    public void zaciatokFrame() {
        PopisHry popis = new PopisHry();
        this.vypis = popis.dajUvod1();
        JLabel zac = new JLabel();
        this.pokracovat = new JButton();
        this.pokracovat.setBounds(880, 650, 100, 50);
        this.pokracovat.setText("Pokracovat");
        this.pokracovat.addActionListener(this);
        this.pokracovat.setFocusable(false);
        this.pokracovat.setBackground(new Color(160, 250, 180));
        zac.setHorizontalAlignment(JLabel.CENTER);
        zac.setVerticalAlignment(JLabel.TOP);
        zac.setFont(new Font("MV Boli" , Font.PLAIN, 19));
        zac.setText(this.vypis);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.zaciatok = new JFrame();
        this.zaciatok.setLocation(dim.width / 4 - this.zaciatok.getSize().width / 5, dim.height / 8 - this.zaciatok.getSize().height / 8);
        this.zaciatok.setTitle("elementalisti");
        this.zaciatok.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //zaciatok.setLayout(null);
        this.zaciatok.setResizable(false);
        this.zaciatok.setSize(1020, 760);
        this.zaciatok.getContentPane().setBackground(new Color(200, 230, 250));
        this.zaciatok.setVisible(true);
        zac.add(this.pokracovat);
        this.zaciatok.add(zac);

    }

    public void nastavFrame() {
        this.wind = new JButton();
        this.wind.setIcon(this.elemwind);
        this.wind.setVerticalAlignment(JButton.CENTER);
        this.wind.setHorizontalAlignment(JButton.CENTER);
        this.wind.setHorizontalTextPosition(JButton.CENTER);
        this.wind.setVerticalTextPosition(JButton.TOP);
        this.wind.setBounds(715, 300, 200, 400);
        this.wind.setText("Veterny");
        this.wind.addActionListener(this);
        this.wind.setFocusable(false);
        this.wind.setBackground(new Color(200, 255, 200));

        this.water = new JButton();
        this.water.setIcon(this.elemwater);
        this.water.setVerticalAlignment(JButton.CENTER);
        this.water.setHorizontalAlignment(JButton.CENTER);
        this.water.setHorizontalTextPosition(JButton.CENTER);
        this.water.setVerticalTextPosition(JButton.TOP);
        this.water.setBounds(510, 300, 200, 400);
        this.water.setText("Vodny");
        this.water.addActionListener(this);
        this.water.setFocusable(false);
        this.water.setBackground(new Color(30, 190, 250));

        this.fire = new JButton();
        this.fire.setIcon(this.elemfire);
        this.fire.setVerticalAlignment(JButton.CENTER);
        this.fire.setHorizontalAlignment(JButton.CENTER);
        this.fire.setHorizontalTextPosition(JButton.CENTER);
        this.fire.setVerticalTextPosition(JButton.TOP);
        this.fire.setBounds(100, 300, 200, 400);
        this.fire.setText("Ohnivy");
        this.fire.addActionListener(this);
        this.fire.setFocusable(false);
        this.fire.setBackground(new Color(250, 100, 150));

        this.earth = new JButton();
        this.earth.setIcon(this.elemearth);
        this.earth.setVerticalAlignment(JButton.CENTER);
        this.earth.setHorizontalAlignment(JButton.CENTER);
        this.earth.setHorizontalTextPosition(JButton.CENTER);
        this.earth.setVerticalTextPosition(JButton.TOP);
        this.earth.setBounds(305, 300, 200, 400);
        this.earth.setText("Zemny");
        this.earth.addActionListener(this);
        this.earth.setFocusable(false);
        this.earth.setBackground(new Color(200, 120, 100));

        JLabel nas = new JLabel();
        nas.setHorizontalAlignment(JLabel.CENTER);
        nas.setVerticalAlignment(JLabel.TOP);
        nas.setFont(new Font("MV Boli" , Font.PLAIN, 19));

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.nastav = new JFrame();
        this.nastav.setLocation(dim.width / 4 - this.nastav.getSize().width / 5, dim.height / 8 - this.nastav.getSize().height / 8);
        //this.nastav.setLayout(null);
        this.nastav.setTitle("elementalisti");
        this.nastav.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.nastav.setResizable(false);
        this.nastav.setSize(1020, 760);
        this.nastav.getContentPane().setBackground(new Color(200, 230, 250));
        this.nastav.setVisible(true);

        PopisHry popis = new PopisHry();
        this.vypis = popis.dajVyber();
        nas.setText(this.vypis);
        nas.add(this.fire);
        nas.add(this.earth);
        nas.add(this.water);
        nas.add(this.wind);
        this.nastav.add(nas);
    }

    public void myFrame() {
        this.hrac = new PriebehHry();
        //fotky
        ImageIcon centerP = new ImageIcon("pokemoncenter.png");
        ImageIcon stadiumP = new ImageIcon("pokemonstadium.png");
        ImageIcon shopP = new ImageIcon("pokeshop.png");
        ImageIcon wildP = new ImageIcon("pokewild.png");

        //tlacitka
        this.infoF = new JButton();
        this.infoF.setBounds(428, 370, 165, 20);
        this.infoF.setText("Info elementalistov");
        this.infoF.addActionListener(this);
        this.infoF.setFocusable(false);
        this.infoF.setBackground(new Color(250, 200, 200));

        this.wildB = new JButton();
        this.wildB.setBounds(685, 650, 165, 20);
        this.wildB.setText("Vyprava do divociny");
        this.wildB.addActionListener(this);
        this.wildB.setFocusable(false);
        this.wildB.setBackground(new Color(255, 255, 100));

        this.centerB = new JButton();
        this.centerB.setBounds(175, 270, 165, 20);
        this.centerB.setText("Ozivit Elementalistov");
        this.centerB.addActionListener(this);
        this.centerB.setFocusable(false);
        this.centerB.setBackground(new Color(160, 250, 180));

        JButton stadiumB = new JButton();
        stadiumB.setBounds(175, 650, 165, 20);
        stadiumB.setText("Vyzvat Oponenta");
        stadiumB.setFocusable(false);
        stadiumB.setEnabled(false);
        stadiumB.setBackground(new Color(200, 120, 100));

        this.shopBhp = new JButton();
        this.shopBhp.setBounds(685, 270, 165, 20);
        this.shopBhp.setText("Dokupit Elixir zdravia");
        this.shopBhp.addActionListener(this);
        this.shopBhp.setFocusable(false);
        this.shopBhp.setBackground(new Color(250, 160, 180));

        this.shopBst = new JButton();
        this.shopBst.setBounds(685, 295, 165, 20);
        this.shopBst.setText("Dokupit Elixir statov");
        this.shopBst.addActionListener(this);
        this.shopBst.setFocusable(false);
        this.shopBst.setBackground(new Color(250, 160, 180));

        //Element budovy
        JLabel wild = new JLabel();
        wild.add(this.wildB);
        wild.setText("Tu vstupis do divociny");
        wild.setIcon(wildP);
        wild.setBounds(630, 400 , 270, 255);
        wild.setVerticalAlignment(JLabel.CENTER);
        wild.setHorizontalAlignment(JLabel.CENTER);
        wild.setHorizontalTextPosition(JLabel.CENTER);
        wild.setVerticalTextPosition(JLabel.TOP);

        JLabel center = new JLabel();
        center.add(this.centerB);
        center.setText("Tu si mozes doplnit zivot Elementalistov");
        center.setIcon(centerP);
        center.setBounds(120, 40 , 270, 255);
        center.setVerticalAlignment(JLabel.CENTER);
        center.setHorizontalAlignment(JLabel.CENTER);
        center.setHorizontalTextPosition(JLabel.CENTER);
        center.setVerticalTextPosition(JLabel.TOP);

        JLabel shop = new JLabel();
        shop.add(this.shopBhp);
        shop.add(this.shopBst);
        shop.setText("Tu si mozes doplnit elixiry");
        shop.setIcon(shopP);
        shop.setBounds(630, 40 , 270, 255);
        shop.setVerticalAlignment(JLabel.CENTER);
        shop.setHorizontalAlignment(JLabel.CENTER);
        shop.setHorizontalTextPosition(JLabel.CENTER);
        shop.setVerticalTextPosition(JLabel.TOP);

        JLabel stadium = new JLabel();
        stadium.add(stadiumB);
        stadium.setText("Tu vyzyvas oponentov na suboj");
        stadium.setIcon(stadiumP);
        stadium.setBounds(120, 420 , 270, 255);
        stadium.setVerticalAlignment(JLabel.CENTER);
        stadium.setHorizontalAlignment(JLabel.CENTER);
        stadium.setHorizontalTextPosition(JLabel.CENTER);
        stadium.setVerticalTextPosition(JLabel.TOP);

        this.hracPopis = new JLabel();
        this.hracPopis.setText(this.dajPopisHraca());
        this.hracPopis.setBounds(428, 315, 165, 60);
        this.hracPopis.setVerticalAlignment(JLabel.CENTER);
        this.hracPopis.setHorizontalAlignment(JLabel.CENTER);


        //grafika
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.frame = new JFrame();
        this.frame.setLocation(dim.width / 4 - this.frame.getSize().width / 5, dim.height / 8 - this.frame.getSize().height / 8);
        this.frame.setTitle("elementalisti");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().setBackground(new Color(230, 250, 230));
        this.frame.setLayout(null);
        this.frame.setResizable(false);
        this.frame.setSize(1020, 760);
        this.frame.setVisible(true);
        this.frame.add(center);
        this.frame.add(this.centerB);
        this.frame.add(shop);
        this.frame.add(this.shopBst);
        this.frame.add(this.shopBhp);
        this.frame.add(stadium);
        this.frame.add(stadiumB);
        this.frame.add(wild);
        this.frame.add(this.wildB);
        this.frame.add(this.infoF);
        this.frame.add(this.hracPopis);
        this.infoFrame();
        this.kontrola();

    }

    public void infoFrame() {
        this.elem1 = new JLabel();
        this.elem2 = new JLabel();
        this.elem3 = new JLabel();

        this.vratitSa = new JButton();
        this.vratitSa.setVerticalAlignment(JButton.CENTER);
        this.vratitSa.setHorizontalAlignment(JButton.CENTER);
        this.vratitSa.setText("Vratit sa");
        this.vratitSa.addActionListener(this);
        this.vratitSa.setFocusable(false);
        this.vratitSa.setBackground(new Color(160, 250, 180));

        this.infoPopisuElem();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.infFrame = new JFrame();
        this.infFrame.setLocation(dim.width / 4 - this.infFrame.getSize().width / 5, dim.height / 8 - this.infFrame.getSize().height / 8);
        this.infFrame.setTitle("elementalisti");
        this.infFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.infFrame.getContentPane().setBackground(new Color(250, 200, 200));
        this.infFrame.setLayout(null);
        this.infFrame.setResizable(false);
        this.infFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Frame.this.infFrame.setVisible(false);
                Frame.this.infoF.setEnabled(true);
            }
        });
        this.reSizeInfoFreame();
        this.infFrame.setVisible(false);
        this.infFrame.add(this.elem1);
        this.infFrame.add(this.elem2);
        this.infFrame.add(this.elem3);
        this.infFrame.add(this.vratitSa);
    }

    public void battleFrame() {
        ImageIcon stupienok = new ImageIcon("stupienok.png");

        this.stupienok1 = new JLabel();
        this.stupienok1.setIcon(stupienok);
        this.stupienok1.setBounds(150, 470, 300, 100);
        this.stupienok1.setHorizontalAlignment(JLabel.CENTER);
        this.stupienok1.setVerticalAlignment(JLabel.CENTER);

        this.stupienok2 = new JLabel();
        this.stupienok2.setIcon(stupienok);
        this.stupienok2.setBounds(570, 230, 300, 100);
        this.stupienok2.setHorizontalAlignment(JLabel.CENTER);
        this.stupienok2.setVerticalAlignment(JLabel.CENTER);

        this.bojElem1 = new JLabel();
        this.bojElem1.setBounds(200, 300, 200, 230);
        this.bojElem1.setHorizontalAlignment(JLabel.CENTER);
        this.bojElem1.setVerticalAlignment(JLabel.CENTER);

        this.setProtivnika();
        this.bojElem2 = new JLabel();
        this.bojElem2.setIcon(this.zvolIconOponenta());
        this.bojElem2.setBounds(620, 60, 200, 230);
        this.bojElem2.setHorizontalAlignment(JLabel.CENTER);
        this.bojElem2.setVerticalAlignment(JLabel.CENTER);

        this.popisElem1 = new JLabel();
        //this.popisElem1.setText(dajPopisElem1());
        this.popisElem1.setOpaque(true);
        this.popisElem1.setBackground(Color.lightGray);
        this.popisElem1.setBounds(500, 430, 230, 40);
        this.popisElem1.setHorizontalAlignment(JLabel.CENTER);
        this.popisElem1.setVerticalAlignment(JLabel.CENTER);

        this.popisElem2 = new JLabel();
        this.popisElem2.setText(this.dajPopisElem2());
        this.popisElem2.setOpaque(true);
        this.popisElem2.setBackground(Color.lightGray);
        this.popisElem2.setBounds(320, 190, 230, 40);
        this.popisElem2.setHorizontalAlignment(JLabel.CENTER);
        this.popisElem2.setVerticalAlignment(JLabel.CENTER);

        this.vyber1 = new JButton();
        this.vyber1.setEnabled(false);
        if (this.hrac.getH1().dajKolkoMaElementalistov() > 0) {
            this.vyber1.setEnabled(true);
        }
        this.vyber1.setIcon(this.zvolIconVyber1());
        this.vyber1.setText(this.zvolTextVyber1());
        this.vyber1.setBackground(this.setColor(this.zvolIconVyber1()));
        this.vyber1.setVerticalAlignment(JButton.CENTER);
        this.vyber1.setHorizontalAlignment(JButton.CENTER);
        this.vyber1.setVerticalTextPosition(JButton.TOP);
        this.vyber1.setHorizontalTextPosition(JButton.CENTER);
        this.vyber1.setBounds(180, 255, 210, 250);
        this.vyber1.addActionListener(this);
        this.vyber1.setFocusable(false);


        this.vyber2 = new JButton();
        this.vyber2.setEnabled(false);
        if (this.hrac.getH1().dajKolkoMaElementalistov() > 1) {
            this.vyber2.setIcon(this.zvolIconVyber2());
            this.vyber2.setText(this.zvolTextVyber2());
            this.vyber2.setBackground(this.setColor(this.zvolIconVyber2()));
            this.vyber2.setEnabled(true);
        } else {
            this.vyber2.setBackground(Color.lightGray);
        }
        this.vyber2.setVerticalAlignment(JButton.CENTER);
        this.vyber2.setHorizontalAlignment(JButton.CENTER);
        this.vyber2.setVerticalTextPosition(JButton.TOP);
        this.vyber2.setHorizontalTextPosition(JButton.CENTER);
        this.vyber2.setBounds(395, 255, 210, 250);
        this.vyber2.addActionListener(this);
        this.vyber2.setFocusable(false);

        this.vyber3 = new JButton();
        this.vyber3.setEnabled(false);
        if (this.hrac.getH1().dajKolkoMaElementalistov() > 2) {
            this.vyber3.setIcon(this.zvolIconVyber3());
            this.vyber3.setText(this.zvolTextVyber3());
            this.vyber3.setBackground(this.setColor(this.zvolIconVyber3()));
            this.vyber3.setEnabled(true);
        } else {
            this.vyber3.setBackground(Color.lightGray);
        }
        this.vyber3.setVerticalAlignment(JButton.CENTER);
        this.vyber3.setHorizontalAlignment(JButton.CENTER);
        this.vyber3.setVerticalTextPosition(JButton.TOP);
        this.vyber3.setHorizontalTextPosition(JButton.CENTER);
        this.vyber3.setBounds(610, 255, 210, 250);
        this.vyber3.addActionListener(this);
        this.vyber3.setFocusable(false);

        this.utok1 = new JButton();
        this.utok1.setText("Kopacka Na Hlavu");
        this.utok1.setBackground(Color.lightGray);
        this.utok1.setBounds(100, 610, 200, 40);
        this.utok1.addActionListener(this);
        this.utok1.setFocusable(false);

        this.utok2 = new JButton();
        this.utok2.setBounds(100, 660, 200, 40);
        this.utok2.addActionListener(this);
        this.utok2.setFocusable(false);

        this.elixirZd = new JButton();
        this.elixirZd.setBounds(310, 610, 200, 40);
        this.elixirZd.addActionListener(this);
        this.elixirZd.setFocusable(false);
        this.elixirZd.setText("Elixir Zdravia " + this.hrac.getZdravia().dajKapacitu() + "/" + this.hrac.getZdravia().getMnozstvo());
        this.elixirZd.setBackground(Color.PINK);

        this.elixirSt = new JButton();
        this.elixirSt.setBounds(310, 660, 200, 40);
        this.elixirSt.addActionListener(this);
        this.elixirSt.setFocusable(false);
        this.elixirSt.setText("Elixir Statov " + this.hrac.getStatov().dajKapacitu() + "/" + this.hrac.getStatov().getMnozstvo());
        this.elixirSt.setBackground(Color.orange);

        this.vymena = new JButton();
        this.vymena.setBounds(630, 610, 200, 40);
        this.vymena.addActionListener(this);
        this.vymena.setFocusable(false);
        this.vymena.setText("Vymena Elementalistu");
        this.vymena.setBackground(Color.GREEN);

        this.utiect = new JButton();
        this.utiect.setBounds(630, 660, 200, 40);
        this.utiect.addActionListener(this);
        this.utiect.setFocusable(false);
        this.utiect.setText("Utiect");
        this.utiect.setBackground(Color.CYAN);

        this.prevziat = new JButton();
        this.prevziat.setVerticalAlignment(JButton.CENTER);
        this.prevziat.setHorizontalAlignment(JButton.CENTER);
        this.prevziat.setText("Prevziat");
        this.prevziat.addActionListener(this);
        this.prevziat.setFocusable(false);
        this.prevziat.setBackground(Color.GREEN);

        this.prevziat1 = new JButton();
        this.prevziat1.setVerticalAlignment(JButton.CENTER);
        this.prevziat1.setHorizontalAlignment(JButton.CENTER);
        this.prevziat1.setText("Prevziat");
        this.prevziat1.addActionListener(this);
        this.prevziat1.setFocusable(false);
        this.prevziat1.setBackground(Color.GREEN);

        this.prevziat2 = new JButton();
        this.prevziat2.setVerticalAlignment(JButton.CENTER);
        this.prevziat2.setHorizontalAlignment(JButton.CENTER);
        this.prevziat2.setText("Prevziat");
        this.prevziat2.addActionListener(this);
        this.prevziat2.setFocusable(false);
        this.prevziat2.setBackground(Color.GREEN);

        this.ponechat = new JButton();
        this.ponechat.setVerticalAlignment(JButton.CENTER);
        this.ponechat.setHorizontalAlignment(JButton.CENTER);
        this.ponechat.setText("Ponechat");
        this.ponechat.addActionListener(this);
        this.ponechat.setFocusable(false);
        this.ponechat.setBackground(Color.CYAN);

        this.nezmenit = new JButton();
        this.nezmenit.setVerticalAlignment(JButton.CENTER);
        this.nezmenit.setHorizontalAlignment(JButton.CENTER);
        this.nezmenit.setBounds(710, 515, 100, 40);
        this.nezmenit.setText("Nemenit");
        this.nezmenit.addActionListener(this);
        this.nezmenit.setFocusable(false);
        this.nezmenit.setBackground(Color.CYAN);

        this.prevzatie = new JLabel();
        this.prevzatie.setVerticalAlignment(JLabel.TOP);
        this.prevzatie.setHorizontalAlignment(JLabel.CENTER);
        this.prevzatie.setHorizontalTextPosition(JLabel.CENTER);
        this.prevzatie.setVerticalTextPosition(JLabel.BOTTOM);

        this.vyPrevzatie = new JLabel();
        this.vyPrevzatie.setVerticalAlignment(JLabel.TOP);
        this.vyPrevzatie.setHorizontalAlignment(JLabel.CENTER);
        this.vyPrevzatie.setHorizontalTextPosition(JLabel.CENTER);
        this.vyPrevzatie.setVerticalTextPosition(JLabel.BOTTOM);

        this.prevzatie1 = new JLabel();
        this.prevzatie1.setVerticalAlignment(JLabel.TOP);
        this.prevzatie1.setHorizontalAlignment(JLabel.CENTER);
        this.prevzatie1.setHorizontalTextPosition(JLabel.CENTER);
        this.prevzatie1.setVerticalTextPosition(JLabel.BOTTOM);

        this.prevzatie2 = new JLabel();
        this.prevzatie2.setVerticalAlignment(JLabel.TOP);
        this.prevzatie2.setHorizontalAlignment(JLabel.CENTER);
        this.prevzatie2.setHorizontalTextPosition(JLabel.CENTER);
        this.prevzatie2.setVerticalTextPosition(JLabel.BOTTOM);


        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.bFrame = new JFrame();
        this.bFrame.setLocation(dim.width / 4 - this.bFrame.getSize().width / 5, dim.height / 8 - this.bFrame.getSize().height / 8);
        this.bFrame.setTitle("elementalisti");
        this.bFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.bFrame.getContentPane().setBackground(new Color(200, 230, 250));
        this.bFrame.setLayout(null);
        this.bFrame.setResizable(false);
        this.bFrame.setSize(1020, 760);
        this.bFrame.setVisible(false);
        this.bFrame.add(this.vyber1);
        this.bFrame.add(this.vyber2);
        this.bFrame.add(this.vyber3);
        this.bFrame.add(this.stupienok1);
        this.bFrame.add(this.bojElem2);
        this.bFrame.add(this.stupienok2);
        this.bFrame.add(this.popisElem2);
    }

    public Elementalista getZaciatocnik() {
        return this.zaciatocnik;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.pokracovat) {
            this.zaciatok.setVisible(false);
            this.nastavFrame();
        }
        if (e.getSource() == this.centerB) {
            this.hrac = new PriebehHry();
            this.hrac.getH1().doplnZivotElementalistom();
            if (this.hrac.getH1().skontrolujCiElementalistiMajuMaxHp()) {
                this.centerB.setEnabled(false);
            }
            this.kontrola();
        }
        if (e.getSource() == this.shopBhp) {
            this.hrac = new PriebehHry();
            this.hrac.getH1().pridajJedenElixir(this.hrac.getZdravia());
            this.hrac.getZdravia().vypis();
            if (this.hrac.getZdravia().getMnozstvo() >= this.hrac.getZdravia().dajKapacitu()) {
                this.shopBhp.setEnabled(false);
            }
            this.kontrola();
        }
        if (e.getSource() == this.shopBst) {
            this.hrac = new PriebehHry();
            this.hrac.getH1().pridajJedenElixir(this.hrac.getStatov());
            this.hrac.getStatov().vypis();
            if (this.hrac.getStatov().getMnozstvo() >= this.hrac.getStatov().dajKapacitu()) {
                this.shopBst.setEnabled(false);
            }
            this.kontrola();
        }
        if (e.getSource() == this.wind) {
            this.nastav.setVisible(false);
            this.zaciatocnik = new Elementalista("Pegas", Element.VZDUCH);
            this.myFrame();
        }
        if (e.getSource() == this.earth) {
            this.nastav.setVisible(false);
            this.zaciatocnik = new Elementalista("Golem", Element.ZEM);
            this.myFrame();
        }
        if (e.getSource() == this.water) {
            this.nastav.setVisible(false);
            this.zaciatocnik = new Elementalista("Vodny Drak", Element.VODA);
            this.myFrame();
        }
        if (e.getSource() == this.fire) {
            this.nastav.setVisible(false);
            this.zaciatocnik = new Elementalista("Zijuci Plamen", Element.OHEN);
            this.myFrame();
        }
        if (e.getSource() == this.infoF) {
            this.hrac = new PriebehHry();
            this.infFrame.setVisible(true);
            this.infoF.setEnabled(false);
            this.kontrola();
        }
        if (e.getSource() == this.vratitSa) {
            this.infFrame.setVisible(false);
            this.infoF.setEnabled(true);
        }
        if (e.getSource() == this.wildB) {
            this.battleFrame();
            this.bFrame.setVisible(true);
            this.frame.setVisible(false);
            //this.kontrola();
        }
        if (e.getSource() == this.vyber1) {
            this.vybrany = this.hrac.getH1().getElementalistu(0);
            this.utok2.setBackground(this.zvolFarbuUtoku());
            this.utok2.setText(this.zvolMenoUtoku());
            this.bojElem1.setIcon(this.zvolIconVyber1());
            this.popisElem1.setText(this.dajPopisElem1());
            this.bFrame.remove(this.vyber1);
            this.bFrame.remove(this.vyber2);
            this.bFrame.remove(this.vyber3);
            this.bFrame.remove(this.nezmenit);

            this.bFrame.add(this.utok1);
            this.bFrame.add(this.utok2);
            this.bFrame.add(this.elixirZd);
            this.bFrame.add(this.elixirSt);
            this.bFrame.add(this.vymena);
            this.bFrame.add(this.utiect);
            this.bFrame.add(this.bojElem1);
            this.bFrame.add(this.bojElem2);
            this.bFrame.add(this.stupienok1);
            this.bFrame.add(this.stupienok2);
            this.bFrame.add(this.popisElem1);
            this.bFrame.add(this.popisElem2);

            this.kontrola();

        }
        if (e.getSource() == this.vyber2) {
            this.vybrany = this.hrac.getH1().getElementalistu(1);
            this.utok2.setBackground(this.zvolFarbuUtoku());
            this.utok2.setText(this.zvolMenoUtoku());
            this.bojElem1.setIcon(this.zvolIconVyber2());
            this.popisElem1.setText(this.dajPopisElem1());
            this.bFrame.remove(this.vyber1);
            this.bFrame.remove(this.vyber2);
            this.bFrame.remove(this.vyber3);
            this.bFrame.remove(this.nezmenit);

            this.bFrame.add(this.utok1);
            this.bFrame.add(this.utok2);
            this.bFrame.add(this.elixirZd);
            this.bFrame.add(this.elixirSt);
            this.bFrame.add(this.vymena);
            this.bFrame.add(this.utiect);
            this.bFrame.add(this.bojElem1);
            this.bFrame.add(this.bojElem2);
            this.bFrame.add(this.stupienok1);
            this.bFrame.add(this.stupienok2);
            this.bFrame.add(this.popisElem1);
            this.bFrame.add(this.popisElem2);

            this.kontrola();

        }
        if (e.getSource() == this.vyber3) {
            this.vybrany = this.hrac.getH1().getElementalistu(2);
            this.utok2.setBackground(this.zvolFarbuUtoku());
            this.utok2.setText(this.zvolMenoUtoku());
            this.bojElem1.setIcon(this.zvolIconVyber3());
            this.popisElem1.setText(this.dajPopisElem1());
            this.bFrame.remove(this.vyber1);
            this.bFrame.remove(this.vyber2);
            this.bFrame.remove(this.vyber3);
            this.bFrame.remove(this.nezmenit);

            this.bFrame.add(this.utok1);
            this.bFrame.add(this.utok2);
            this.bFrame.add(this.elixirZd);
            this.bFrame.add(this.elixirSt);
            this.bFrame.add(this.vymena);
            this.bFrame.add(this.utiect);
            this.bFrame.add(this.bojElem1);
            this.bFrame.add(this.bojElem2);
            this.bFrame.add(this.stupienok1);
            this.bFrame.add(this.stupienok2);
            this.bFrame.add(this.popisElem1);
            this.bFrame.add(this.popisElem2);

            this.kontrola();

        }
        if (e.getSource() == this.utiect) {
            this.setBasicStaty();
            this.bFrame.setVisible(false);
            this.frame.setVisible(true);
            this.kontrola();
            this.vOponent = null;
            this.vybrany = null;
        }
        if (e.getSource() == this.vymena) {
            this.bFrame.add(this.nezmenit);
            this.bFrame.add(this.vyber1);
            this.bFrame.add(this.vyber2);
            this.bFrame.add(this.vyber3);
            this.bFrame.add(this.bojElem2);
            this.bFrame.add(this.popisElem2);
            this.bFrame.add(this.stupienok1);
            this.bFrame.add(this.stupienok2);

            this.bFrame.remove(this.utok1);
            this.bFrame.remove(this.utok2);
            this.bFrame.remove(this.elixirZd);
            this.bFrame.remove(this.elixirSt);
            this.bFrame.remove(this.vymena);
            this.bFrame.remove(this.utiect);
            this.bFrame.remove(this.bojElem1);
            this.bFrame.remove(this.popisElem1);

            this.kontrola();
        }
        if (e.getSource() == this.nezmenit) {
            this.bFrame.remove(this.vyber1);
            this.bFrame.remove(this.vyber2);
            this.bFrame.remove(this.vyber3);
            this.bFrame.remove(this.nezmenit);

            this.bFrame.add(this.utok1);
            this.bFrame.add(this.utok2);
            this.bFrame.add(this.elixirZd);
            this.bFrame.add(this.elixirSt);
            this.bFrame.add(this.vymena);
            this.bFrame.add(this.utiect);
            this.bFrame.add(this.bojElem1);
            this.bFrame.add(this.bojElem2);
            this.bFrame.add(this.stupienok1);
            this.bFrame.add(this.stupienok2);
            this.bFrame.add(this.popisElem1);
            this.bFrame.add(this.popisElem2);

            this.kontrola();
        }
        if (e.getSource() == this.utok1) {
            int silaUtok1 = 0;
            int silaUtok2 = this.utokProtivnika();
            int ktoZacina;
            if (this.vybrany.getPresnost() >= this.presnostRandom()) {
                if (this.vybrany.getSilu() - this.vOponent.getObranu() <= 0) {
                    silaUtok1 = 1;
                } else {
                    silaUtok1 = this.vybrany.getSilu() - this.vOponent.getObranu();
                }
            }
            ktoZacina = this.ktoPrvy();
            if (ktoZacina == 1) {
                if (this.vybrany.getZivot() > 0) {
                    this.vOponent.setAktualnyZivot(this.vOponent.getZivot() - silaUtok1);
                }
                if (this.vOponent.getZivot() <= 0) {
                    this.vOponent.setAktualnyZivot(0);
                }
                if (this.vOponent.getZivot() > 0) {
                    this.vybrany.setAktualnyZivot(this.vybrany.getZivot() - silaUtok2);
                    if (this.vybrany.getZivot() <= 0) {
                        this.vybrany.setAktualnyZivot(0);
                    }
                }
            } else {
                if (this.vOponent.getZivot() > 0) {
                    this.vybrany.setAktualnyZivot(this.vybrany.getZivot() - silaUtok2);
                }
                if (this.vybrany.getZivot() <= 0) {
                    this.vybrany.setAktualnyZivot(0);
                }
                if (this.vybrany.getZivot() > 0) {
                    this.vOponent.setAktualnyZivot(this.vOponent.getZivot() - silaUtok1);
                    if (this.vOponent.getZivot() <= 0) {
                        this.vOponent.setAktualnyZivot(0);
                    }
                }
            }
            System.out.println("*********");
            System.out.println(silaUtok1);
            System.out.println(silaUtok2);
            System.out.println(this.vOponent.getZivot());
            System.out.println(this.vybrany.getZivot());
            System.out.println("*********");
            //this.kontrola();
            this.spravPopisElem1();
            this.spravPopisElem2();
            this.kontrola();
        }
        if (e.getSource() == this.utok2) {
            int silaUtok1 = 0;
            int silaUtok2 = this.utokProtivnika();
            int ktoZacina;
            if (this.vybrany.getPresnost() >= this.presnostRandom()) {
                if (this.vybrany.getSilu() - this.vOponent.getObranu() <= 0) {
                    silaUtok1 = 1;
                } else {
                    silaUtok1 = this.vybrany.getSilu() - this.vOponent.getObranu();
                }
            }
            if ((this.vybrany.getTypElementu().equals(Element.OHEN) && this.vOponent.getTypElementu().equals(Element.VZDUCH))
                    || (this.vybrany.getTypElementu().equals(Element.VODA) && this.vOponent.getTypElementu().equals(Element.OHEN))
                    || (this.vybrany.getTypElementu().equals(Element.ZEM) && this.vOponent.getTypElementu().equals(Element.VODA))
                    || (this.vybrany.getTypElementu().equals(Element.VZDUCH) && this.vOponent.getTypElementu().equals(Element.ZEM))) {
                silaUtok1 = silaUtok1 * 2;
            }
            if ((this.vybrany.getTypElementu().equals(Element.VZDUCH) && this.vOponent.getTypElementu().equals(Element.OHEN))
                    || (this.vybrany.getTypElementu().equals(Element.OHEN) && this.vOponent.getTypElementu().equals(Element.VODA))
                    || (this.vybrany.getTypElementu().equals(Element.VODA) && this.vOponent.getTypElementu().equals(Element.ZEM))
                    || (this.vybrany.getTypElementu().equals(Element.ZEM) && this.vOponent.getTypElementu().equals(Element.VZDUCH))) {
                silaUtok1 = silaUtok1 / 2;
            }
            ktoZacina = this.ktoPrvy();
            if (ktoZacina == 1) {
                if (this.vybrany.getZivot() > 0) {
                    this.vOponent.setAktualnyZivot(this.vOponent.getZivot() - silaUtok1);
                }
                if (this.vOponent.getZivot() <= 0) {
                    this.vOponent.setAktualnyZivot(0);
                } else {
                    this.vybrany.setAktualnyZivot(this.vybrany.getZivot() - silaUtok2);
                    if (this.vybrany.getZivot() <= 0) {
                        this.vybrany.setAktualnyZivot(0);
                    }
                }
            } else {
                if (this.vOponent.getZivot() > 0) {
                    this.vybrany.setAktualnyZivot(this.vybrany.getZivot() - silaUtok2);
                }
                if (this.vybrany.getZivot() <= 0) {
                    this.vybrany.setAktualnyZivot(0);
                } else {
                    this.vOponent.setAktualnyZivot(this.vOponent.getZivot() - silaUtok1);
                    if (this.vOponent.getZivot() <= 0) {
                        this.vOponent.setAktualnyZivot(0);
                    }
                }
            }
            System.out.println("*********");
            System.out.println(silaUtok1);
            System.out.println(silaUtok2);
            System.out.println(this.vOponent.getZivot());
            System.out.println(this.vybrany.getZivot());
            System.out.println("*********");
            this.spravPopisElem1();
            this.spravPopisElem2();
            this.kontrola();
        }
        if (e.getSource() == this.elixirZd) {
            this.vybrany.setAktualnyZivot(this.vybrany.getMaxZivot());
            this.hrac.getZdravia().pouziElixir();
            this.elixirZd.setText("Elixir Zdravia " + this.hrac.getZdravia().dajKapacitu() + "/" + this.hrac.getZdravia().getMnozstvo());
            int silaUtok2 = this.utokProtivnika();
            if (this.vOponent.getZivot() > 0) {
                this.vybrany.setAktualnyZivot(this.vybrany.getZivot() - silaUtok2);
            }
            if (this.vybrany.getZivot() <= 0) {
                this.vybrany.setAktualnyZivot(0);
            }
            this.spravPopisElem1();
            this.spravPopisElem2();
            this.kontrola();
        }
        if (e.getSource() == this.elixirSt) {
            System.out.println(this.vybrany.getSilu());
            this.vybrany.setSiluPocasBoja(this.vybrany.getSilu() + 3);
            this.vybrany.setObranuPocasBoja(this.vybrany.getObranu() + 3);
            this.vybrany.setRychlostPocasBoja(this.vybrany.getRychlost() + 3);
            this.vybrany.setPresnostPocasBoja(this.vybrany.getPresnost() + 3);
            System.out.println(this.vybrany.getSilu());
            this.hrac.getStatov().pouziElixir();
            this.elixirSt.setText("Elixir Statov " + this.hrac.getStatov().dajKapacitu() + "/" + this.hrac.getStatov().getMnozstvo());
            int silaUtok2 = this.utokProtivnika();
            if (this.vOponent.getZivot() > 0) {
                this.vybrany.setAktualnyZivot(this.vybrany.getZivot() - silaUtok2);
            }
            if (this.vybrany.getZivot() <= 0) {
                this.vybrany.setAktualnyZivot(0);
            }
            this.spravPopisElem1();
            this.spravPopisElem2();
            this.kontrola();
        }
        if (e.getSource() == this.ponechat) {
            this.setBasicStaty();
            this.bFrame.setVisible(false);
            this.vOponent = null;
            this.vybrany = null;
            this.frame.setVisible(true);
            this.kontrola();
        }
        if (e.getSource() == this.prevziat1) {
            this.setBasicStaty();
            this.hrac.getH1().odoberElementalistu(this.hrac.getH1().getElementalistu(0));
            this.hrac.getH1().pridajElementalistu(this.vOponent);
            this.vOponent = null;
            this.vybrany = null;
            this.bFrame.setVisible(false);
            this.frame.setVisible(true);
            this.kontrola();
        }
        if (e.getSource() == this.prevziat2) {
            this.setBasicStaty();
            this.hrac.getH1().odoberElementalistu(this.hrac.getH1().getElementalistu(1));
            this.hrac.getH1().pridajElementalistu(this.vOponent);
            this.vOponent = null;
            this.vybrany = null;
            this.bFrame.setVisible(false);
            this.frame.setVisible(true);
            this.kontrola();
        }
        if (e.getSource() == this.prevziat) {
            this.setBasicStaty();
            if (this.getPomElem() == -1 && this.hrac.getH1().dajKolkoMaElementalistov() < 3) {
                this.hrac.getH1().pridajElementalistu(this.vOponent);
            } else if (this.getPomElem() == -1 && this.hrac.getH1().dajKolkoMaElementalistov() > 2) {
                this.hrac.getH1().odoberElementalistu(this.hrac.getH1().getElementalistu(2));
                this.hrac.getH1().pridajElementalistu(this.vOponent);
            } else {
                this.hrac.getH1().odoberElementalistu(this.hrac.getH1().getElementalistu(this.getPomElem()));
                this.hrac.getH1().pridajElementalistu(this.vOponent);
            }
            this.vOponent = null;
            this.vybrany = null;
            this.bFrame.setVisible(false);
            this.frame.setVisible(true);
            this.kontrola();
        }
    }

    public void kontrola() {
        if (this.hrac.getZdravia().getMnozstvo() < this.hrac.getZdravia().dajKapacitu()) {
            this.shopBhp.setEnabled(true);
        }
        if (this.hrac.getStatov().getMnozstvo() < this.hrac.getStatov().dajKapacitu()) {
            this.shopBst.setEnabled(true);
        }
        this.centerB.setEnabled(!this.hrac.getH1().skontrolujCiElementalistiMajuMaxHp());
        if (this.vybrany != null) {
            int pocetMrtvych = 0;
            if (this.hrac.getH1().dajKolkoMaElementalistov() > 0) {
                this.vyber1.setEnabled(!this.vybrany.getMeno().equals(this.hrac.getH1().getElementalistu(0).getMeno()));
            }
            if (this.hrac.getH1().dajKolkoMaElementalistov() > 1) {
                this.vyber2.setEnabled(!this.vybrany.getMeno().equals(this.hrac.getH1().getElementalistu(1).getMeno()));
            }
            if (this.hrac.getH1().dajKolkoMaElementalistov() > 2) {
                this.vyber3.setEnabled(!this.vybrany.getMeno().equals(this.hrac.getH1().getElementalistu(2).getMeno()));
            }
            for (int i = 0; i < this.hrac.getH1().dajKolkoMaElementalistov(); i++) {
                if (this.hrac.getH1().getElementalistu(i).getZivot() == 0) {
                    pocetMrtvych++;
                }
            }
            if (this.vybrany.getZivot() == 0) {
                this.bFrame.add(this.vyber1);
                this.bFrame.add(this.vyber2);
                this.bFrame.add(this.vyber3);
                this.bFrame.add(this.bojElem2);
                this.bFrame.add(this.popisElem2);
                this.bFrame.add(this.stupienok1);
                this.bFrame.add(this.stupienok2);

                this.bFrame.remove(this.utok1);
                this.bFrame.remove(this.utok2);
                this.bFrame.remove(this.elixirZd);
                this.bFrame.remove(this.elixirSt);
                this.bFrame.remove(this.vymena);
                this.bFrame.remove(this.utiect);
                this.bFrame.remove(this.bojElem1);
                this.bFrame.remove(this.popisElem1);
            }
            if (pocetMrtvych == this.hrac.getH1().dajKolkoMaElementalistov()) {
                this.setBasicStaty();
                this.bFrame.setVisible(false);
                this.frame.setVisible(true);
                this.vOponent = null;
                this.vybrany = null;
            }
        }
        if (this.vOponent != null) {
            if (this.vOponent.getZivot() == 0) {
                this.setBasicStaty();
                this.bFrame.remove(this.utok1);
                this.bFrame.remove(this.utok2);
                this.bFrame.remove(this.elixirZd);
                this.bFrame.remove(this.elixirSt);
                this.bFrame.remove(this.vymena);
                this.bFrame.remove(this.utiect);
                this.bFrame.remove(this.bojElem1);
                this.bFrame.remove(this.popisElem1);
                this.bFrame.remove(this.bojElem2);
                this.bFrame.remove(this.popisElem2);
                this.labelPrevziatia();
                this.bFrame.add(this.stupienok1);
                this.bFrame.add(this.stupienok2);

            }
        }
        if (this.vybrany != null) {
            if (this.vybrany.getZivot() == this.vybrany.getMaxZivot()) {
                this.elixirZd.setEnabled(false);
            } else {
                this.elixirZd.setEnabled(this.hrac.getZdravia().getMnozstvo() > 0);
            }
            this.elixirSt.setEnabled(this.hrac.getStatov().getMnozstvo() > 0);
        }
        this.infoPopisuElem();
        this.reSizeInfoFreame();
        this.spravPopisHraca();
        this.infFrame.revalidate();
        this.infFrame.repaint();
        this.frame.revalidate();
        this.frame.repaint();
        if (this.bFrame != null) {
            this.bFrame.revalidate();
            this.bFrame.repaint();
        }
    }

    public void infoPopisuElem() {
        this.elem1.setText(this.hrac.getH1().getElementalistu(0).dajElementalistu());
        if (this.hrac.getH1().getElementalistu(0).getTypElementu() == Element.OHEN) {
            this.elem1.setIcon(this.elemfire);
        } else if (this.hrac.getH1().getElementalistu(0).getTypElementu() == Element.VODA) {
            this.elem1.setIcon(this.elemwater);
        } else if (this.hrac.getH1().getElementalistu(0).getTypElementu() == Element.ZEM) {
            this.elem1.setIcon(this.elemearth);
        } else if (this.hrac.getH1().getElementalistu(0).getTypElementu() == Element.VZDUCH) {
            this.elem1.setIcon(this.elemwind);
        }
        this.elem1.setBounds(0, 0, 250, 450);
        this.elem1.setVerticalAlignment(JLabel.TOP);
        this.elem1.setHorizontalAlignment(JLabel.CENTER);
        this.elem1.setHorizontalTextPosition(JLabel.CENTER);
        this.elem1.setVerticalTextPosition(JLabel.BOTTOM);

        if (this.hrac.getH1().dajKolkoMaElementalistov() > 1) {
            this.elem2.setText(this.hrac.getH1().getElementalistu(1).dajElementalistu());
            if (this.hrac.getH1().getElementalistu(1).getTypElementu() == Element.OHEN) {
                this.elem2.setIcon(this.elemfire);
            } else if (this.hrac.getH1().getElementalistu(1).getTypElementu() == Element.VODA) {
                this.elem2.setIcon(this.elemwater);
            } else if (this.hrac.getH1().getElementalistu(1).getTypElementu() == Element.ZEM) {
                this.elem2.setIcon(this.elemearth);
            } else if (this.hrac.getH1().getElementalistu(1).getTypElementu() == Element.VZDUCH) {
                this.elem2.setIcon(this.elemwind);
            }
        }
        this.elem2.setBounds(250, 0, 250, 450);
        this.elem2.setVerticalAlignment(JLabel.TOP);
        this.elem2.setHorizontalAlignment(JLabel.CENTER);
        this.elem2.setHorizontalTextPosition(JLabel.CENTER);
        this.elem2.setVerticalTextPosition(JLabel.BOTTOM);

        if (this.hrac.getH1().dajKolkoMaElementalistov() > 2) {
            this.elem3.setText(this.hrac.getH1().getElementalistu(2).dajElementalistu());
            if (this.hrac.getH1().getElementalistu(2).getTypElementu() == Element.OHEN) {
                this.elem3.setIcon(this.elemfire);
            } else if (this.hrac.getH1().getElementalistu(2).getTypElementu() == Element.VODA) {
                this.elem3.setIcon(this.elemwater);
            } else if (this.hrac.getH1().getElementalistu(2).getTypElementu() == Element.ZEM) {
                this.elem3.setIcon(this.elemearth);
            } else if (this.hrac.getH1().getElementalistu(2).getTypElementu() == Element.VZDUCH) {
                this.elem3.setIcon(this.elemwind);
            }
        }
        this.elem3.setBounds(500, 0, 250, 450);
        this.elem3.setVerticalAlignment(JLabel.TOP);
        this.elem3.setHorizontalAlignment(JLabel.CENTER);
        this.elem3.setHorizontalTextPosition(JLabel.CENTER);
        this.elem3.setVerticalTextPosition(JLabel.BOTTOM);
    }

    public String dajPopisHraca() {
        return "<html>Hrac: " + this.hrac.getH1().getMeno() + " <br/>" +
                "Elixir Zivota: " + this.hrac.getZdravia().dajKapacitu() + "/" + this.hrac.getZdravia().getMnozstvo() + " <br/>" +
                "Elixir Statov: " + this.hrac.getStatov().dajKapacitu() + "/" + this.hrac.getStatov().getMnozstvo() + " </html>";
    }

    public String dajPopisElem1() {
        StringBuilder x = new StringBuilder("<html>" + this.vybrany.getMeno() + "<br/>" +
                "HP: ");
        int percento = 10;
        for (int i = 0; i < percento; i++) {
            if (this.vybrany.getZivot() > ((this.vybrany.getMaxZivot() * percento * i) / 100)) {
                x.append("[+]");
            } else {
                x.append("[-]");
            }
        }
        x.append(" ").append(this.vybrany.getMaxZivot()).append("/").append(this.vybrany.getZivot()).append("</html>");
        return x.toString();
    }

    public String dajPopisElem2() {
        StringBuilder x = new StringBuilder("<html>" + this.vOponent.getMeno() + "<br/>" +
                "HP: ");
        int percento = 10;
        for (int i = 0; i < percento; i++) {
            if (this.vOponent.getZivot() > ((this.vOponent.getMaxZivot() * percento * i) / 100)) {
                x.append("[+]");
            } else {
                x.append("[-]");
            }
        }
        x.append(" ").append(this.vOponent.getMaxZivot()).append("/").append(this.vOponent.getZivot()).append("</html>");
        return x.toString();
    }

    public void spravPopisHraca() {
        this.hracPopis.setText(this.dajPopisHraca());
    }

    public void spravPopisElem1() {
        this.popisElem1.setText(this.dajPopisElem1());
    }

    public void spravPopisElem2() {
        this.popisElem2.setText(this.dajPopisElem2());
    }

    public ImageIcon zvolIconOponenta() {
        ImageIcon x = null;
        if (this.vOponent.getTypElementu().equals(Element.OHEN)) {
            x = this.elemfire;
        } else if (this.vOponent.getTypElementu().equals(Element.VZDUCH)) {
            x = this.elemwind;
        } else if (this.vOponent.getTypElementu().equals(Element.VODA)) {
            x = this.elemwater;
        } else if (this.vOponent.getTypElementu().equals(Element.ZEM)) {
            x = this.elemearth;
        }
        return x;
    }

    public ImageIcon zvolIconVyber1() {
        ImageIcon x = null;
        if (this.hrac.getH1().getElementalistu(0).getTypElementu().equals(Element.OHEN)) {
            x = this.elemfire;
        } else if (this.hrac.getH1().getElementalistu(0).getTypElementu().equals(Element.VODA)) {
            x = this.elemwater;
        } else if (this.hrac.getH1().getElementalistu(0).getTypElementu().equals(Element.ZEM)) {
            x = this.elemearth;
        } else if (this.hrac.getH1().getElementalistu(0).getTypElementu().equals(Element.VZDUCH)) {
            x = this.elemwind;
        }
        return x;
    }

    public ImageIcon zvolIconVyber2() {
        ImageIcon x = null;
        if (this.hrac.getH1().getElementalistu(1).getTypElementu().equals(Element.OHEN)) {
            x = this.elemfire;
        } else if (this.hrac.getH1().getElementalistu(1).getTypElementu().equals(Element.VODA)) {
            x = this.elemwater;
        } else if (this.hrac.getH1().getElementalistu(1).getTypElementu().equals(Element.ZEM)) {
            x = this.elemearth;
        } else if (this.hrac.getH1().getElementalistu(1).getTypElementu().equals(Element.VZDUCH)) {
            x = this.elemwind;
        }
        return x;
    }

    public ImageIcon zvolIconVyber3() {
        ImageIcon x = null;
        if (this.hrac.getH1().getElementalistu(2).getTypElementu().equals(Element.OHEN)) {
            x = this.elemfire;
        } else if (this.hrac.getH1().getElementalistu(2).getTypElementu().equals(Element.VODA)) {
            x = this.elemwater;
        } else if (this.hrac.getH1().getElementalistu(2).getTypElementu().equals(Element.ZEM)) {
            x = this.elemearth;
        } else if (this.hrac.getH1().getElementalistu(2).getTypElementu().equals(Element.VZDUCH)) {
            x = this.elemwind;
        }
        return x;
    }

    public String zvolTextVyber1() {
        return this.hrac.getH1().getElementalistu(0).getMeno();
    }

    public String zvolTextVyber2() {
        return this.hrac.getH1().getElementalistu(1).getMeno();
    }

    public String zvolTextVyber3() {
        return this.hrac.getH1().getElementalistu(2).getMeno();
    }

    public Color setColor(ImageIcon icon) {
        Color x = Color.LIGHT_GRAY;
        if (icon.equals(this.elemfire)) {
            x = Color.red;
        } else if (icon.equals(this.elemearth)) {
            x = Color.ORANGE;
        } else if (icon.equals(this.elemwind)) {
            x = Color.GREEN;
        } else if (icon.equals(this.elemwater)) {
            x = Color.CYAN;
        }
        return x;
    }

    public String zvolMenoUtoku() {
        return this.vybrany.getUtok(1).getMeno();

    }

    public Color zvolFarbuUtoku() {
        Color x = null;
        if (this.vybrany.getUtok(1).getElement().equals(Element.OHEN)) {
            x = Color.red;
        } else if (this.vybrany.getUtok(1).getElement().equals(Element.ZEM)) {
            x = Color.orange;
        } else if (this.vybrany.getUtok(1).getElement().equals(Element.VODA)) {
            x = Color.CYAN;
        } else if (this.vybrany.getUtok(1).getElement().equals(Element.VZDUCH)) {
            x = Color.green;
        }
        return x;
    }

    public void reSizeInfoFreame() {
        if (this.hrac.getH1().dajKolkoMaElementalistov() == 1) {
            this.infFrame.setSize(250, 520);
        } else if (this.hrac.getH1().dajKolkoMaElementalistov() == 2) {
            this.infFrame.setSize(500, 520);
        } else {
            this.infFrame.setSize(750, 520);
        }

        if (this.hrac.getH1().dajKolkoMaElementalistov() == 1) {
            this.vratitSa.setBounds(70, 430, 150, 40);
        } else if (this.hrac.getH1().dajKolkoMaElementalistov() == 2) {
            this.vratitSa.setBounds(320, 430, 150, 40);
        } else {
            this.vratitSa.setBounds(570, 430, 150, 40);
        }
    }

    public Elementalista getOhnivy() {
        this.getZaciatocnik().ohnivyElementalista();
        return this.getZaciatocnik().getOhnivyElem();
    }

    public Elementalista getVodny() {
        this.getZaciatocnik().vodnyElementalista();
        return this.getZaciatocnik().getVodnyElem();
    }

    public Elementalista getZemny() {
        this.getZaciatocnik().zemnyElementalista();
        return this.getZaciatocnik().getZemnyElem();
    }

    public Elementalista getVeterny() {
        this.getZaciatocnik().veternyElementalista();
        return this.getZaciatocnik().getVeternyElem();
    }

    public int presnostRandom() {
        int presnost;
        Random pres = new Random();
        presnost = pres.nextInt(60 - 30) + 30;
        return  presnost;
    }

    public int ktoPrvy() {
        int ktoPrvy = 0;
        if (this.vybrany.getRychlost() >= this.vOponent.getRychlost()) {
            ktoPrvy = 1;
        }
        return ktoPrvy;
    }

    public int utokProtivnika() {
        int silaUtoku = 0;
        if (this.vOponent.getPresnost() >= this.presnostRandom()) {
            if (this.vOponent.getSilu() - this.vybrany.getObranu() <= 0) {
                silaUtoku = 1;
            } else {
                silaUtoku = this.vOponent.getSilu() - this.vybrany.getObranu();
            }
        }
        if ((this.vOponent.getTypElementu().equals(Element.OHEN) && this.vybrany.getTypElementu().equals(Element.VZDUCH))
            || (this.vOponent.getTypElementu().equals(Element.VODA) && this.vybrany.getTypElementu().equals(Element.OHEN))
            || (this.vOponent.getTypElementu().equals(Element.ZEM) && this.vybrany.getTypElementu().equals(Element.VODA))
            || (this.vOponent.getTypElementu().equals(Element.VZDUCH) && this.vybrany.getTypElementu().equals(Element.ZEM))) {
            silaUtoku = silaUtoku * 2;
        }
        return silaUtoku;
    }

    public void setProtivnika() {
        int vyber;
        Random nahodne = new Random();
        vyber = nahodne.nextInt(5 - 1) + 1;
        if (vyber == 1) {
            this.vOponent = this.getOhnivy();
        } else if (vyber == 2) {
            this.vOponent = this.getVodny();
        } else if (vyber == 3) {
            this.vOponent = this.getZemny();
        } else {
            this.vOponent = this.getVeterny();
        }
    }

    public void setBasicStaty() {
        for (int i = 0; i < this.hrac.getH1().dajKolkoMaElementalistov(); i++) {
            this.hrac.getH1().getElementalistu(i).setSiluPocasBoja(this.hrac.getH1().getElementalistu(i).getBasicSila());
            this.hrac.getH1().getElementalistu(i).setObranuPocasBoja(this.hrac.getH1().getElementalistu(i).getBasicObrana());
            this.hrac.getH1().getElementalistu(i).setRychlostPocasBoja(this.hrac.getH1().getElementalistu(i).getBasicRychlost());
            this.hrac.getH1().getElementalistu(i).setPresnostPocasBoja(this.hrac.getH1().getElementalistu(i).getBasicPresnost());
        }
    }

    public int getPomElem() {
        int pomElem = -1;
        for (int i = 0; i < this.hrac.getH1().dajKolkoMaElementalistov(); i++) {
            if (this.vOponent.getTypElementu().equals(this.hrac.getH1().getElementalistu(i).getTypElementu())) {
                pomElem = i;
            }
        }
        return pomElem;
    }

    public void labelPrevziatia() {
        boolean pom = false;
        if (this.getPomElem() != -1) {
            pom = true;
        }

        System.out.println(this.getPomElem());
        this.prevzatie.setText(this.vOponent.dajElementalistu());
        this.prevzatie.setIcon(this.zvolIconOponenta());
        if (!pom && this.hrac.getH1().dajKolkoMaElementalistov() < 3) {
            this.prevzatie.setBounds(385, 120, 250, 450);
            this.prevzatie.setOpaque(true);
            this.prevzatie.setBackground(Color.pink);
            this.prevziat.setBounds(460, 535, 100, 25);
            this.vyPrevzatie.setText("");
            this.vyPrevzatie.setIcon(null);
            this.vyPrevzatie.setOpaque(false);
            this.bFrame.add(this.prevziat);
            this.bFrame.add(this.prevzatie);
        } else if (!pom && this.hrac.getH1().dajKolkoMaElementalistov() > 2) {
            this.prevzatie1.setBounds(5, 120, 250, 450);
            this.prevzatie1.setOpaque(true);
            this.prevzatie1.setBackground(Color.pink);
            this.prevzatie1.setText(this.hrac.getH1().getElementalistu(0).dajElementalistu());
            this.prevzatie1.setIcon(this.zvolIconVyber1());
            this.prevzatie2.setBounds(255, 120, 250, 450);
            this.prevzatie2.setOpaque(true);
            this.prevzatie2.setBackground(Color.pink);
            this.prevzatie2.setText(this.hrac.getH1().getElementalistu(1).dajElementalistu());
            this.prevzatie2.setIcon(this.zvolIconVyber2());
            this.vyPrevzatie.setBounds(505, 120, 250, 450);
            this.vyPrevzatie.setOpaque(true);
            this.vyPrevzatie.setBackground(Color.pink);
            this.vyPrevzatie.setText(this.hrac.getH1().getElementalistu(2).dajElementalistu());
            this.vyPrevzatie.setIcon(this.zvolIconVyber3());
            this.prevzatie.setBounds(755, 120, 250, 450);
            this.prevzatie.setOpaque(true);
            this.prevzatie.setBackground(Color.pink);
            this.prevziat1.setBounds(80, 535, 100, 25);
            this.prevziat1.setText("Vymenit");
            this.prevziat2.setBounds(330, 535, 100, 25);
            this.prevziat2.setText("Vymenit");
            this.prevziat.setBounds(580, 535, 100, 25);
            this.prevziat.setText("Vymenit");
            this.ponechat.setBounds(830, 535, 100, 25);
            this.ponechat.setText("Nevymenit");
            this.bFrame.add(this.prevziat);
            this.bFrame.add(this.prevziat1);
            this.bFrame.add(this.prevziat2);
            this.bFrame.add(this.ponechat);
            this.bFrame.add(this.prevzatie);
            this.bFrame.add(this.prevzatie1);
            this.bFrame.add(this.prevzatie2);
            this.bFrame.add(this.vyPrevzatie);

        } else {
            this.prevzatie.setBounds(260, 120, 250, 450);
            this.prevzatie.setOpaque(true);
            this.prevzatie.setBackground(Color.pink);
            this.vyPrevzatie.setText(this.hrac.getH1().getElementalistu(this.getPomElem()).dajElementalistu());
            this.vyPrevzatie.setIcon(this.zvolIconOponenta());
            this.vyPrevzatie.setBounds(510, 120, 250, 450);
            this.vyPrevzatie.setOpaque(true);
            this.vyPrevzatie.setBackground(Color.pink);
            this.prevziat.setBounds(335, 535, 100, 25);
            this.ponechat.setBounds(585, 535, 100, 25);
            this.bFrame.add(this.ponechat);
            this.bFrame.add(this.prevziat);
            this.bFrame.add(this.prevzatie);
            this.bFrame.add(this.vyPrevzatie);
        }
    }

}

