package com.example.oblig1data1700hoali8175.oblig2;

public class Billett {

    private String filmNavn;
    private int antallBilletter;
    private String kundeNavn;
    private String kundeEtternavn;
    private String kundeNummer;
    private String kundeEmail;

    // Konstruktør
    public Billett() {}

    // Getters og setters for alle feltene
    public String getFilmNavn() {
        return filmNavn;
    }

    public void setFilmNavn(String filmNavn) {
        this.filmNavn = filmNavn;
    }

    public int getAntallBilletter() {
        return antallBilletter;
    }

    public void setAntallBilletter(int antallBilletter) {
        this.antallBilletter = antallBilletter;
    }

    public String getKundeNavn() {
        return kundeNavn;
    }

    public void setKundeNavn(String kundeNavn) {
        this.kundeNavn = kundeNavn;
    }

    public String getKundeEtternavn() {
        return kundeEtternavn;
    }

    public void setKundeEtternavn(String kundeEtternavn) {
        this.kundeEtternavn = kundeEtternavn;
    }

    public String getKundeNummer() {
        return kundeNummer;
    }

    public void setKundeNummer(String kundeNummer) {
        this.kundeNummer = kundeNummer;
    }

    public String getKundeEmail() {
        return kundeEmail;
    }

    public void setKundeEmail(String kundeEmail) {
        this.kundeEmail = kundeEmail;
    }
}

