import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
	private JTextField pid_req;
	private JTextField pna_re;
	private JTextField nadd_re;
	private JTable tableapp;
	ArrayList<Patient> plist = GetArrayLists.getPatientsList();
	ArrayList<Clinic> clist = GetArrayLists.getClinicsList();
	ArrayList<users> ulist = GetArrayLists.getUsersList();
	ArrayList<Appointment> aplist = GetArrayLists.getAppointmentsList();
	private JTextField textFieldName;
	private JTextField textFieldAddress;
	private JTextField textFieldProblem;
	private JTable tablepat;
	JComboBox PCOMBO, CCOMBO, DCOMBO;
	DefaultTableModel modelapp, modelpat;

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

		JLabel lblNewLabel = new JLabel("PATIENT ID - NAME:");
		lblNewLabel.setBounds(487, 386, 157, 35);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("CLINIC ID-NAME:");
		lblNewLabel_1.setBounds(667, 391, 130, 28);
		panel.add(lblNewLabel_1);

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
		btn_Appointments.setBounds(47, 447, 190, 54);
		btn_Appointments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p_id;
				String c_id;
				String d_id;
				String da_app = d_app.getSelectedItem().toString();
				String ma_app = m_app.getSelectedItem().toString();
				String ya_app = y_app.getSelectedItem().toString();

				p_id = ((String) PCOMBO.getSelectedItem()).split("-")[0];
				c_id = ((String) CCOMBO.getSelectedItem()).split("-")[0];
				d_id = (String) DCOMBO.getSelectedItem();

				insertclient.insertappointment(Integer.parseInt(p_id), Integer.parseInt(c_id),
						ya_app + "-" + ma_app + "-" + da_app, d_id);
				updatetableAPP();

			}
		});
		panel.add(btn_Appointments);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 13, 982, 300);
		panel.add(scrollPane);

		tableapp = new JTable();
		tableapp.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "ID", "PATIENT ID", "CLINIC ID", "DATE", "DOCTOR ID - NAME", "STATUS" }) {
			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tableapp);

		PCOMBO = new JComboBox();
		PCOMBO.setBounds(487, 434, 157, 28);
		panel.add(PCOMBO);
		
		if(plist!=null){
		for (int i = 0; i < plist.size(); i++) {
			PCOMBO.addItem(plist.get(i).getId() + "- " + plist.get(i).getName());
		}}

		CCOMBO = new JComboBox();
		CCOMBO.setBounds(656, 432, 157, 28);
		panel.add(CCOMBO);
		if(clist!=null){
		for (int i = 0; i < clist.size(); i++) {

			CCOMBO.addItem(clist.get(i).getId() + "- " + clist.get(i).getName());
		}
		}
		JLabel lblDoctorId = new JLabel("DOCTOR ID - NAME:");
		lblDoctorId.setBounds(842, 395, 122, 16);
		panel.add(lblDoctorId);

		DCOMBO = new JComboBox();
		DCOMBO.setBounds(839, 435, 136, 26);
		panel.add(DCOMBO);

		JCheckBox chckbxDoneapp = new JCheckBox("done");
		chckbxDoneapp.setEnabled(false);
		chckbxDoneapp.setBounds(722, 322, 57, 25);
		panel.add(chckbxDoneapp);

		JButton btnUpdateapp = new JButton("UPDATE");
		btnUpdateapp.setEnabled(false);
		btnUpdateapp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean done = chckbxDoneapp.isSelected();

				int id = Integer.parseInt(tableapp.getValueAt(tableapp.getSelectedRow(), 0).toString());
				int patient_id = Integer.parseInt(tableapp.getValueAt(tableapp.getSelectedRow(), 1).toString());
				int clinic_id = Integer.parseInt(tableapp.getValueAt(tableapp.getSelectedRow(), 2).toString());
				String date = tableapp.getValueAt(tableapp.getSelectedRow(), 3).toString();
				;
				String doctor = tableapp.getValueAt(tableapp.getSelectedRow(), 4).toString();
				;

				if (done) {

					UpdatesClient.updateappointment(id, patient_id, clinic_id, date, doctor, "DONE");
					plist = GetArrayLists.getPatientsList();
					for (int i = 0; i < plist.size(); i++) {

						if (plist.get(i).getId() == patient_id) {
							UpdatesClient.updatePatient(plist.get(i).getId(), plist.get(i).getName(),
									plist.get(i).getAddress(), plist.get(i).getSelfharm() + "",
									plist.get(i).getProblem(), date, plist.get(i).getIsalive() + "",
									plist.get(i).getComments(), plist.get(i).getDangerous() + "");
							break;
						}
					}
					updatetableAPP();
				}

			}
		});
		btnUpdateapp.setBounds(793, 322, 97, 25);
		panel.add(btnUpdateapp);
		
		JButton btnGenerateDailyList = new JButton("GENERATE DAILY LIST");
		btnGenerateDailyList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GenerateFiles.dailyList();
				JOptionPane.showMessageDialog(null, "attendanceFailed.txt generated!");
			}
		});
		btnGenerateDailyList.setBounds(260, 452, 190, 44);
		panel.add(btnGenerateDailyList);
		for (int i = 0; i < ulist.size(); i++) {

			if (ulist.get(i).getRole().equals("Doctor")) {
				DCOMBO.addItem(ulist.get(i).getId() + "- " + ulist.get(i).getName());
			}
		}

		JPanel REQUESTS = new JPanel();
		tabbedPane.addTab("REQUESTS", null, REQUESTS, null);
		REQUESTS.setLayout(null);

		JLabel PANTIENT_ID = new JLabel("PANTIENT_ID:");
		PANTIENT_ID.setBounds(12, 13, 105, 30);
		REQUESTS.add(PANTIENT_ID);

		pid_req = new JTextField();
		pid_req.setBounds(180, 18, 177, 20);
		REQUESTS.add(pid_req);
		pid_req.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("PATIENT_NEW_NAME:");
		lblNewLabel_3.setBounds(12, 66, 148, 20);
		REQUESTS.add(lblNewLabel_3);

		pna_re = new JTextField();
		pna_re.setBounds(180, 66, 177, 20);
		REQUESTS.add(pna_re);
		pna_re.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("NEWS_ADDRESS:");
		lblNewLabel_4.setBounds(12, 116, 123, 30);
		REQUESTS.add(lblNewLabel_4);

		nadd_re = new JTextField();
		nadd_re.setBounds(180, 121, 177, 20);
		REQUESTS.add(nadd_re);
		nadd_re.setColumns(10);

		JButton btnMakeRequest = new JButton("MAKE REQUEST");
		btnMakeRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = pid_req.getText();
				String name = pna_re.getText();
				String add = nadd_re.getText();

				insertclient.insertrequest(Integer.parseInt(id), name, add);
				JOptionPane.showMessageDialog(null, "Request done");
			}
		});
		btnMakeRequest.setBounds(52, 175, 177, 65);
		REQUESTS.add(btnMakeRequest);

		JPanel PATIENTS = new JPanel();
		PATIENTS.setLayout(null);
		tabbedPane.addTab("PATIENTS", null, PATIENTS, null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 13, 974, 282);
		PATIENTS.add(scrollPane_1);

		tablepat = new JTable();
		tablepat.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "ID", "NAME", "ADDRESS", "SELFHARM", "PROBLEM" }) {
			boolean[] columnEditables = new boolean[] { false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_1.setViewportView(tablepat);

		JLabel label = new JLabel("NAME:");
		label.setBounds(12, 336, 56, 16);
		PATIENTS.add(label);

		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(96, 333, 116, 22);
		PATIENTS.add(textFieldName);

		JLabel label_1 = new JLabel("ADDRESS:");
		label_1.setBounds(267, 336, 93, 16);
		PATIENTS.add(label_1);

		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(372, 333, 165, 22);
		PATIENTS.add(textFieldAddress);

		JCheckBox k_se = new JCheckBox("SELF-HARM");
		k_se.setBounds(584, 332, 113, 25);
		PATIENTS.add(k_se);

		JLabel label_2 = new JLabel("PROBLEM:");
		label_2.setBounds(12, 398, 76, 16);
		PATIENTS.add(label_2);

		textFieldProblem = new JTextField();
		textFieldProblem.setColumns(10);
		textFieldProblem.setBounds(96, 395, 156, 57);
		PATIENTS.add(textFieldProblem);

		JButton btnInsertPatient = new JButton("INSERT");
		btnInsertPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textFieldName.getText();
				String address = textFieldAddress.getText();
				boolean selfharm = k_se.isSelected();

				String problem = textFieldProblem.getText();

				String se;
				if (selfharm)
					se = "1";
				else
					se = "0";

				insertclient.insertpatient(name, address, se, problem);
				updatetablePAT();
				PCOMBO.removeAllItems();
				for (int i = 0; i < plist.size(); i++) {
					PCOMBO.addItem(plist.get(i).getId() + "- " + plist.get(i).getName());
				}
			}
		});
		btnInsertPatient.setBounds(115, 479, 97, 25);
		PATIENTS.add(btnInsertPatient);

		for (int count = 1; count <= 31; count++) {
			d_app.addItem(count);

		}
		for (int count = 1; count <= 12; count++) {
			m_app.addItem(count);

		}
		for (int count = 1950; count <= (Calendar.getInstance().get(Calendar.YEAR)); count++) {
			y_app.addItem(count);

		}

		modelapp = (DefaultTableModel) tableapp.getModel();
		Object tapp[] = new Object[6];
		if (aplist!=null){
		for (int i = 0; i < aplist.size(); i++) {

			tapp[0] = aplist.get(i).getId();
			tapp[1] = aplist.get(i).getPatient_id();
			tapp[2] = aplist.get(i).getClinic_id();
			tapp[3] = aplist.get(i).getDate();
			tapp[4] = aplist.get(i).getDoctor();
			tapp[5] = aplist.get(i).getStatus();
			modelapp.addRow(tapp);

		}}

		modelpat = (DefaultTableModel) tablepat.getModel();
		Object tpat[] = new Object[5];
		if(plist!=null){
		for (int i = 0; i < plist.size(); i++) {

			tpat[0] = plist.get(i).getId();
			tpat[1] = plist.get(i).getName();
			tpat[2] = plist.get(i).getAddress();
			tpat[3] = plist.get(i).getSelfharm();
			tpat[4] = plist.get(i).getProblem();
			modelpat.addRow(tpat);

		}
		}
		tableapp.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent event) {

				if (tableapp.getSelectedRow() < 0) {

					chckbxDoneapp.setEnabled(false);

					return;
				} else {

					chckbxDoneapp.setEnabled(true);
				}

				// tableapp.getValueAt(tableapp.getSelectedRow(), 0).toString();

			}
		});

		chckbxDoneapp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (chckbxDoneapp.isSelected())
					btnUpdateapp.setEnabled(true);
				else
					btnUpdateapp.setEnabled(false);

			}

		});

	}

	void updatetableAPP() {
		aplist = GetArrayLists.getAppointmentsList();

		while (modelapp.getRowCount() > 0)
			modelapp.removeRow(0);
		Object tapp[] = new Object[6];
		for (int i = 0; i < aplist.size(); i++) {

			tapp[0] = aplist.get(i).getId();
			tapp[1] = aplist.get(i).getPatient_id();
			tapp[2] = aplist.get(i).getClinic_id();
			tapp[3] = aplist.get(i).getDate();
			tapp[4] = aplist.get(i).getDoctor();
			tapp[5] = aplist.get(i).getStatus();
			modelapp.addRow(tapp);

		}
	}

	void updatetablePAT() {
		plist = GetArrayLists.getPatientsList();

		while (modelpat.getRowCount() > 0)
			modelpat.removeRow(0);
		Object tpat[] = new Object[5];

		for (int i = 0; i < plist.size(); i++) {

			tpat[0] = plist.get(i).getId();
			tpat[1] = plist.get(i).getName();
			tpat[2] = plist.get(i).getAddress();
			tpat[3] = plist.get(i).getSelfharm();
			tpat[4] = plist.get(i).getProblem();
			modelpat.addRow(tpat);

		}
	}
}
