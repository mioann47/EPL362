import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login  {

	public JFrame frame;
	private JTextField username;
	private JPasswordField password;
    public static Login window;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					  window = new Login();
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
	public Login() {
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
		frame.setTitle("Login");

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(25, 41, 104, 33);
		frame.getContentPane().add(lblUsername);

		JLabel lblNewLabel = new JLabel("Password:");
		lblNewLabel.setBounds(25, 106, 104, 33);
		frame.getContentPane().add(lblNewLabel);

		JButton Loginbtn = new JButton("Login");
		Loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String user = username.getText();
				char[] pass = password.getPassword();
				String pa = new String(pass);

				// frame health

				if (user.equals("Health") && pa.equals("1234")) {
					frame.dispose();
					HealthService geniko = new HealthService();
					geniko.setVisible(true);
					geniko.setTitle("Health");
				}

				// frame clinical
				else if (user.equals("Clinical") && pa.equals("1234")) {
					//frame.dispose();
					frame.setVisible(false);
					ClinicalStaff clinical = new ClinicalStaff();
					clinical.setVisible(true);
					clinical.setTitle("Clinical Staff");

				}
				// frame Receptionists
				else if (user.equals("Receptionists") && pa.equals("1234")) {
					frame.dispose();
					Receptionists receptionis = new Receptionists();
					receptionis.setVisible(true);
					receptionis.setTitle("Receptionists");

				}

				// frame MedicalRecordsStaff
				else if (user.equals("MedicalRecordsStaff") && pa.equals("1234")) {
					frame.dispose();
					MedicalRecordsStaff medical = new MedicalRecordsStaff();
					medical.setVisible(true);
					medical.setTitle("MedicalRecordsStaff");

				}

				else {
					JOptionPane.showMessageDialog(null, "Try again");
				}
			}
		});
		Loginbtn.setBounds(25, 183, 115, 29);
		frame.getContentPane().add(Loginbtn);

		username = new JTextField();
		username.setBounds(110, 44, 146, 26);
		frame.getContentPane().add(username);
		username.setColumns(10);

		password = new JPasswordField();
		password.setBounds(110, 109, 146, 26);
		frame.getContentPane().add(password);

		JButton grea_acco = new JButton("Create Account");
		grea_acco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Great_Account frame = new Great_Account();
				frame.setVisible(true);
				window.frame.setVisible(false);
				frame.setTitle("Create Account");

			}
		});
		grea_acco.setBounds(167, 186, 164, 26);
		frame.getContentPane().add(grea_acco);
	}
}
