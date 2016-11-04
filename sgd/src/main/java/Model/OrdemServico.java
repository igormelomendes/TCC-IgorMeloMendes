package Model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "orcamento")
public class OrdemServico {
	@Id
	@Column(name = "id_orcamento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private Date data;

	@Column
	private Boolean orcamento;

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	@PrimaryKeyJoinColumn
	@JoinColumn(name = "cliente_fk")
	private Cliente clientes;

	@OneToMany(cascade = {
			CascadeType.REFRESH }, targetEntity = Servico.class, fetch = FetchType.LAZY, mappedBy = "ordemServicos")
	private List<Servico> servicos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Boolean getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Boolean orcamento) {
		this.orcamento = orcamento;
	}

	public Cliente getClientes() {
		return clientes;
	}

	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

}
