package io.pello.refactorings.removecontrolflag.refactored2;

/**
* Refactored version
*/
public class Friends {
	private String[] friends;
	
	public Friends (String[] friends) {
		this.friends = friends;
	}
	
	public int indexOf (String friend) {
		for (int i = 0;i< friends.length; i++) 
			if (friends[i].equals(friend)) 
				return i;
		
		return -1;
	}
}
