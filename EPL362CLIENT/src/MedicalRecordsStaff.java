import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MedicalRecordsStaff extends JFrame {

	private JPanel contentPane;
	private JTextField name_clinics;
	private JTextField address_clinics;
	private JTable tableclinics;
	private JTable tabledrugs;
	private JTable tableal;
	private JTable tablereq;
	private JTextField alname;
	private JTextField tdrug;
	private JTextField tside;

	ArrayList<Clinic> clist = GetArrayLists.getClinicsList();
	DefaultTableModel modelclinic,modeldrug,modelalergy,modelreq,modelupdate;
	
	ArrayList<Drug> druglist=GetArrayLists.getDrugsList();
	ArrayList<Alergy> alergylist=GetArrayLists.getAlergysList();
	ArrayList<request> reqlist= GetArrayLists.getrequestList();
	ArrayList<Patient> updpatlist=GetArrayLists.getPatientsUpdateList();
	private JTable tableupdate;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicalRecordsStaff frame = new MedicalRecordsStaff();
					frame.setVisible(true);
					frame.setTitle("MedicalRecordsStaff");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MedicalRecordsStaff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 695, 367);
		contentPane.add(tabbedPane);
		
		JPanel CLINICS = new JPanel();
		tabbedPane.addTab("CLINICS", null, CLINICS, null);
		CLINICS.setLayout(null);
		
		JLabel NAME = new JLabel("NAME:");
		NAME.setBounds(10, 11, 119, 14);
		CLINICS.add(NAME);
		
		JLabel ADDRESS = new JLabel("ADDRESS:");
		ADDRESS.setBounds(10, 47, 129, 23);
		CLINICS.add(ADDRESS);
		
		JLabel SUPPORTS_DROP_IN = new JLabel("SUPPORTS_DROP_IN:");
		SUPPORTS_DROP_IN.setBounds(10, 92, 207, 28);
		CLINICS.add(SUPPORTS_DROP_IN);
		
		JLabel SUPPORTS_PRE_ARRANGED = new JLabel("SUPPORTS_PRE_ARRANGED:");
		SUPPORTS_PRE_ARRANGED.setBounds(10, 147, 176, 28);
		SUPPORTS_PRE_ARRANGED.setHorizontalAlignment(SwingConstants.CENTER);
		CLINICS.add(SUPPORTS_PRE_ARRANGED);
		
		name_clinics = new JTextField();
		name_clinics.setBounds(229, 8, 119, 20);
		CLINICS.add(name_clinics);
		name_clinics.setColumns(10);
		
		address_clinics = new JTextField();
		address_clinics.setBounds(229, 47, 119, 23);
		CLINICS.add(address_clinics);
		address_clinics.setColumns(10);
		
		JCheckBox suppo_drop_yes = new JCheckBox("YES");
		suppo_drop_yes.setBounds(225, 95, 97, 23);
		CLINICS.add(suppo_drop_yes);
		
		JCheckBox supports_pre = new JCheckBox("YES");
		supports_pre.setBounds(225, 150, 97, 23);
		CLINICS.add(supports_pre);
		
		JButton btnClinics = new JButton("Insert");
		btnClinics.setBounds(104, 260, 153, 33);
		btnClinics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String na_clinics=name_clinics.getText();
			String ad_clinics=address_clinics .getText();
			boolean  su_drop_yes=suppo_drop_yes.isSelected();
			boolean suppo_pre=supports_pre.isSelected();
			
			String su,sup;
			if (su_drop_yes) su="1";
			else su="0";
			
			
			if (suppo_pre) sup="1";
			else sup="0";
			
			if(na_clinics.length()>0&&ad_clinics.length()>0){
				insertclient.insertclinic(na_clinics, ad_clinics, su, sup);
				updateclinic();
			}
			else {
				JOptionPane.showMessageDialog(null, "dokimaste 3ana");
				
			}
				
			}
		});
		CLINICS.add(btnClinics);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(381, 11, 278, 289);
		CLINICS.add(scrollPane);
		
		tableclinics = new JTable();
		tableclinics.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "NAME", "ADDRESS"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tableclinics);
		
		JPanel DRUGS = new JPanel();
		tabbedPane.addTab("DRUGS", null, DRUGS, null);
		DRUGS.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(50, 13, 576, 142);
		DRUGS.add(scrollPane_1);
		
		tabledrugs = new JTable();
		tabledrugs.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "NAME", "SIDE_EFFECTS"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_1.setViewportView(tabledrugs);
		
		tdrug = new JTextField();
		tdrug.setBounds(50, 217, 116, 22);
		DRUGS.add(tdrug);
		tdrug.setColumns(10);
		
		tside = new JTextField();
		tside.setBounds(212, 217, 116, 71);
		DRUGS.add(tside);
		tside.setColumns(10);
		
		JLabel lblDrugName = new JLabel("DRUG NAME:");
		lblDrugName.setBounds(65, 195, 89, 16);
		DRUGS.add(lblDrugName);
		
		JLabel lblSideeffects = new JLabel("SIDE_EFFECTS:");
		lblSideeffects.setBounds(212, 188, 102, 16);
		DRUGS.add(lblSideeffects);
		
		JButton btnInsert_1 = new JButton("INSERT");
		btnInsert_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String td=tdrug.getText();
				String ts=tside.getText();
				insertclient.insertdrug(td, ts);
				updatedrug();
			}
		});
		btnInsert_1.setBounds(444, 228, 97, 25);
		DRUGS.add(btnInsert_1);
		
		JPanel ALLERGYS = new JPanel();
		tabbedPane.addTab("ALLERGYS", null, ALLERGYS, null);
		ALLERGYS.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(63, 13, 571, 199);
		ALLERGYS.add(scrollPane_2);
		
		tableal = new JTable();
		tableal.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "NAME"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_2.setViewportView(tableal);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s= alname.getText();
				insertclient.insertallergy(s);
				updatelaergy();
			}
		});
		btnInsert.setBounds(268, 259, 97, 25);
		ALLERGYS.add(btnInsert);
		
		alname = new JTextField();
		alname.setBounds(63, 260, 116, 22);
		ALLERGYS.add(alname);
		alname.setColumns(10);
		
		JLabel lblAllergyName = new JLabel("ALLERGY NAME:");
		lblAllergyName.setBounds(66, 225, 140, 16);
		ALLERGYS.add(lblAllergyName);
		
		JPanel REQUESTS = new JPanel();
		tabbedPane.addTab("REQUESTS", null, REQUESTS, null);
		REQUESTS.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(12, 27, 666, 136);
		REQUESTS.add(scrollPane_3);
		
		tablereq = new JTable();
		tablereq.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "PATIENT ID", "PATIENT NEW NAME", "PATIENT NEW ADDRESS"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_3.setViewportView(tablereq);
		
		JButton btnApprove = new JButton("APPROVE");
		btnApprove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(tablereq.getValueAt(tablereq.getSelectedRow(), 0).toString());
				int patient_id = Integer.parseInt(tablereq.getValueAt(tablereq.getSelectedRow(), 1).toString());
				String name = tablereq.getValueAt(tablereq.getSelectedRow(), 2).toString();
				String add = tablereq.getValueAt(tablereq.getSelectedRow(), 3).toString();
				
				System.out.println(id+" "+patient_id+" "+name+" "+add);
				
				ArrayList<Patient> patientlist= GetArrayLists.getPatientsList();
				for (int i=0;i<patientlist.size();i++){
					
					if (patient_id==patientlist.get(i).getId()){
						
				UpdatesClient.updatePatient(patient_id, name,
						add, patientlist.get(i).getSelfharm()+"", 
						patientlist.get(i).getProblem(), patientlist.get(i).getPrev_cons(), 
						patientlist.get(i).getIsalive()+"", patientlist.get(i).getComments(),
						patientlist.get(i).getDangerous()+"");
				
					
					DeletesClient.deleterequest(id);
					updatereq();
					}
				}
			}
		});
		btnApprove.setBounds(25, 224, 97, 25);
		REQUESTS.add(btnApprove);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(tablereq.getValueAt(tablereq.getSelectedRow(), 0).toString());
				
				
					
					DeletesClient.deleterequest(id);
					updatereq();
			}
		});
		btnDelete.setBounds(163, 224, 97, 25);
		REQUESTS.add(btnDelete);
		
		JPanel UPDATEPATIENTS = new JPanel();
		tabbedPane.addTab("UPDATE PATIENTS", null, UPDATEPATIENTS, null);
		UPDATEPATIENTS.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(12, 13, 666, 261);
		UPDATEPATIENTS.add(scrollPane_4);
		
		tableupdate = new JTable();
		tableupdate.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "NAME", "ADDRESS", "SELFHARM", "PROBLEM", "PREV_CONS", "ISALIVE", "COMMENTS", "DANGEROUS"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_4.setViewportView(tableupdate);
		
		JButton btnUpdateNow = new JButton("UPDATE NOW");
		btnUpdateNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String id=tableupdate.getValueAt(tableupdate.getSelectedRow(), 0).toString();
				String name=tableupdate.getValueAt(tableupdate.getSelectedRow(), 1).toString();
				String add=tableupdate.getValueAt(tableupdate.getSelectedRow(), 2).toString();
				String self=tableupdate.getValueAt(tableupdate.getSelectedRow(), 3).toString();
				String prob=tableupdate.getValueAt(tableupdate.getSelectedRow(), 4).toString();
				String prev=tableupdate.getValueAt(tableupdate.getSelectedRow(), 5).toString();
				String isalive=tableupdate.getValueAt(tableupdate.getSelectedRow(), 6).toString();
				String com=tableupdate.getValueAt(tableupdate.getSelectedRow(), 7).toString();
				String da=tableupdate.getValueAt(tableupdate.getSelectedRow(), 8).toString();
				
				String s1,s2,s3;
				if (self.equals("true")) s1="1"; else s1="0";
				if (isalive.equals("true")) s2="1"; else s2="0";
				if (da.equals("true")) s3="1"; else s3="0";
				
				UpdatesClient.updatePatient(Integer.parseInt(id), name, add, s1, prob, prev, s2, com, s3);
				DeletesClient.deletepatientupd(Integer.parseInt(id));
				updatepatientsupdate();
			}
		});
		btnUpdateNow.setBounds(238, 299, 152, 25);
		UPDATEPATIENTS.add(btnUpdateNow);
		
		
		modelclinic = (DefaultTableModel) tableclinics.getModel();
		Object tc[] = new Object[3];
		clist = GetArrayLists.getClinicsList();
		if (clist!=null){
		for (int i = 0; i < clist.size(); i++) {

			tc[0] = clist.get(i).getId();
			tc[1] = clist.get(i).getName();
			tc[2] = clist.get(i).getAddress();
			modelclinic.addRow(tc);

		}
		}
		
		
		modeldrug = (DefaultTableModel) tabledrugs.getModel();
		Object tdr[] = new Object[3];
		druglist = GetArrayLists.getDrugsList();
		if (druglist!=null){
		for (int i = 0; i < druglist.size(); i++) {

			tdr[0] = druglist.get(i).getId();
			tdr[1] = druglist.get(i).getName();
			tdr[2] = druglist.get(i).getSide_effects();
			modeldrug.addRow(tdr);

		}
		}
		
		modelalergy = (DefaultTableModel) tableal.getModel();
		Object tal[] = new Object[3];
		alergylist = GetArrayLists.getAlergysList();
		if (alergylist!=null){
		for (int i = 0; i < alergylist.size(); i++) {

			tal[0] = alergylist.get(i).getId();
			tal[1] = alergylist.get(i).getName();
			modelalergy.addRow(tal);

		}
		}
		
		modelreq = (DefaultTableModel) tablereq.getModel();
		Object trq[] = new Object[4];
		reqlist = GetArrayLists.getrequestList();
		if (reqlist!=null){
		for (int i = 0; i < reqlist.size(); i++) {

			trq[0] = reqlist.get(i).getId();
			trq[1] = reqlist.get(i).getPatientID();
			trq[2] = reqlist.get(i).getNewName();
			trq[3] = reqlist.get(i).getNewAddress();
			modelreq.addRow(trq);

		}
		}
		
		
		modelupdate = (DefaultTableModel) tableupdate.getModel();
		Object tup[] = new Object[9];
		updpatlist=GetArrayLists.getPatientsUpdateList();
		if (updpatlist!=null){
		for (int i = 0; i < updpatlist.size(); i++) {

			tup[0] = updpatlist.get(i).getId();
			tup[1] = updpatlist.get(i).getName();
			tup[2] = updpatlist.get(i).getAddress();

			char temp = updpatlist.get(i).getSelfharm();

			if (temp == '1') {
				tup[3] = "true";
			} else
				tup[3] = "false";

			tup[4] = updpatlist.get(i).getProblem();
			tup[5] = updpatlist.get(i).getPrev_cons();

			temp = updpatlist.get(i).getIsalive();

			if (temp == '1') {
				tup[6] = "true";
			} else
				tup[6] = "false";

			tup[7] = updpatlist.get(i).getComments();

			temp = updpatlist.get(i).getDangerous();

			if (temp == '1') {
				tup[8] = "true";
			} else
				tup[8] = "false";
			modelupdate.addRow(tup);

		}
		}
		
		
	}
	
	
	
	
	void updatepatientsupdate(){
		modelupdate = (DefaultTableModel) tableupdate.getModel();
		while (modelupdate.getRowCount() > 0)
			modelupdate.removeRow(0);
		Object tup[] = new Object[9];
		updpatlist=GetArrayLists.getPatientsUpdateList();
		if (updpatlist!=null){
		for (int i = 0; i < updpatlist.size(); i++) {

			tup[0] = updpatlist.get(i).getId();
			tup[1] = updpatlist.get(i).getName();
			tup[2] = updpatlist.get(i).getAddress();

			char temp = updpatlist.get(i).getSelfharm();

			if (temp == '1') {
				tup[3] = "true";
			} else
				tup[3] = "false";

			tup[4] = updpatlist.get(i).getProblem();
			tup[5] = updpatlist.get(i).getPrev_cons();

			temp = updpatlist.get(i).getIsalive();

			if (temp == '1') {
				tup[6] = "true";
			} else
				tup[6] = "false";

			tup[7] = updpatlist.get(i).getComments();

			temp = updpatlist.get(i).getDangerous();

			if (temp == '1') {
				tup[8] = "true";
			} else
				tup[8] = "false";
			modelupdate.addRow(tup);

		}
		}
	}
	
	
	void updatereq(){
		
		modelreq = (DefaultTableModel) tablereq.getModel();
		while (modelreq.getRowCount() > 0)
			modelreq.removeRow(0);
		Object trq[] = new Object[4];
		reqlist = GetArrayLists.getrequestList();
		if (reqlist!=null){
		for (int i = 0; i < reqlist.size(); i++) {

			trq[0] = reqlist.get(i).getId();
			trq[1] = reqlist.get(i).getPatientID();
			trq[2] = reqlist.get(i).getNewName();
			trq[3] = reqlist.get(i).getNewAddress();
			modelreq.addRow(trq);

		}
		}
	}
	
	
	void updatelaergy(){
		
		modelalergy = (DefaultTableModel) tableal.getModel();
		while (modelalergy.getRowCount() > 0)
			modelalergy.removeRow(0);
		Object tal[] = new Object[3];
		alergylist = GetArrayLists.getAlergysList();
		if (alergylist!=null){
		for (int i = 0; i < alergylist.size(); i++) {

			tal[0] = alergylist.get(i).getId();
			tal[1] = alergylist.get(i).getName();
			modelalergy.addRow(tal);

		}
		}
		
	}
	
	
	void updatedrug(){

		modeldrug = (DefaultTableModel) tabledrugs.getModel();
		while (modeldrug.getRowCount() > 0)
			modeldrug.removeRow(0);
		Object tdr[] = new Object[3];
		druglist = GetArrayLists.getDrugsList();
		if (druglist!=null){
		for (int i = 0; i < druglist.size(); i++) {

			tdr[0] = druglist.get(i).getId();
			tdr[1] = druglist.get(i).getName();
			tdr[2] = druglist.get(i).getSide_effects();
			modeldrug.addRow(tdr);

		}
		}
	}
	
	
	void updateclinic(){
		modelclinic = (DefaultTableModel) tableclinics.getModel();
		while (modelclinic.getRowCount() > 0)
			modelclinic.removeRow(0);
		Object tc[] = new Object[3];
		clist = GetArrayLists.getClinicsList();
		if (clist!=null){
		for (int i = 0; i < clist.size(); i++) {

			tc[0] = clist.get(i).getId();
			tc[1] = clist.get(i).getName();
			tc[2] = clist.get(i).getAddress();
			modelclinic.addRow(tc);

		}
		}
		
	}
}
