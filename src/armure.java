public class armure extends item {

	int ptDefense = 10;
	String Aptitude = "Just rock n'roll";
	
	public armure(String name){
		super(name);
		System.out.println("Une armure a été créer");
	}

	public int getPtDefense() {
		return ptDefense;
	}

	public void setPtDefense(int ptDefense) {
		this.ptDefense = ptDefense;
	}

	public String getAptitude() {
		return Aptitude;
	}

	public void setAptitude(String aptitude) {
		Aptitude = aptitude;
	}


	
}
