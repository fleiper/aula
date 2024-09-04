package modificadores;
import java.util.Scanner;
public class PrincipalAnimal {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Animal animal = new Animal();
		
		System.out.println("Qual o nome deste animal? ");
		String nome = ler.next();
		
		System.out.println("E qual(is) a(s) cor(es) deste animal? ");
		String cor = ler.next();
		
		System.out.println("Qual o tamanho deste animal°?: ");
		String tamanho = ler.next();
		
		System.out.println("Qual a raça deste animal ");
		String raça = ler.next();
		
		System.out.println("Qual o peso deste animal?:");
		double peso = ler.nextDouble();
		
		animal.setcor(cor);
		animal.setpeso(peso);
		animal.setraça(raça);
		animal.setNome(nome);
		animal.settamanho();
		
		System.out.println(animal.getNome());
		System.out.println(animal.getcor());
		System.out.println(animal.getpeso());
		System.out.println(animal.getraça());
		System.out.println(animal.getpeso());
	}

}