public class ProduitAlimentaire extends Produit {

    //-----------------------------------initialisation--------------------------------
    private String dateExpiration;

    //-----------------------------------constructeur--------------------------------
    public ProduitAlimentaire(String nom, String description, int prix, String dateExpiration) {
        super(nom, description, prix);
        this.dateExpiration = dateExpiration;
    }

    //Methode pour afficher les caracteristiques secondaire des produits
    public void afficher() {
        super.afficher();
        System.out.println(", Date d'expiration : " + dateExpiration);
    }
}
