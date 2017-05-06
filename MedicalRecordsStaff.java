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
import java.awt.event.ActionEvent;

public class MedicalRecordsStaff extends JFrame {

	private JPanel contentPane;
	private JTextField name_clinics;
	private JTextField address_clinics;

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
		SUPPORTS_PRE_ARRANGED.setHorizontalAlignment(SwingConstants.CENTER);
		SUPPORTS_PRE_ARRANGED.setBounds(10, 147, 247, 28);
		CLINICS.add(SUPPORTS_PRE_ARRANGED);
		
		name_clinics = new JTextField();
		name_clinics.setBounds(173, 8, 119, 20);
		CLINICS.add(name_clinics);
		name_clinics.setColumns(10);
		
		address_clinics = new JTextField();
		address_clinics.setBounds(183, 46, 119, 23);
		CLINICS.add(address_clinics);
		address_clinics.setColumns(10);
		
		JCheckBox suppo_drop_yes = new JCheckBox("YES");
		suppo_drop_yes.setBounds(301, 95, 97, 23);
		CLINICS.add(suppo_drop_yes);
		
		JCheckBox supports_pre = new JCheckBox("YES");
		supports_pre.setBounds(311, 150, 97, 23);
		CLINICS.add(supports_pre);
		
		JButton btnClinics = new JButton("Insert");
		btnClinics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String na_clinics=name_clinics.getText();
			String ad_clinics=address_clinics .getText();
			boolean  su_drop_yes=suppo_drop_yes.isSelected();
			boolean suppo_pre=supports_pre.isSelected();
			if(na_clinics.length()>0&&ad_clinics.length()>0){
				
			}
			else {
				JOptionPane.showMessageDialog(null, "dokimaste 3ana");
				
			}
				
			}
		});
		btnClinics.setBounds(104, 260, 153, 33);
		CLINICS.add(btnClinics);
	}

}
