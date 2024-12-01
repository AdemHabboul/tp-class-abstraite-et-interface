package tp8;

public class ProprietePrivee extends Propriete {
    private int nbPieces;

    public ProprietePrivee(int id, Personne responsable, String adresse, double surface, int nbPieces) {
        super(id, responsable, adresse, surface);
        this.nbPieces = nbPieces;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }


    public double calculImpot() {

        return (surface / 100) * 50 + (nbPieces * 10);
    }

    public String toString() {
        return super.toString() + ", nbPieces=" + nbPieces;
    }
}

