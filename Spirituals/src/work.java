import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

import jxl.Sheet;
import jxl.Workbook;

public class work {

	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub
		PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
		System.setOut(out);
		File f = new File("C:\\Users\\Jacob\\workspace\\Spirituals\\Discography-Song.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet(0);
		int row = s.getRows();
		// int col = s.getColumns();
		String uniformT = "";
		for (int i = 1; i < 4195; i++) {
			if (s.getCell(21, i).getContents().compareTo(uniformT) != 0) {
				uniformT = s.getCell(21, i).getContents();
				String tag = "";
				int j = i;
				while (tag.isEmpty() && j != -1) {
					if (s.getCell(19, j).getContents().isEmpty() == false) {
						tag = s.getCell(19, j).getContents();
					} else if (s.getCell(21, j).getContents().compareTo(uniformT) != 0) {
						j = -1;
					} else if (j < row) {
						j = -1;
					}
				}
				System.out.println(uniformT);
				if (tag.isEmpty() == false) {
					System.out.println("Tags: " + tag + '\n');
				}
			}
			String vocA = s.getCell(1, i).getContents();
			String vtA = s.getCell(2, i).getContents();
			String vocB = s.getCell(3, i).getContents();
			String vtB = s.getCell(4, i).getContents();

			Vocalists voices = new Vocalists(vocA, vocB, vtA, vtB);
			String voice = voices.getVocalists();

			String compA = s.getCell(5, i).getContents();
			String cdA = s.getCell(6, i).getContents();
			String compB = s.getCell(7, i).getContents();
			String cdB = s.getCell(8, i).getContents();

			Composers composers = new Composers(compA, compB, cdA, cdB);
			String composer = composers.getComposers();

			String album = s.getCell(9, i).getContents();
			String url = s.getCell(10, i).getContents();
			String publisher = s.getCell(11, i).getContents();
			String pubYear = s.getCell(13, i).getContents();
			String format = s.getCell(14, i).getContents();
			String song = s.getCell(15, i).getContents();
			String accompaniment = s.getCell(16, i).getContents();
			String dialect = s.getCell(17, i).getContents();
			// String tag = s.getCell(19, i).getContents();
			String trackN = s.getCell(20, i).getContents();

			Info inf = new Info(trackN, song, url, composer, voice, album, publisher, pubYear, format, accompaniment,
					dialect);
			// for (int i = 0; i < 23; i++) {
			// System.out.println(s.getCell(i, 0).getContents());
			// }
			show(inf);
		}
	}

	public static void show(Info in) {
		// System.out.println(" Tags: " + in.tags);
		System.out.println("	Track Entry: " + in.trackNum);
		System.out.println("	Track Title: " + in.songTitle);
		// System.out.println(in.firstLine);
		System.out.println("	Composer(s): " + in.composers);
		System.out.println("	Vocalist(s): " + in.vocalists);
		System.out.println("	Album Title: " + in.albumTitle);
		System.out.println("	Publisher: " + in.publisher);
		System.out.println("	Release Date: " + in.releaseDate);
		System.out.println("	Format: " + in.format);
		if (in.accompaniedBy.isEmpty() == false) {
			System.out.println("	Accompanied By: " + in.accompaniedBy);
		}
		if (in.dialect.isEmpty() == false) {
			System.out.println("	Dialect: " + in.dialect);
		}
		System.out.println("\n");
	}
}
//Track Entry: 0001
//Track Title: Ain' a that good news
//Composer(s): Dawson, William L.
//Vocalist(s): Thompson, Jeanette (Soprano)
//Album Title: Negro Spirituals
//Publisher: Pavane Records ADW 7267
//Release Date: 1992
//Format: CD
//Accompanied By: Chorus
//Dialect: No dialect discerned

