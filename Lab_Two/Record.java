public class Record {

	public int position;
	public String name;
	public String artist;
	public int streamCount;
	public String url;

	public String toString () {
		return this.name;
	}

	public Record (int position, String name, String artist, int streamCount, String url) {
		this.position = position;
		this.name = name;
		this.artist = artist;
		this.streamCount = streamCount;
		this.url = url;
	}

}
