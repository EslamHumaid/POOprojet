/*
 * POO Projet L2 2019
 *@author HUMAID Eslam, BAGHAWITAH Ahmed Groupe 384J 
 * 
 * @date 18/12/2019
 * 
*/
package projet;

public class test {
  public static void main(String[] args) {
	  
	  System.out.println("creating admin : lea....");
	  Admin lea = new Admin("lea");
	  System.out.println("lea is creating a new network (echange)");
	  lea.creatNetwork("echange");
	  System.out.println("network (echange) has been created by lea");
	  
	  System.out.println("");
	  System.out.println("");
	  
	  System.out.println("creating members...");
	  Member maxime = lea.createMember("maxime", new ZeroClass());
	  System.out.println("maxime has been created by lea");
	  Member charly = lea.createMember("charly", new HalfClass());
	  System.out.println("charly has been created by lea");
	  Member eslam = lea.createMember("eslam", new NormalClass());
	  System.out.println("eslam has been created by lea");
	  Member ahmed = lea.createMember("charly", new HalfClass());
	  System.out.println("ahmed has been created by lea");
	  
	  System.out.println("");
	  System.out.println("");
	  
	  //test socialclass
	  System.out.println("displaying members fractions...");
	  System.out.println(maxime.getName() + " whose social class is zero, fraction =  " + maxime.getSocialClass().getFraction());
	  System.out.println(charly.getName() + " whose social class is half,  fraction =  " + charly.getSocialClass().getFraction());
	  System.out.println(lea.getName() + " whose social class is normal,  fraction =  " +lea.getSocialClass().getFraction());
	  
	  System.out.println("");
	  System.out.println("");
	  
	  System.out.println("creating new servieces..");
	  Service serv1 = new Service("driving" , 5);
	  System.out.println("driving service has been created");
	  Service serv2 = new Service("bodyguard" , 10);
	  System.out.println("bodyguard service has been created");
	  Service serv3 = new Service("cleaning" , 7);
	  System.out.println("cleaning service has been created");
	  Service serv4 = new Service("programming" , 12);
	  System.out.println("programming service has been created");
	  
	  System.out.println("");
	  System.out.println("");
	  
	  //test Member
	  System.out.println("adding services to members...");
	  maxime.addService(serv1);
	  System.out.println("driving service has been added to maxime");
	  maxime.addService(serv2);
	  System.out.println("bodyguard service has been added to maxime");
	  charly.addService(serv1);
	  System.out.println("driving service has been added to charly");
	  charly.addService(serv2);
	  System.out.println("bodyguard service has been added to charly");
	  lea.addService(serv3);
	  System.out.println("cleaning service has been added to lea");
	  lea.addService(serv4);
	  System.out.println("programming service has been added to lea");
	  ahmed.addService(serv1);
	  System.out.println("driving service has been added to ahmed");
	  ahmed.addService(serv2);
	  System.out.println("bodyguard service has been added to ahmed");
	  ahmed.addService(serv4);
	  System.out.println("programming service has been added to ahmed");
	  eslam.addService(serv2);
	  System.out.println("cleaning service has been added to eslam");
	  eslam.addService(serv4);
	  System.out.println("programming service has been added to eslam");
	  
	  
	  System.out.println("");
	  System.out.println("");
	  
	  System.out.println("setting maxime's wallet to 50 jetons");
	  maxime.setWallet(50);
	  
	  System.out.println("maxime wallet = " + maxime.getWallet());
	  
	  System.out.println("setting ahmed's wallet to 15 jetons");
	  ahmed.setWallet(15);
	  
	  System.out.println("ahmed wallet = " + ahmed.getWallet());
	  
	  System.out.println("setting eslam's wallet to 30 jetons");
	  eslam.setWallet(30);
	  
	  System.out.println("eslam wallet = " + eslam.getWallet());
	  
	  System.out.println("setting lea's wallet to 70 jetons");
	  lea.setWallet(70);
	  
	  System.out.println("eslam wallet = " + lea.getWallet());
	  
	  System.out.println("setting charly's wallet to 37 jetons");
	  charly.setWallet(37);
	  
	  System.out.println("eslam wallet = " + charly.getWallet());
	  
	  
	  System.out.println("");
	  System.out.println("");
	  
	  System.out.println("displaying members services... : ");
	  System.out.println("maxime services : ");
	  
	  for(Service serv : maxime.getServices()) {
		  System.out.println("              " + serv.getNameService());
	  }
	  
	  System.out.println("charly services : ");
	  
	  for(Service serv : charly.getServices()) {
		  System.out.println("              " + serv.getNameService());
	  }
	  
	  System.out.println("lea services : ");
	  
	  for(Service serv : lea.getServices()) {
		  System.out.println("              " + serv.getNameService());
	  }
	  System.out.println("eslam services : ");
	  
	  for(Service serv : eslam.getServices()) {
		  System.out.println("              " + serv.getNameService());
	  }
	  
	  System.out.println("ahmed services : ");
	  
	  for(Service serv : ahmed.getServices()) {
		  System.out.println("              " + serv.getNameService());
	  }
	  
	  
	  //test task
	 
	  
	  System.out.println("creating tasks... ");
	  Task task1 = new Task(serv2 , maxime, 1.5 , false, 3) ;
	  System.out.println("task1 :- \n beneficiary :maxime " + "\n service : bodyguard " + "\n duration : 1 hour and a half " + " \n task is not voluntary" + "\n task needs 3 members");
	  System.out.println(" task1 cost =  " + task1.calculeCost());
	  System.out.println("");	  
	  Task taskV = new Task(serv2 , charly, 2 , true, 2) ;
	  System.out.println("taskV :- \n beneficiary :charly " + "\n service : bodyguard " + "\n duration : 2 hours " + " \n task is voluntary" + "\n task needs 2 members");
	  System.out.println(" taskV cost =  " + taskV.calculeCost());
	  System.out.println("");
	  Task task2 = new Task(serv3 , lea, 1.2 , false, 2) ;
	  System.out.println("task2 :- \n beneficiary :lea " + "\n service : cleaning " + "\n duration : 1 hour and 20min " + " \n task is not voluntary" + "\n task needs 1 member");
	  System.out.println(" task2 cost =  " + task2.calculeCost());
	  System.out.println("");
	  Task task3 = new Task(serv4 , lea, 3 , false, 2) ;
	  System.out.println("task3 :- \n beneficiary :lea " + "\n service : programming " + "\n duration : 3 hours " + " \n task is not voluntary" + "\n task needs 2 members");
	  System.out.println(" task3 cost =  " + task3.calculeCost());
	  System.out.println("");
	  System.out.println("");
	  
	  
	  

	  
	
	  
	  
	  //test Admin
	  try {
		  System.out.println("Testing validity...");  
		  System.out.println("task1 is valid? " + lea.isAValidTask(task1));  //result : true
		  System.out.println("taskV is valid? " + lea.isAValidTask(taskV));  //result : true
		  System.out.println("task2 is valid? " + lea.isAValidTask(task2));  //result : false
		  System.out.println("reason: not enough members with cleaning service");  
		  System.out.println("task3 is valid? " + lea.isAValidTask(task3));  //result : false
		  System.out.println("reason: not enough jetons in lea's wallet"); 
		  System.out.println("");
		  System.out.println("");
	  
		  System.out.println("Choosing members for task1... ");
		  lea.chooseMembers(task1);
		  
	  }
	  catch(Exception e) {
		  System.out.println(e);
	  }
	  
	  
	  
	  try {
		  System.out.println("Choosing members for taskV... ");
		  lea.chooseMembers(taskV);
	  }
	  catch(Exception e) {
		  System.out.println(e);
	  }
	  
	  
	  try {
		  System.out.println("Choosing members for task2... ");
		  lea.chooseMembers(task2);
	  }
	  catch(Exception e) {
		  System.out.println(e);
	  }
	  
	  try {
		  System.out.println("Choosing members for task3... ");
		  lea.chooseMembers(task3);
	  }
	  catch(Exception e) {
		  System.out.println(e);
	  }
	  
	  
	  System.out.println("");
	  System.out.println("");
	  System.out.println("task1 members: ");
	  for(Member member : task1.getParticipantsList()) {
		  System.out.println("              " + member.getName());
	  }
	  
	  System.out.println("taskV members: ");
	  for(Member member : taskV.getParticipantsList()) {
		  System.out.println("              " + member.getName());
	  }
	  System.out.println("");
	  System.out.println("");
	  
	  
	  System.out.println("Validating the payment of Tasks...");
	  System.out.println("");
	  
	  System.out.println("Members wallets before payments:");
	  System.out.println("lea's money : " + lea.getWallet());
	  System.out.println("maxime's money : " + maxime.getWallet());
	  System.out.println("charly's money : " + charly.getWallet());
	  System.out.println("ahmed's money : " + ahmed.getWallet());
	  System.out.println("eslam's money : " + eslam.getWallet());
	  System.out.println("");
	  
	  
	  
	  try {
	  System.out.println("Paying task1..");
	  lea.TaskPayment(task1);
	  }
	  catch(Exception e) { 
		  System.out.println(e);
	  }
	  System.out.println("");
	  System.out.println("Members wallets:");
	  System.out.println("lea's money : " + lea.getWallet());
	  System.out.println("maxime's money : " + maxime.getWallet());
	  System.out.println("charly's money : " + charly.getWallet());
	  System.out.println("ahmed's money : " + ahmed.getWallet());
	  System.out.println("eslam's money : " + eslam.getWallet());
	  System.out.println("");
	  try {
	  System.out.println("Paying taskV..(taskV is volutnary so no changes are expected in the wallets)");
	  lea.TaskPayment(taskV);
	  }
	  catch(Exception e) { 
		  System.out.println(e);
	  }
	  System.out.println("");
	  System.out.println("Members wallets:");
	  System.out.println("lea's money : " + lea.getWallet());
	  System.out.println("maxime's money : " + maxime.getWallet());
	  System.out.println("charly's money : " + charly.getWallet());
	  System.out.println("ahmed's money : " + ahmed.getWallet());
	  System.out.println("eslam's money : " + eslam.getWallet());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
