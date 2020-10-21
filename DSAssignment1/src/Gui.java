import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Gui extends JFrame implements ActionListener {
	public String data[][];
	public String column[] = {"Tax Number","First Name", "Last Name", "Job Tittle","Salary", "Email"};
	
	/**
	 * The LABELS
	 */
	public JLabel taxNumberLabel;
	public JLabel firstNameLabel;
	public JLabel lastNameLabel;
	public JLabel jobTitleLabel;
	public JLabel salaryLabel;
	public JLabel emailLabel;
	
	/**
	 * The TextFields
	 */
	public JTextField taxNumberText;
	public JTextField firstNameText;
	public JTextField lastNameText;
	public JTextField jobTitleText;
	public JTextField salaryText;
	public JTextField emailText;
	
	/**
	 * The Buttons
	 */
	JButton saveButton;
	JButton updateButton;
	JButton deleteButton;
	
	/**
	 * The Table and Title label
	 */
	JTable listTable;
	JLabel tittleLabel;
	
	public Gui(){
		
		/**
		 * Creating the Labels
		 */
		tittleLabel = new JLabel("JAVA/ MYSQL CRUID APPLICATION");
		taxNumberLabel = new JLabel("Tax Number");
		firstNameLabel = new JLabel("First Name");
		lastNameLabel = new JLabel("Last Name");
		jobTitleLabel = new JLabel("Job Tittle");
		salaryLabel = new JLabel("Salary");
		emailLabel = new JLabel("Email");
		
		/**
		 * Setting the bounds for the Labels
		 */
		tittleLabel.setBounds(200,30,20,10);
		taxNumberLabel.setBounds(50,90,20,10);
		firstNameLabel.setBounds(50,120,20,10);
		lastNameLabel.setBounds(50,150,20,10);
		jobTitleLabel.setBounds(50,180,20,10);
		salaryLabel.setBounds(50,210,20,10);
		emailLabel.setBounds(50,240,20,10);
		
		/**
		 * Creating the Text fields
		 */
		taxNumberText = new JTextField();
		firstNameText = new JTextField();
		lastNameText = new JTextField();
		jobTitleText = new JTextField();
		salaryText = new JTextField();
		emailText = new JTextField();
		
		
		/**
		 * setting the text field bounds
		 */
		taxNumberText.setBounds(200,50,150,25);
		firstNameText.setBounds(200,50,150,25);
		lastNameText.setBounds(200,50,150,25);
		jobTitleText.setBounds(200,50,150,25);
		salaryText.setBounds(200,50,150,25);
		emailText.setBounds(200,50,150,25);	
		
		// create the buttons
		saveButton = new JButton("Save");
		updateButton = new JButton("Update");
		deleteButton = new JButton("Delete");
		
//		saveButton.addActionListener(this);
//		updateButton.addActionListener(this);
//		deleteButton.addActionListener(this);
		
		//set bounds for the buttons
		saveButton.setBounds(50,350,70,50);
		updateButton.setBounds(120,300,70,50);
		deleteButton.setBounds(190,300,70,50);
		
		// add all components to the frame
		add(tittleLabel);
		add(taxNumberLabel);
		add(firstNameLabel);
		add(lastNameLabel);
		add(jobTitleLabel);
		add(salaryLabel);
		add(emailLabel);
		
		add(taxNumberText);
		add(firstNameText);
		add(lastNameText);
		add(jobTitleText);
		add(salaryText);
		add(emailText);
		
		add(saveButton);
		add(updateButton);
		add(deleteButton);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.print("I love you");
		
	}
	
	public static void main(String args[]) {
		Gui app = new Gui();
		app.setSize(850,400);
		app.setVisible(true);
	}


}
