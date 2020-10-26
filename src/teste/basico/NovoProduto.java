package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	
	public static void main(String[] args) {
		
		DAO<Produto> dao= new DAO<>(Produto.class);// especificou que é um dao de produto, ja que a classe DAO é generics, 
		                                           // ou pode criar uma classe : "public class ProdutoDAO extends DAO<Produto>
		Produto produto= new Produto("Monitor 23",789.98);
		dao.incluirAtomico(produto).fechar();
		//dao.abrirT().incluir(produto).fecharT().fechar();
		System.out.println("Id do produto: " + produto.getId());
	}
}
