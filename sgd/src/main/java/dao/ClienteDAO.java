package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Model.Cliente;

public class ClienteDAO {
	EntityManagerFactory factory;
	EntityManager entityManager;

	public ClienteDAO() {

		// Obtém o factory a partir da unidade de persistência.
		factory = Persistence.createEntityManagerFactory("sgd_persistence");
		// Cria um entity manager.
		entityManager = factory.createEntityManager();
		// Fecha o factory para liberar os recursos utilizado.
	}
	// public void Salvar(Cliente cliente) {
	// entityManager.getTransaction().begin();
	// entityManager.remove(cliente);
	// entityManager.getTransaction().commit();
	// entityManager.close();
	// }
	//
	// public void Remover(Cliente cliente) {
	// entityManager.getTransaction().begin();
	// entityManager.remove(cliente);
	// entityManager.getTransaction().commit();
	// entityManager.close();
	// }
	//
	// @SuppressWarnings("unchecked")
	// public List<Cliente> listarTodos() {
	// entityManager.getTransaction().begin();
	// Query consulta = entityManager.createQuery("select cliente from Cliente
	// cliente");
	// List<Cliente> cliente = consulta.getResultList();
	// entityManager.getTransaction().commit();
	// factory.close();
	// return cliente;
	// }

	public Cliente salvar(Cliente cliente) {
		try {
			// Inicia uma transação com o banco de dados.
			entityManager.getTransaction().begin();
			System.out.println("Cliente Salvo.");
			// Verifica se a pessoa ainda não está salva no banco de dados.
			if (cliente.getId() == null) {
				// Salva os dados da pessoa.
				entityManager.persist(cliente);
			} else {
				// Atualiza os dados da pessoa.
				cliente = entityManager.merge(cliente);
			}
			// Finaliza a transação.
			entityManager.getTransaction().commit();
		} finally {
			entityManager.close();
		}
		return cliente;
	}

	public void excluir(Long id) {
		try {
			// Inicia uma transação com o banco de dados.
			entityManager.getTransaction().begin();
			// Consulta a pessoa na base de dados através do seu ID.
			Cliente cliente = entityManager.find(Cliente.class, 1);
			System.out.println("Excluindo os dados de: " + cliente.getNomeCompleto());
			// Remove a pessoa da base de dados.
			entityManager.remove(cliente);
			// Finaliza a transação.
			entityManager.getTransaction().commit();
		} finally {
			entityManager.close();
		}
	}

	public Cliente consultarPorId(Long id) {
		Cliente cliente = null;
		try {
			// Consulta uma pessoa pelo seu ID.
			cliente = entityManager.find(Cliente.class, id);
		} finally {
			entityManager.close();
		}
		return cliente;
	}

}
