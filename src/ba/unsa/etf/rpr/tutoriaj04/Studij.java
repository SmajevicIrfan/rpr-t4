package ba.unsa.etf.rpr.tutoriaj04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Studij {
    private Map<Integer, Set<Predmet>> semestri;

    public Studij(int brojSemestara) {
        semestri = new HashMap<>();

        for (int i = 1; i <= brojSemestara; i++) {
            semestri.put(i, new HashSet<>());
        }
    }

    public void dodajPredmetNaSemestar(int semestar, Predmet predmet) {
        if (semestar < 1 || semestar > semestri.size()) {
            throw new IllegalArgumentException("Nepostojeci semestar");
        }

        semestri.get(semestar).add(predmet);
    }

    public void izbrisiPredmetSaSemestra(int semestar, Predmet predmetKojiSeBrise) {
        if (semestar < 1 || semestar > semestri.size()) {
            throw new IllegalArgumentException("Nepostojeci semestar");
        }

        for (Predmet predmet : semestri.get(semestar)) {
            if (predmet.equals(predmetKojiSeBrise)) {
                semestri.get(semestar).remove(predmet);
                return;
            }
        }

        throw new IllegalArgumentException("Nepostojeci predmet");
    }

    public Set<Predmet> dajPredmeteNaSemestru(int semestar) {
        if (semestar < 1 || semestar > semestri.size()) {
            throw new IllegalArgumentException("Nepostojeci semestar");
        }

        return semestri.get(semestar);
    }

    public Map<Integer, Set<Predmet>> dajSvePredmete() {
        return semestri;
    }
}
