import java.util.ArrayList;

public class Funcionario {

	private ArrayList<Problema> problema = new ArrayList<Problema>();
	
	private String nome;
	
	private int sexo;
	
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public ArrayList<Problema> getProblema() {
		return problema;
	}

	public void setProblema(ArrayList<Problema> problema) {
		this.problema = problema;
	}


	}
