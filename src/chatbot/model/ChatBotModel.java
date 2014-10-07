package chatbot.model;

import java.util.*;

import javax.swing.*;

/**
 * This is where all of the methods are and sends them to the controller to send
 * to the View.
 * 
 * @author jlin3312
 *
 */
public class ChatBotModel
{

	private String name;
	private int chatCount;
	private ArrayList<String> memeList;
	// Arrays.asList("hi","bye","yes","no"));
	private ArrayList<String> contentList;

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
											// constructor.
		contentList = new ArrayList<String>();
		fillTheMemeList();

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
	public int getchatCount()
	{
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

	private void fillTheMemeList()
	{
		memeList.add("Poke");
		memeList.add("hello");
		memeList.add(" my name");
		memeList.add("cool");
		memeList.add("bye");
		memeList.add("sucker");
	}

	private void fillTheContentList()
	{
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

		if (memeChecker(currentInput))// if it is true
		{
			result = "wow, " + currentInput + " is a meme  wahoo!";
		}

		else
		{
			result = "Not a meme, try again";
		}
		
		

		return result;
	}

	private void updateChatCount()
	{
		chatCount++;
	}
/**
 * 
 * @param currentInput
 * @return
 */
	private String contentChecker(String currentInput)
	{
		String content = "";
		String returnWord = "";
		
		if(currentInput.contains(""))
		{
			returnWord = "hello " + currentInput+ "my name is " + name;
		}
			
		
		

		
		
		
		return returnWord;

	}
/**
 * 
 * @param input
 * @return
 */
	private boolean memeChecker(String input)
	{
		boolean isAMeme = false;

		for (String currentMeme : memeList)// for each loop.
		{
			if (input.equalsIgnoreCase(currentMeme))
			{
				isAMeme = true;
			}
		}

		for (int loopCounter = 0; loopCounter < memeList.size(); loopCounter++)// for
																				// loop.
		{
			if (input.equalsIgnoreCase(memeList.get(loopCounter)))
			{
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
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;

		if (input != null && input.equals("yes"))
		{
			okToQuit = true;
		}

		return okToQuit;

	}

}
