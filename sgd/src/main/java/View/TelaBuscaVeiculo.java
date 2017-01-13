package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class TelaBuscaVeiculo extends JFrame {

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
					TelaBuscaVeiculo frame = new TelaBuscaVeiculo();
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
	public TelaBuscaVeiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblBuscaDeVeculo = new JLabel("BUSCA DE VEÍCULO");
		lblBuscaDeVeculo.setBounds(189, 45, 194, 24);
		lblBuscaDeVeculo.setFont(new Font("Arial", Font.BOLD, 20));

		JLabel lblOpo = new JLabel("OPÇÃO:");
		lblOpo.setBounds(75, 113, 45, 15);
		lblOpo.setFont(new Font("Arial", Font.PLAIN, 12));

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(50, 129, 95, 26);

		textField = new JTextField();
		textField.setBounds(191, 128, 270, 28);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("PARÂMETRO DE PESQUISA:");
		lblNewLabel.setBounds(249, 113, 159, 15);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(468, 128, 95, 28);
		btnPesquisar.setFont(new Font("Arial", Font.PLAIN, 12));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 190, 513, 184);

		table = new JTable();
		table.setModel(
				new DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, },
						new String[] { "C\u00F3digo", "Cliente", "Placa", "Renavan" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(56);
		table.getColumnModel().getColumn(1).setPreferredWidth(157);
		table.getColumnModel().getColumn(2).setPreferredWidth(94);
		scrollPane.setViewportView(table);
		contentPane.setLayout(null);
		contentPane.add(lblBuscaDeVeculo);
		contentPane.add(lblOpo);
		contentPane.add(lblNewLabel);
		contentPane.add(scrollPane);
		contentPane.add(comboBox);
		contentPane.add(textField);
		contentPane.add(btnPesquisar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(269, 404, 90, 28);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaPrincipal().show();
				dispose();
			}
		});
		contentPane.add(btnCancelar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(371, 404, 90, 28);
		contentPane.add(btnExcluir);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(473, 404, 90, 28);
		contentPane.add(btnAlterar);
	}
}
