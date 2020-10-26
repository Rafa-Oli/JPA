package modelo.testeCarro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carro {

	private String nome, placa;
	private String tipoCarro;
	private int ano, dias;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private double valorAluguel;
	
	public Carro() {

	}

	public Carro(String nome, String placa, String tipoCarro, int ano, int dias) {

		this.nome = nome;
		this.placa = placa;
		this.tipoCarro = tipoCarro;
		this.ano = ano;
		this.dias = dias;
	
	}

	public void calculoLocacao() {
		if (this.getTipoCarro().equalsIgnoreCase("hatch")) {
        
		}
	}

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
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

	public String getTipoCarro() {
		return tipoCarro;
	}

	public void setTipoCarro(String tipoCarro) {
		this.tipoCarro = tipoCarro;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getDias() {
		return dias;
	}

	public void setKm(int dias) {
		this.dias = dias;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

}
