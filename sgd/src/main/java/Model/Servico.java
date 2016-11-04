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

	@Column(name = "descricao_servico", nullable = false)
	private String descricao;

	@Column
	private double valor;

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	@PrimaryKeyJoinColumn
	@JoinColumn(name = "ordemServico_fk")
	private OrdemServico ordemServicos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public OrdemServico getOrdemServicos() {
		return ordemServicos;
	}

	public void setOrdemServicos(OrdemServico ordemServicos) {
		this.ordemServicos = ordemServicos;
	}

}
