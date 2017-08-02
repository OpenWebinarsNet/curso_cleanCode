package io.pello.refactorings.removecontrolflag.refactored1;

/**
* Refactored version
*/
public class Friends {
	private String[] friends;
	
	public Friends (String[] friends) {
		this.friends = friends;
	}
	
	public int indexOf (String friend) {

		int i = 0;
		
		while (i < friends.length ) {
			
			  if (friends[i].equals(friend)) {
			    break;
			  }
			  i++;
			}
		
		if (i == friends.length) {
			return -1;
		} else {
			return i;
		}
	}
}
