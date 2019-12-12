package projet;

import java.util.ArrayList;

public class Member {
    private String name;
    private double wallet;
    private ArrayList<Service> providedServices ;
    private SocialClass socialClass;
    
    public Member(String name, SocialClass socialClass) {
    	this.name = name;
    	this.socialClass = socialClass;
    	this.wallet = 10;
    	this.providedServices = new ArrayList<Service>();
    	
    }
    
    public String getName() { return this.name; }
    public double getWallet() { return this.wallet;}
    public ArrayList<Service> getServices(){ return  this.providedServices;}
    public SocialClass getSocialClass() {return this.socialClass;}
    public void setWallet(double salary) { this.wallet = salary;}
    public void addService(Service newService) {  this.providedServices.add(newService);}
    
    
}
    