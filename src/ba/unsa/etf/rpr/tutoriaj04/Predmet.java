package ba.unsa.etf.rpr.tutoriaj04;

import java.util.ArrayList;
import java.util.List;

public class Predmet {
    private String naziv;
    private String sifra;
    private Integer ECTSBodovi;
    private List<Student> studenti;

    public Predmet(String naziv, String sifra, Integer ECTSBodovi) {
        this.naziv = naziv;
        this.sifra = sifra;
        this.ECTSBodovi = ECTSBodovi;
        studenti = new ArrayList<>();
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

    List<Student> dajStudente() {
        return null;
    }

    void upisiStudenta(Student student) {
    }

    void ispisiStudenta(Student student) {
    }
}
