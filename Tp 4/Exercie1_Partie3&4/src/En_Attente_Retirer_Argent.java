
public class En_Attente_Retirer_Argent extends Etat {

	
	public void retirerArgent(Distributeur d,double solde){
		if(d.getStockArgent()>solde){
			
		boolean retiree;
		retiree=d.getCarte().retirerArgent(solde);
		if(retiree==false){
			System.out.print("Solde insuffisant :");
			d.retirerCarte();
		}
		else{
			d.setStockArgent(d.getStockArgent()-solde);
		}
		}
		else{
			d.setEtat(d.machineVide);
		} 
	}
	public void retirerCarte(Distributeur d){
		d.setCarte(null);
		d.setEtat(d.pas_De_Carte);
		System.out.println("carte retiré");
	}
	
	public void tostring(){
		System.out.print("Distributeur est dans l'etat En_Attente_Retire");
	}
	public void lire_solde_compte(Distributeur d){
		System.out.println("votre solde est"+d.getCarte().getSolde());
	}
}
