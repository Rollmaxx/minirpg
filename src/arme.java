public class arme extends item {

	int ptAttaque = 10;
	String Aptitude = "Just rock n'roll";
	
	public arme(String name){
		super(name);
		System.out.println("Une arme a été créer");
	}

	public int getPtAttaque() {
		return ptAttaque;
	}

	public void setPtAttaque(int ptAttaque) {
		this.ptAttaque = ptAttaque;
	}

	public String getAptitude() {
		return Aptitude;
	}

	public void setAptitude(String aptitude) {
		Aptitude = aptitude;
	}
	
}
