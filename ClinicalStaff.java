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

public class ClinicalStaff extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField address;
	private JTextField problem;
	private JTextField pantient_id;
	private JTextField details;
	private JTextField pantie_id;
	private JTextField detailstre;

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
		setBounds(100, 100, 781, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 11, 765, 390);
		contentPane.add(tabbedPane);
		
		JPanel PATIENTS = new JPanel();
		tabbedPane.addTab("PATIENTS", null, PATIENTS, null);
		PATIENTS.setLayout(null);
		
		JLabel NAME = new JLabel("NAME:");
		NAME.setBounds(10, 11, 45, 32);
		PATIENTS.add(NAME);
		
		JLabel ADDRESS = new JLabel("ADDRESS:");
		ADDRESS.setHorizontalAlignment(SwingConstants.LEFT);
		ADDRESS.setBounds(10, 54, 70, 32);
		PATIENTS.add(ADDRESS);
		
		JLabel SELFHARM = new JLabel("SELFHARM:");
		SELFHARM.setHorizontalAlignment(SwingConstants.LEFT);
		SELFHARM.setBounds(10, 121, 97, 14);
		PATIENTS.add(SELFHARM);
		
		JLabel PROBLEM = new JLabel("PROBLEM:");
		PROBLEM.setBounds(10, 146, 93, 32);
		PATIENTS.add(PROBLEM);
		
		JLabel PREVIOUS_CONSULTATION = new JLabel("PREVIOUS_CONSULTATION(D/M/Y):");
		PREVIOUS_CONSULTATION.setBounds(10, 189, 202, 32);
		PATIENTS.add(PREVIOUS_CONSULTATION);
		
		JLabel islalive = new JLabel("ISALIVE:");
		islalive.setBounds(10, 232, 142, 24);
		PATIENTS.add(islalive);
		
		name = new JTextField();
		name.setBounds(79, 17, 133, 20);
		PATIENTS.add(name);
		name.setColumns(10);
		
		address = new JTextField();
		address.setBounds(79, 60, 133, 24);
		PATIENTS.add(address);
		address.setColumns(10);
		
		JCheckBox selfharm = new JCheckBox("YES");
		selfharm.setBounds(169, 117, 97, 23);
		PATIENTS.add(selfharm);
		
		JComboBox d_pa = new JComboBox();
		d_pa.setBounds(243, 195, 51, 20);
		PATIENTS.add(d_pa);
		
		JComboBox m_pa = new JComboBox();
		m_pa.setBounds(320, 195, 51, 20);
		PATIENTS.add(m_pa);
		
		JComboBox y_pa = new JComboBox();
		y_pa.setBounds(381, 195, 70, 20);
		PATIENTS.add(y_pa);
		
		JCheckBox isalive = new JCheckBox("YES");
		isalive.setBounds(98, 233, 97, 23);
		PATIENTS.add(isalive);
		
		problem = new JTextField();
		problem.setBounds(79, 146, 156, 24);
		PATIENTS.add(problem);
		problem.setColumns(10);
		
		JButton insert = new JButton("Insert");
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
		insert.setBounds(146, 306, 89, 23);
		PATIENTS.add(insert);
		
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
		bd_year5.setBounds(268, 117, 56, 20);
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
