package webprog.model;

import webprog.exceptions.InvalidEvjarat;
import webprog.exceptions.InvalidRendszam;
import webprog.exceptions.InvalidSzinKod;

import java.time.LocalDate;
import java.util.Collection;

public class Kocsi {
    private int evjarat;
    private double hengerurtartalom;
    private String rendszam;
    private String marka;
    private String tipus;
    private Kivitel kivitel;
    private LocalDate muszaki_ervenyesseg;
    private Uzemanyag uzemanyag;
    private String szin_hexakod;
    private Szinezes szinezes;
    private int ajtok_szama;
    private Collection<Allapot> allapot;
    private int teljesitmeny;


    public int getEvjarat() {
        return evjarat;
    }

    public void setEvjarat(int evjarat) throws InvalidEvjarat {
        if (evjarat > LocalDate.now().getYear()) {
            throw new InvalidEvjarat(String.valueOf(evjarat));
        }
        this.evjarat = evjarat;
    }

    public double getHengerurtartalom() {
        return hengerurtartalom;
    }

    public void setHengerurtartalom(double hengerurtartalom) {
        this.hengerurtartalom = hengerurtartalom;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) throws InvalidRendszam {
        if(rendszam.matches("^[A-z]-\\d\\d\\d$")){
        this.rendszam = rendszam;}
        else{
            throw new InvalidRendszam(rendszam);
        }
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public Kivitel getKivitel() {
        return kivitel;
    }

    public void setKivitel(Kivitel kivitel) {
        this.kivitel = kivitel;
    }

    public LocalDate getMuszaki_ervenyesseg() {
        return muszaki_ervenyesseg;
    }

    public void setMuszaki_ervenyesseg(LocalDate muszaki_ervenyesseg) {
        this.muszaki_ervenyesseg = muszaki_ervenyesseg;
    }

    public Uzemanyag getUzemanyag() {
        return uzemanyag;
    }

    public void setUzemanyag(Uzemanyag uzemanyag) {
        this.uzemanyag = uzemanyag;
    }

    public String getSzin_hexakod() {
        return szin_hexakod;
    }

    public void setSzin_hexakod(String szin_hexakod) throws InvalidSzinKod {
        if(szin_hexakod.matches("^#([A-F]|[a-f]|\\d){6}$")){
            this.szin_hexakod = szin_hexakod;
        }
        else{
            throw new InvalidSzinKod();
        }

    }

    public Szinezes getSzinezes() {
        return szinezes;
    }

    public void setSzinezes(Szinezes szinezes) {
        this.szinezes = szinezes;
    }

    public int getAjtok_szama() {
        return ajtok_szama;
    }

    public void setAjtok_szama(int ajtok_szama) {
        this.ajtok_szama = ajtok_szama;
    }

    public Collection<Allapot> getAllapot() {
        return allapot;
    }

    public void setAllapot(Collection<Allapot> allapot) {
        this.allapot = allapot;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public void setTeljesitmeny(int teljesitmeny) {
        this.teljesitmeny = teljesitmeny;
    }

    public int loeroErteke() {
        return 0;
    }


    public Kocsi(int evjarat, double hengerurtartalom, String rendszam, String marka, String tipus, Kivitel kivitel, LocalDate muszaki_ervenyesseg, Uzemanyag uzemanyag, String szin_hexakod, Szinezes szinezes, int ajtok_szama, Collection<Allapot> allapot, int teljesitmeny) throws InvalidRendszam, InvalidSzinKod, InvalidEvjarat {
        setEvjarat(evjarat);
        this.hengerurtartalom = hengerurtartalom;
        setRendszam(rendszam);
        this.marka = marka;
        this.tipus = tipus;
        this.kivitel = kivitel;
        this.muszaki_ervenyesseg = muszaki_ervenyesseg;
        this.uzemanyag = uzemanyag;
        setSzin_hexakod(szin_hexakod);
        this.szinezes = szinezes;
        this.ajtok_szama = ajtok_szama;
        this.allapot = allapot;
        this.teljesitmeny = teljesitmeny;
    }
}
