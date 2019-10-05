import java.util.ArrayList;

public class ServiceTraitementCommande {
	
	ArrayList<Commande> listeCommande=new ArrayList<Commande>();
	
	public Commande passerCommande(int n, ArrayList<Produit> l){
		Commande c=new Commande(n,l);
		listeCommande.add(c);
		return c;
	}
	public void annulerCommande(Commande c){
		listeCommande.remove(c);
		}

}
