package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	
	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em= emf.createEntityManager();
        
		
		
		em.getTransaction().begin(); //precisa de uma transacao para alterar um dado
		 
		Usuario usuario= em.find(Usuario.class, 7L);
		em.detach(usuario);// vai desassociar para tirar o estado de gerenciamento(não vai ter uma sincronia direto com o banco de dados fazendo um update)
	   
		usuario.setNome("Rafaela");
        
        
        em.merge(usuario); // responsavel por fazer uma alteracao
	   
        em.getTransaction().commit();
		
        em.close();
        emf.close();
		
	}
}
