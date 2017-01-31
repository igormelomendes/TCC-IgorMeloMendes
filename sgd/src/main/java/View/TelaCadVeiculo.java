package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Model.Veiculo;
import dao.VeiculoDAO;

public class TelaCadVeiculo extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeVeiculo;
	private JTextField txtRenavam;
	private JTextField txtChassi;
	private JTextField txtPlaca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadVeiculo frame = new TelaCadVeiculo();
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
	public TelaCadVeiculo() {
		setTitle("Tela Cadastro de Veículo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CADASTRO DE VEÍCULO");
		lblNewLabel.setBounds(145, 45, 236, 25);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		contentPane.add(lblNewLabel);

		JLabel lblProprietario = new JLabel("Proprietário:");
		lblProprietario.setBounds(78, 105, 67, 15);
		lblProprietario.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblProprietario);

		JLabel lblTipoDoVeculo = new JLabel("Veículo:");
		lblTipoDoVeculo.setBounds(102, 131, 43, 15);
		lblTipoDoVeculo.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblTipoDoVeculo);

		final JComboBox cbTipoVeiculo = new JComboBox();
		cbTipoVeiculo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
			}
		});
		cbTipoVeiculo.setModel(new DefaultComboBoxModel(new String[] { "Moto", "Carro", "Caminhão" }));
		cbTipoVeiculo.setBounds(145, 126, 89, 26);
		contentPane.add(cbTipoVeiculo);

		JLabel lblNomeDoVeculo = new JLabel("Nome:");
		lblNomeDoVeculo.setBounds(108, 161, 37, 15);
		lblNomeDoVeculo.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblNomeDoVeculo);

		JLabel lblRenavan = new JLabel("Renavam:");
		lblRenavan.setBounds(89, 189, 56, 15);
		lblRenavan.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblRenavan);

		txtRenavam = new JTextField();
		txtRenavam.setBounds(145, 183, 184, 28);
		contentPane.add(txtRenavam);
		txtRenavam.setColumns(10);

		JLabel lblChassi = new JLabel("Chassi:");
		lblChassi.setBounds(102, 217, 43, 15);
		lblChassi.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblChassi);

		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(397, 161, 34, 15);
		lblPlaca.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblPlaca);

		txtNomeVeiculo = new JTextField();
		txtNomeVeiculo.setBounds(145, 155, 122, 28);
		contentPane.add(txtNomeVeiculo);
		txtNomeVeiculo.setColumns(10);

		txtPlaca = new JTextField();
		txtPlaca.setBounds(431, 155, 122, 28);
		contentPane.add(txtPlaca);
		txtPlaca.setColumns(10);

		txtChassi = new JTextField();
		txtChassi.setBounds(145, 211, 184, 28);
		contentPane.add(txtChassi);
		txtChassi.setColumns(10);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(361, 269, 90, 27);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaPrincipal().show();
				dispose();
			}
		});
		btnCancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnCancelar);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(463, 269, 90, 27);
		btnSalvar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Veiculo veiculo = new Veiculo();
				// veiculo.equals(cbTipoVeiculo.getSelectedItem());
				veiculo.setNome(txtNomeVeiculo.getText());
				veiculo.setPlaca(txtPlaca.getText());
				// veiculo.setRenavam(txtRenavam.getText());
				veiculo.setChassi(txtChassi.getText());

				if ((txtNomeVeiculo.getText().isEmpty()) || (txtPlaca.getText().isEmpty())
						|| (txtRenavam.getText().isEmpty()) || (txtChassi.getText().isEmpty())) {
					JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
				} else {
					VeiculoDAO dao = new VeiculoDAO();
					dao.Salvar(veiculo);
					dao.closeSession();
				}

				txtNomeVeiculo.setText("");
				txtPlaca.setText("");
				txtRenavam.setText("");
				txtChassi.setText("");
				txtNomeVeiculo.requestFocus();
			}
		});
		contentPane.add(btnSalvar);

		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Igor Melo Mendes" }));
		comboBox.setBounds(145, 100, 408, 26);
		contentPane.add(comboBox);
	}
}
