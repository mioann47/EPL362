import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Login  {

	public static users USER;
	
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

				ArrayList<users> userlist=GetArrayLists.getUsersList();
				boolean ok=false;
				for (int i=0;i<userlist.size();i++){
					
					if (userlist.get(i).getUsername().equals(user) && userlist.get(i).getPassword().equals(pa)){
						USER=userlist.get(i);
						ok=true;
						break;
					}
				}
				
				if (!ok){
					JOptionPane.showMessageDialog(null, "Lathos onoma/kodikos. Dokimase ksana i kane logariasmo");
					return;
					
				}
				
				if (USER.getRole().equals("HealthService")) {
					frame.dispose();
					HealthService geniko = new HealthService();
					geniko.setVisible(true);
					geniko.setTitle("Health");
				}

				// frame clinical
				else if (USER.getRole().equals("Doctor") || USER.getRole().equals("Nurse") || USER.getRole().equals("Health Visitor")) {
					//frame.dispose();
					frame.setVisible(false);
					ClinicalStaff clinical = new ClinicalStaff();
					clinical.setVisible(true);
					clinical.setTitle("Clinical Staff");

				}
				// frame Receptionists
				else if (USER.getRole().equals("Receptionist")) {
					frame.dispose();
					Receptionists receptionis = new Receptionists();
					receptionis.setVisible(true);
					receptionis.setTitle("Receptionists");

				}

				// frame MedicalRecordsStaff
				else if (USER.getRole().equals("Medical Record Staff")) {
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
