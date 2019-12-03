package projet;

public abstract class SocialClass {
	private String nameClass;
	
	public SocialClass(String name) {
		this.nameClass = name;
	}
	
	public abstract double getFraction();
	public String getNameClass() { return this.nameClass;}
	
}
