public class Panier {
    //-----------------------------Initialisation-----------------------------------
    private int total = 0;

    //-----------------------------Methodes--------------------------------
    //getteur
    public int getTotal() {
        return total;
    }
    //setteur
    public void setTotal(int total) {
        this.total = total;
    }
    //Methode pour ajouter un Produit au Panier soit sont prx
    public void ajouterProduit(Produit produit) {
        total += produit.getPrix();
    }

    public void affichageTotalPanier(){
        System.out.println("--------------Votre Panier--------------");
        System.out.println("Le prix total du panier est de " + total + " euros");
        System.out.println("----------------------------------------");
    }
}
