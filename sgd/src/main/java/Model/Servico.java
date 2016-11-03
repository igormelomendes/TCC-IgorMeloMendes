package Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

//@Entity
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

	@ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = { CascadeType.REFRESH })
	@PrimaryKeyJoinColumn
	@JoinColumn(name = "servico_fk", nullable = false)
	private Veiculo veiculo;

	@OneToOne(fetch = FetchType.EAGER, cascade = { CascadeType.REFRESH })
	@JoinColumn(name = "servico_fk")
	private Orcamento orcamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPrimeiroEmplacamento() {
		return primeiroEmplacamento;
	}

	public void setPrimeiroEmplacamento(int primeiroEmplacamento) {
		this.primeiroEmplacamento = primeiroEmplacamento;
	}

	public int getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(int transferencia) {
		this.transferencia = transferencia;
	}

	public int getLicenciamento() {
		return licenciamento;
	}

	public void setLicenciamento(int licenciamento) {
		this.licenciamento = licenciamento;
	}

	public int getPedidoDePlaca() {
		return pedidoDePlaca;
	}

	public void setPedidoDePlaca(int pedidoDePlaca) {
		this.pedidoDePlaca = pedidoDePlaca;
	}

	public int getAlteracaoDeCaracteristica() {
		return alteracaoDeCaracteristica;
	}

	public void setAlteracaoDeCaracteristica(int alteracaoDeCaracteristica) {
		this.alteracaoDeCaracteristica = alteracaoDeCaracteristica;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}
}
