
public class ScooterEssence  extends Scooter{
	int capaciteReservoir;
	
	public ScooterEssence (String a, int b) {
		this.nomModele=a;
		this.capaciteReservoir=b;
	}
	
	public void affichageCaracteristique() {
		System.out.println("Ceci est un scooter Essence de modele "+this.nomModele+" et il a un reservoir de capacité "+this.capaciteReservoir);
	}
}
