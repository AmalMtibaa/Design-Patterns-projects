
public class En_Attente_Code extends Etat {
	private int i=0;
	
	public void entrerCode(int a,Distributeur d){
		
		if(d.getCarte().estBon(a) && i<3){
			System.out.println("Code vrai");
			d.setEtat(d.en_Attente_Retirer_Argent);
		}
		else{
			System.out.println("code invalide");
			i++;
		}
		if(i==3){
			System.out.println("carte avalé");
			d.setCarte(null);
			d.setEtat(d.pas_De_Carte);
			i=0;
		}
	}
	public void tostring(){
		System.out.print("Distributeur est dans l'etat En_Attente_Code :");
	}
	
}
