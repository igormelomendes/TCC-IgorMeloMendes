package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class TelaCadServiço extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadServiço frame = new TelaCadServiço();
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
	public TelaCadServiço() {
		setTitle("Tela Cadastro de Serviço");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 40, 45, 120, 45, 120, 70, 120, 120, 40, 0 };
		gbl_contentPane.rowHeights = new int[] { 40, 30, 28, 28, 28, 107, 28, 27, 65, 30, 27, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblCadastroDeServio = new JLabel("CADASTRO DE SERVIÇO");
		lblCadastroDeServio.setFont(new Font("Arial", Font.BOLD, 20));
		GridBagConstraints gbc_lblCadastroDeServio = new GridBagConstraints();
		gbc_lblCadastroDeServio.anchor = GridBagConstraints.WEST;
		gbc_lblCadastroDeServio.fill = GridBagConstraints.VERTICAL;
		gbc_lblCadastroDeServio.insets = new Insets(0, 0, 5, 5);
		gbc_lblCadastroDeServio.gridwidth = 3;
		gbc_lblCadastroDeServio.gridx = 3;
		gbc_lblCadastroDeServio.gridy = 0;
		contentPane.add(lblCadastroDeServio, gbc_lblCadastroDeServio);
						
								JLabel lblNewLabel = new JLabel("Código:");
								lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
								GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
								gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
								contentPane.add(lblNewLabel, gbc_lblNewLabel);
				
						textField = new JTextField();
		textField.setText("321");
		textField.setEnabled(false);
						textField.setColumns(10);
						GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.anchor = GridBagConstraints.NORTH;
						gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 2;
						contentPane.add(textField, gbc_textField);
				
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblData = new GridBagConstraints();
		gbc_lblData.anchor = GridBagConstraints.EAST;
		gbc_lblData.insets = new Insets(0, 0, 5, 5);
		gbc_lblData.gridx = 3;
		gbc_lblData.gridy = 2;
		contentPane.add(lblData, gbc_lblData);
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
				gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 4;
		gbc_textField_1.gridy = 2;
				contentPane.add(textField_1, gbc_textField_1);
				
				JCheckBox chckbxNewCheckBox = new JCheckBox("Orçamento");
				chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 12));
				GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridwidth = 2;
		gbc_chckbxNewCheckBox.gridx = 6;
		gbc_chckbxNewCheckBox.gridy = 2;
				contentPane.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
						
								JLabel lblNewLabel_1 = new JLabel("Cliente:");
								lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
								GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
								gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
								contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
				
						textField_2 = new JTextField();
						textField_2.setColumns(10);
						GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.anchor = GridBagConstraints.NORTH;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
						gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridwidth = 5;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
						contentPane.add(textField_2, gbc_textField_2);

		JLabel lblTipoDeVeculo = new JLabel("Veículo:");
		lblTipoDeVeculo.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblTipoDeVeculo = new GridBagConstraints();
		gbc_lblTipoDeVeculo.anchor = GridBagConstraints.EAST;
		gbc_lblTipoDeVeculo.fill = GridBagConstraints.VERTICAL;
		gbc_lblTipoDeVeculo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoDeVeculo.gridx = 1;
		gbc_lblTipoDeVeculo.gridy = 4;
		contentPane.add(lblTipoDeVeculo, gbc_lblTipoDeVeculo);

		JScrollPane scrollPane = new JScrollPane();
				
		table = new JTable();
		table.setModel(
				new DefaultTableModel(
						new Object[][] { { null, null, null }, { null, null, null }, { null, null, null },
								{ null, null, null }, { null, null, null }, },
						new String[] { "Nome Ve\u00EDculo", "Placa", "Renavan" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(165);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
				
						JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Moto" }));
		comboBox.setToolTipText("");
						GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
						gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 4;
						contentPane.add(comboBox, gbc_comboBox);
		scrollPane.setViewportView(table);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridwidth = 7;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		contentPane.add(scrollPane, gbc_scrollPane);

		JLabel lblNewLabel_2 = new JLabel("Lista de Serviços:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 6;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
						
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.gridheight = 3;
		gbc_scrollPane_1.gridwidth = 3;
		gbc_scrollPane_1.gridx = 5;
		gbc_scrollPane_1.gridy = 6;
		contentPane.add(scrollPane_1, gbc_scrollPane_1);
								
		table_1 = new JTable();
		table_1.setToolTipText("");
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(
				new DefaultTableModel(new Object[][] { { null, null }, { null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null }, }, new String[] { "Servi\u00E7o", "Valor" }));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(160);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(79);
						
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "2ª Via de CRLV" }));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.anchor = GridBagConstraints.SOUTH;
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.gridwidth = 3;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 7;
		contentPane.add(comboBox_1, gbc_comboBox_1);
				
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_btnAdicionar = new GridBagConstraints();
		gbc_btnAdicionar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAdicionar.anchor = GridBagConstraints.NORTH;
		gbc_btnAdicionar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdicionar.gridx = 4;
		gbc_btnAdicionar.gridy = 7;
		contentPane.add(btnAdicionar, gbc_btnAdicionar);
				
		JButton btnRemover = new JButton("Remover");
		btnRemover.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_btnRemover = new GridBagConstraints();
		gbc_btnRemover.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRemover.anchor = GridBagConstraints.NORTH;
		gbc_btnRemover.insets = new Insets(0, 0, 5, 5);
		gbc_btnRemover.gridx = 4;
		gbc_btnRemover.gridy = 8;
		contentPane.add(btnRemover, gbc_btnRemover);
		
		JButton btnImprimirOramento = new JButton("Imprimir");
				btnImprimirOramento.setFont(new Font("Arial", Font.PLAIN, 12));
				GridBagConstraints gbc_btnImprimirOramento = new GridBagConstraints();
		gbc_btnImprimirOramento.anchor = GridBagConstraints.NORTH;
		gbc_btnImprimirOramento.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnImprimirOramento.insets = new Insets(0, 0, 0, 5);
		gbc_btnImprimirOramento.gridx = 2;
		gbc_btnImprimirOramento.gridy = 10;
				contentPane.add(btnImprimirOramento, gbc_btnImprimirOramento);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaPrincipal().show();
				dispose();
			}
		});
		btnCancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.anchor = GridBagConstraints.NORTH;
		gbc_btnCancelar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 6;
		gbc_btnCancelar.gridy = 10;
		contentPane.add(btnCancelar, gbc_btnCancelar);
		
				JButton btnSalvar = new JButton("Salvar");
				btnSalvar.setFont(new Font("Arial", Font.PLAIN, 12));
				GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalvar.anchor = GridBagConstraints.NORTH;
		gbc_btnSalvar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSalvar.gridx = 7;
		gbc_btnSalvar.gridy = 10;
				contentPane.add(btnSalvar, gbc_btnSalvar);
	}
}
