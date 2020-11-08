package test;

public class SongPlaylist {
	
	public Node root;
	
	void insert(Song song) {
		root = insertRec(root, song);
	}
	
	Node insertRec(Node root, Song song) {
		if (root == null) {
			root = new Node(song);
			return root;
		}
		
		if (song.getArtistName().compareTo(root.data.getArtistName()) > 0) {
			root.left = insertRec(root.left, song);
		} else if (song.getArtistName().compareTo(root.data.getArtistName()) < 0) {
			root.right = insertRec(root.right, song);
		}
		return root;
	}
	
	public void subSet(Node node, String start, String end) {
		if (node == null)
			return;
		if(start.compareTo(node.data.getArtistName()) < 0) {
			subSet(node.left, start, end);
		}
		if (start.compareTo(node.data.getArtistName()) > 0 && end.compareTo(node.data.getArtistName()) <0) {
			System.out.println(node.data + " ");
		}
		if(end.compareTo(node.data.getArtistName()) > 0) {
			subSet(node.right, start, end);
		}
	}

}
