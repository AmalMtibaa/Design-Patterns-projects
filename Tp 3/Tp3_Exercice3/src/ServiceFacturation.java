import java.util.ArrayList;

public class ServiceFacturation {
	
	public void payerFacture(Facture f){
		if(!f.getPayement())
		f.setPayement(true);
		else
			System.out.println("Facture deja payé");
	}
	
	public Facture FacturerCommande(Commande c){
		ArrayList<Produit> l =c.getListeProduit();
		Facture f=new Facture(c.getNumero());
		for(int i=0;i<l.size();i++){
			f.addProduit(c.getListeProduit().get(i));
		}
		f.calculMontant();
		return f;
	}
}
