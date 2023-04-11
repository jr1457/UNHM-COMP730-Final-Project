import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ClearNote extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnClear;
	private JTextArea txtArea;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClearNote frame = new ClearNote();
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
	public ClearNote() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout());
		btnClear = new JButton("Clear");
		btnClear.addActionListener(this);
		contentPane.add(btnClear, "South");
		
		txtArea = new JTextArea();
		contentPane.add(txtArea, "Center");
		setContentPane(contentPane);
	}
	
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btnClear) {
			int result = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm Dialog Box", JOptionPane.YES_NO_OPTION);
			if (result == JOptionPane.YES_OPTION) {
				this.txtArea.setText("");
				//https://steemit.com/utopian-io/@will-ugo/java-gui-confirm-dialogs-using-eclipse-ide
			}
		}
	}

}
