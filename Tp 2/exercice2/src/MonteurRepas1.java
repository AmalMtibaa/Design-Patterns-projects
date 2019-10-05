
public class MonteurRepas1 extends MonteurRepas {
	//repas1=hamburger poulet+coke
	public void monterHamburger() {
		HamburgerPoulet hamburger=new HamburgerPoulet();
		hamburger.setNom("Hamburger Poulet");
		hamburger.setPrix(5.5);
		hamburger.setQuantitePoulet(200);
		repas.setNom("repas1");
		repas.setHamburger(hamburger);}
	
	public void monterBoisson() {
		Coke coke=new Coke();
		coke.setNom("CocaCola");
		coke.setPrix(1.5);
		coke.setType("medium");
		repas.setBoisson(coke);}

	
}
