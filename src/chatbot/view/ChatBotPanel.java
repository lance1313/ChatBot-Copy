package chatbot.view;

import javax.swing.JPanel;

import chatbot.controller.ChatBotController;

/**
 * 
 * @author jlin3312
 *
 */
public class ChatBotPanel extends JPanel {

	private ChatBotController baseController;//import the controller.
	public ChatBotPanel(ChatBotController baseController)
	{
		this.baseController = baseController;
	}
}
