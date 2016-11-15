package View;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaCadCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblCidade;
	private JTextField textField_4;
	private JLabel lblEstado;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadCliente frame = new TelaCadCliente();
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
	public TelaCadCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CADASTRO DE CLIENTE");
		lblNewLabel.setBounds(196, 11, 152, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(32, 66, 37, 14);
		contentPane.add(lblNome);

		JLabel lblNewLabel_1 = new JLabel("RG:");
		lblNewLabel_1.setBounds(44, 122, 25, 14);
		contentPane.add(lblNewLabel_1);

		JCheckBox chckbxFisica = new JCheckBox("Fisica:");
		chckbxFisica.setBounds(71, 87, 70, 23);
		contentPane.add(chckbxFisica);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Juridica:");
		chckbxNewCheckBox.setBounds(275, 86, 80, 23);
		contentPane.add(chckbxNewCheckBox);

		textField = new JTextField();
		textField.setBounds(70, 63, 229, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(142, 88, 113, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(361, 88, 113, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setBounds(71, 119, 123, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(32, 160, 46, 14);
		contentPane.add(lblCidade);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(81, 157, 123, 20);
		contentPane.add(textField_4);

		lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(253, 160, 46, 14);
		contentPane.add(lblEstado);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(298, 157, 46, 20);
		contentPane.add(textField_5);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(44, 258, 89, 23);
		contentPane.add(btnSalvar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(287, 258, 89, 23);
		contentPane.add(btnCancelar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(166, 258, 89, 23);
		contentPane.add(btnLimpar);
	}
}
