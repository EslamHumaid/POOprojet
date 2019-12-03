package projet;

import java.util.ArrayList;

public class Task {
    private Service service;
    private Member beneficiary;
    private double duration;
    private int nb_Participents;
    private ArrayList<Member> participants;
    private boolean isVoluntary; 
    
    
    public Task(Service service , Member beneficiary, double duration, int nb_Participents, boolean isVoluntary) {
    	this.service = service;
    	this.beneficiary = beneficiary;
    	this.duration = duration;
    	this.nb_Participents = nb_Participents;
    	this.isVoluntary = isVoluntary;
    	this.participants = new ArrayList<Member>();
    	
    }
    
    public Service getService() { return this.service;}
    public double getDuration() { return this.duration;}
    public int getNbParticipants() {return this.nb_Participents;}
    
    public void addParticipants(Member addedMember) { this.participants.add(addedMember);}
    
}
