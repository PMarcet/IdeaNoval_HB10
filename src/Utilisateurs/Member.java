package Utilisateurs;

import java.util.Comparator;

public abstract class Member implements Comparator<Member>, Comparable<Member> {
	private String pseudo;
	private String pwd;
	private String mail;
	private String role;
	
	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String pseudo, String pwd, String mail, String role) {
		super();
		this.pseudo = pseudo;
		this.pwd = pwd;
		this.mail = mail;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Member [pseudo=" + pseudo + ", pwd=" + pwd + ", mail=" + mail + ", role=" + role + "]";
	}
	
	@Override
	public int compare(Member member1, Member member2) {
		 String pseudo1 = member1.getPseudo();
		 String pseudo2 = member2.getPseudo();
		 if (pseudo1.compareTo(pseudo2) < 0) {
			return -1;
		} else if (pseudo1.compareTo(pseudo2) == 0){
			return 0;
		} else if (pseudo1.compareTo(pseudo2) > 0) {
			return 1;
		} else {
			return 2;
		} 
	}
	
	@Override
	public int compareTo(Member member) {
		return this.compare(this, member);
	}
	
}
