package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo {
	@Column
	@Id
	@GeneratedValue
	public long idVeiculo;
	@Column
	public String NomeVeiculo;
	@Column
	public int Placa;

	public long getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getNomeVeiculo() {
		return NomeVeiculo;
	}

	public void setNomeVeiculo(String nomeVeiculo) {
		NomeVeiculo = nomeVeiculo;
	}

	public int getPlaca() {
		return Placa;
	}

	public void setPlaca(int placa) {
		Placa = placa;
	}

	public int getRenavan() {
		return Renavan;
	}

	public void setRenavan(int renavan) {
		Renavan = renavan;
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}

	public int getChassi() {
		return Chassi;
	}

	public void setChassi(int chassi) {
		Chassi = chassi;
	}

	@Column
	int Renavan;
	@Column
	int Ano;
	@Column
	int Chassi;

}
