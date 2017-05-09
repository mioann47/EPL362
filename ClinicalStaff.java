import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ClinicalStaff extends JFrame {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField pantient_id;
	private JTextField details;
	private JTextField pidtre;
	private JTextField det1;
	private JTable table_1;
	DefaultTableModel model;
	DefaultTableModel modelpatients;
	DefaultTableModel modeltreatment;
	ArrayList<Incident> incidentslist;
	ArrayList<treatment> treatmentlist;
	ArrayList<Patient> patientlist;
	private JTable table;
	private JTable table_2;
	private JTextField textFieldName;
	private JTextField textFieldAddress;
	private JTextField textFieldProblem;
	private JTextField textFieldPrevious;
	private JTextField textFieldComments;
	JButton btnUpdate = new JButton("UPDATE");
	JButton btnDelete = new JButton("DELETE");
	private JTable tableDRUGS;
	DefaultTableModel modeldrugs;
	ArrayList<Drug> druglist;
	private JTable tableallergys;
	DefaultTableModel modelal;
	ArrayList<PatientAllergy> palist;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClinicalStaff frame = new ClinicalStaff();
					frame.setVisible(true);
					frame.setTitle("ClinicalStaff");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClinicalStaff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1073, 630);
		contentPane = new JPanel();
		// contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 6, 1003, 564);

		JPanel PATIENTS = new JPanel();
		tabbedPane.addTab("PATIENTS", null, PATIENTS, null);
		PATIENTS.setLayout(null);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 13, 974, 282);
		PATIENTS.add(scrollPane_2);

		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "ID", "NAME", "ADDRESS", "SELF-HARM",
				"PROBLEM", "PREVIOUS_CONSULTATION_DATE", "ISALIVE", "COMMENTS", "DANGEROUS" }) {
			/**
					 * 
					 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_2.getColumnModel().getColumn(1).setPreferredWidth(66);
		scrollPane_2.setViewportView(table_2);

		btnUpdate.setBounds(34, 475, 133, 33);
		PATIENTS.add(btnUpdate);

		JLabel lblName = new JLabel("NAME:");
		lblName.setBounds(12, 336, 56, 16);
		PATIENTS.add(lblName);

		textFieldName = new JTextField();
		textFieldName.setBounds(96, 333, 116, 22);
		PATIENTS.add(textFieldName);
		textFieldName.setColumns(10);

		JLabel lblAddress = new JLabel("ADDRESS:");
		lblAddress.setBounds(267, 336, 93, 16);
		PATIENTS.add(lblAddress);

		textFieldAddress = new JTextField();
		textFieldAddress.setBounds(372, 333, 165, 22);
		PATIENTS.add(textFieldAddress);
		textFieldAddress.setColumns(10);

		JCheckBox k_se = new JCheckBox("SELF-HARM");
		k_se.setBounds(584, 332, 113, 25);
		PATIENTS.add(k_se);

		JLabel lblProblem = new JLabel("PROBLEM:");
		lblProblem.setBounds(12, 398, 76, 16);
		PATIENTS.add(lblProblem);

		textFieldProblem = new JTextField();
		textFieldProblem.setBounds(96, 395, 156, 57);
		PATIENTS.add(textFieldProblem);
		textFieldProblem.setColumns(10);

		JLabel lblPreviousconsultationdate = new JLabel("PREVIOUS_CONSULTATION_DATE:");
		lblPreviousconsultationdate.setBounds(302, 398, 223, 16);
		PATIENTS.add(lblPreviousconsultationdate);

		textFieldPrevious = new JTextField();
		textFieldPrevious.setEditable(false);
		textFieldPrevious.setBounds(537, 395, 116, 22);
		PATIENTS.add(textFieldPrevious);
		textFieldPrevious.setColumns(10);

		JCheckBox k_alive = new JCheckBox("ISALIVE");
		k_alive.setBounds(722, 332, 113, 25);
		PATIENTS.add(k_alive);

		JLabel lblComments = new JLabel("COMMENTS:");
		lblComments.setBounds(779, 398, 93, 16);
		PATIENTS.add(lblComments);

		textFieldComments = new JTextField();
		textFieldComments.setBounds(698, 427, 254, 94);
		PATIENTS.add(textFieldComments);
		textFieldComments.setColumns(10);

		JCheckBox k_d = new JCheckBox("DANGEROUS");
		k_d.setBounds(839, 332, 113, 25);
		PATIENTS.add(k_d);

		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DeletesClient
						.deletepatient(Integer.parseInt(table_2.getValueAt(table_2.getSelectedRow(), 0).toString()));
				updatetablepatients();

			}
		});
		btnDelete.setBounds(353, 475, 113, 33);
		PATIENTS.add(btnDelete);

		JButton bLater = new JButton("UPDATE LATER");
		bLater.setBounds(192, 475, 125, 33);
		PATIENTS.add(bLater);

		table_2.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent event) {

				if (table_2.getSelectedRow() < 0) {
					btnUpdate.setEnabled(false);
					btnDelete.setEnabled(false);

					return;
				} else {
					btnUpdate.setEnabled(true);
					btnDelete.setEnabled(true);
				}

				textFieldName.setText(table_2.getValueAt(table_2.getSelectedRow(), 1).toString());
				textFieldAddress.setText(table_2.getValueAt(table_2.getSelectedRow(), 2).toString());
				if (table_2.getValueAt(table_2.getSelectedRow(), 3).toString().equals("true")) {
					k_se.setSelected(true);
				} else {
					k_se.setSelected(false);
				}

				if (table_2.getValueAt(table_2.getSelectedRow(), 6).toString().equals("true")) {
					k_alive.setSelected(true);
				} else {
					k_alive.setSelected(false);
				}

				if (table_2.getValueAt(table_2.getSelectedRow(), 8).toString().equals("true")) {
					k_d.setSelected(true);
				} else {
					k_d.setSelected(false);
				}

				textFieldProblem.setText(table_2.getValueAt(table_2.getSelectedRow(), 4).toString());
				String temp2;
				try {
					temp2 = table_2.getValueAt(table_2.getSelectedRow(), 5).toString();
					textFieldPrevious.setText(temp2);
				} catch (Exception e) {

					textFieldPrevious.setText("n/a");
				}

				try {
					temp2 = table_2.getValueAt(table_2.getSelectedRow(), 7).toString();
					textFieldComments.setText(temp2);
				} catch (Exception e) {

					textFieldComments.setText("n/a");
				}
			}

		});

		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String name = textFieldName.getText();
				String address = textFieldAddress.getText();
				boolean selfharm = k_se.isSelected();
				boolean alive = k_alive.isSelected();
				boolean d = k_d.isSelected();
				String problem = textFieldProblem.getText();
				String prev = textFieldPrevious.getText();
				String comments = textFieldComments.getText();

				String se;
				if (selfharm)
					se = "1";
				else
					se = "0";

				String a;
				if (alive)
					a = "1";
				else
					a = "0";

				String kd;
				if (d)
					kd = "1";
				else
					kd = "0";

				UpdatesClient.updatePatient(
						Integer.parseInt(table_2.getValueAt(table_2.getSelectedRow(), 0).toString()), name, address, se,
						problem, prev, a, comments, kd);
				updatetablepatients();
			}
		});

		JPanel IDENTITY = new JPanel();
		tabbedPane.addTab("INCIDENTS", null, IDENTITY, null);
		IDENTITY.setLayout(null);

		JLabel PANTIENT_ID = new JLabel("PANTIENT_ID:");
		PANTIENT_ID.setBounds(56, 301, 127, 14);
		IDENTITY.add(PANTIENT_ID);

		pantient_id = new JTextField();
		pantient_id.setBounds(165, 298, 169, 20);
		IDENTITY.add(pantient_id);
		pantient_id.setColumns(10);

		JLabel DETAILS = new JLabel("DETAILS:");
		DETAILS.setBounds(56, 345, 84, 20);
		IDENTITY.add(DETAILS);

		details = new JTextField();
		details.setBounds(165, 345, 169, 63);
		IDENTITY.add(details);
		details.setColumns(10);

		JLabel INCIDENT_DATE = new JLabel("INCIDENT_DATE(D/M/Y):");
		INCIDENT_DATE.setBounds(377, 293, 185, 30);
		IDENTITY.add(INCIDENT_DATE);

		JComboBox bd_day5 = new JComboBox();
		bd_day5.setBounds(595, 298, 40, 20);
		IDENTITY.add(bd_day5);

		JComboBox bd_month5 = new JComboBox();
		bd_month5.setBounds(645, 298, 42, 20);
		IDENTITY.add(bd_month5);

		JComboBox bd_year5 = new JComboBox();
		bd_year5.setBounds(719, 298, 56, 20);
		IDENTITY.add(bd_year5);

		JButton btnNewButton = new JButton("Insert");
		btnNewButton.setBounds(165, 453, 169, 36);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pantie = pantient_id.getText();
				String deta = details.getText();
				String bd_d = bd_day5.getSelectedItem().toString();
				String bd_m = bd_month5.getSelectedItem().toString();
				String bd_y = bd_year5.getSelectedItem().toString();
				if (pantie.length() > 0 && deta.length() > 0) {
					System.out.println(Integer.parseInt(pantie) + " " + deta + " " + bd_y + "-" + bd_m + "-" + bd_d);
					insertclient.insertincident(Integer.parseInt(pantie), deta, bd_y + "-" + bd_m + "-" + bd_d);
				}

				else {
					JOptionPane.showMessageDialog(null, "dokimaste 3ana");
				}
				updatetable1(model);
			}
		});
		IDENTITY.add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 974, 248);
		IDENTITY.add(scrollPane);

		table_1 = new JTable();
		table_1.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "ID", "PATIENT ID", "DETAILS", "DATE" }) {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;
					boolean[] columnEditables = new boolean[] { false, true, true, true };

					public boolean isCellEditable(int row, int column) {
						return columnEditables[column];
					}
				});

		table_1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent event) {

				// System.out.println(table_1.getValueAt(table_1.getSelectedRow(),
				// 0).toString());
				// System.out.println(table_1.getValueAt(table_1.getSelectedRow(),
				// 1).toString());
				// System.out.println(table_1.getValueAt(table_1.getSelectedRow(),
				// 2).toString());
				pantient_id.setText(table_1.getValueAt(table_1.getSelectedRow(), 0).toString());
				details.setText(table_1.getValueAt(table_1.getSelectedRow(), 1).toString());

				String tokens[] = table_1.getValueAt(table_1.getSelectedRow(), 2).toString().split("-");
				bd_day5.setSelectedItem(Integer.parseInt(tokens[2]));
				bd_month5.setSelectedItem(Integer.parseInt(tokens[1]));
				bd_year5.setSelectedItem(Integer.parseInt(tokens[0]));

			}

		});

		incidentslist = GetArrayLists.getIncidentsList();

		model = (DefaultTableModel) table_1.getModel();

		Object ta[] = new Object[4];
		for (int i = 0; i < incidentslist.size(); i++) {
			ta[0] = incidentslist.get(i).getId();
			ta[1] = incidentslist.get(i).getPatient_id();
			ta[2] = incidentslist.get(i).getDetails();
			ta[3] = incidentslist.get(i).getIncident_date();
			model.addRow(ta);

		}

		scrollPane.setViewportView(table_1);

		JPanel TREATMENT = new JPanel();
		tabbedPane.addTab("TREATMENT", null, TREATMENT, null);
		TREATMENT.setLayout(null);

		JLabel lblPantientid = new JLabel("PANTIENT_ID:");
		lblPantientid.setBounds(80, 293, 96, 27);
		TREATMENT.add(lblPantientid);

		JLabel lblNewLabel = new JLabel("DETAILS:");
		lblNewLabel.setBounds(87, 352, 101, 27);
		TREATMENT.add(lblNewLabel);

		JLabel lblTreatmantdate = new JLabel("TREATMANT_DATE:");
		lblTreatmantdate.setBounds(434, 290, 130, 33);
		TREATMENT.add(lblTreatmantdate);

		pidtre = new JTextField();
		pidtre.setBounds(188, 293, 207, 24);
		TREATMENT.add(pidtre);
		pidtre.setColumns(10);

		det1 = new JTextField();
		det1.setBounds(188, 335, 207, 60);
		TREATMENT.add(det1);
		det1.setColumns(10);

		JComboBox da_tre = new JComboBox();
		da_tre.setBounds(565, 296, 44, 20);
		TREATMENT.add(da_tre);

		JComboBox mo_tre = new JComboBox();
		mo_tre.setBounds(619, 296, 44, 20);
		TREATMENT.add(mo_tre);

		JComboBox ye_tre = new JComboBox();
		ye_tre.setBounds(685, 296, 55, 20);
		TREATMENT.add(ye_tre);

		JButton btnNewButton_1 = new JButton("Insert");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String pa_id = pidtre.getText();
				String detai = det1.getText();
				String d_tre = da_tre.getSelectedItem().toString();
				String m_tre = mo_tre.getSelectedItem().toString();
				String y_tre = ye_tre.getSelectedItem().toString();
				if (pa_id.length() > 0 && detai.length() > 0) {

					insertclient.inserttreatment(Integer.parseInt(pa_id), detai, y_tre + "-" + m_tre + "-" + d_tre);

				} else {
					JOptionPane.showMessageDialog(null, "dokimaste 3ana");
				}
				updatetabletreatment();
			}
		});
		contentPane.setLayout(null);
		btnNewButton_1.setBounds(141, 475, 207, 46);
		TREATMENT.add(btnNewButton_1);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(62, 23, 835, 248);
		TREATMENT.add(scrollPane_1);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "ID", "PATIENT_ID", "DETAILS", "TREATMENT_DATE" }) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] { false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_1.setViewportView(table);

		JPanel DRUGS = new JPanel();
		tabbedPane.addTab("DRUGS", null, DRUGS, null);
		DRUGS.setLayout(null);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(120, 29, 744, 425);
		DRUGS.add(scrollPane_3);

		tableDRUGS = new JTable();
		tableDRUGS.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "NAME", "SIDE_EFFECTS" }) {
			/**
			 * 
			 */

			boolean[] columnEditables = new boolean[] { false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_3.setViewportView(tableDRUGS);

		JPanel ALLERGYS = new JPanel();
		tabbedPane.addTab("PATIENT ALLERGYS", null, ALLERGYS, null);
		ALLERGYS.setLayout(null);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(145, 52, 682, 271);
		ALLERGYS.add(scrollPane_4);

		tableallergys = new JTable();
		tableallergys.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "PATIENT", "ALLERGY" }) {
			boolean[] columnEditables = new boolean[] { false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_4.setViewportView(tableallergys);

		contentPane.add(tabbedPane);

		patientlist = GetArrayLists.getPatientsList();
		if (patientlist != null) {
			modelpatients = (DefaultTableModel) table_2.getModel();

			Object ta1[] = new Object[9];

			for (int i = 0; i < patientlist.size(); i++) {
				ta1[0] = patientlist.get(i).getId();
				ta1[1] = patientlist.get(i).getName();
				ta1[2] = patientlist.get(i).getAddress();

				char temp = patientlist.get(i).getSelfharm();

				if (temp == '1') {
					ta1[3] = "true";
				} else
					ta1[3] = "false";

				ta1[4] = patientlist.get(i).getProblem();
				ta1[5] = patientlist.get(i).getPrev_cons();

				temp = patientlist.get(i).getIsalive();

				if (temp == '1') {
					ta1[6] = "true";
				} else
					ta1[6] = "false";

				ta1[7] = patientlist.get(i).getComments();

				temp = patientlist.get(i).getDangerous();

				if (temp == '1') {
					ta1[8] = "true";
				} else
					ta1[8] = "false";

				modelpatients.addRow(ta1);

			}
		}

		// Initialise combo boxes
		for (int count = 1; count <= 31; count++) {

			bd_day5.addItem(count);
			da_tre.addItem(count);
		}
		for (int count = 1; count <= 12; count++) {

			bd_month5.addItem(count);
			mo_tre.addItem(count);

		}
		for (int count = 1950; count <= (Calendar.getInstance().get(Calendar.YEAR)); count++) {

			bd_year5.addItem(count);
			ye_tre.addItem(count);
		}

		modeltreatment = (DefaultTableModel) table.getModel();
		treatmentlist = GetArrayLists.getTreatmentList();

		Object ta3[] = new Object[4];
		for (int i = 0; i < treatmentlist.size(); i++) {
			ta3[0] = treatmentlist.get(i).getId();
			ta3[1] = treatmentlist.get(i).getPatientID();
			ta3[2] = treatmentlist.get(i).getDetails();
			ta3[3] = treatmentlist.get(i).getDate();
			modeltreatment.addRow(ta3);

		}

		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent event) {

				pidtre.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
				det1.setText(table.getValueAt(table.getSelectedRow(), 2).toString());

				String tokens[] = table.getValueAt(table.getSelectedRow(), 3).toString().split("-");
				da_tre.setSelectedItem(Integer.parseInt(tokens[2]));
				mo_tre.setSelectedItem(Integer.parseInt(tokens[1]));
				ye_tre.setSelectedItem(Integer.parseInt(tokens[0]));

			}

		});

		modeldrugs = (DefaultTableModel) tableDRUGS.getModel();
		druglist = GetArrayLists.getDrugsList();

		Object tad[] = new Object[2];
		for (int i = 0; i < druglist.size(); i++) {

			tad[0] = druglist.get(i).getName();
			tad[1] = druglist.get(i).getSide_effects();
			modeldrugs.addRow(tad);

		}
		
		
		
		modelal = (DefaultTableModel) tableallergys.getModel();
		palist = GetArrayLists.getPatientAllergyList();
		ArrayList<Patient> tempplist= GetArrayLists.getPatientsList();
		ArrayList<Alergy> allist=GetArrayLists.getAlergysList();
		Object tal[] = new Object[2];
		for (int i = 0; i < palist.size(); i++) {

			int p=palist.get(i).getPatient_id();
			int a=palist.get(i).getAllergy_id();
			
			
			for (int j=0;j<tempplist.size();j++){
				if (tempplist.get(j).getId()==p)
			tal[0] =tempplist.get(j).getName();
					
			}
			
			for (int j=0;j<allist.size();j++){
				if (allist.get(j).getId()==p)
			tal[1] = allist.get(j).getName();
			}
			modelal.addRow(tal);

		}

		

	}

	void updatetabletreatment() {
		treatmentlist = GetArrayLists.getTreatmentList();

		while (modeltreatment.getRowCount() > 0)
			modeltreatment.removeRow(0);
		Object ta3[] = new Object[4];
		for (int i = 0; i < treatmentlist.size(); i++) {
			ta3[0] = treatmentlist.get(i).getId();
			ta3[1] = treatmentlist.get(i).getPatientID();
			ta3[2] = treatmentlist.get(i).getDetails();
			ta3[3] = treatmentlist.get(i).getDate();
			modeltreatment.addRow(ta3);

		}
	}

	void updatetable1(DefaultTableModel model) {
		incidentslist = GetArrayLists.getIncidentsList();

		while (model.getRowCount() > 0)
			model.removeRow(0);
		Object ta[] = new Object[4];
		for (int i = 0; i < incidentslist.size(); i++) {
			ta[0] = incidentslist.get(i).getId();
			ta[1] = incidentslist.get(i).getPatient_id();
			ta[2] = incidentslist.get(i).getDetails();
			ta[3] = incidentslist.get(i).getIncident_date();
			model.addRow(ta);

		}
	}

	void updatetablepatients() {

		if (modelpatients == null) {

			btnUpdate.setEnabled(false);
			btnDelete.setEnabled(false);

			return;
		} else {
			btnUpdate.setEnabled(true);
			btnDelete.setEnabled(true);
		}

		while (modelpatients.getRowCount() > 0) {
			modelpatients.removeRow(0);

		}

		patientlist = GetArrayLists.getPatientsList();
		if (patientlist == null)
			return;
		modelpatients = (DefaultTableModel) table_2.getModel();

		Object ta1[] = new Object[9];

		for (int i = 0; i < patientlist.size(); i++) {
			ta1[0] = patientlist.get(i).getId();
			ta1[1] = patientlist.get(i).getName();
			ta1[2] = patientlist.get(i).getAddress();

			char temp = patientlist.get(i).getSelfharm();

			if (temp == '1') {
				ta1[3] = "true";
			} else
				ta1[3] = "false";

			ta1[4] = patientlist.get(i).getProblem();
			ta1[5] = patientlist.get(i).getPrev_cons();

			temp = patientlist.get(i).getIsalive();

			if (temp == '1') {
				ta1[6] = "true";
			} else
				ta1[6] = "false";

			ta1[7] = patientlist.get(i).getComments();

			temp = patientlist.get(i).getDangerous();

			if (temp == '1') {
				ta1[8] = "true";
			} else
				ta1[8] = "false";

			modelpatients.addRow(ta1);

		}
	}
}
