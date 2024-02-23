
import java.util.ArrayList;
import java.util.List;

public class Boutique {
    //---------------------------------initialisation-----------------------------------
    private List<Produit> produits = new ArrayList<>();

    //----------------------------------Methodes----------------------------------------------------
    //Methode pour ajouter un Produit
    public Produit addProduit(Produit newProduit){
            produits.add(newProduit);
            return newProduit;
    }

    //Methode pour listr de tous les produits
    public List<Produit> getProduits() {
        return produits;
    }
    //Methode pour afficher le stock
    public void afficherStock(){
        for (Produit produit : produits) {
            produit.afficher();
        }
    }
}
