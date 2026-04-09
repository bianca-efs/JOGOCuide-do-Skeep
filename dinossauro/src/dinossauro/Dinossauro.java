package dinossauro;

public class Dinossauro {

	private int energia;
	private int velocidade;
	private int temperatura;
	private String humor;
	
	public void tomarSol () {
		velocidade += 10;
		temperatura+= 10;
		humor = "Feliz :) ";
	}

	public void comer () {
		energia += 10;
		velocidade -= 10;
		humor = "Feliz :) ";
	}
	
	public void correr () {
		energia -= 10;
		velocidade -= 10;
		humor = "Feliz :) ";
	}
	
	public void ficarNaSombra () {
		energia += 10;
		humor = "Triste :( ";
		temperatura -= 10;
	}
	
	public void cantar () {
		energia -= 10;
		humor = "Feliz :) ";
	}
	
	public void pular () {
		energia -= 10;
		velocidade -= 10;
		humor = "Feliz :) ";
	}
	

	public int getEnergia() {return energia;}
	public void setEnergia(int energia) {this.energia = energia;}

	public int getVelocidade() {return velocidade;}
	public void setVelocidade(int velocidade) {this.velocidade = velocidade;}

	public int getTemperatura() {return temperatura;}
	public void setTemperatura(int temperatura) {this.temperatura = temperatura;}

	public String getHumor() {return humor;}
	public void setHumor(String humor) {this.humor = humor;}
}
