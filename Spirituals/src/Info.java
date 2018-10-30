
public class Info {
	//String tags;
	String trackNum;
	String songTitle;
	String firstLine;
	String composers;
	String vocalists;
	String albumTitle;
	String publisher;
	String releaseDate;
	String format;
	String accompaniedBy;
	String dialect;

	
	public Info(String trackNum, String songTitle, String firstLine, String composers, String vocalists,
			String albumTitle, String publisher, String releaseDate, String format, String accompaniedBy,
			String dialect){
		this.trackNum = trackNum;
		this.songTitle = songTitle;
		this.firstLine = firstLine;
		//this.tags = tags;
		this.composers = composers;
		this.vocalists = vocalists;
		this.albumTitle = albumTitle;
		this.publisher = publisher;
		this.releaseDate = releaseDate;
		this.format = format;
		this.accompaniedBy = accompaniedBy;
		this.dialect = dialect;
	}

}
