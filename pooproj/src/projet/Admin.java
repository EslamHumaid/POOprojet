/*
 * POO Projet L2 2019
 *@author HUMAID Eslam, BAGHAWITAH Ahmed Groupe 384J 
 * 
 * @date 18/12/2019
 * 
*/
package projet;

import java.util.ArrayList;
import java.util.Random;

public class Admin extends Member {
	
	private Network network;
	
	public Admin(String name) {
		super(name,new NormalClass());
		this.network = null;
		
	}
	
	public void creatNetwork(String name) {
		this.network = new Network(this, name);
		this.network.addMember(this);
	}
	
	public void addMember(Member toAdd) {
		this.network.addMember(toAdd);
	}
	
	public Member createMember(String name, SocialClass sc) {
		Member newMember = new Member(name, sc);
		this.addMember(newMember);
		return newMember;
	}
	
	
	public void removeMember(Member toRemove) {
		this.network.removeMember(toRemove);
	}
	
	
	
	
	public ArrayList<Member> membersWithService(Task task) throws NetworkException  {
		
		if(network.getMembersList().isEmpty()) {  //if there is no members in this network
			throw new NetworkException("there are no members in this network");
		}else {
		
		    String wantedService = task.getService().getNameService();
			
			ArrayList<Member> membersWithService = new ArrayList<Member>();  //the members with the service of the task in this network
			
			boolean serviceFound;
			
			for(Member member : this.network.getMembersList()) {
				serviceFound = false;
				
				for(Service serv : member.getServices()) {
					if(serv.getNameService() == wantedService) {
						serviceFound = true;
					}
				}
				
							
				if(serviceFound) {
					membersWithService.add(member);
				}
				
			}
		
		
			
		
			return membersWithService;
		}
	}
	
	
	
	public void TaskPayment(Task task) throws NetworkException {
		double toPay; //the amount of money that the beneficiary should pay
		
		if(!this.isAValidTask(task)) {
			throw new NetworkException("task is not valid");
		}else {
			double dividend = task.calculeCost() / task.getNbParticipants();  //the amount of money that the participants should receive
			
			for(Member member : task.getParticipantsList()) {
				member.setWallet(member.getWallet() + dividend); 
			}
			
			toPay = task.calculeCost()*(task.getBeneficiary().getSocialClass().getFraction());
			
			task.getBeneficiary().setWallet(task.getBeneficiary().getWallet() - toPay);
		}
	}
	
	
	public void chooseMembers(Task task) throws NetworkException {
		
		if(!this.isAValidTask(task)) {
			throw new NetworkException("task is not valid");
		}else {
			ArrayList<Member> membersWithService = this.membersWithService(task); //the members with the service of the task 
			
			int membersAdded = 0;
			int indice;
			Random r = new Random();
			boolean memberFound;    //if the member is already in the list of participants
			
			while(membersAdded < task.getNbParticipants()) {
				memberFound = false;
				
		        indice =  r.nextInt((membersWithService.size()));  //random selection of the index of a member
		        
		        for(Member member : task.getParticipantsList() ) {
		        	if(member.getName() == membersWithService.get(indice).getName()) {
		        		memberFound = true;
		        		
		        	}
		        }
		    
		        		        
		        
		        if(!memberFound) {  //if the member is not already chosen
		        	
		        	
		        	task.addParticipants(membersWithService.get(indice));
		        	membersAdded++;
		        
		        }
				
				
				
			}
			
			
			
		}
		
		
		
	}
	
	
	
	public boolean isAValidTask(Task task) throws NetworkException {
		
		double toPay = task.calculeCost()*task.getBeneficiary().getSocialClass().getFraction(); //the amount of money that the beneficiary should pay
		

		if(task.getBeneficiary().getWallet() < toPay) { //if the beneficiary does not have  money
			return false;
		}else {
			
			return (task.getNbParticipants() <= membersWithService(task).size()); //if there is no enough members with the service in the network
			
		}
			
						
		
	}
	

}
