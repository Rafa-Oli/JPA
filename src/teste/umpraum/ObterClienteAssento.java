package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

	
	
	public static void main(String[] args) {
		DAO<Cliente> daoCliente= new DAO<>(Cliente.class);

		
		
		Cliente cliente= daoCliente.ObterPorID(1L);
		System.out.println(cliente.getAssento().getNome());// esta acessando o nome do assento atraves do cliente, ja que é uma relaçao bidirecional
		daoCliente.fechar();
		
		
		DAO<Assento> daoAssento= new DAO<>(Assento.class);
		Assento assento= daoAssento.ObterPorID(4L);
		System.out.println(assento.getCliente().getNome());//obtendo o nome do cliente a partir do assento
		
		daoAssento.fechar(); 
		
	
	
	}
}
