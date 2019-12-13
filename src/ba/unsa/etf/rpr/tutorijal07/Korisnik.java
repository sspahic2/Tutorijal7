package ba.unsa.etf.rpr.tutorijal07;

public class Korisnik {
    private String ime, prezime, email,korisnickoIme,lozinka;

    Korisnik() {
        ime = "";
        prezime = "";
        email = "";
        korisnickoIme = "";
        lozinka = "";
    }

    Korisnik(String ime, String prezime, String email, String korisnickoIme, String lozinka) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getEmail() {
        return email;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    @Override
    public String toString() {
        return ime + ' ' + prezime;
    }
}
