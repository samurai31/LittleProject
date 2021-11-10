
abstract class Pessoa {

	String nome;
	String hierarquia;
	int idade;
	String sexo;
	
	void setIdade(int valor) {
		this.idade = valor;
	}

	
	public String getNome() {
		return this.nome;
	}
	
	public String getHierarquia() {
		return this.hierarquia;
	}
	
	public void imprime() {
		System.out.println("O meu nome é: "+ this.nome);
	}
	
	public void aumentaIdade() {
		this.idade++;
	}
}
