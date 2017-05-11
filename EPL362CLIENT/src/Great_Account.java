import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class Great_Account extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField name;
	private JButton great;
	private JPasswordField password;
	private JFrame frame;
	JComboBox rolebox = new JComboBox();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Great_Account window = new Great_Account();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	private static URI getBaseURI() {
        return UriBuilder.fromUri("http://192.168.0.11:8080/rest").build();
}
	/**
	 * Create the frame.
	 */
	public Great_Account() {
		frame=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(10, 11, 125, 37);
		contentPane.add(lblNewLabel);

		username = new JTextField();
		username.setBounds(87, 15, 184, 20);
		contentPane.add(username);
		username.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(10, 59, 87, 37);
		contentPane.add(lblNewLabel_1);

		JLabel name2 = new JLabel("Name:");
		name2.setBounds(10, 121, 62, 20);
		contentPane.add(name2);

		name = new JTextField();
		name.setBounds(87, 121, 184, 20);
		contentPane.add(name);
		name.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Role:");
		lblNewLabel_2.setBounds(10, 172, 87, 20);
		contentPane.add(lblNewLabel_2);

		great = new JButton("Create");
		great.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = username.getText();
				char[] pass = password.getPassword();
				String pa = new String(pass);
				String name1 = name.getText();
				String role1 = (String) rolebox.getSelectedItem();
				if (user.length() > 0 && pa.length() > 0 && name1.length() > 0 && role1.length() > 0) {
					
					frame.setVisible(false);
					Login.window.frame.setVisible(true);
					
					insertclient.signup(user, pa, name1, role1);
					
					
										
					 

				}
				else {
					JOptionPane.showMessageDialog(null, "Try Again");
				}
			}
		});
		great.setBounds(128, 213, 89, 23);
		contentPane.add(great);

		password = new JPasswordField();
		password.setBounds(87, 67, 184, 20);
		contentPane.add(password);
		
		
		rolebox.setBounds(87, 172, 183, 20);
		contentPane.add(rolebox);
		
		rolebox.addItem("Doctor");
		rolebox.addItem("Nurse");
		rolebox.addItem("Health Visitor");
		rolebox.addItem("Receptionist");
		rolebox.addItem("Medical Record Staff");
	}
}
