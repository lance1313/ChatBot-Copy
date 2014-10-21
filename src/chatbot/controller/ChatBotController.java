package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.ChatBotModel;
import chatbot.view.ChatBotFrame;
import chatbot.view.ChatBotView;
/**
 * Runs ChotBot project. Owns the model and associated views.
 * DON'T CALL POP UP WINDOWS ON CONTROLLERS
 * Get my MAC projects to gitHub.
 * @author Jacob Lindquist
 * @version 1.2 10/2/14 - Cleaned the quit method.
 */
public class ChatBotController
{
	/**
	 * 
	 */
	private ChatBotView appView;
	/**
	 * 
	 */
	private ChatBotModel myAwesomeChatBot;
	/**
	 * 
	 */
	private String startMessage;
	/**
	 * 
	 */
	private String quitMessage;
	/**
	 * reference to GUI frame.
	 */
	private ChatBotFrame appFrame;
	
	public ChatBotController()
	{
		appView = new ChatBotView(this);
		myAwesomeChatBot = new  ChatBotModel("derf");
		startMessage = "Welcome to the " + myAwesomeChatBot.getName() + " chatbot. What is your name?";
		quitMessage = "good bye cruel world:)";
		appFrame = new ChatBotFrame(this);//Instantiate the reference.
	}
	/**
	 * this is a constructor.
	 */
	public ChatBotModel getMyAwesomeChatBot()
	{
		return  myAwesomeChatBot;
	}
	
	public void start()
	{
		
		String result = appView.showChatBot(startMessage);
		//this is the quit checker in model
//		while(!myAwesomeChatBot.quitChecker(result))
//		{//this is a new result from the result in view.
//			
//			result = myAwesomeChatBot.processText(result);
//			result = appView.showChatBot(result);
//		}
//			quit();
//		
	}
	
		//start
	//say hello
	//dialog
	//responed
	//reply
	//quit
	

	private void quit()
	{
		appView.ShowChatBotMessage(quitMessage);
		System.exit(0);
	}
	

}
