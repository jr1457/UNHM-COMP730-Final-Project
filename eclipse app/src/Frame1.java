import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class Frame1 {

	// The JFrame object is created to hold the components of a GUI. 
	private JFrame frame; 
	// For user input
	public JTextField textField;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		// An instance is created on the Event Dispatch Thread.
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// A new instance of the window.
					Frame1 window = new Frame1();
					// Window becomes visible.
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		// The initialize method is invoked, to initialize the GUI components.
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// A new JFrame object is created. 
		frame = new JFrame();
		// The size and position of the window.
		frame.setBounds(100, 100, 450, 300);
		// Add the default closing operation for the JFrame object.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// The JFrame layout is set to null.
		frame.getContentPane().setLayout(null);
		// Creates a new object for user input.
		textField = new JTextField();
		// Set the position and size of the JTextField object.
		textField.setBounds(137, 36, 287, 214);
		// Adds the JTextField object to the JFrame object,
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		// New JLabel object created.
		JLabel lblNewLabel = new JLabel("");
		// Set the position and size of the JLabel object. 
		lblNewLabel.setBounds(10, 11, 46, 14);
		// Add the JLabel object to the JFrame object.  
		frame.getContentPane().add(lblNewLabel);
		// Creates new JButton object.
		JButton btnNewButton = new JButton("Create Note");
		// Add actionListener to the object.
		btnNewButton.addActionListener(new ActionListener() {
			// Action event of button clicked.
			public void actionPerformed(ActionEvent e) {
				// Get the text entered by the user.
				String userData = textField.getText();
				// Dialogue to enter file name.
				String input = JOptionPane.showInputDialog("Enter the File Name");
				// Sets the text of the JLabel object to the file name entered by the user.
				lblNewLabel.setText(input);
				// Creates a new instance of client, passing input(aka the filename) and userData through. 
				Client client = new Client(input, userData);
				// A method call on an instance of the client class.
				client.buildImmediately();
				// New note is created with the client object.
				CreateNote.create(client);
			}
		});
		// Set the position and size of the Jbutton object. 
		btnNewButton.setBounds(10, 36, 106, 23);
		// Adds the JButton object to the JFrame object.
		frame.getContentPane().add(btnNewButton);
		
	}
}
/*
class Client {
	private NoteBuilder note = null;
	private String input;
	private String userData;*/
	/*
	public Client(String input, String userData) {
		this.input = input;
		this.userData = userData;
	}

	public void buildImmediately() {
		note = new NoteBuilder.Builder()
			.setNoteName(input)
			.setNoteData(userData)
			.build();
	}

	public String getNoteName() {
		return note.getNoteName();
	}

	public String getNoteData() {
		return note.getNoteData();
	}
}*/
/*
class CreateNote {
	public static void create(Client client) {
		try {
			File myNote = new File(client.getNoteName() + ".txt");
			if (myNote.createNewFile()) {
				System.out.println("File created: " + myNote.getName());
			} else {
				System.out.println("File already exists");
			}
			FileWriter myNoteWriter = new FileWriter(myNote);
			myNoteWriter.write(client.getNoteData());
			myNoteWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}*/