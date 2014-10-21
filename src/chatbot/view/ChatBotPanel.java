package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import chatbot.controller.ChatBotController;

/**
 * 
 * @version1.1 10/21/14
 * @author jlin3312
 *
 */
public class ChatBotPanel extends JPanel {

	private ChatBotController baseController;//import the controller.
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	/**
	 * 
	 * @param baseController this links this panel to the controller.
	 */
	public ChatBotPanel(ChatBotController baseController)
	{
		this.baseController = baseController;
		firstButton = new JButton("click the button... it is so clicky.");
		firstTextField = new JTextField(25);
		baseLayout = new SpringLayout();
		chatArea = new JTextArea(5,20);
		chatPane = new JScrollPane(chatArea);
		
		
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setSize(400,400);
		this.setLayout(baseLayout);//make the layout what you coded in the base layout
		this.add(firstButton);
		this.add(firstTextField);
		this.add(chatPane);
	}
	
	private void setupLayout()//dumping ground
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 92, SpringLayout.SOUTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, 0, SpringLayout.EAST, firstTextField);
	}
	
	private void setupListeners()//this is what buttons do.
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText(firstTextField.getText()+":)");
			}
		});
	}
			
	
}
