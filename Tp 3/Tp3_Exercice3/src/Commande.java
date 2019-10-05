import java.util.ArrayList;
public class Commande {
	
	private int numero;
	ArrayList<Produit> listeProduit=new ArrayList<Produit>();
	
	public Commande(int n,ArrayList<Produit> l){
		numero=n;
		for(int i=0;i<l.size();i++)
			listeProduit.add(l.get(i));
	}
	
	public int getNumero(){return numero;}
	public ArrayList<Produit> getListeProduit(){
		return listeProduit;
	}
	
	public void addProduit(Produit p){
		listeProduit.add(p);
	}
	public void removeProduit(Produit p){
		listeProduit.remove(p);
	}

}
