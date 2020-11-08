package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		SongPlaylist playlist;
		
		Scanner sc = new Scanner(new File("songs.csv"));
		sc.nextLine();
		sc.nextLine();
		String[] line = sc.nextLine().split(",");
		Song data = new Song(line[1], Integer.parseInt(line[3]), line[2]);
		playlist = new SongPlaylist();
		playlist.root = new Node(data);
		while(sc.hasNextLine()) {
			line = sc.nextLine().split(",");
			data = new Song(line[1], Integer.parseInt(line[3]), line[2]);
			playlist.insert(data);
		}
		
	}
	
}
