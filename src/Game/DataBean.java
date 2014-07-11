package Game;

public class DataBean {

	private int result;
	private String serverChoice;
	private String userChoice;
	

	public DataBean(){
		
	}

	/**
	 * @return the choice
	 */
	public int getResult() {
		return result;
	}

	/**
	 * @param choice the choice to set
	 */
	public void setResult(int result) {
		this.result = result;
	}
	
	
	/**
	 * @return the serverChoice
	 */
	public String getServerChoice() {
		return serverChoice;
	}
	/**
	 * @param serverChoice the serverChoice to set
	 */
	public void setServerChoice(String serverChoice) {
		this.serverChoice = serverChoice;
	}
	/**
	 * @return the userChoice
	 */
	public String getUserChoice() {
		return userChoice;
	}
	/**
	 * @param userChoice the userChoice to set
	 */
	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}
	
	

	
	
}
