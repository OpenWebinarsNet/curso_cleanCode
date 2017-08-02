package io.pello.refactorings.removecontrolflag;

/**
 * Remove Control Flag
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class Friends {
	private String[] friends;
	
	public Friends (String[] friends) {
		this.friends = friends;
	}
	
	public int indexOf (String friend) {
		boolean found = false;
		int i = 0;
		
		while (i < friends.length && !found ) { 
			  if (friends[i].equals(friend)) {
			    found = true;
			  }
			  i++;
			}
		
		if (found) {
			return (i-1);
		} else {
			return -1;
		}
	}
}
