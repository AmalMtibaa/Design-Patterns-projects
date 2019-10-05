
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distributeur d=new Distributeur();
		Carte carte=new Carte(1234);
		d.insererCarte(carte);
		d.entrerUnCode(1);
		d.entrerUnCode(1234);
		d.retirerDesEspece();
		d.retirerCarte();
		
	}

}
