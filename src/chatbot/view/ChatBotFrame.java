package chatbot.view;

import javax.swing.JFrame;
import chatbot.controller.ChatBotController;
//
/**
 * 
 * @author jlin3312
 *only holds panels.
 */
public class ChatBotFrame extends JFrame 
{
	private ChatBotPanel basePanel;
	public ChatBotFrame(ChatBotController baseController) 
	{
		basePanel = new ChatBotPanel(baseController);
		setupFrame();
	}
	/**
	 * this builds the frame on the computer.
	 */
	private void setupFrame()
	{
		
		this.setContentPane(basePanel);//this means i can do all the parent class can do to .
		this.setSize(400,400);
		this.setResizable(false);
		
		setVisible(true);
	}

}
