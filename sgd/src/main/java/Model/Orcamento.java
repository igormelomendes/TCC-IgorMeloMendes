package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// TODO Repensar sobre isso.
@Entity
public class Orcamento extends Servico {
	@Id
	@Column(name = "id_orcamento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome_cliente")
	private String nome;
}
