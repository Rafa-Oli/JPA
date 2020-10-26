package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		//ele cria o EntityManager
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("exercicios-jpa");
		// vai fazer a intera�ao com o banco de dados, vai fazer o clude e tbm vai fazer a conexao
	    EntityManager em= emf.createEntityManager();
	    
	    Usuario novoUsuario= new Usuario("Rafaela","rafaela@lanche.com.br");
	
	    //precisa fazer uma transa�ao para fazzer a insercao
	    em.getTransaction().begin();
	    em.persist(novoUsuario);//vai gerar um insert,ele so vai inserir se tiver uma transa��o
	    em.getTransaction().commit();
	    em.close();
	    emf.close();
	    
	}
}
