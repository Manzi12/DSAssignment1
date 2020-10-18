import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Gui {
	public String data[][];
	public String column[] = {"First Name", "Last Name", "Tax Number","Salary","Gender", "Email"};
	
	BorderLayout bpane = new BorderLayout();
	
	JTextPane tittle = new JTextPane();
	
	JFrame frame = new JFrame();
	JLabel firstName = new JLabel("First Name");
	JLabel lastName = new JLabel("Last Name");
	JLabel taxNumber = new JLabel("Tax Number");
	JLabel salary = new JLabel("Salary");
	JLabel gender = new JLabel("Gender");
	JLabel email = new JLabel("email");
	
	JTextField firstNameText = new JTextField(30);
	JTextField lastNameText = new JTextField(30);
	JTextField taxNumberText = new JTextField(30);
	JTextField salaryText = new JTextField(30);
	JTextField genderText = new JTextField(30);
	JTextField emailText = new JTextField(30);
	
	JButton save = new JButton("Save");
	JButton Update = new JButton("Update");
	JButton Delete = new JButton("Delete");
	
	JTable table = new JTable(data, column);
	
	


}
