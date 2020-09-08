import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class Driver {

	public static void main(String[] args) {
		File file = new File("songs.csv");
		ArrayList<String[]> tracks =  new ArrayList<>();
		//Create array of lines of artists
		try {
			Scanner sc = new Scanner(file);
			sc.nextLine();
			sc.nextLine();
			while (sc.hasNextLine()) {
				String[] line = sc.nextLine().split(",");
				tracks.add(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		//Delete output file if it exists
		try {
			File temp = new File("output.txt");
			if (temp.exists()) {
				temp.delete();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Create output file
		File output = new File("output.txt");
		try {
			output.createNewFile();
			FileWriter myWriter = new FileWriter(output);
			for (String[] i : tracks) {
				myWriter.write(i[0] + " | " + i[1] + " | " + i[2] + " | " + i[3] + " | " + i[4] + "\n");
				myWriter.write("===========================================================\n");
			}
			myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
