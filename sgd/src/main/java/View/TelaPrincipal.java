package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaPrincipal extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 491);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnPedidos = new JMenu("SERVIÇOS");
		menuBar.add(mnPedidos);

		JMenuItem mntmNovoPedido = new JMenuItem("Cadastrar Serviço");
		mntmNovoPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadServiço ts = new TelaCadServiço();
				ts.show();
				ts.setExtendedState(new TelaCadServiço().MAXIMIZED_HORIZ);
				dispose();
			}
		});
		mnPedidos.add(mntmNovoPedido);

		JMenuItem mntmEmAberto = new JMenuItem("Visualizar Serviços");
		mntmEmAberto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVisualizarServiço tvs = new TelaVisualizarServiço();
				tvs.show();
				tvs.setExtendedState(new TelaVisualizarServiço().MAXIMIZED_HORIZ);
				dispose();
			}
		});
		mnPedidos.add(mntmEmAberto);

		JMenu mnCliente = new JMenu("CLIENTE");
		menuBar.add(mnCliente);

		JMenuItem mntmCadCliente = new JMenuItem("Cadastrar Cliente");
		mntmCadCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadCliente tc = new TelaCadCliente();
				tc.show();
				tc.setExtendedState(new TelaCadCliente().MAXIMIZED_HORIZ);
				dispose();
			}
		});
		mnCliente.add(mntmCadCliente);

		JMenuItem mntmBuscarClientes = new JMenuItem("Buscar Cliente");
		mntmBuscarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaBuscaCliente tb = new TelaBuscaCliente();
				tb.show();
				tb.setExtendedState(new TelaBuscaCliente().MAXIMIZED_HORIZ);
				dispose();
			}
		});
		mnCliente.add(mntmBuscarClientes);

		JMenu mnVeiculo = new JMenu("VEICULO");
		menuBar.add(mnVeiculo);

		JMenuItem mntmNovoVeiculo = new JMenuItem("Cadastrar Veículo");
		mntmNovoVeiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadVeiculo tv = new TelaCadVeiculo();
				tv.show();
				tv.setExtendedState(new TelaCadVeiculo().MAXIMIZED_HORIZ);
				dispose();
			}
		});
		mnVeiculo.add(mntmNovoVeiculo);

		JMenuItem mntmBuscarVeculo = new JMenuItem("Buscar Veículo");
		mntmBuscarVeculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaBuscaVeiculo tbv = new TelaBuscaVeiculo();
				tbv.show();
				tbv.setExtendedState(new TelaBuscaVeiculo().MAXIMIZED_HORIZ);
				dispose();
			}
		});
		mnVeiculo.add(mntmBuscarVeculo);

		JMenu mnRelatrio = new JMenu("RELATÓRIO");
		menuBar.add(mnRelatrio);

		JMenuItem mntmRelatrioDeSerivos = new JMenuItem("Relatório de Serivços");
		mntmRelatrioDeSerivos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaRelatorio tr = new TelaRelatorio();
				tr.show();
				tr.setExtendedState(new TelaRelatorio().MAXIMIZED_HORIZ);
				dispose();
			}
		});
		mnRelatrio.add(mntmRelatrioDeSerivos);
		getContentPane().setLayout(null);

		JButton btnCadastroDeServio = new JButton("Cadastro de Serviço");
		btnCadastroDeServio.setBounds(112, 220, 168, 52);
		getContentPane().add(btnCadastroDeServio);

		JButton btnCadastroDeCliente = new JButton("Cadastro de Cliente");
		btnCadastroDeCliente.setBounds(112, 129, 168, 52);
		getContentPane().add(btnCadastroDeCliente);

		JButton btnVisualizarServio = new JButton("Visualizar Serviço");
		btnVisualizarServio.setBounds(377, 129, 168, 52);
		getContentPane().add(btnVisualizarServio);

		JButton btnReltorio = new JButton("Relátorio");
		btnReltorio.setBounds(382, 220, 163, 52);
		getContentPane().add(btnReltorio);
	}
}
