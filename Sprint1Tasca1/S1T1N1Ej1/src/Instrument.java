public abstract class Instrument {

   private String nom;
    private float preu;

    public Instrument(String nom, float preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public abstract void tocar();

    @Override
    public String toString() {
        return "Instrument{" +
                "nom='" + nom + '\'' +
                ", preu=" + preu +
                '}';
    }
}
