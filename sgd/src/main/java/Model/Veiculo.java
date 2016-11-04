package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "veiculo")
public class Veiculo {
	@Id
	@Column(name = "id_veiculo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome_veiculo")
	private String nome;

	@Column
	private String placa;

	@Column
	private int renavan;

	@Column(name = "ano_veiculo")
	private int ano;

	@Column
	private int chassi;

	// Relacionamentos

	@ManyToOne
	@JoinColumn(name = "veiculo_fk")
	private Cliente clientes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getRenavan() {
		return renavan;
	}

	public void setRenavan(int renavan) {
		this.renavan = renavan;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getChassi() {
		return chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}

	public Cliente getClientes() {
		return clientes;
	}

	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}
}
