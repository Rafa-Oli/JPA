package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		//ele cria o EntityManager
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("exercicios-jpa");
		// vai fazer a interaçao com o banco de dados, vai fazer o clude e tbm vai fazer a conexao
	    EntityManager em= emf.createEntityManager();
	    
	    Usuario novoUsuario= new Usuario("Rafaela","rafaela@lanche.com.br");
	
	    //precisa fazer uma transaçao para fazzer a insercao
	    em.getTransaction().begin();
	    em.persist(novoUsuario);//vai gerar um insert,ele so vai inserir se tiver uma transação
	    em.getTransaction().commit();
	    em.close();
	    emf.close();
	    
	}
}
