
public class VisiteurTacheComplexe implements IVisiteur{
	
public void visit(TacheComplexe t) {
        System.out.println("VisiteurTacheComplexe :on ajoute dans <taches></taches> la tache complexe de nom ="
+t.getNom() );
    }

@Override
public void visit(TacheElementaire t) {
	// TODO Auto-generated method stub
	
}
}
