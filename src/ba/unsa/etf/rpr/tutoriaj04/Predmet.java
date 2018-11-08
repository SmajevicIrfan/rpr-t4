package ba.unsa.etf.rpr.tutoriaj04;

import java.util.ArrayList;
import java.util.List;

public class Predmet {
    private String naziv;
    private String sifra;
    private Integer ECTSBodovi;
    private boolean obaveznost;

    public Predmet(String naziv, String sifra, Integer ECTSBodovi, boolean obaveznost) {
        this.naziv = naziv;
        this.sifra = sifra;
        this.ECTSBodovi = ECTSBodovi;
        this.obaveznost = obaveznost;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public Integer getECTSBodovi() {
        return ECTSBodovi;
    }

    public void setECTSBodovi(Integer ECTSBodovi) {
        this.ECTSBodovi = ECTSBodovi;
    }

    public boolean isObavezan() {
        return obaveznost;
    }

    public void setObaveznost(boolean obaveznost) {
        this.obaveznost = obaveznost;
    }
}
