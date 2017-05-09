import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;

public class Receptionists extends JFrame {

	private JPanel contentPane;
	private JTextField pa_id;
	private JTextField ci_id;
	private JTextField pantient_id;
	private JTextField patient_na;
	private JTextField new_add;
	private JTable table;
	ArrayList<Patient> plist=GetArrayLists.getPatientsList();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table_1;
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
		setBounds(100, 100, 1094, 634);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 1036, 563);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("APPOINTMENTS", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PANTIE_ID:");
		lblNewLabel.setBounds(510, 330, 99, 35);
		panel.add(lblNewLabel);
		
		pa_id = new JTextField();
		pa_id.setBounds(487, 374, 157, 28);
		panel.add(pa_id);
		pa_id.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CLINIC_ID:");
		lblNewLabel_1.setBounds(866, 348, 77, 28);
		panel.add(lblNewLabel_1);
		
		ci_id = new JTextField();
		ci_id.setBounds(810, 376, 157, 24);
		panel.add(ci_id);
		ci_id.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("APP_DATE:");
		lblNewLabel_2.setBounds(25, 374, 77, 28);
		panel.add(lblNewLabel_2);
		
		JComboBox d_app = new JComboBox();
		d_app.setBounds(122, 378, 48, 20);
		panel.add(d_app);
		
		JComboBox m_app = new JComboBox();
		m_app.setBounds(201, 378, 48, 20);
		panel.add(m_app);
		
		JComboBox y_app = new JComboBox();
		y_app.setBounds(281, 378, 69, 20);
		panel.add(y_app);
		
		JButton btn_Appointments = new JButton("Insert");
		btn_Appointments.setBounds(186, 446, 190, 54);
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
		panel.add(btn_Appointments);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 13, 982, 300);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"PATIENT", "CLINIC", "DATE", "DOCTOR"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		JComboBox PCOMBO = new JComboBox();
		PCOMBO.setBounds(487, 434, 157, 28);
		panel.add(PCOMBO);
		
		for (int i=0;i<plist.size();i++)
		PCOMBO.addItem(plist.get(i).getName());
		
		
		
		JComboBox CCOMBO = new JComboBox();
		CCOMBO.setBounds(810, 437, 157, 28);
		panel.add(CCOMBO);
		
		JPanel REQUESTS = new JPanel();
		tabbedPane.addTab("REQUESTS", null, REQUESTS, null);
		REQUESTS.setLayout(null);
		
		JLabel PANTIENT_ID = new JLabel("PANTIENT_ID:");
		PANTIENT_ID.setBounds(12, 13, 105, 30);
		REQUESTS.add(PANTIENT_ID);
		
		pantient_id = new JTextField();
		pantient_id.setBounds(180, 18, 177, 20);
		REQUESTS.add(pantient_id);
		pantient_id.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("PATIENT_NEW_NAME:");
		lblNewLabel_3.setBounds(12, 66, 148, 20);
		REQUESTS.add(lblNewLabel_3);
		
		patient_na = new JTextField();
		patient_na.setBounds(180, 66, 177, 20);
		REQUESTS.add(patient_na);
		patient_na.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("NEWS_ADDRESS:");
		lblNewLabel_4.setBounds(12, 116, 123, 30);
		REQUESTS.add(lblNewLabel_4);
		
		new_add = new JTextField();
		new_add.setBounds(180, 121, 177, 20);
		REQUESTS.add(new_add);
		new_add.setColumns(10);
		
		JButton btnMakeRequest = new JButton("MAKE REQUEST");
		btnMakeRequest.setBounds(52, 175, 177, 65);
		REQUESTS.add(btnMakeRequest);
		
		JPanel PATIENTS = new JPanel();
		PATIENTS.setLayout(null);
		tabbedPane.addTab("PATIENTS", null, PATIENTS, null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 13, 974, 282);
		PATIENTS.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JLabel label = new JLabel("NAME:");
		label.setBounds(12, 336, 56, 16);
		PATIENTS.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(96, 333, 116, 22);
		PATIENTS.add(textField);
		
		JLabel label_1 = new JLabel("ADDRESS:");
		label_1.setBounds(267, 336, 93, 16);
		PATIENTS.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(372, 333, 165, 22);
		PATIENTS.add(textField_1);
		
		JCheckBox checkBox = new JCheckBox("SELF-HARM");
		checkBox.setBounds(584, 332, 113, 25);
		PATIENTS.add(checkBox);
		
		JLabel label_2 = new JLabel("PROBLEM:");
		label_2.setBounds(12, 398, 76, 16);
		PATIENTS.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(96, 395, 156, 57);
		PATIENTS.add(textField_2);
		
		JLabel label_3 = new JLabel("PREVIOUS_CONSULTATION_DATE:");
		label_3.setBounds(302, 398, 223, 16);
		PATIENTS.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(537, 395, 116, 22);
		PATIENTS.add(textField_3);
		
		JCheckBox checkBox_1 = new JCheckBox("ISALIVE");
		checkBox_1.setBounds(722, 332, 113, 25);
		PATIENTS.add(checkBox_1);
		
		JLabel label_4 = new JLabel("COMMENTS:");
		label_4.setBounds(779, 398, 93, 16);
		PATIENTS.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(698, 427, 254, 94);
		PATIENTS.add(textField_4);
		
		JCheckBox checkBox_2 = new JCheckBox("DANGEROUS");
		checkBox_2.setBounds(839, 332, 113, 25);
		PATIENTS.add(checkBox_2);
		
		JButton btnInsertPatient = new JButton("INSERT");
		btnInsertPatient.setBounds(115, 479, 97, 25);
		PATIENTS.add(btnInsertPatient);
	
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
