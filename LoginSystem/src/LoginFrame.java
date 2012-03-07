
//Author: Leander Stolk
//Project BusinessRuleGenerator

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class LoginFrame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 4830104090596232290L;
	
	private JButton newUserButton = new JButton("New User");
	private JButton loginButton = new JButton("Log in");
	private JButton closeButton = new JButton("Exit");
	private JButton clearButton = new JButton("Clear");
	private JTextField namef = new JPasswordField(12);
	private JPasswordField passf = new JPasswordField(12);
	private JCheckBox credentials = new JCheckBox();
	
	//private Model model = Main.model;

	  public LoginFrame() 
	  {
	      initGUI();
	  }
	
	  public void initGUI() 
	  {
	  	  System.out.println("Application has started");
	      setLayout(null);
	      
	      JLabel name = new JLabel("Name:");
	      name.setBounds(10,10,100,20);
	              
	      namef.setBounds(10,35,100,20);
	      
	      JLabel pass = new JLabel("Password:");
	      pass.setBounds(10,60,100,20);
	                   
	      passf.setBounds(10,85,100,20);
	                 
	      loginButton.setBounds(150, 10, 90, 20);
	      loginButton.setHorizontalAlignment(SwingConstants.LEFT);
	      loginButton.addActionListener((ActionListener) this);
	      
	      clearButton.setBounds(150, 35, 90, 20);
	      clearButton.setHorizontalAlignment(SwingConstants.LEFT);
	      clearButton.addActionListener(this);
	
	      newUserButton.setBounds(150, 60, 90, 20);
	      newUserButton.setHorizontalAlignment(SwingConstants.LEFT);
	      newUserButton.addActionListener(this);
	  
	      closeButton.setBounds(150, 85, 90, 20);
	      closeButton.setHorizontalAlignment(SwingConstants.LEFT);
	      closeButton.addActionListener(this);
	      
	      credentials.setBounds(7, 105, 30, 30);
	      credentials.addActionListener(this);
	      credentials.setSelected(true);
	      
	      JLabel credentialL = new JLabel("Save credentials");
	      credentialL.setBounds(35, 110 ,100,20);
	      
	      add(loginButton);
	      add(clearButton);
	      add(newUserButton);
	      add(closeButton);
	      add(newUserButton);
	      add(name);
	      add(pass);
	      add(namef);
	      add(passf);
	      add(credentials);
	      add(credentialL);
	     
	      setTitle("Log in");
	      setSize(265, 175);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setLocationRelativeTo(null);
	  }    
	  
	  public void clear()
	  {
		  namef.setText("");
		  passf.setText("");
	  }
	  
	  public void close()
	  {
		  System.exit(0);
	  }
	
	  public void actionPerformed(ActionEvent e)
	  {
		  if(closeButton==e.getSource())
		  {
			  close();
		  }
		  if(clearButton==e.getSource())
		  {
			  clear();
		  }
		  if(loginButton==e.getSource())
		  {
			  
		  }
	  }
}