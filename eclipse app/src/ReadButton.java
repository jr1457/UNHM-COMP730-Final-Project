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

public class ReadButton extends JFrame implements ActionListener{
	// Holds the components.
	private JPanel contentPane;
	private JTextArea txtBox;
	private JButton btnOpen;
	/**
	 * Launch the application.
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
	 * Create the frame.
	 */
	public ReadButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
	
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btnOpen) {
			String fileName = JOptionPane.showInputDialog(this, "Enter file name: ");
			if (fileName != null && fileName.length() != 0) {
				Read r = new Read(fileName);
				String contents = r.readFromFile();
				txtBox.setText(contents);
			}
		}
	}

}
