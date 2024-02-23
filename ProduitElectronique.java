public class ProduitElectronique extends Produit {
    //------------------------------initialisation----------------------------------
    private String dureeGarantie;
    
    //------------------------------constructeur----------------------------------
    public ProduitElectronique(String nom, String description, int prix, String dureeGarantie) {
        super(nom, description, prix);
        this.dureeGarantie = dureeGarantie;
    }

    //Methode pour afficher les caracteristiques secondaire des produits
    public void afficher() {
        super.afficher();
        System.out.println(", Duree de garantie : " + dureeGarantie);
    }
}
