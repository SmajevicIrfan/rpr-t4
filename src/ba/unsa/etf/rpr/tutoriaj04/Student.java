package ba.unsa.etf.rpr.tutoriaj04;

public class Student {
    private String ime;
    private String prezime;
    private String brojIndexa;

    public Student(String ime, String prezime, String brojIndexa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndexa = brojIndexa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }
}
