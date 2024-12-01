package tp8;

public class Villa extends ProprietePrivee {
    private boolean avecPiscine;

    public Villa(int id, Personne responsable, String adresse, double surface, int nbPieces, boolean avecPiscine) {
        super(id, responsable, adresse, surface, nbPieces);
        this.avecPiscine = avecPiscine;
    }

    public boolean isAvecPiscine() {
        return avecPiscine;
    }

    public void setAvecPiscine(boolean avecPiscine) {
        this.avecPiscine = avecPiscine;
    }

    public double calculImpot() {
        double impotBase = super.calculImpot();
        if (avecPiscine) {
            impotBase += 200;
        }
        return impotBase;
    }

   public String toString() {
        return super.toString() + ", avecPiscine=" + avecPiscine;
    }
}