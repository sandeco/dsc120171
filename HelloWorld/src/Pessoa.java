
public class Pessoa {
	
	String nome;
	int idade;
	double altura;
	double peso;
	
	public Pessoa(){
		
		nome = "";
		idade = 0;
		peso = 0.0;
		altura = 0.0;
		
	}
	
	
	void comer(){
		System.out.println("Pessoa comendo");
		peso=peso+10;
	}
	
	void andar(){
		System.out.println("Pessoa andando");
	}

}
