package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em= emf.createEntityManager();
        
		
		//quando faz uma consulta dentro de uma transacao, ele assume o estado gerenciado, ou seja, quando o jpa tem um gerenciamento daquele dado, 
		//e qualquer mudança é sincronizado com o banco de dados, msm que n chama o metodo merge
		em.getTransaction().begin(); //precisa de uma transacao para alterar um dado
		 
		Usuario usuario= em.find(Usuario.class, 7L);
	    usuario.setNome("Rafa");
        
        
       // em.merge(usuario); // responsavel por fazer uma alteracao
	   
        em.getTransaction().commit();
		
        em.close();
        emf.close();
	}
}
