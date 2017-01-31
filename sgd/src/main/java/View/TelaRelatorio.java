package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class TelaRelatorio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelatorio frame = new TelaRelatorio();
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
	public TelaRelatorio() {
		setTitle("Tela de Relatório");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblOpo = new JLabel("OPÇÃO:");
		lblOpo.setBounds(77, 113, 45, 15);
		lblOpo.setFont(new Font("Arial", Font.PLAIN, 12));

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "DD / MM / AA", "MM / AA", "AA" }));
		comboBox.setBounds(33, 129, 147, 26);

		JLabel lblNewLabel = new JLabel("DATA:");
		lblNewLabel.setBounds(295, 113, 33, 15);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(58, 184, 456, 151);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null }, },
				new String[] { "Clientes", "Placa", "Ve\u00EDculo" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(236);
		table.getColumnModel().getColumn(1).setPreferredWidth(86);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		contentPane.setLayout(null);

		JLabel lblReltorio = new JLabel("RELATÓRIO");
		lblReltorio.setBounds(228, 45, 116, 25);
		lblReltorio.setFont(new Font("Arial", Font.BOLD, 20));
		contentPane.add(lblReltorio);
		contentPane.add(lblOpo);
		contentPane.add(lblNewLabel);
		contentPane.add(comboBox);

		textField = new JTextField();
		textField.setBounds(251, 128, 122, 28);
		textField.setColumns(10);
		contentPane.add(textField);
		contentPane.add(scrollPane);

		JButton btnCancelar = new JButton("Sair");
		btnCancelar.setBounds(216, 368, 90, 27);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaPrincipal().show();
				dispose();
			}
		});
		btnCancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnCancelar);

		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(318, 368, 90, 27);
		btnConsultar.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnConsultar);

		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(420, 368, 74, 27);
		btnImprimir.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnImprimir);
	}
}
