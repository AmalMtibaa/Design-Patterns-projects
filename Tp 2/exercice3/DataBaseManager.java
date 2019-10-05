import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {
   
private static Connection connexion = null;
	
//des attributs de connexion
	private String url = "jdbc:derby://localhost:1527/MaBase4";
        private String utilisateurBD = "amal";
        private String motDePasseBD = "amal";
        private String driver_Derby = "org.apache.derby.jdbc.ClientDriver";
        
//constructeur privé
private DataBaseManager(){
    
    try 
        {
            Class.forName(this.driver_Derby);
            System.out.println("Chargement du driver Class.forName");

        } 
        catch ( ClassNotFoundException e ) {
            /* Gérer les éventuelles erreurs ici. */
            System.out.println(" initialisation du driver échouée =>"+e);

        }
    try{
        DataBaseManager.connexion = DriverManager.getConnection(url, utilisateurBD,  motDePasseBD);
        
        }
    catch( SQLException e){
    System.out.println("connexion non établi");
    }
   
}
	
	//Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
public static Connection getInstance()
{	 
    if(connexion == null){
      new DataBaseManager();
      System.out.println("creation de conexion");
    }
    else{
    System.out.println("vous etes deja connecé");
    return connexion;   
    }
    return connexion;
          
}


}


