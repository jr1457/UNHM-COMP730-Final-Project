import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Frame1 {

	private JFrame frame;
	public JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(137, 36, 287, 214);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Create Note");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userData = textField.getText();
				String input = JOptionPane.showInputDialog("Enter the File Name");
				lblNewLabel.setText(input);
				
				 class Client {
					private NoteBuilder note = null;
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
						
				}
				
				class CreateNote {
					public static void main() {
						Client client = new Client();
						client.buildImmediately();
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
					
				}
				CreateNote.main();
			}
		});
		btnNewButton.setBounds(10, 36, 106, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
}
