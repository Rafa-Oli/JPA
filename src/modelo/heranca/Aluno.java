package modelo.heranca;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy =InheritanceType.SINGLE_TABLE)//criando uma heranca, selecionou o metodo de cada classe tem uma tabela
@Inheritance(strategy =InheritanceType.JOINED)
@DiscriminatorColumn(name= "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)// definir qual o tipo de instancia daquele tipo naquela linha, ex: aluno normal, ja que single é uma unica tabela 
@DiscriminatorValue("AL")
public class Aluno {
    @Id
	private Long matricula;
	private String nome;
	
	public Aluno() {
		
	}

	public Aluno(Long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
