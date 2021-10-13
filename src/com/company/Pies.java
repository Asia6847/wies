package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pies {
    int wysokosc; // wysokość psa
    String nazwa; // nazwa psa
    boolean czyNakarmiony;
    List<Kleszcz> kleszcze = new ArrayList<>();

    public Pies(int wysokosc, String nazwa, boolean czyNakarmiony) {
        this.wysokosc = wysokosc;
        this.nazwa = nazwa;
        this.czyNakarmiony = czyNakarmiony;
    }

    public Pies() {

    }

    public void nakarm() {
        this.czyNakarmiony = true;
    }

    public void idźDoLasu() {
        this.kleszcze.add(new Kleszcz());
    }

    public void odkleszcz() {
        if (this.kleszcze.size() > 500) {
            this.kleszcze.clear();
        }
    }
}