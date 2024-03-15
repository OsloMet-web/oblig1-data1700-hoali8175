package webprog5;

public class Kunde2 {
    private String navn;
    private String adresse;

    public Kunde2(String navn, String adresse) {
        this.navn = navn;
        this.adresse = adresse;
    }

    public Kunde2() { }

    public String getNavn() { return navn; }

    public void setNavn(String navn) { this.navn = navn; }

    public String getAdresse() { return adresse; }

    public void setAdresse(String adresse) { this.adresse = adresse; }
}
