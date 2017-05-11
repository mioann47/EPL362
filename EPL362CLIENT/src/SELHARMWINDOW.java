/**
 * 
 */


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Modes
 *
 */
public class SELHARMWINDOW extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SELHARMWINDOW frame = new SELHARMWINDOW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SELHARMWINDOW() {
		setTitle("PATIENTS WITH SELF HARM");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 689, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 13, 636, 381);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NAME", "ADDRESS"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnGenerateLetters = new JButton("GENERATE LETTERS");
		btnGenerateLetters.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Patient> p=GetArrayLists.getPatientsListself();
				int counter=0;
				for (int i=0;i<p.size();i++){
					counter++;
					GenerateFiles.letter(p.get(i));			
				}
				JOptionPane.showMessageDialog(null, counter+" Letters generated");
				
			}
		});
		btnGenerateLetters.setBounds(267, 422, 154, 30);
		contentPane.add(btnGenerateLetters);
		
		
		ArrayList<Patient> p=GetArrayLists.getPatientsListself();
		
		DefaultTableModel model=(DefaultTableModel) table.getModel();
		
		Object ta[] = new Object[4];
		for (int i = 0; i < p.size(); i++) {
			ta[0] = p.get(i).getName();
			ta[1] = p.get(i).getAddress();
			model.addRow(ta);

		}
	}
}
