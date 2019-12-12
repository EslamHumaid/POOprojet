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
	
	
	
	//returns the list of members with the service of the task
	public ArrayList<Member> membersWithService(Task task) {
		
		
		
		String wantedService = task.getService().getNameService();
		
		ArrayList<Member> membersWithService = new ArrayList<Member>();
		
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
	
	
	
	public void TaskPayment(Task task) {
		double dividend = task.calculeCost() / task.getNbParticipants();
		
		for(Member member : task.getParticipantsList()) {
			member.setWallet(member.getWallet() + dividend); 
		}
		
		task.getBeneficiary().setWallet(task.getBeneficiary().getWallet() - (task.calculeCost()*(task.getBeneficiary().getSocialClass().getFraction())));
		
	}
	
	
	public boolean chooseMembers(Task task) {
		
		if(!this.isAValidTask(task)) {
			return false;
		}else {
			ArrayList<Member> membersWithService = this.membersWithService(task);
			
			int membersAdded = 0;
			int indice;
			Random r = new Random();
			boolean memberFound;    //if the member is already in the list of participants
			
			while(membersAdded < task.getNbParticipants()) {
				memberFound = false;
				
		        indice =  r.nextInt((membersWithService.size()));
		        
		        for(Member member : task.getParticipantsList() ) {
		        	if(member.getName() == membersWithService.get(indice).getName()) {
		        		memberFound = true;
		        		
		        	}
		        }
		    
		        		        
		        
		        if(!memberFound) {
		        	
		        	
		        	task.addParticipants(membersWithService.get(indice));
		        	membersAdded++;
		        
		        }
				
				
				
			}
			
			return true;
			
		}
		
		
		
	}
	
	
	
	public boolean isAValidTask(Task task) {
		

		if(task.getBeneficiary().getWallet() < task.calculeCost()*task.getBeneficiary().getSocialClass().getFraction()) {
			return false;
		}else {
			return (task.getNbParticipants() <= membersWithService(task).size());
			
		}
			
						
		
	}
	

}