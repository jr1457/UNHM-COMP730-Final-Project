import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
/**
 * The ReadButton class implements the read button. It uses the Read class to read the
 * contents of a file and display them on the GUI.
 * 
 * @author Eshwar
 *
 */
public class ReadButton extends JFrame implements ActionListener{
	// Holds the components.
	/**
	 * This instance variable is a container for holding components in a frame.
	 */
	private JPanel contentPane;
	/**
	 * This instance variable is a component that displays the contents of a .txt file.
	 */
	private JTextArea txtBox;
	/**
	 * This instance variable is a JButton that when it is clicked, the actionPerformed 
	 * method opens and reads a .txt file.s
	 */
	private JButton btnOpen;

	/**
	 * Launch the application and run the button click event.
	 * 
	 * @param args Arguments get passed through here.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReadButton frame = new ReadButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * This constructor creates an object that displays the window. 
	 */
	public ReadButton() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		txtBox  = new JTextArea();
		btnOpen = new JButton("Open");
		btnOpen.addActionListener(this);
		contentPane.add(txtBox);
		JPanel btnPanel = new JPanel();
		btnPanel.add(btnOpen);
		contentPane.add(btnPanel, "South");
		
		setContentPane(contentPane);
	}
	/**
	 * When the button is clicked the user is asked to enter the file name to open. 
	 */
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btnOpen) {
			String fileName = JOptionPane.showInputDialog(this, "Enter file name: ");
			if (fileName != null && fileName.length() != 0) {
				fileName += ".txt";
				Read r = new Read(fileName);
				String contents = r.readFromFile();
				txtBox.setText(contents);
			}
		}
	}

}
