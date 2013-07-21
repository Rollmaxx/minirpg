import java.util.Scanner;




public class jeuRPG {
	  public static void main(String[] args) {
		  
	Hero MainPersonnage = new Hero("Rollmax");
	inventaire inventaire = new inventaire();
	System.out.println("------------------------------------");
	System.out.println("|        Welcome in RPGame         |");
	System.out.println("------------------------------------");
	



	Scanner Action = new Scanner(System.in);
	while(true){
		
		System.out.println("Vos choix d'aventure");
		System.out.println("Combat");
		System.out.println("Statut");
		System.out.println("Sauvegarde");
		System.out.println("Exit");
		System.out.println("Que voulez-vous faire?:");
		String choix = Action.nextLine();
		System.out.println("-------------------------------");
			if (choix.equals("Combat")){
				
				Monstre MainMonstre = new Monstre("Smiley");
				Combat test = new Combat(MainPersonnage, MainMonstre);
				test.fight(MainPersonnage, MainMonstre);
			}
			else if (choix.equals("Statut")){
				MainPersonnage.affStat();
				armure test = new armure("Dragon");
				arme epee = new arme("Excalibur");
				
			}
			else if (choix.equals("Inventaire")){
				inventaire.voir();
			}
			else if (choix.equals("Sauvegarde")){
				save sauvegarde = new save();
			}
			else if (choix.equals("Exit")){
				System.exit(0);

			}
			else
			{
				System.out.println("Try again");
			}

		}
	
	
	  }
}
