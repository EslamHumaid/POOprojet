/*
 * POO Projet L2 2019
 *@author HUMAID Eslam, BAGHAWITAH Ahmed Groupe 384J 
 * 
 * @date 18/12/2019
 * 
*/
package projet;

public class Service {
    private String nameService;
    private int cost_h;   //cout par heure 
    
    public Service(String name, int cost) {
    	this.nameService = name;
    	this.cost_h = cost;
    	
    }
    
    public String getNameService() {return this.nameService;}
    public int getCost() { return this.cost_h;}
    
    
    
}
