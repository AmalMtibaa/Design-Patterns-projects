
public class MonteurRepas3 extends MonteurRepas {
	public void monterHamburger() {
		//repas3=hamburgervégi+coke
		
		HamburgerVegi hamburger=new HamburgerVegi();
		hamburger.setNom("Hamburger Vegi");
		hamburger.setPrix(5.5);
		hamburger.setQuantiteSalade(200);
		repas.setNom("repas3");
		repas.setHamburger(hamburger);}
	
	public void monterBoisson() {
		Coke coke=new Coke();
		coke.setNom("CocaCola");
		coke.setType("0%sucre");
		coke.setPrix(1.5);
		repas.setBoisson(coke);}
	
	
}
