package projet;

public class NormalClass extends SocialClass {
    private double fraction ;
    
    public NormalClass() {
    	super("Normal");
    	this.fraction = 1;
    }
    
    public double getFraction() {return this.fraction;}
    
}
