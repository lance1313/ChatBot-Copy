package chatbot.model;

import java.util.*;

import javax.swing.*;
import chatbot.model.ChatBotUser;
import chatbot.controller.ChatBotController;

/**
 * This is where all of the methods are and sends them to the controller to send
 * to the View.
 * 
 * @author jlin3312
 *
 */
public class ChatBotModel {

	private String name;
	private int chatCount;
	private ArrayList<String> memeList;
	// Arrays.asList("hi","bye","yes","no"));
	private ArrayList<String> contentList;
	private ChatBotUser myUser;
	private ArrayList<String> userInputList;
	

	/**
	 * creates an chatbot object with suppleid name and initializes the current
	 * number of chats to zero
	 * 
	 * @param name
	 */

	public ChatBotModel(String name)

	{
		this.name = name;
		chatCount = 0;
		memeList = new ArrayList<String>();// use paranthesis to call a
		myUser  = new ChatBotUser();
						// constructor.
		contentList = new ArrayList<String>();
		fillTheMemeList();
		userInputList = new ArrayList<String>();

	}

	/** 
	 * this returns the name value.
	 * 
	 * @return
	 */
	public String getName()// getter
	{
		return name;
	}

	/**
	 * This gets the amount of chat that is used.
	 * 
	 * @return
	 */
	public int getchatCount() {
		return chatCount;
	}

	/**
	 * This sets the name to the string name in chatBotController.
	 * 
	 * @param name
	 *            The new name for the chatBot.
	 */
	public void setName(String name)// setter
	{
		this.name = name;
	}

	private void fillTheMemeList() {
		memeList.add("Poke");
		memeList.add("hello");
		memeList.add(" my name");
		memeList.add("cool");
		memeList.add("bye");
		memeList.add("sucker");
	}

	private void fillTheContentList() {
		contentList.add("");
		contentList.add("");
		contentList.add("");
		contentList.add("");
	}

	/**
	 * 
	 * @param currentInput
	 *            This is were you pass the checkers to the controller to give
	 *            to the view.
	 * @return the proccesed text based on checker or other methods/arraylist.
	 */
	public String processText(String currentInput)
	{
		String result = "";
		
		if(getchatCount() < 5)
		{
			
			if(getchatCount() < 1)
			{
			result = ChatBotController.startMessage;
			}
			else if(getchatCount() < 2)
			{
				result = "What is your name";
			}
			else if(getchatCount() < 3)
			{
				result = "What is your age";
			}
			else if(getchatCount() < 4)
			{
				result = "What is your height";
			}
			else if(getchatCount() < 5)
			{
				result = "Do you play card games?";
				
			}
			
			updateChatCount();
			return result;
		}
		
		int randomPosition = (int) (Math.random()* 6);
		if(currentInput != null)
		{
		
		if(randomPosition == 0)
		{
			//this is String checker here
			if(stringChecker(currentInput))
			{
				result = "too long.";
			}
			
			else
			{
				result = "too short";
			
		}
		}
		
		else if(randomPosition == 1)
		{
			//contentChecker here.
			if(contentChecker(currentInput))
			{
				result = "You are cool.";
			}
			else
			{
				result = "ZZZZzzz.";
			}
		}
		
		else if(randomPosition == 2)
		
		{
		
		if (memeChecker(currentInput))// if it is true
		{
			result = "wow, " + currentInput + " is a meme  wahoo!";
		}
		else
		{
			result = "Not a meme, try again";
		}
		}
		
		else if(randomPosition == 3)
		{
		//talk about user here.
		}
		else if(randomPosition == 4)
		{
		//add to our list
		}
		else 
		{
			if(UserInputChecker(currentInput))
			{
				result = "Thank you for the comment";
			}
			else
			{
				
			}
			
			//list Cheker and removal.
		}
		
		
		}
		
	
		else
		{
		result = "use words!!!!";	
		
		updateChatCount();
		return result;
		}
		return result;
}
	/**
	 * 
	 * @param userInput
	 * @return
	 */
	private boolean UserInputChecker(String userInput)
	{
		boolean matchesInput = false;
		
		for(int loopCount = 0; loopCount < userInputList.size(); loopCount++)
		{
		if(userInput.equalsIgnoreCase(userInputList.get(loopCount)))
		{
		matchesInput = true;
		userInputList.remove(loopCount);
		loopCount--;
		}
		
		}
		return matchesInput;
	}
	
	
	private void updateChatCount() {
		chatCount++;
	}

	/**
	 * 
	 * @param currentInput
	 * @return
	 */
	private boolean contentChecker(String currentInput) {

		boolean returnWord = false;

		if (currentInput.contains("Jacob")) {
			//returnWord = "hello " + currentInput + "my name is " + name;
		}
		return returnWord;

	}

	private boolean stringChecker(String currentInput) {

		boolean isToLong = false;
		if (currentInput.length() >= 10)
		{
			isToLong = true;
		}

		return isToLong;

	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	private boolean memeChecker(String input) {
		boolean isAMeme = false;

		for (String currentMeme : memeList)// for each loop.
		{
			if (input.equalsIgnoreCase(currentMeme)) {
				isAMeme = true;
			}
		}

		for (int loopCounter = 0; loopCounter < memeList.size(); loopCounter++)// for
																				// loop.
		{
			if (input.equalsIgnoreCase(memeList.get(loopCounter))) {
				isAMeme = true;
			}

		}

		return isAMeme;

	}

	/**
	 * This checks the input from the view to see if you should quit.
	 * 
	 * @param input
	 * @return
	 */
	public boolean quitChecker(String input) {
		boolean okToQuit = false;

		if (input != null && input.equals("yes")) {
			okToQuit = true;
		}

		return okToQuit;

	}

}
