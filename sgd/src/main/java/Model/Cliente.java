package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Column
	@Id
	@GeneratedValue
	public long idCliente;
	@Column
	public String Nome;
	@Column
	public int CPF;
	@Column
	String Identidade;

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public String getIdentidade() {
		return Identidade;
	}

	public void setIdentidade(String identidade) {
		Identidade = identidade;
	}
}
