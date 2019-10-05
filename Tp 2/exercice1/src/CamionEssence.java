
public class CamionEssence extends Camion {
	int capaciteReservoir;
	
	public CamionEssence (String a, int b, int c) {
		this.nomModele=a;
		this.capaciteReservoir=b;
		this.nbPortes=c;
	}
	
	public void affichageCaracteristique() {
		System.out.println("Ceci est un camion Essence de modele "
	+this.nomModele+" et il a un reservoir de capacité "
	+this.capaciteReservoir+ " litre(s) et son nombre de portes est "+this.nbPortes);
		
	}

}
