
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distributeur d=new Distributeur();
		Carte c=new Carte(1234,100);
		
		//scénario parfait
		d.insererCarte(c);
		d.entrerCode(1234);
		d.retirerArgent(50);
		d.retirerCarte();
		
		System.out.println("");
		Carte c2=new Carte(1111,50);
		Carte c3=new Carte(2222,55); 
		
		d.insererCarte(c2);
		d.insererCarte(c3); //on ne peut pas inserer tant que il y une carte dans le distribiteur
		d.retirerArgent(10); //operation invalide il faut entrerCode
		d.retirerCarte();  //operation invalide il faut entrerCode
		
		
	
		d.entrerCode(1);
		d.entrerCode(1);
		d.entrerCode(1); //o
		
		System.out.println(d.getCarte()); //la carte est avalé,distributeur est à l'etat pas carte
		
		System.out.println("");
		
		d.insererCarte(c3);
		d.entrerCode(2222);
		d.retirerArgent(70); //superieur au solde de la  carte
		System.out.println(d.getCarte()); //carte est retiré
	
	}
}
