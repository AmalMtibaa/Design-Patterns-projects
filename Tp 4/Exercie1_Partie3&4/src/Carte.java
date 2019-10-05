
public class Carte {
	private int cleSecret;
	private double solde;
	
	public Carte(int a,double s){
		cleSecret=a;
		solde=s;
	}
	//getters et setters
	public void setSolde(double s){
		solde=s;
	}
	public double getSolde(){return solde;}
	
	public boolean estBon(int a){
		if(cleSecret==a)
			return true;
		else
			return false;
	}
	
	public boolean retirerArgent(double s){
		boolean retire=false;
		if(s<solde){
		System.out.println("On retire Argent");
		solde=solde-s;
		retire=true;
		}
		return retire;
	}


}
