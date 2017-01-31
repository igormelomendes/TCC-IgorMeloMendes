package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class TelaRelatorioServ extends JFrame {

	private JPanel contentPane;
	private JTextField txtIgorMeloMendes;
	private JTextField textField_1;
	private JTextField txtMg;
	private JTextField txtAlegre;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelatorioServ frame = new TelaRelatorioServ();
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
	public TelaRelatorioServ() {
		setTitle("Tela Consulta de Relatório");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 693);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblConsultaDeServio = new JLabel("CONSULTA DE SERVIÇO");
		lblConsultaDeServio.setBounds(140, 40, 236, 24);
		lblConsultaDeServio.setFont(new Font("Arial", Font.BOLD, 20));

		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(344, 157, 21, 15);
		lblRg.setFont(new Font("Arial", Font.PLAIN, 12));

		txtMg = new JTextField();
		txtMg.setText("12345678 MG");
		txtMg.setBounds(365, 151, 122, 28);
		txtMg.setEnabled(false);
		txtMg.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(95, 291, 456, 94);

		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		contentPane.setLayout(null);
		contentPane.add(lblConsultaDeServio);

		JLabel lblDadosDoCliente = new JLabel("DADOS DO CLIENTE:");
		lblDadosDoCliente.setBounds(45, 101, 185, 15);
		lblDadosDoCliente.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblDadosDoCliente);

		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(98, 123, 42, 28);
		lblCliente.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblCliente);

		txtIgorMeloMendes = new JTextField();
		txtIgorMeloMendes.setText("Igor Melo Mendes");
		txtIgorMeloMendes.setBounds(140, 123, 270, 28);
		txtIgorMeloMendes.setEnabled(false);
		txtIgorMeloMendes.setColumns(10);
		contentPane.add(txtIgorMeloMendes);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(113, 151, 27, 28);
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblCpf);

		textField_1 = new JTextField();
		textField_1.setText("12345678911");
		textField_1.setBounds(140, 151, 122, 28);
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		contentPane.add(txtMg);
		contentPane.add(lblRg);

		JLabel lblEndereo = new JLabel("Cidade");
		lblEndereo.setBounds(98, 185, 42, 15);
		lblEndereo.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblEndereo);

		txtAlegre = new JTextField();
		txtAlegre.setText("Alegre");
		txtAlegre.setBounds(140, 179, 225, 28);
		txtAlegre.setEnabled(false);
		txtAlegre.setColumns(10);
		contentPane.add(txtAlegre);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(89, 213, 51, 15);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblTelefone);

		textField_4 = new JTextField();
		textField_4.setText("99 999999999");
		textField_4.setToolTipText("");
		textField_4.setBounds(140, 207, 180, 28);
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		contentPane.add(textField_4);

		JLabel lblVeculos = new JLabel("VEÍCULOS:");
		lblVeculos.setBounds(45, 269, 61, 15);
		lblVeculos.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblVeculos);
		contentPane.add(scrollPane);

		JLabel lblDescrioDoServio = new JLabel("DESCRIÇÃO DO SERIÇO:");
		lblDescrioDoServio.setBounds(45, 419, 136, 15);
		lblDescrioDoServio.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblDescrioDoServio);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(95, 441, 456, 126);
		contentPane.add(scrollPane_1);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, },
				new String[] { "Servi\u00E7o", "Data", "Pre\u00E7o" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(195);
		scrollPane_1.setViewportView(table);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaPrincipal().show();
				dispose();
			}
		});
		btnSair.setBounds(360, 597, 50, 27);
		btnSair.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnSair);

		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(443, 597, 74, 27);
		btnImprimir.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnImprimir);
	}
}
