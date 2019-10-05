
public class MonteurRepas2 extends MonteurRepas {
	public void monterHamburger() {
		//repas2=hamburgerPoulet+Pepsi
		
		HamburgerPoulet hamburger=new HamburgerPoulet();
		hamburger.setNom("Hamburger Poulet");
		hamburger.setPrix(5.5);
		hamburger.setQuantitePoulet(200);
		repas.setNom("repas2");
		repas.setHamburger(hamburger);}
	
	public void monterBoisson() {
		Pepsi pepsi=new Pepsi();
		pepsi.setNom("Pepsi");
		pepsi.setPrix(1.3);
		repas.setBoisson(pepsi);}
	
	
}
