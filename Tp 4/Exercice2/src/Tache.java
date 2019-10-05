
public interface Tache {
	/** Obtenir le nom de la tâche. */
	 String getNom();
	
	 /** Obtenir le coût de la tâche. */
	 int getCout();
	 
	 void accept(IVisiteur r);
	 default void ajouter(Tache t){}
	 default void supprimer(Tache t){}
}
