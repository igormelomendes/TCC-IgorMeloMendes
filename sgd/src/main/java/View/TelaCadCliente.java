package View;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Model.Cliente;
import dao.ClienteDAO;

public class TelaCadCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtCnpj;
	private JLabel lblCidade;
	private JTextField txtCidade;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadCliente frame = new TelaCadCliente();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
		setTitle("Tela Cadastro de Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("CADASTRO DE CLIENTE");
		lblNewLabel.setBounds(157, 35, 233, 25);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(48, 96, 37, 15);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 12));

		txtNome = new JTextField();
		txtNome.setToolTipText("");
		txtNome.setBounds(85, 90, 335, 28);
		txtNome.setColumns(10);

		JCheckBox chckbxFisica = new JCheckBox("Fisica:");
		chckbxFisica.setBounds(56, 123, 67, 18);
		chckbxFisica.setFont(new Font("Arial", Font.PLAIN, 12));

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(148, 125, 27, 15);
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 12));

		txtCpf = new JTextField();
		txtCpf.setBounds(175, 118, 110, 28);
		txtCpf.setColumns(10);

		JCheckBox chckbJuridica = new JCheckBox("Juridica:");
		chckbJuridica.setBounds(297, 123, 83, 18);
		chckbJuridica.setFont(new Font("Arial", Font.PLAIN, 12));

		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setBounds(383, 124, 37, 15);
		lblCnpj.setFont(new Font("Arial", Font.PLAIN, 12));

		txtCnpj = new JTextField();
		txtCnpj.setBounds(420, 118, 122, 28);
		txtCnpj.setColumns(10);

		lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCidade.setBounds(40, 180, 45, 16);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(191, 232, 94, 27);
		btnCancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaPrincipal().show();
				dispose();
			}
		});

		txtCidade = new JTextField();
		txtCidade.setBounds(85, 174, 200, 28);
		txtCidade.setColumns(10);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(85, 232, 83, 27);
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNome.setText("");
				txtCidade.setText("");
				txtNome.requestFocus();
			}
		});

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(310, 232, 80, 27);
		btnSalvar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cliente = new Cliente();
				cliente.setNomeCompleto(txtNome.getText());
				// cliente.setTipoPessoa(txtCpfCliente.getText()); //TODO ver
				// como fazer.
				cliente.setCidade(txtCidade.getText());
				if ((txtNome.getText().isEmpty()) || (txtCidade.getText().isEmpty())) {
					JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
				} else {
					ClienteDAO dao = new ClienteDAO();
					dao.Salvar(cliente);
					dao.closeSession();
				}

				txtNome.setText("");
				txtCidade.setText("");
				txtNome.requestFocus();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNome);
		contentPane.add(txtNome);
		contentPane.add(chckbxFisica);
		contentPane.add(lblCpf);
		contentPane.add(txtCpf);
		contentPane.add(chckbJuridica);
		contentPane.add(lblCnpj);
		contentPane.add(txtCnpj);

		JLabel lblNewLabel_1 = new JLabel("RG:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(64, 152, 27, 16);
		contentPane.add(lblNewLabel_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "ES", "MG", "SP", "RJ" }));
		comboBox.setBounds(398, 175, 67, 26);
		comboBox.setToolTipText("");
		contentPane.add(comboBox);
		contentPane.add(btnLimpar);
		contentPane.add(btnCancelar);
		contentPane.add(btnSalvar);
		contentPane.add(lblCidade);
		contentPane.add(txtCidade);

		textField = new JTextField();
		textField.setBounds(85, 146, 90, 28);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblEstado.setBounds(353, 181, 55, 16);
		contentPane.add(lblEstado);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
