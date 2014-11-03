package chatbot.model;

public class ChatBotUser {
	//four data members.
	//at least 2 different types int String boolean
	private String userName;
	private double height;
	private int age;
	private boolean playsCardGames;
	
	public ChatBotUser()
	{
		this.userName = "";
			this.age = -999;
		this.height = 100;
		this.playsCardGames = false;
		
	}
/**
 * 
 * @return new name for the user.
 */
	public String getUserName() {
		return userName;
	}

	/**
	 *
	 * @return new height for user
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * 
	 * @return new age for user
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 
	 * @return new name for user
	 */
	public boolean isPlaysCardGames() {
		return playsCardGames;
	}
/**
 * 
 * @param playsCardGames the supplied boolean value for this.
 */
	public void setPlaysCardGames(boolean playsCardGames) {
		this.playsCardGames = playsCardGames;
	}
	/**
	 * 
	 * @param userName set name for user
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 
	 * @param height set height for user
	 */
	public void setHeight(double height) {
		this.height = height;
	}

}
