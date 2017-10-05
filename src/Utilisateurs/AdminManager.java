package Utilisateurs;

import java.util.Iterator;
import java.util.List;
import Idea.Idea;

public class AdminManager {
	
	public void showIdeas(List<Idea> ideas) {
		Iterator<Idea> it = ideas.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
