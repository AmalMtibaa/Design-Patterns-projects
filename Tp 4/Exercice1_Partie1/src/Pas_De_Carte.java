
public class Pas_De_Carte extends Etat {

	public void insererCarte(Carte c,Distributeur d){
		System.out.println("insertion de la carte");
		d.setEtat(d.en_Attente_Code);
		d.setCarte(c);
	}
	
	public void tostring(){
		System.out.print("Distributeur est dans l'etat Pas_De_Carte: ");
	}
}
