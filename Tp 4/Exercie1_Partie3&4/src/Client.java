public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distributeur d=new Distributeur(100);
		Carte c=new Carte(1234,1000);
		//scénario parfait
		d.insererCarte(c);
		d.lire_solde_compte(); //operation invalide
		d.entrerCode(1234);
		d.lire_solde_compte();//operattion valide
		d.retirerArgent(50);
		d.lire_solde_compte();//operattion valide
		d.retirerCarte();
		
		Carte c2=new Carte(12,1000);
		
		//scénario parfait
		d.insererCarte(c2);
		d.entrerCode(12);
		d.retirerArgent(50);
		d.retirerCarte();
		
	}

}
