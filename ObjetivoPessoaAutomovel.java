package modificadores;
import java.util.Scanner;
public class ObjetivoPessoaAutomovel {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	
	Pessoa pessoa = new Pessoa ();
	int velocidade;
	String cor, nome;
	
	System.out.println("Informe a cor do carro");
	cor = ler.next();
	
	System.out.println("Informe o nome do carro");
	nome = ler.next();
	
	System.out.println("informe a velocidade do carro");
	velocidade = ler.nextInt();
			
	pessoa.compracarro(cor, nome, velocidade);
	
	Automovel carro = pessoa.getAutomovel();
	
	System.out.println("o carro foi comprado "+ carro.getNome()+"da cor"+carro.getCor()+ "que atinge a velocidade de"+carro.getVelocidade());
	

}
}