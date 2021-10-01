public class Problema extends Funcionario {
	
	private int estado;
	
	private String descrição;

		public String descrição(){
		if(estado==0){
		descrição ="NOVO";
		}
		if(estado==3){
		descrição ="CANCELADO";
		}
		if(estado==9){
		descrição ="RESOLVIDO";
		}

		  return descrição;
		}


	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getDescrição() {
		
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	
	public Problema() {
	   //Possiveis resultados. 
    //estado = 0;//
    estado = 3;
    //estado = 9;//
	  
	}



}