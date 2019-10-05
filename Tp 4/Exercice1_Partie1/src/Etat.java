
public abstract class Etat {
	
	//implementation par defaut 
	
	public void insererCarte(Carte c,Distributeur d){
		d.getEtat().tostring();
		System.out.println("operation invalide");
	}
	public void entrerCode(int a,Distributeur d){
		d.getEtat().tostring();
		System.out.println("operation invalide");
	}
	public void retirerArgent(Distributeur d,double argent){
		d.getEtat().tostring();
		System.out.println("operation invalide");
	}
	public void retirerCarte(Distributeur d){
		d.getEtat().tostring();
		System.out.println("operation invalide");
	}
	public abstract void tostring();
}
