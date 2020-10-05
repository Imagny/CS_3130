package test;

/* A node represents an artist */
class Artist {
   private String name;
   private Artist next;
   
   public String getName() {
	   return name;
   }
   
   public void setName(String name) {
	   this.name = name;
   }

   public Artist getNext() {
	   return next;
   }
	
   public void setNext(Artist next) {
	   this.next = next;
   }
   
   public Artist(String name) {
	   this.name = name;
   }

}