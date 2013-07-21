import java.util.ArrayList;

public class inventaire {

	ArrayList inventaire = new ArrayList();
	

	public inventaire(){
		inventaire.add(12);
	    inventaire.add("Une chaîne de caractères !");
	    inventaire.add(12.20f);
	    inventaire.add('d');
	}
	    
	    void voir(){
	    for(int i = 0; i < inventaire.size(); i++)
	    {
	      System.out.println("donnée à l'indice " + i + " = " + inventaire.get(i));
	      inventaire.remove(2);
	    }     
			
	    
	    }
}

