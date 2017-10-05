package Utilisateurs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Idea.Idea;

public class Test {

	public static void main(String[] args) {
		
		User user1 = new User("toto", "1234", "toto@gafam.com", "user");
		User user2 = new User("titi", "5432", "titi@gafam.com", "user");
		User user3 = new User("warda", "0000", "warda@gafam.com", "admin");
		User user4 = new User("severin", "9999", "severin@gafam.com", "user");
		
		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		
		Collections.sort(users, new User());
		System.out.println(users);
		
		Idea idea1 = new Idea(user1, "CreateEnergy", "blablabla");
		Idea idea2 = new Idea(user2, "SuperIdea", "blablabli");
		Idea idea3 = new Idea(user3, "GreatIdea", "Huge!");
		Idea idea4 = new Idea(user4, "ChittyIdea", "glouglouglou");
		
		List<Idea> ideas = new ArrayList<>();
		
		ideas.add(idea1);
		ideas.add(idea2);
		ideas.add(idea3);
		ideas.add(idea4);
		
		AdminManager am = new AdminManager();
		am.showIdeas(ideas);
		
		//Collections.sort(ideas);
	}

}
