package ListaLigada;

public class Temperatura {
	
	public String getGraus() {
		return graus;
	}

	public void setGraus(String graus) {
		this.graus = graus;
	}

	private String graus;
	
	
  public Temperatura(String graus) {
	  
	  this.graus =graus;
  }
  
  @Override
public String toString() {
	// TODO Auto-generated method stub
	return "A temperatura é :"+this.graus;
}
}
