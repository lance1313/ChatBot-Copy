package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import chatbot.controller.ChatBotController;
import chatbot.model.ChatBotModel;


/**
 * 
 * @version1.1 10/21/14
 * @author jlin3312
 *
 */
public class ChatBotPanel extends JPanel {

	private ChatBotController baseController;//import the controller.
	private ChatBotModel baseModel;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private JButton secondButton;
	
	/**
	 * 
	 * @param baseController this links this panel to the controller.
	 */
	public ChatBotPanel(ChatBotController baseController,ChatBotModel baseModel)
	{
		this.baseController = baseController;
		this.baseModel = baseModel;
		firstButton = new JButton("click the button... it is so clicky.");
		firstTextField = new JTextField(25);
		baseLayout = new SpringLayout();
		chatArea = new JTextArea(5,20);
		chatPane = new JScrollPane(chatArea);
		secondButton = new JButton("???");
		

		
		
		
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public String displayChat()
	{
		String initialMessage;
		if(baseModel.getchatCount() > 0)
		{
			initialMessage = baseController.startMessage;
		}
		
		else
		{
			System.exit(0);
		}
		
		return initialMessage;
		
	}
	
	private void setupPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
	}
	/**
	 * this is were you put the GUI to be dysplayed on the panel in the frame.
	 */
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setSize(400,400);
		this.setLayout(baseLayout);//make the layout what you coded in the base layout
		this.add(firstButton);
		this.add(firstTextField);
		this.add(chatPane);
		this.add(secondButton);
		
	}
	
	private void setupLayout()//dumping ground
	{
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 200, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 100, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 300, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 100, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, secondButton, 350, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, secondButton, 175, SpringLayout.WEST, this);
	}
	
	
	private void setupListeners()//this is what buttons do.
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText(firstTextField.getText()+ );
			}
		});
		
		
	}
			
	
}
