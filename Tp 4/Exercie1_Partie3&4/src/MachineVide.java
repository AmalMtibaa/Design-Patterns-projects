
public class MachineVide extends Etat {
	
	public void tostring() {
		System.out.print("Distribiteur est vide");
		
	}
	public void retirerCarte(Distributeur d){
		d.setCarte(null);
		System.out.println("carte retiré puisque le distribiteur est vide; pas d'argent");
		d.setEtat(d.pas_De_Carte);
	}

}

