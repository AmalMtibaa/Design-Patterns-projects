import java.util.ArrayList;
public class Facture {
	
	private int idFacture;
	private double montant;
	private boolean payement;
	ArrayList<Produit> listeProduit=new ArrayList<Produit>();
	
	public Facture(int id){
		idFacture=id;
		payement=false;
		
	}
	public int getid(){return idFacture;}
	public boolean getPayement(){return payement;}
	
	public void calculMontant(){
		int s=0;
		for(int i=0;i<listeProduit.size();i++)
			s+=listeProduit.get(i).getPrix();
		montant=s;
	}
	public void setPayement(boolean s){payement=s;}
	
	public void addProduit(Produit p){
		listeProduit.add(p);
	}
	public void removeProduit(Produit p){
		listeProduit.remove(p);
	}
	public void affichageCaracteristique(){
		System.out.println("Facture "+idFacture+" est de montant= "+montant+"dt ,payement= "+payement);
	}
}
