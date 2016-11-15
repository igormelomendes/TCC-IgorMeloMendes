package View;

import java.awt.EventQueue;

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
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnPedidos = new JMenu("SERVIÇOS");
		menuBar.add(mnPedidos);

		JMenuItem mntmNovoPedido = new JMenuItem("Cadastrar Serviço");
		mnPedidos.add(mntmNovoPedido);

		JMenuItem mntmEmAberto = new JMenuItem("Visualizar Serviços");
		mnPedidos.add(mntmEmAberto);

		JMenu mnCliente = new JMenu("CLIENTE");
		menuBar.add(mnCliente);

		JMenuItem mntmNovoCliente = new JMenuItem("Cadastrar Cliente");
		mnCliente.add(mntmNovoCliente);

		JMenuItem mntmBuscarClientes = new JMenuItem("Buscar Cliente");
		mnCliente.add(mntmBuscarClientes);

		JMenu mnVeiculo = new JMenu("VEICULO");
		menuBar.add(mnVeiculo);

		JMenuItem mntmNovoVeiculo = new JMenuItem("Cadastrar Veículo");
		mnVeiculo.add(mntmNovoVeiculo);

		JMenuItem mntmBuscarVeculo = new JMenuItem("Buscar Veículo");
		mnVeiculo.add(mntmBuscarVeculo);

		JMenu mnRelatrio = new JMenu("RELATÓRIO");
		menuBar.add(mnRelatrio);

		JMenuItem mntmRelatrioDeSerivos = new JMenuItem("Relatório de Serivços");
		mnRelatrio.add(mntmRelatrioDeSerivos);

		JMenuItem mntmRelatrioDeCliente = new JMenuItem("Relatório de Cliente");
		mnRelatrio.add(mntmRelatrioDeCliente);

		JMenuItem mntmRelatrioDeVeculo = new JMenuItem("Relatório de Veículo");
		mnRelatrio.add(mntmRelatrioDeVeculo);
	}

}
