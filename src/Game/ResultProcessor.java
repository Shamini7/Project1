package Game;

import java.util.Random;

public class ResultProcessor {

	public DataBean compute(String s){
	
	String userChoice = s;
	DataBean db = new DataBean();
	String serverChoice = choiceofServer();
	db.setResult(computeResult(userChoice,serverChoice));
	db.setUserChoice(userChoice);
	db.setServerChoice(serverChoice);
	
	return db;
	
	}



	private int computeResult(String userChoice, String serverChoice) {
		// TODO Auto-generated method stub
		int flag = 0;
		
		
		
		
		System.out.println("Computing....");
		System.out.println("User choice--->" +userChoice);
		System.out.println("Server choice--->" +serverChoice);
	
		//String serverChoice = choiceofServer();
		//db.setServerChoice(serverChoice);
	
		if(serverChoice.equalsIgnoreCase("Rock")){
			if(userChoice.equalsIgnoreCase("Paper"))
				flag = 1;
			else
				flag = 0;
		}
		if(serverChoice.equalsIgnoreCase("Paper")){
			if(userChoice.equalsIgnoreCase("Scissors"))
				flag = 1;
			else
				flag = 0;
		}
		if(serverChoice.equalsIgnoreCase("Scissors")){
			if(userChoice.equalsIgnoreCase("Rock"))
				flag = 1;
			else
				flag = 0;
		}

		if(serverChoice.equalsIgnoreCase(userChoice)){
			flag = 2;
		}
		
		System.out.println("Flag value at the end--->"+flag);
	
		return flag;
	}



private String choiceofServer() {
	// TODO Auto-generated method stub

	
	String[] choiceForServer = {"Rock","Paper","Scissors"};
	String serverChoice = (choiceForServer[new Random().nextInt(choiceForServer.length)]);
	System.out.println("serverChoice---->" +serverChoice);
	
	return serverChoice;
}
	
	
}
