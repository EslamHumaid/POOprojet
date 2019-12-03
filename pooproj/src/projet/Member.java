package projet;

import java.util.ArrayList;

public class Member {
    private String name;
    private int salary;
    private ArrayList<Service> providedServices ;
    private SocialClass socialClass;
    
    public Member(String name, SocialClass socialClass) {
    	this.name = name;
    	this.socialClass = socialClass;
    	this.salary = 10;
    	this.providedServices = new ArrayList<Service>();
    	
    }
    
    public String getName() { return this.name; }
    public int getSalary() { return this.salary;}
    public ArrayList<Service> getServices(){ return  this.providedServices;}
    
    public void setSalary(int salary) { this.salary = salary;}
    public void addService(Service newService) {  this.providedServices.add(newService);}
    
    
}
    
