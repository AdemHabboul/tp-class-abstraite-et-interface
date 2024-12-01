package tp8;

public class ProprieteProfessionnelle extends Propriete {
    private int nbEmployes;
    private boolean estEtatique;

    public ProprieteProfessionnelle(int id, Personne responsable, String adresse, double surface, int nbEmployes, boolean estEtatique) {
        super(id, responsable, adresse, surface);
        this.nbEmployes = nbEmployes;
        this.estEtatique = estEtatique;
    }

    public int getNbEmployes() {
        return nbEmployes;
    }

    public void setNbEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }

    public boolean isEstEtatique() {
        return estEtatique;
    }

    public void setEstEtatique(boolean estEtatique) {
        this.estEtatique = estEtatique;
    }

    
    public double calculImpot() {
        if (estEtatique) {
            return 0;
        } else {
            return (surface / 100) * 100 + (nbEmployes * 30);
        }
    }

    
    public String toString() {
        return super.toString() + ", nbEmployes=" + nbEmployes + ", estEtatique=" + estEtatique;
    }
}
