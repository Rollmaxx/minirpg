public class Creature{

	String nom;
	String classe;

	private int pvMax = 1000;
	private int pv = pvMax;
	private int manaMax = 100;
	private int mana = manaMax;
	private int attaqueRepos = 10;
	private int attaqueCombat = attaqueRepos;
	private int defense = 10;
	private int lvl = 1;


	public Creature(){
		
	}

	public Creature(String nom){
		this.nom = nom;
		
	}
	
// Accesseurs et Mutateurs
	
	public int getPvMax(){
	return this.pvMax;
	}

	public int getPv(){
	return this.pv;
	}
	
	public int getManaMax(){
	return this.manaMax;
	}

	public int getMana(){	
	return this.mana;
	}

	public String getNom(){
	return this.nom;
	}


	public int getAttaqueRepos() {
		return attaqueRepos;
	}

	public void setAttaqueRepos(int attaqueRepos) {
		this.attaqueRepos = attaqueRepos;
	}

	public int getAttaqueCombat() {
		return attaqueCombat;
	}

	public void setAttaqueCombat(int attaqueCombat) {
		this.attaqueCombat = attaqueCombat;
	}

	public int getDefense(){
	return this.defense;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public void setPvMax(int pvMax) {
		this.pvMax = pvMax;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public void setManaMax(int manaMax) {
		this.manaMax = manaMax;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public void puissance (int attaque){
	this.attaqueCombat *= 5;	
	System.out.println("La puissance augmente, la force est de " + this.attaqueCombat);
	}
	
	public void debuf(){
		this.attaqueCombat = this.attaqueRepos;
	}
	
	//Fonction lié a créature
	public void estAttaque(int attaque){
	this.pv -= attaque;
	System.out.println(this.nom + " a subi " + attaque + " de dégat");
	System.out.println("Pv restant : " + pv + "/"+pvMax);
	}
	
	public void affStat()
	{
		System.out.println("Nom: "+ nom);
		System.out.println("Pv: " + pv + "/"+pvMax);
		System.out.println("Mana: "+ mana + "/"+manaMax);
		System.out.println("Attaque: " + attaqueRepos);
		System.out.println("Defense: " + defense);
		System.out.println("--------------------");	
	}

	
}
	