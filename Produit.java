public class Produit {
    
    //-----------------------------------initialisation--------------------------------
    private String nom;
    private String description;
    private int prix;

    //-----------------------------------constructeur------------------------------------
    public Produit(String nom, String description, int prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }
    
    //----------------------------------setteurs----------------------------------------
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrix(int prix){
        this.prix = prix;
    }
    //-------------------------------------getteur--------------------------------------------
    public String getNom(){
        return nom;
    }
    
    public String getDescription(){
        return description;
    }

    public int getPrix(){
    return prix;
    }

    //Methode pour afficher les caracteristiques principales des produits
    public void afficher() {
        System.out.print("Nom : " + nom + ", Description : " + description + ", Prix : " + prix +" euros");
    }

}
