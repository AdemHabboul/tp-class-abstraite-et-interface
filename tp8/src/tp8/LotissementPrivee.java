package tp8;

public class LotissementPrivee extends Lotissement {

    public LotissementPrivee(int capacite) {
        super(capacite);
    }

    public boolean ajouter(Propriete p) {
        if (p instanceof ProprietePrivee && nombre < tabProp.length) {
            tabProp[nombre++] = p;
            return true;
        }
        return false;     }
    public ProprietePrivee getProprieteByIndex(int i) {
        if (i >= 0 && i < nombre && tabProp[i] instanceof ProprietePrivee) {
            return (ProprietePrivee) tabProp[i];
        }
        return null;
    }

    public int getNbPieces() {
        int totalPieces = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof ProprietePrivee) {
                totalPieces += ((ProprietePrivee) tabProp[i]).getNbPieces();
            }
        }
        return totalPieces;
    }
}

