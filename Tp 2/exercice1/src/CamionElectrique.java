
public class CamionElectrique extends Camion{
	int capaciteBaterie;
	
	
	public CamionElectrique (String a, int b, int c) {
		this.nomModele=a;
		this.capaciteBaterie=b;
		this.nbPortes=c;
	}
	
	public void affichageCaracteristique() {
		System.out.println("Ceci est un camion Electrique de modele "+this.nomModele+" et il a une batterie de capacité "
	+this.capaciteBaterie+ " ferahald et son nombre de portes est "+this.nbPortes);
	}

}
