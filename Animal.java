package modificadores;

public class Animal {
	String nome;
	String cor;
	String tamanho;
	String peso;
	String raça;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getcor() {
		return cor;
	}
	public void setcor(String cor) {
		this.cor = cor;
	}
	public String settamanho () {
		return tamanho;
	}
	public void settamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public double getpeso() {
		return peso;
	}
	public void setpeso(double peso) {
		this.peso = peso;
	}
	public String getraça() {
		return raça;
	}
	public void setraça(String raça) {
		this.raça = raça;
	}
}

