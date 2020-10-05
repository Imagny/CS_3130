package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) throws Exception {
		TopStreamingArtists artistNames = new TopStreamingArtists();
		Scanner sc = new Scanner(new File("ArtistNames.txt"));
		while(sc.hasNextLine()) {
			artistNames.insert(new Artist(sc.nextLine()));
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
		
		File output = new File("output.txt");
		Artist current = artistNames.getFirst();
		try {
			output.createNewFile();
			FileWriter myWriter = new FileWriter(output);
			while (current != null) {
				myWriter.write(current.getName() + "\n");
				current = current.getNext();
			}
			myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
