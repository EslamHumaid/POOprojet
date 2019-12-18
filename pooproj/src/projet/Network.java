/*
 * POO Projet L2 2019
 *@author HUMAID Eslam, BAGHAWITAH Ahmed Groupe 384J 
 * 
 * @date 18/12/2019
 * 
 * Precondition : having identical members ( members with the same name ) is not possible
*/
package projet;

import java.util.ArrayList;

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
