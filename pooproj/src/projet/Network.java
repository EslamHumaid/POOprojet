package projet;

import java.util.ArrayList;
/*
    Precondition : having identical members ( members with the same name ) is not possible

*/
public class Network {
	private ArrayList<Member> membersList;
	private Admin admin;
	private String name;
	
	public Network(Admin admin,String name) {
		this.admin = admin;
		this.membersList = new ArrayList<Member>();
		this.name = name;
		
	}
	
	public void addMember(Member toAdd) {
		this.membersList.add(toAdd);
	}
	
	public void removeMember(Member toRemove) {
		this.membersList.remove(toRemove);
	}
	
	public ArrayList<Member> getMembersList(){ return this.membersList;}
	
	
	

}
