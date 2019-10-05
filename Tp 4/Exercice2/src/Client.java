

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tache c=new TacheComplexe("tacheComplexe1");
		Tache e1=new TacheElementaire("e1",1);
		Tache e2=new TacheElementaire("e2",2);
		
		c.ajouter(e1);
		c.ajouter(e2);
		
		IVisiteur v1= new VisiteurTacheComplexe();
		c.accept(v1);
		
		IVisiteur v2=new VisiteurTacheElementaire();
		e1.accept(v2);
		e2.accept(v2);
	}

}
