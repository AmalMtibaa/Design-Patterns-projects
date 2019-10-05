
public class TacheElementaire implements Tache {
	private String nom;
	private int cout;

	TacheElementaire(String n, int c){
		nom=n;
		cout=c;
	}
	public String getNom(){
		return nom;
	}
	public int getCout(){
		return cout;
	}
	public void accept(IVisiteur v) {
        v.visit(this);
    }
}
