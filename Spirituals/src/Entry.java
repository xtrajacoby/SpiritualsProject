import java.util.ArrayList;
import java.util.List;

public class Entry {
	String uniformTitle;
	List<Info> info;

	public Entry(String uniformTitle){
		this.info = new ArrayList<Info>();
		this.uniformTitle = uniformTitle;
	}
}
