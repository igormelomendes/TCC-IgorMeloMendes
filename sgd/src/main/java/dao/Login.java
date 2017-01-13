/*
 * package dao;
 * 
 * import javax.persistence.EntityManager; import
 * javax.persistence.EntityManagerFactory; import javax.persistence.Persistence;
 * import javax.swing.JOptionPane;
 * 
 * public final class Login {
 * 
 * public boolean acesso; static EntityManagerFactory emf; static EntityManager
 * em;
 * 
 * public Login() { // Obtém o factory a partir da unidade de persistência. emf
 * = Persistence.createEntityManagerFactory("sgd_persistence"); // Cria um
 * entity manager. em = emf.createEntityManager(); // Fecha o factory para
 * liberar os recursos utilizado. // }
 * 
 * public void Acesso(String login, String senha) { ResultSet rs;
 * em.getTransaction().begin(); Usuario acess = em.find(Usuario.class, login,
 * senha); em.getTransaction().commit();
 * 
 * if (rs.next()) { JOptionPane.showMessageDialog(null,
 * "Usuario e senha Corretos"); acesso = true; } else {
 * JOptionPane.showMessageDialog(null, "Usuario e senha Incorretos"); acesso =
 * false; }
 * 
 * } }
 */