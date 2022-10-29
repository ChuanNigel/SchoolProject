import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class LoginHome extends JFrame {

	private JPanel contentPane;
	private JTextField userTextField;
	private JTextField passwordTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginHome frame = new LoginHome();
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
	public LoginHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Research Conference Management System");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(130, 30, 312, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(184, 116, 77, 32);
		contentPane.add(lblNewLabel_1);
		
		userTextField = new JTextField();
		userTextField.setBounds(255, 122, 106, 20);
		contentPane.add(userTextField);
		userTextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password: ");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(184, 141, 77, 32);
		contentPane.add(lblNewLabel_2);
		
		passwordTextField = new JTextField();
		passwordTextField.setBounds(255, 147, 106, 20);
		contentPane.add(passwordTextField);
		passwordTextField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Login as:");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(184, 166, 77, 32);
		contentPane.add(lblNewLabel_2_1);
		

		String[] accountType = {"Author","Reviewer","Conference Chair","Admin"};
		JComboBox roleComboBox = new JComboBox(accountType);
		roleComboBox.setFont(new Font("Arial", Font.PLAIN, 13));
		roleComboBox.setSelectedIndex(3);
		roleComboBox.setBounds(255, 171, 106, 22);
		contentPane.add(roleComboBox);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/AndrewTateFanClub","root",""); 
					Statement stmt = c.createStatement();
					String sql = "Select * from users where username ='"+userTextField.getText()+"'"
							+ " and password ='"+passwordTextField.getText()+"' and accountType ='"+roleComboBox.getSelectedItem()+"'";
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next())
					{
						dispose();
						AdminHome ah = new AdminHome();
						ah.setVisible(true);
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Username/Password Error", "ERROR", JOptionPane.ERROR_MESSAGE);
						userTextField.setText(null);
						passwordTextField.setText(null);
					}
				}
				catch(Exception excep) {
					excep.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(270, 204, 91, 23);
		contentPane.add(btnNewButton);
	}
}
