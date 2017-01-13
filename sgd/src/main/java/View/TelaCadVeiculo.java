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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaCadVeiculo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(145, 126, 89, 26);
		contentPane.add(comboBox_1);

		JLabel lblNomeDoVeculo = new JLabel("Nome:");
		lblNomeDoVeculo.setBounds(108, 161, 37, 15);
		lblNomeDoVeculo.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblNomeDoVeculo);

		JLabel lblRenavan = new JLabel("Renavan:");
		lblRenavan.setBounds(93, 189, 52, 15);
		lblRenavan.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblRenavan);

		textField_1 = new JTextField();
		textField_1.setBounds(145, 183, 184, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblChassi = new JLabel("Chassi:");
		lblChassi.setBounds(102, 217, 43, 15);
		lblChassi.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblChassi);

		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(397, 161, 34, 15);
		lblPlaca.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblPlaca);

		textField = new JTextField();
		textField.setBounds(145, 155, 122, 28);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(431, 155, 122, 28);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(145, 211, 184, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

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
			}
		});
		contentPane.add(btnSalvar);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(145, 100, 408, 26);
		contentPane.add(comboBox);
	}
}
