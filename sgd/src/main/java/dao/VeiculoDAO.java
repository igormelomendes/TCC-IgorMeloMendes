package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Model.Veiculo;

public class VeiculoDAO {
	EntityManagerFactory emf;
	EntityManager em;

	public VeiculoDAO() {

		// Obtém o factory a partir da unidade de persistência.
		emf = Persistence.createEntityManagerFactory("sgd_persistence");
		// Cria um entity manager.
		em = emf.createEntityManager();
		// Fecha o factory para liberar os recursos utilizado.
	}

	public Veiculo BuscarPorId(Long id) {
		em.getTransaction().begin();
		Veiculo veiculo = em.find(Veiculo.class, id);
		em.getTransaction().commit();
		return veiculo;

	}

	public void Salvar(Veiculo veiculo) {
		em.getTransaction().begin();
		em.merge(veiculo);
		em.getTransaction().commit();
	}

	public void Remover(Veiculo veiculo) {
		em.getTransaction().begin();
		em.remove(veiculo);
		em.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public List<Veiculo> listarTodos() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("select cliente from Cliente cliente");
		List<Veiculo> veiculo = consulta.getResultList();
		em.getTransaction().commit();
		return veiculo;
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
