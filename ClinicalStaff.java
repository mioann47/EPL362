import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

	private JPanel contentPane;
	private JTextField name;
	private JTextField address;
	private JTextField problem;
	private JTextField pantient_id;
	private JTextField details;
	private JTextField pantie_id;
	private JTextField detailstre;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

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
		setBounds(100, 100, 843, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JScrollPane PATIENTS = new JScrollPane();
		tabbedPane.addTab("PATIENTS", null, PATIENTS, null);
		
		JLabel NAME = new JLabel("NAME:");
		NAME.setBounds(10, 11, 80, 32);
		
		JLabel ADDRESS = new JLabel("ADDRESS:");
		ADDRESS.setBounds(10, 54, 97, 32);
		ADDRESS.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel SELFHARM = new JLabel("SELFHARM:");
		SELFHARM.setBounds(10, 121, 97, 14);
		SELFHARM.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel PROBLEM = new JLabel("PROBLEM:");
		PROBLEM.setBounds(10, 146, 93, 32);
		
		JLabel PREVIOUS_CONSULTATION = new JLabel("PREVIOUS_CONSULTATION(D/M/Y):");
		PREVIOUS_CONSULTATION.setBounds(10, 189, 225, 32);
		
		JLabel islalive = new JLabel("ISALIVE:");
		islalive.setBounds(10, 232, 142, 24);
		
		name = new JTextField();
		name.setBounds(182, 17, 133, 20);
		name.setColumns(10);
		
		address = new JTextField();
		address.setBounds(192, 58, 133, 24);
		address.setColumns(10);
		
		JCheckBox selfharm = new JCheckBox("YES");
		selfharm.setBounds(169, 117, 97, 23);
		
		JComboBox d_pa = new JComboBox();
		d_pa.setBounds(243, 195, 51, 20);
		
		JComboBox m_pa = new JComboBox();
		m_pa.setBounds(320, 195, 51, 20);
		
		JComboBox y_pa = new JComboBox();
		y_pa.setBounds(381, 195, 70, 20);
		
		JCheckBox isalive = new JCheckBox("YES");
		isalive.setBounds(98, 233, 97, 23);
		
		problem = new JTextField();
		problem.setBounds(110, 150, 156, 24);
		problem.setColumns(10);
		
		JButton insert = new JButton("Insert");
		insert.setBounds(146, 306, 89, 23);
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String na=name.getText();
				String ad=address.getText();
				String pro=problem.getText();
				boolean  self=selfharm.isSelected();
				boolean isa=isalive.isSelected();
				String d_p = d_pa.getSelectedItem().toString();
				String m_p = m_pa.getSelectedItem().toString();
				String y_p = y_pa.getSelectedItem().toString();
				
				if(na.length()>0&&ad.length()>0&&pro.length()>0&&d_p.length()>0&&m_p.length()>0&&y_p.length()>0){
					
				}
				else {
					JOptionPane.showMessageDialog(null, "dokimaste 3ana");
				}
			}
		});
		PATIENTS.setLayout(null);
		PATIENTS.add(NAME);
		PATIENTS.add(name);
		PATIENTS.add(ADDRESS);
		PATIENTS.add(address);
		PATIENTS.add(SELFHARM);
		PATIENTS.add(selfharm);
		PATIENTS.add(PROBLEM);
		PATIENTS.add(problem);
		PATIENTS.add(PREVIOUS_CONSULTATION);
		PATIENTS.add(d_pa);
		PATIENTS.add(m_pa);
		PATIENTS.add(y_pa);
		PATIENTS.add(islalive);
		PATIENTS.add(isalive);
		PATIENTS.add(insert);
		
		table_1 = new JTable();
		PATIENTS.setColumnHeaderView(table_1);
		
		table_2 = new JTable();
		PATIENTS.setViewportView(table_2);
		
		JPanel IDENTITY = new JPanel();
		tabbedPane.addTab("INCIDENTS", null, IDENTITY, null);
		IDENTITY.setLayout(null);
		
		JLabel PANTIENT_ID = new JLabel("PANTIENT_ID:");
		PANTIENT_ID.setBounds(10, 11, 127, 14);
		IDENTITY.add(PANTIENT_ID);
		
		pantient_id = new JTextField();
		pantient_id.setBounds(119, 8, 133, 20);
		IDENTITY.add(pantient_id);
		pantient_id.setColumns(10);
		
		JLabel DETAILS = new JLabel("DETAILS:");
		DETAILS.setBounds(10, 55, 84, 20);
		IDENTITY.add(DETAILS);
		
		details = new JTextField();
		details.setBounds(119, 55, 133, 20);
		IDENTITY.add(details);
		details.setColumns(10);
		
		JLabel INCIDENT_DATE = new JLabel("INCIDENT_DATE(D/M/Y):");
		INCIDENT_DATE.setBounds(10, 112, 127, 30);
		IDENTITY.add(INCIDENT_DATE);
		
		JComboBox bd_day5 = new JComboBox();
		bd_day5.setBounds(160, 117, 40, 20);
		IDENTITY.add(bd_day5);
		
		JComboBox bd_month5 = new JComboBox();
		bd_month5.setBounds(210, 117, 42, 20);
		IDENTITY.add(bd_month5);
		
		JComboBox bd_year5 = new JComboBox();
		bd_year5.setBounds(318, 117, 56, 20);
		IDENTITY.add(bd_year5);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pantie=pantient_id.getText();
				String deta=details.getText();
				String bd_d = bd_day5.getSelectedItem().toString();
				String bd_m =bd_month5.getSelectedItem().toString();
				String bd_y=bd_year5.getSelectedItem().toString();
				if (pantie.length()>0&&deta.length()>0){
					
				}
				
				else {
					JOptionPane.showMessageDialog(null, "dokimaste 3ana");
				}
				
			}
		});
		btnNewButton.setBounds(119, 273, 169, 36);
		IDENTITY.add(btnNewButton);
		
		JPanel TREATMENT = new JPanel();
		tabbedPane.addTab("TREATMENT", null, TREATMENT, null);
		TREATMENT.setLayout(null);
		
		JLabel lblPantientid = new JLabel("PANTIENT_ID:");
		lblPantientid.setBounds(10, 11, 96, 27);
		TREATMENT.add(lblPantientid);
		
		JLabel lblNewLabel = new JLabel("DETAILS:");
		lblNewLabel.setBounds(10, 49, 101, 27);
		TREATMENT.add(lblNewLabel);
		
		JLabel lblTreatmantdate = new JLabel("TREATMANT_DATE:");
		lblTreatmantdate.setBounds(10, 101, 130, 33);
		TREATMENT.add(lblTreatmantdate);
		
		pantie_id = new JTextField();
		pantie_id.setBounds(96, 14, 178, 24);
		TREATMENT.add(pantie_id);
		pantie_id.setColumns(10);
		
		detailstre = new JTextField();
		detailstre.setBounds(96, 56, 178, 34);
		TREATMENT.add(detailstre);
		detailstre.setColumns(10);
		
		JComboBox da_tre = new JComboBox();
		da_tre.setBounds(141, 107, 44, 20);
		TREATMENT.add(da_tre);
		
		JComboBox mo_tre = new JComboBox();
		mo_tre.setBounds(195, 107, 44, 20);
		TREATMENT.add(mo_tre);
		
		JComboBox ye_tre = new JComboBox();
		ye_tre.setBounds(261, 107, 55, 20);
		TREATMENT.add(ye_tre);
		
		JButton btnNewButton_1 = new JButton("Insert");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pa_id=pantie_id.getText();
				String detai=detailstre.getText();
				String d_tre=da_tre.getSelectedItem().toString();
				String m_tre=mo_tre.getSelectedItem().toString();
				String y_tre=ye_tre.getSelectedItem().toString();
				if(pa_id.length()>0&&detai.length()>0){
					
				}
				else {
					JOptionPane.showMessageDialog(null, "dokimaste 3ana");
				}
			}
		});
		btnNewButton_1.setBounds(96, 248, 207, 46);
		TREATMENT.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("ALLERGYS", null, panel, null);
		panel.setLayout(null);
		
		JList list = new JList();
		list.setBounds(10, 11, 740, 340);
		panel.add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(733, 11, 17, 340);
		panel.add(scrollBar);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.setBounds(39, 16, 580, 251);
		panel_1.add(table);
		
		table_3 = new JTable();
		tabbedPane.addTab("New tab", null, table_3, null);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 765, GroupLayout.PREFERRED_SIZE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
		
		
		
		//Initialise combo boxes
        for(int count=1; count<=31; count++){
        	d_pa.addItem(count);
        	bd_day5.addItem(count);
        	da_tre.addItem(count);
        }
        for(int count=1; count<=12; count++){
        	m_pa.addItem(count);
        	bd_month5.addItem(count);
        	mo_tre.addItem(count);

        }
        for(int count=1950; count<=(Calendar.getInstance().get(Calendar.YEAR)); count++){
        	y_pa.addItem(count);
        	bd_year5.addItem(count);
        	ye_tre.addItem(count);
      }
		
		
	}
}
