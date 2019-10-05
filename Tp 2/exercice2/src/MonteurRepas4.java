
public class MonteurRepas4 extends MonteurRepas {
	//repas4=hamburgervégi+Pepsi
	public void monterHamburger() {
		HamburgerVegi hamburger=new HamburgerVegi();
		hamburger.setNom("Hamburger Vegi");
		hamburger.setPrix(5.5);
		hamburger.setQuantiteSalade(200);
		
		repas.setHamburger(hamburger);
		repas.setNom("repas4");}
	
	public void monterBoisson() {
		Pepsi pepsi=new Pepsi();
		pepsi.setNom("Pepsi");
		pepsi.setPrix(1.3);
		repas.setBoisson(pepsi);}
	
	
}
