/*
 * POO Projet L2 2019
 *@author HUMAID Eslam, BAGHAWITAH Ahmed Groupe 384J 
 * 
 * @date 18/12/2019
 * 
*/
package projet;

import java.util.ArrayList;

public class Task {
    private Service service;
    private Member beneficiary;
    private double duration;   
    private ArrayList<Member> participants;
    private boolean isVoluntary;
    private int nbParticipantsNeeded;
    
    
    public Task(Service service , Member beneficiary, double duration, boolean isVoluntary, int nbParticipantsNeeded) {
    	this.service = service;
    	this.beneficiary = beneficiary;
    	this.duration = duration;   
    	this.isVoluntary = isVoluntary;
    	this.participants = new ArrayList<Member>();
    	this.nbParticipantsNeeded = nbParticipantsNeeded;
    	
    }
    
    
    public Member getBeneficiary() {return this.beneficiary;}
    public Service getService() { return this.service;}
    public double getDuration() { return this.duration;}
    public int getNbParticipants() {return this.nbParticipantsNeeded;}
    public void addParticipants(Member addedMember) { this.participants.add(addedMember);} //only used by admin
    public ArrayList<Member> getParticipantsList(){ return this.participants;}
    
    public double calculeCost() {         
    	if(this.isVoluntary) { 
    		return 0;
    	}else {
    	
    	return this.service.getCost() * this.duration * this.getNbParticipants();
    	
    	}
    }
    
}
