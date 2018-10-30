
public class Vocalists {
	String vocA;
	String vocB;
	String typeA;
	String typeB;
	
	public Vocalists(String vocA, String vocB, String typeA, String typeB){
		this.vocA = vocA;
		this.vocB= vocB;
		this.typeA = getType(typeA);
		this.typeB = getType(typeB);
	}
	
	public String getVocalists(){
		if(typeA.isEmpty() == false){
			vocA = vocA + " (" + typeA + ")";
		}
		if(typeB.isEmpty() == false){
			vocB = vocB + " (" + typeB + ")";
		}
		if(vocB.isEmpty()== false){
			return vocA + " ;" + vocB;
		} else{
			return vocA;
		}
	}
	public String getType(String type){
		type = type.toLowerCase();
		if(type.isEmpty()){
			return "";
		} else if(type.contains("mez")){
			return "mez";
		} else if(type.equals("soprano")){
			return "sop";
		} else if(type.contains("alt")){
			return "alt";
		} else if(type.contains("ten")){
			return "ten";
		} else if(type.equals("baritone")){
			return "bar";
		} else if(type.contains("bas") && type.contains("bar")){
			return "bbr";
		} else if(type.contains("bas")){
			return "bas";
		} else if(type.contains("voc")){
			return "voc";
		} else if(type.equals("not identified")){
		    return "";
		} else if(type.equals(" ")){
			return "";
		} else{
			return "ERROR" + type;
		}
	}
}
