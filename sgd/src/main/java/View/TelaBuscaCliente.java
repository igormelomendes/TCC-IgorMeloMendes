package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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

import Model.Cliente;
import dao.ClienteDAO;

public class TelaBuscaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField buscaCliente;
	private JTable table;
	DefaultTableModel modelo = new DefaultTableModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBuscaCliente frame = new TelaBuscaCliente();
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
	public TelaBuscaCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblBuscarCliente = new JLabel("BUSCAR CLIENTE");
		lblBuscarCliente.setBounds(218, 45, 172, 25);
		lblBuscarCliente.setFont(new Font("Arial", Font.BOLD, 20));

		JLabel lblOpo = new JLabel("OPÇÃO:");
		lblOpo.setBounds(75, 113, 45, 15);
		lblOpo.setFont(new Font("Arial", Font.PLAIN, 12));

		JLabel lblNewLabel = new JLabel("PARÂMETRO DE PESQUISA:");
		lblNewLabel.setBounds(243, 113, 159, 15);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));

		buscaCliente = new JTextField();
		buscaCliente.setBounds(175, 128, 300, 28);
		buscaCliente.setColumns(10);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					carregarTabela();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}

			}
		});
		btnPesquisar.setBounds(494, 128, 105, 27);
		btnPesquisar.setFont(new Font("Arial", Font.PLAIN, 12));

		JComboBox opcaoCliente = new JComboBox();
		opcaoCliente.setModel(new DefaultComboBoxModel(new String[] { "Código", "Nome" }));
		opcaoCliente.setBounds(45, 128, 105, 28);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 184, 554, 178);
		
		table = new JTable(modelo);
		table.setModel(new DefaultTableModel(
			new Object[][] {
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null },
			},
			new String[] {
				"C\u00F3digo", "Nome", "RG"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(82);
		table.getColumnModel().getColumn(1).setPreferredWidth(282);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);

		scrollPane.setViewportView(table);
		contentPane.setLayout(null);
		contentPane.add(lblBuscarCliente);
		contentPane.add(lblOpo);
		contentPane.add(lblNewLabel);
		contentPane.add(opcaoCliente);
		contentPane.add(buscaCliente);
		contentPane.add(btnPesquisar);
		contentPane.add(scrollPane);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(457, 399, 90, 27);
		btnAlterar.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnAlterar);

		JButton btnNewButton = new JButton("Excluir");
		btnNewButton.setBounds(355, 399, 90, 27);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnNewButton);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaPrincipal().show();
				dispose();
			}
		});
		btnCancelar.setBounds(253, 399, 90, 27);
		btnCancelar.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnCancelar);
	}

	private void carregarTabela() {
		// Cliente cliente = new Cliente();
		ClienteDAO dao = new ClienteDAO();
		List<Cliente> list = dao.listarTodos();
		
		for (Cliente cliente2 : list) {
			modelo.addRow(new Object[] { cliente2.getId(), cliente2.getNomeCompleto(), cliente2.getRg() });
		}
		//dao.closeSession();
		
		// TODO Auto-generated method stub

	}
}

