
public interface Tache {
	/** Obtenir le nom de la t�che. */
	 String getNom();
	
	 /** Obtenir le co�t de la t�che. */
	 int getCout();
	 
	 void accept(IVisiteur r);
	 default void ajouter(Tache t){}
	 default void supprimer(Tache t){}
}
