import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class HealthService extends JFrame {

	private String[][] Object;
	private JPanel contentPane;
	private JTextField textField;
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
					HealthService frame = new HealthService();
					frame.setVisible(true);
					frame.setTitle("HealthService");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HealthService() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 629);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 1008, 573);

		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(430, 59, 472, 319);
		panel.add(scrollPane);

		JList list = new JList();
		scrollPane.setViewportView(list);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultListModel DLM = new DefaultListModel();
				DLM.addElement("loukas");
				DLM.addElement("loukas");
				DLM.addElement("loukas");
				DLM.addElement("loukas");
				DLM.addElement("loukas");
				DLM.addElement("loukas");

				DLM.addElement("loukas");

				list.setModel(DLM);

			}
		});
		contentPane.setLayout(null);
		btnNewButton.setBounds(54, 494, 115, 29);
		panel.add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(113, 42, 146, 26);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(29, 45, 69, 20);
		panel.add(lblNewLabel);
		contentPane.add(tabbedPane);

		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedPane.addTab("New tab", null, scrollPane_1, null);

		table_3 = new JTable();
		table_3.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "Name", "id", "problima" }));
		scrollPane_1.setViewportView(table_3);
		DefaultTableModel model = (DefaultTableModel) table_3.getModel();
		Object ta[] = new Object[3];
		String tabl[][]={{"loukas","1","den einai kala logo erwta"},{"loukas","1","den einai kala logo erwta"},{"loukas","1","den einai kala logo erwta"}};
		for (int i = 0; i < 3; i++) {
		for (int j=0; j<1; j++){
			ta[0] = tabl[i][j];
			ta[1] =  tabl[i][j+1];
			ta[2] =  tabl[i][j+2];
			model.addRow(ta);
		}
		}

	}
}
