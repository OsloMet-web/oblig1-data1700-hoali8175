package com.example.oblig1data1700hoali8175.oblig2;

public class Billett {

    private String filmNavn;
    private int antallBilletter;
    private String kundeNavn;
    private String kundeEtternavn;
    private String kundeNummer;
    private String kundeEmail;

    public Billett(String filmNavn, int antallBilletter, String kundeNavn,
                   String kundeEtternavn, String kundeNummer, String kundeEmail) {
        this.filmNavn = filmNavn;
        this.antallBilletter = antallBilletter;
        this.kundeNavn = kundeNavn;
        this.kundeEtternavn = kundeEtternavn;
        this.kundeNummer = kundeNummer;
        this.kundeEmail = kundeEmail;
    }
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


