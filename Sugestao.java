public class Sugestao extends Problema {
	
	private boolean aplicada ;
	private String descriçao;
	public boolean isAplicaçao() {
		return aplicada;
	}
	public void setAplicada(boolean aplicada) {
		this.aplicada = aplicada;
	}
	public String getDescriçao() {
		return descriçao;
	}
	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
	
public Sugestao() {
	    
	    aplicada = false;
      //aplicada = true;
	  
	}

	public String descriçao (){
		if(aplicada==false){
			descriçao ="ABCDEF";
		}
		if(aplicada==true){
			descriçao ="GHIJ";
		}

		  return descriçao;
		}

}
