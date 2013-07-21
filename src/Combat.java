import java.util.Scanner;

public class Combat {

public Combat(Hero joueur, Monstre monstre)
{
	
}

public void fight(final Hero joueur, final Monstre monstre)
{
	Scanner Action = new Scanner(System.in);
	System.out.println("Un " + monstre.getNom() + " est apparu");
	while(monstre.getPv() > 0){
		
		System.out.println("Action du Hero?:");
		String choix = Action.nextLine();
			if (choix.equals("attaque"))
					monstre.estAttaque(joueur.getAttaqueCombat());
			else if (choix.equals("boost"))
					joueur.puissance(joueur.getAttaqueCombat());
			else if (choix.equals("fuir"))
				break;
			else;

		}
		System.out.println("Fin du combat");
		joueur.debuf();
}
}