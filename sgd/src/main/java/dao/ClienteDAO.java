package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Model.Cliente;

public class ClienteDAO {
	EntityManagerFactory emf;
	EntityManager em;

	public ClienteDAO() {

		// Obtém o factory a partir da unidade de persistência.
		emf = Persistence.createEntityManagerFactory("sgd_persistence");
		// Cria um entity manager.
		em = emf.createEntityManager();
		// Fecha o factory para liberar os recursos utilizado.
	}

	public Cliente BuscarPorId(Long id) {
		em.getTransaction().begin();
		Cliente cliente = em.find(Cliente.class, id);
		em.getTransaction().commit();
		return cliente;

	}

	public void Salvar(Cliente cliente) {
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
	}

	public void Remover(Cliente cliente) {
		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> listarTodos() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("select cliente from Cliente cliente");
		List<Cliente> clientes = consulta.getResultList();
		em.getTransaction().commit();
		return clientes;
	}

	public void closeSession() {
		if ((em != null) && (!em.isOpen())) {
			em.close();
		}
	}

	@Override
	protected void finalize() throws Throwable {
		closeSession();
		super.finalize();
	}
}
