import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.JTableHeader;

public class Gui extends JFrame implements ActionListener {
	
	/**
	 * The Table and Title label
	 */
	Table listTable;
	Form form;
	
	public Gui(){

		listTable = new Table();
		form = new Form("FORM");
		Container pane = this.getContentPane();

		//add the table to the frame
		pane.add(new JScrollPane(listTable), BorderLayout.EAST);
		pane.add(new JScrollPane(form), BorderLayout.WEST);

		this.setTitle("Table Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
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
