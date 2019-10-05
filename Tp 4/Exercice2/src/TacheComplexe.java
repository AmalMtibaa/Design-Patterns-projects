import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TacheComplexe implements Tache{

	 private Collection<Tache> sousTaches;
	 private String nom;
	
	 public TacheComplexe(String n) {
		 nom = n;
		 sousTaches = new ArrayList<Tache>();
	 }
	
	public void ajouter(Tache tache) {
	 sousTaches.add(tache);
	 }

	public void supprimer(Tache tache) {
	 sousTaches.remove(tache);
	 }
	
	 public String getNom() {
	 return this.nom;
	 }
	
	 public int getCout() {
	 int result = 0;
	 for (Tache t : sousTaches) {
	 result += t.getCout();
	 }
	 return result;
	 }
	
	 public Iterator<Tache> iterator() {
	 return sousTaches.iterator();
	 }
	
	 public void accept(IVisiteur v) {
	        v.visit(this);
	    }
	
}

