
public class VisiteurTacheElementaire implements IVisiteur{
	
	public void visit(TacheElementaire t) {
		
        System.out.println("VisiteurTacheElementaire :on ajoute l'attribut nom="+t.getNom()
        +" de la tache Elementaire <tache></tache>" );
    }
	@Override
	public void visit(TacheComplexe t) {}

}
