
public abstract class MonteurRepas {
	protected Repas repas;
	
	public Repas getRepas() {return this.repas;}
	public void creerNouveauRepas() { repas=new Repas();}
	
	
	public abstract void monterHamburger();
	public abstract void monterBoisson();
	

}
