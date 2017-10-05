package Idea;

import Utilisateurs.User;

public class Idea {
	private User author;
	private String name;
	private String description;
	private boolean activated;
	
	public Idea() {
		super();
	}
	public Idea(User author, String name, String description) {
		super();
		this.author = author;
		this.name = name;
		this.description = description;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Idea [author=" + author + ", name=" + name + ", description=" + description + "]";
	}
	
}
