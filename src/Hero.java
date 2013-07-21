public class Hero extends Creature {
  	
	int gils = 0;
	

	public Hero(){

		super();
	}

	public Hero(String name){

	super(name);
	}
	
	
	public int getGils() {
		return gils;
	}

	public void setGils(int gils) {
		this.gils = gils;
	}
}	