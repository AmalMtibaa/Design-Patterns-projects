import java.util.ArrayList;

//Un client a un seul panier ,peut etablir plusieurs commandes 
//chaque Client a son propre ServiceClientaire
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServiceClientaireFacade serviceFacade=new ServiceClientaireFacade();
		
		ArrayList<Produit> panier=serviceFacade.CreerPanier(3); //remplir le panier par des produits  
		Commande commande1=serviceFacade.passerCommande(1, panier); 
		Facture facture=serviceFacade.getFacture(commande1); 
		
		serviceFacade.payerFacture(facture);
		
	}

}
