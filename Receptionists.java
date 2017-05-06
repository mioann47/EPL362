import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Receptionists extends JFrame {

	private JPanel contentPane;
	private JTextField pa_id;
	private JTextField ci_id;
	private JTextField pantient_id;
	private JTextField patient_na;
	private JTextField new_add;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receptionists frame = new Receptionists();
					frame.setVisible(true);
					frame.setTitle("Receptionists");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Receptionists() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 718, 364);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("APPOINTMENTS", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PANTIE_ID:");
		lblNewLabel.setBounds(10, 11, 99, 35);
		panel.add(lblNewLabel);
		
		pa_id = new JTextField();
		pa_id.setBounds(92, 18, 157, 28);
		panel.add(pa_id);
		pa_id.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CLINIC_ID:");
		lblNewLabel_1.setBounds(10, 68, 77, 28);
		panel.add(lblNewLabel_1);
		
		ci_id = new JTextField();
		ci_id.setBounds(92, 72, 157, 24);
		panel.add(ci_id);
		ci_id.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("APP_DATE:");
		lblNewLabel_2.setBounds(10, 131, 77, 28);
		panel.add(lblNewLabel_2);
		
		JComboBox d_app = new JComboBox();
		d_app.setBounds(107, 135, 48, 20);
		panel.add(d_app);
		
		JComboBox m_app = new JComboBox();
		m_app.setBounds(186, 135, 48, 20);
		panel.add(m_app);
		
		JComboBox y_app = new JComboBox();
		y_app.setBounds(266, 135, 69, 20);
		panel.add(y_app);
		
		JButton btn_Appointments = new JButton("Insert");
		btn_Appointments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p_id=pa_id.getText();
				String c_id=ci_id.getText();
				String da_app = d_app.getSelectedItem().toString();
				String ma_app=m_app.getSelectedItem().toString();
				String ya_app=y_app.getSelectedItem().toString();
				
				
				if (p_id.length()>0&&c_id.length()>0){
					
				}
				
				else {
					JOptionPane.showMessageDialog(null, "dokimaste 3ana");
					
				}
				
			}
		});
		btn_Appointments.setBounds(107, 228, 190, 54);
		panel.add(btn_Appointments);
		
		JPanel REQUESTS = new JPanel();
		tabbedPane.addTab("REQUESTS", null, REQUESTS, null);
		REQUESTS.setLayout(null);
		
		JLabel PANTIENT_ID = new JLabel("PANTIENT_ID:");
		PANTIENT_ID.setBounds(10, 18, 105, 30);
		REQUESTS.add(PANTIENT_ID);
		
		pantient_id = new JTextField();
		pantient_id.setBounds(178, 23, 177, 20);
		REQUESTS.add(pantient_id);
		pantient_id.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("PATIENT_NEW_NAME:");
		lblNewLabel_3.setBounds(10, 71, 148, 20);
		REQUESTS.add(lblNewLabel_3);
		
		patient_na = new JTextField();
		patient_na.setBounds(178, 71, 177, 20);
		REQUESTS.add(patient_na);
		patient_na.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("NEWS_ADDRESS:");
		lblNewLabel_4.setBounds(10, 121, 123, 30);
		REQUESTS.add(lblNewLabel_4);
		
		new_add = new JTextField();
		new_add.setBounds(178, 126, 177, 20);
		REQUESTS.add(new_add);
		new_add.setColumns(10);
	
		 for(int count=1; count<=31; count++){
	        	d_app.addItem(count);
	        	 
	        }
	        for(int count=1; count<=12; count++){
	        	m_app.addItem(count);
	        	 

	        }
	        for(int count=1950; count<=(Calendar.getInstance().get(Calendar.YEAR)); count++){
	        	y_app.addItem(count);
	        	 
	      }
			
	
	
	
	}
}
