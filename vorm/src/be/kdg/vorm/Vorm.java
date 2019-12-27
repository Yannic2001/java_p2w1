package be.kdg.vorm;

public abstract class Vorm {
    private String kleur;

    protected Vorm(String kleur) {
        this.kleur = kleur;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public abstract double oppervlakte();

    public abstract double volume();

}
