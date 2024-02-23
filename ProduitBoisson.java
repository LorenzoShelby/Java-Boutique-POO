public class ProduitBoisson extends Produit {
    //------------------------------initialisation----------------------------------
    private String quantite;

    //------------------------------constructeur----------------------------------
    public ProduitBoisson(String nom, String description, int prix, String quantite) {
        super(nom, description, prix);
        this.quantite = quantite;
    }

    //Methode pour afficher les caracteristiques secondaire des produits
    public void afficher() {
        super.afficher();
        System.out.println(", Quantite : " + quantite);
    }
}
