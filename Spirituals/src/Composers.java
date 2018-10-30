
public class Composers {
	String compA;
	String compB;
	String disA;
	String disB;
	
	public Composers(String compA, String compB, String disA, String disB){
		this.compA = compA;
		this.compB = compB;
		this.disA = disA;
		this.disB = disB;
	}
	
	public String getComposers(){
		if (this.disA.isEmpty() == false){
			compA = disA + " (discerned)";
		}
		if (this.disB.isEmpty() == false){
			compB = disB + " (discerned)";
		}
		if(compB.isEmpty() == false){
			return compA + " ;" + compB;
		} else{
			return compA;
		}
	}

}
