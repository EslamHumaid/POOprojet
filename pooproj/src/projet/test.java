package projet;

public class test {
  public static void main(String[] args) {
	  
	  Admin lea = new Admin("lea");
	  lea.creatNetwork("echange");
	  
	  Member maxime = lea.createMember("maxime", new ZeroClass());
	  Member charly = lea.createMember("charly", new HalfClass());
	  
	  
	  
	  
	  
	  //test socialclass
	  System.out.println(maxime.getName() + " fraction =  " + maxime.getSocialClass().getFraction());
	  System.out.println(charly.getName() + " fraction =  " + charly.getSocialClass().getFraction());
	  System.out.println(lea.getName() + " fraction =  " +lea.getSocialClass().getFraction());
	  
	  //test Member
	  maxime.addService(new Service("driving" , 5));
	  maxime.addService(new Service("body guard" , 20));
	  charly.addService(new Service("driving" , 5));
	  charly.addService(new Service("body guard" , 20));
	  
	  
	  maxime.setWallet(100);
	  System.out.println("maxime salary = " + maxime.getWallet());
	  
	  System.out.println("maxime services : ");
	  
	  for(Service serv : maxime.getServices()) {
		  System.out.println("              " + serv.getNameService());
	  }
	  
	  
	  //test task
	  Service serv1 = new Service("driving" , 5);
	  
	  Task task1 = new Task(serv1 , maxime, 1 , false, 3) ;
	  Task taskV = new Task(serv1 , charly, 1 , true, 2) ;
	  Task task2 = new Task(serv1 , lea, 1 , false, 1) ;
	  Task task3 = new Task(serv1 , lea, 1 , false, 2) ;
	  
	  System.out.println("maxime task cost =  " + task1.calculeCost());   //result : 15.0
	  System.out.println("charly task cost =  " + taskV.calculeCost());  //result : 0.0
	  
	  
	  //test Admin
	  System.out.println("maxime task is valid? " + lea.isAValidTask(task1));  //result : false
	  System.out.println("charly task is valid? " + lea.isAValidTask(taskV));  //result : false
	  
	  System.out.println("lea task is valid? " + lea.isAValidTask(task2));  //result : true
	  
	  System.out.println("members added to task? " + lea.chooseMembers(task3));  //result : true
	  
	  System.out.println("task2 members : ");
	  
	  for(Member member : task3.getParticipantsList()) {
		  System.out.println("              " + member.getName());
	  }
	  
	  lea.TaskPayment(task3);
	  System.out.println("lea's money : " + lea.getWallet());
	  System.out.println("maxime's money : " + maxime.getWallet());
	  System.out.println("charly's money : " + charly.getWallet());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
