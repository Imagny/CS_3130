package test;

public class Song {
	
	private String songTitle;
	private int streamsAverageCount;
	private String artistName;
	private int artistAverage;
	
	public String getSongTitle() {
		return songTitle;
	}
	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}
	public int getStreamsAverageCount() {
		return streamsAverageCount;
	}
	public void setStreamsAverageCount(int streamsAverageCount) {
		this.streamsAverageCount = streamsAverageCount;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public int getArtistAverage() {
		return artistAverage;
	}
	public void setArtistAverage(int artistAverage) {
		this.artistAverage = artistAverage;
	}
	
	public Song (String songTitle, int streamsAverageCount, String artistName) {
		this.songTitle =  songTitle;
		this.streamsAverageCount =  streamsAverageCount;
		this.artistName = artistName;
	}

}
