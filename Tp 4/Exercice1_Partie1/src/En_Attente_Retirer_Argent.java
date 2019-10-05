
public class En_Attente_Retirer_Argent extends Etat {

	
	public void retirerArgent(Distributeur d,double solde){
		boolean retiree;
		retiree=d.getCarte().retirerArgent(solde);
		if(retiree==false){
			System.out.print("Solde insuffisant :");
			d.retirerCarte();
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
}
