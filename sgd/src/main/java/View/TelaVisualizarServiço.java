package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class TelaVisualizarServiço extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTextField textField;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVisualizarServiço frame = new TelaVisualizarServiço();
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
	public TelaVisualizarServiço() {
		setFont(new Font("Arial", Font.PLAIN, 12));
		setForeground(Color.BLACK);
		setTitle("Visualizar Serviços");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 705);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(246, 64, 687, 433);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setFont(new Font("Arial", Font.BOLD, 12));
		tabbedPane.setToolTipText("");

		JPanel panel = new JPanel();
		panel.setToolTipText("");
		tabbedPane.addTab("Serviço", null, panel, null);

		JLabel lblDescrioDoServio = new JLabel("Dados do Veículo:");
		lblDescrioDoServio.setBounds(5, 15, 101, 20);
		lblDescrioDoServio.setFont(new Font("Arial", Font.BOLD, 12));

		JLabel lblVeculo = new JLabel("Veículo:");
		lblVeculo.setBounds(34, 46, 43, 15);
		lblVeculo.setFont(new Font("Arial", Font.PLAIN, 12));

		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(43, 99, 34, 15);
		lblPlaca.setFont(new Font("Arial", Font.PLAIN, 12));

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(340, 46, 27, 15);
		lblTipo.setFont(new Font("Arial", Font.PLAIN, 12));

		JLabel lblRenavan = new JLabel("Renavan:");
		lblRenavan.setBounds(315, 99, 52, 15);
		lblRenavan.setFont(new Font("Arial", Font.PLAIN, 12));

		textField_1 = new JTextField();
		textField_1.setBounds(77, 40, 122, 28);
		textField_1.setEnabled(false);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(77, 93, 122, 28);
		textField_2.setEnabled(false);
		textField_2.setColumns(10);

		JLabel lblDescrioDoServio_1 = new JLabel("Descrição do Serviço:");
		lblDescrioDoServio_1.setBounds(5, 146, 124, 20);
		lblDescrioDoServio_1.setFont(new Font("Arial", Font.BOLD, 12));

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(34, 171, 455, 119);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, },
				new String[] { "Servi\u00E7o", "Data", "Valor" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(213);
		contentPane.setLayout(null);

		JLabel lblVisualizarServio = new JLabel("VISUALIZAR SERVIÇO");
		lblVisualizarServio.setBounds(246, 5, 207, 24);
		lblVisualizarServio.setFont(new Font("Arial", Font.BOLD, 20));
		lblVisualizarServio.setForeground(Color.BLACK);
		lblVisualizarServio.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblVisualizarServio);

		JLabel lblCliente = new JLabel("CLIENTES");
		lblCliente.setBounds(99, 64, 75, 18);
		lblCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCliente.setFont(new Font("Arial", Font.BOLD, 15));
		lblCliente.setForeground(Color.BLACK);
		contentPane.add(lblCliente);
		scrollPane_1.setViewportView(table);

		JLabel lblObservao = new JLabel("Observação:");
		lblObservao.setBounds(5, 300, 72, 20);
		lblObservao.setFont(new Font("Arial", Font.BOLD, 12));
		panel.setLayout(null);
		panel.add(lblDescrioDoServio);
		panel.add(lblVeculo);
		panel.add(textField_1);
		panel.add(lblTipo);

		textField_3 = new JTextField();
		textField_3.setBounds(367, 40, 122, 28);
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		panel.add(textField_3);
		panel.add(textField_2);
		panel.add(lblPlaca);
		panel.add(lblRenavan);

		textField_4 = new JTextField();
		textField_4.setBounds(367, 93, 122, 28);
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		panel.add(textField_4);
		panel.add(lblDescrioDoServio_1);
		panel.add(scrollPane_1);
		panel.add(lblObservao);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(34, 325, 455, 79);
		panel.add(scrollPane_2);

		JTextPane textPane_1 = new JTextPane();
		scrollPane_2.setViewportView(textPane_1);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Dados Cliente", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(18, 21, 37, 15);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_1.add(lblNewLabel);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(4, 74, 51, 15);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_1.add(lblTelefone);

		textField_5 = new JTextField();
		textField_5.setBounds(55, 68, 104, 28);
		textField_5.setEnabled(false);
		panel_1.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(326, 68, 100, 28);
		textField_6.setEnabled(false);
		panel_1.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Cidade:");
		lblNewLabel_1.setBounds(12, 127, 43, 15);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_1.add(lblNewLabel_1);

		textField_8 = new JTextField();
		textField_8.setBounds(55, 121, 104, 28);
		textField_8.setEnabled(false);
		panel_1.add(textField_8);
		textField_8.setColumns(10);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(284, 127, 42, 15);
		lblEstado.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_1.add(lblEstado);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(299, 74, 27, 15);
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_1.add(lblCpf);

		textField = new JTextField();
		textField.setBounds(55, 15, 271, 28);
		textField.setEnabled(false);
		panel_1.add(textField);
		textField.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(326, 121, 100, 28);
		textField_9.setEnabled(false);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		contentPane.add(tabbedPane);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 87, 209, 410);

		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		contentPane.add(scrollPane);

		JButton btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnFechar.setBounds(301, 531, 115, 28);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaPrincipal().show();
				dispose();
			}
		});
		contentPane.add(btnFechar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(428, 532, 115, 27);
		btnExcluir.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnExcluir);

		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(555, 532, 115, 27);
		btnEditar.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnEditar);

		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(682, 532, 115, 27);
		btnFinalizar.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnFinalizar);
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
