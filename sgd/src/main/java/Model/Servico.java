package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servico {
	@Id
	@Column(name = "id_servico")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "primeiro_emplacamento")
	private int primeiroEmplacamento;

	@Column
	private int transferencia;

	@Column
	private int licenciamento;

	@Column(name = "pedido_de_placa")
	private int pedidoDePlaca;

	@Column(name = "alteracao_de_caracteristica")
	private int alteracaoDeCaracteristica;
}
