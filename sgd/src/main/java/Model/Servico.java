package Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "servico")
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

	@ManyToOne(optional = true, fetch = FetchType.EAGER, cascade = { CascadeType.REFRESH })
	@PrimaryKeyJoinColumn
	@JoinColumn(name = "servico_fk", nullable = false)
	private Veiculo veiculo;
}
