
public class Serveur {
	MonteurRepas monteurRepas;
	
	public void setMonteurRepas(MonteurRepas r) {monteurRepas=r;}
	public Repas getRepas() { return monteurRepas.getRepas();}
	
	public void contruireRepas() {
		
		monteurRepas.creerNouveauRepas();
		monteurRepas.monterBoisson();
		monteurRepas.monterHamburger();
		
		
	}

}
