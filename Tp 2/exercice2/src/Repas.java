
public class Repas {
	String nom;
	Hamburger hamburger;
	BoissonFroide boisson;
	
	public void setNom(String a) {this.nom=a;}
	public void setHamburger(Hamburger a) { this.hamburger=a;}
	public void setBoisson(BoissonFroide a) { this.boisson=a;}
	
	public void afficher() { System.out.println(nom+" est composé d'un "+hamburger.getNom()+
			" de prix "+hamburger.getPrix()+ " et d'une boisson "
			+boisson.getNom()+" de prix "+boisson.getPrix());
	double prixTotal=boisson.getPrix()+hamburger.getPrix();
	System.out.println("prix total de repas est "+prixTotal);
	}
}
