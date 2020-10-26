package teste.basico;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.basico.Usuario;
public class AlterarUsuario1 {

	
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em= emf.createEntityManager();
        
		em.getTransaction().begin(); //precisa de uma transacao para alterar um dado
		 
		Usuario usuario= em.find(Usuario.class, 7L);
	    usuario.setNome("Rafa");
        usuario.setEmail("rafaela@lanche.com.br");
        
        em.merge(usuario); // responsavel por fazer uma alteracao
	   
        em.getTransaction().commit();
		
        em.close();
        emf.close();
	}
}
