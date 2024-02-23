/* 
Lorenzon Cesana Rale 
B2 Opent It Montpellier 
EVALUATION 23/02/2024
Jean Christophe Dominguez POO (JAVA)
*/
public class ProgrammePrincipal {
    public static void main(String[] args) {

        // -----------------------------intitialisation de l'instance Boutique-------------------
        System.out.println("-----------------------------Boutique de Lorenzo-----------------------------");
        Boutique boutique = new Boutique();
        
        // ---------------------------------Creation de Produit-----------------------------------
        Produit produit1 = boutique.addProduit(new ProduitAlimentaire("Chocolat", "au lait",3,"01/10/1999"));
        Produit produit2 = boutique.addProduit(new ProduitBoisson("Coca", "Bien frais", 2, "33cl"));
        Produit produit3 = boutique.addProduit(new ProduitElectronique("DisqueSSD", "1To", 60, "1an"));

        //--------------------Methode pour afficher le Stock de la boutique------------------------------------
        boutique.afficherStock();
        System.out.println("-----------------------------------------------------------------------------");
        
        //---------------------Creation du Panier--------------------------------
        Panier panier1 = new Panier();
        
        //----------------------Ajout de Produit au Panier--------------------------------
        panier1.ajouterProduit(produit1);
        panier1.ajouterProduit(produit2);
        panier1.ajouterProduit(produit2);
        panier1.ajouterProduit(produit3);

        //------------------------affichage du prix total du panier------------------------
        //il sera egal au prix des trois article 65+2 car il a pris 2fois l'article 2
        panier1.affichageTotalPanier();
        
    }
}
