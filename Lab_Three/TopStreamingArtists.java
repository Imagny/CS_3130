package test;

class TopStreamingArtists {
	
    private Artist first;
    
    public void insert(Artist n) {
    	Artist current;
    	if (this.isEmpty() || this.first.getName().compareTo(n.getName()) > 0) {
    		n.setNext(first);
    		this.first = n;
    	} else {
    		current = first;
    		while (current.getNext() != null && current.getName().compareTo(n.getName()) > 0) {
    			current = current.getNext();
    		}
    		n.setNext(current.getNext());
    		current.setNext(n);
    	}
    }
    
    public Artist getFirst() {
    	return this.first;
    }
    
    public TopStreamingArtists(){
      first = null;
    }
    public boolean isEmpty(){
     return (first == null);
    }
    
 }