public class Membros extends Pessoa {
	
	public void pai() {
		System.out.println("meu nome �: "+ this.nome);
	}
	
	public Membros(String nome, int idade,String hierarquia, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.hierarquia = hierarquia;
		this.sexo = sexo;
				
}


	public void print() {
		System.out.println("Ol�, me chamo:  " + nome + " tenho " + idade+ " anos "+ "sou "+ hierarquia+  " e sou do sexo "+ sexo);
	}
	
	
	
}
