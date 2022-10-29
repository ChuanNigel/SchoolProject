import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class AdminHome extends JFrame {

	private JPanel contentPane;
	private JTextField userField;
	private JTextField pwField;
	private JTextField searchUserField;
	private JTable accTable;
	private JTextField emailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHome frame = new AdminHome();
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
	public AdminHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Homepage");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel.setBounds(324, 29, 239, 48);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Account Registration", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(21, 98, 406, 266);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(10, 22, 123, 36);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password : ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(10, 59, 123, 36);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Account Role : ");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1.setBounds(10, 133, 175, 36);
		panel.add(lblNewLabel_1_1_1);
		
		userField = new JTextField();
		userField.setBounds(198, 28, 175, 31);
		panel.add(userField);
		userField.setColumns(10);
		
		pwField = new JTextField();
		pwField.setColumns(10);
		pwField.setBounds(198, 65, 175, 31);
		panel.add(pwField);
		
		String[] accountType = {"Author","Reviewer","Conference Chair","Admin"};
		JComboBox accRoleDDL = new JComboBox(accountType);
		accRoleDDL.setFont(new Font("Tahoma", Font.PLAIN, 15));
		accRoleDDL.setSelectedIndex(3);
		accRoleDDL.setBounds(198, 143, 175, 22);
		panel.add(accRoleDDL);
		
		JButton registerBtn = new JButton("Register");
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		registerBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		registerBtn.setBounds(39, 195, 94, 46);
		panel.add(registerBtn);
		
		JButton clearBtn = new JButton("Clear");
		clearBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		clearBtn.setBounds(279, 195, 94, 46);
		panel.add(clearBtn);
		
		JButton updateBtn = new JButton("Update");
		updateBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		updateBtn.setBounds(160, 195, 94, 46);
		panel.add(updateBtn);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Email : ");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_2.setBounds(10, 95, 123, 36);
		panel.add(lblNewLabel_1_1_2);
		
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(198, 101, 175, 31);
		panel.add(emailField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Search", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(21, 375, 406, 110);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Username : ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(10, 39, 123, 36);
		panel_1.add(lblNewLabel_1_2);
		
		searchUserField = new JTextField();
		searchUserField.setColumns(10);
		searchUserField.setBounds(132, 45, 175, 31);
		panel_1.add(searchUserField);
		
		JButton searchBtn = new JButton("Search");
		searchBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		searchBtn.setBounds(317, 44, 79, 31);
		panel_1.add(searchBtn);
		
		accTable = new JTable();
		accTable.setBounds(447, 115, 342, 347);
		contentPane.add(accTable);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.setBounds(709, 473, 91, 23);
		contentPane.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Account List", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(437, 98, 363, 372);
		contentPane.add(panel_2);
	}
}
