package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _01_array_list_visualizer.data.ArrayList;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add Name");
	JButton view = new JButton("View Names");
	ArrayList<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		GuestBook g = new GuestBook();
		g.run();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	 void run() {
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		add.addActionListener(this);
		view.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton)e.getSource();
		if(pressed == add) {
			String namesaid = JOptionPane.showInputDialog("Enter your name.");
			list.add(namesaid);
		}
		if(pressed == view) {
			String joe = "";
				for (int i = 0; i < list.size(); i++) {
				joe = joe+"Guest #"+(i+1)+": "+list.get(i)+"\n";
			}
			JOptionPane.showMessageDialog(null, joe);
		}
	}
}
