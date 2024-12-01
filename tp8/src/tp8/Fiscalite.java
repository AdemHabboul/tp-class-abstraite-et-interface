package tp8;


public class Fiscalite {

    public static void main(String[] args) {
        Personne p1 = new Personne(11111111, "miled", "Omar");
        Personne p2 = new Personne(22222222, "HBL", "adem");
        Personne p3 = new Personne(33333333, "Khayati", "Mohamed");

        Lotissement lotissement = new Lotissement(10);

        Propriete propriete1 = new ProprietePrivee(1, p1, "Nabeul", 350, 4);
        Propriete propriete2 = new Villa(2, p2, "Jendouba", 400, 6, true);
        Propriete propriete3 = new Appartement(3, p2, "Hammamet", 1200, 8, 3);
        Propriete propriete4 = new ProprieteProfessionnelle(4, p3, "Korba", 1000, 50, true);
        Propriete propriete5 = new ProprieteProfessionnelle(5, p1, "Bir Bouragba", 2500, 400, false);

        lotissement.ajouter(propriete1);
        lotissement.ajouter(propriete2);
        lotissement.ajouter(propriete3);
        lotissement.ajouter(propriete4);
        lotissement.ajouter(propriete5);

        System.out.println("Liste des propriétés dans le lotissement :");
        lotissement.afficherProprietes();
        
        for (int i = 0; i < lotissement.nombre; i++) {
            Propriete prop = lotissement.getProprieteByIndex(i);
            System.out.println("Impôts à payer pour la propriété " + prop.getId() + " : " + prop.calculImpot() + " DT");
        }

        int nombreTotalPieces = lotissement.getNbPieces();
        System.out.println("Nombre total de pièces dans les propriétés privées : " + nombreTotalPieces);

        ProprietePrivee proprieteMoinsImpot = null;
        double impotMin = 0;

        for (Propriete prop : lotissement.tabProp) {
            if (prop instanceof ProprietePrivee) {
                double impot = prop.calculImpot();
                if (proprieteMoinsImpot == null || impot < impotMin) {
                    proprieteMoinsImpot = (ProprietePrivee) prop;
                    impotMin = impot;
                }
            }
        }



        if (proprieteMoinsImpot != null) {
            System.out.println("Propriétaire de la propriété privée avec le moins d'impôts : " + proprieteMoinsImpot.getResponsable().getNom() + " " + proprieteMoinsImpot.getResponsable().getPrenom());
            System.out.println("Montant des impôts : " + impotMin + " DT");
        }

        lotissement.supprimer(propriete3);
        System.out.println("Liste des propriétés après suppression de l'appartement de Hammamet :");
        lotissement.afficherProprietes();
    }
}
