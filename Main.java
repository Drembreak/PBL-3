class Main {
	  public static void main(String[] args) {


	Problema novoProblema = new Problema();


	Sugestao novaSugestao = new Sugestao();
	
  System.out.println("\nNome: Everson Caio de Oliveira Cruz\nRA:30959 "); 
  System.out.println("\nAnálise e Projeto Orientado a Objetos "); 

	System.out.println("\nO código do Estado do problema é: "+novoProblema.getEstado());

	System.out.println("\nDescrição do status do problema: "+novoProblema.descrição());
	
	System.out.println("\n\nA sugestão do problema é: "+novaSugestao.descriçao());

	  }
	}