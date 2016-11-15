package dao;

import Model.Cliente;

public class testdao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		// cliente.setNomeCompleto("Luan viado test2");
		// cliente.setTipoPessoa(TipoPessoa.FISICA);
		// cliente.setCpfCnpj("1535432134");

		ClienteDAO dao = new ClienteDAO();
		// System.out.println("Salvando a pessoa: " +
		// cliente.getNomeCompleto());
		// cliente = dao.salvar(cliente);

		cliente.setNomeCompleto("Luan Guimarães Sakurai");
		cliente = dao.salvar(cliente);
		System.out.println("Alterando a pessoa: " + cliente.getNomeCompleto());

		// Cliente cliente2 = dao.consultarPorId(cliente.getId());
		// System.out.println("Consultando: " + cliente2.getNomeCompleto());

		// System.out.println("Removendo a pessoa: " + cliente.getId());
		// dao.excluir(cliente.getId());
	}
}
