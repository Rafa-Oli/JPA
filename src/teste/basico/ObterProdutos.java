package teste.basico;

import java.util.List;

import modelo.basico.Produto;
import modelo.basico.ProdutoDAO;

public class ObterProdutos {

	public static void main(String[] args) {
		
	
	ProdutoDAO dao= new ProdutoDAO();
	List<Produto> produtos = dao.ObterTodos();
	
	for(Produto produto: produtos) {
		System.out.println("ID: " + produto.getId() + ",  Nome: " + produto.getNome());
		
	}
	
	double precoTotal= produtos.stream().map(p -> p.getPreco()).reduce(0.0,(t,p) -> t + p).doubleValue();// vai somar os precos
System.out.println("O valor total é R$ " + precoTotal);


dao.fechar();
}
}