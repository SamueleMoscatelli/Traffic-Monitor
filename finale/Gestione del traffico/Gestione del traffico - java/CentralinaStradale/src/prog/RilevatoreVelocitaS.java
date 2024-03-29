package prog;

import java.util.Random;

public class RilevatoreVelocitaS extends RilevatoreVelocita{

	private int sommaVelocita;

	public RilevatoreVelocitaS() {
		this.velocita=50;
		this.sommaVelocita = 0;
	}

	public void rilevaVelocita() {

//la velocita' viene calcolata in modo random in un intorno +-15 della velocita' media registrata in precedenza
		Random random = new Random();
		int min;
		int max;
		if (this.velocita>15) {
			min = this.velocita-15; // numero minimo
		}
		else {
			min =0;
		}
		if(this.velocita<95) {
			max = this.velocita+15;
		} // numero massimo
		else {
			max=110;
		}
		int intorno = ((max-min) + 1);

		int vel = random.nextInt(intorno) + min;
		this.sommaVelocita=this.sommaVelocita+vel;
	}

	public void resetSommaVelocita(int velocita) {

		this.velocita=velocita; //indica la velocita' dell'intervallo precedente
		this.sommaVelocita = 0;
	}

	public int getSommaVelocita() {
		return this.sommaVelocita;
	}
}