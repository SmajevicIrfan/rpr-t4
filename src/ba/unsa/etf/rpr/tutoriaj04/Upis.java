package ba.unsa.etf.rpr.tutoriaj04;

public class Upis {
    private Student student;
    private Predmet predmet;
    private Studij studij;

    public Upis(Student student, Predmet predmet, Studij studij) {
        this.student = student;
        this.predmet = predmet;
        this.studij = studij;
    }

    public Student getStudent() {
        return student;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public Studij getStudij() {
        return studij;
    }

    public void setStudij(Studij studij) {
        this.studij = studij;
    }
}
