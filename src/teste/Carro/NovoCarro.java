package teste.Carro;

import java.util.Scanner;

import infra.DAO;
import modelo.testeCarro.Carro;

public class NovoCarro {
public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	  
	System.out.println("Cadastro do carro");
    System.out.println("Digite o nome do carro: ");
	String nome = entrada.next();

	System.out.println("Digite o tipo do carro: ");
	String tipo = entrada.next();

	System.out.println("Digite o ano do carro: ");
	int ano = entrada.nextInt();

	System.out.println("Digite a placa do carro: ");
	String placa = entrada.next();

	System.out.println("Quanto dias de locação do carro: ");
	int dias = entrada.nextInt();
    
	System.out.println("Cadastro do locador");
	System.out.println("Digite o nome do locador: ");
	String nomeL = entrada.next();
	
	
	Carro carro = new Carro(nome, placa,tipo,ano, dias);
	DAO<Carro> dao= new DAO<>();
	dao.incluirAtomico(carro);
	
	entrada.close();
	
	
}
}
