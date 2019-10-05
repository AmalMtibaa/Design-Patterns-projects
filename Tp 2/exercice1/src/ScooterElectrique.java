
public class ScooterElectrique extends Scooter {
	int capaciteBaterie;
	
	public ScooterElectrique (String a, int b) {
		this.nomModele=a;
		this.capaciteBaterie=b;
	}
	
	public void affichageCaracteristique() {
		System.out.println("Ceci est un sccoter Electrique de modele "+this.nomModele+" et il a une batterie de capacité "+this.capaciteBaterie+ " ferahald");
	}
}
