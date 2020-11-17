package baraja;

import java.util.ArrayList;
import java.util.Collections;
import Carta.Carta;


public class Baraja {
	
	private TipoDeBaraja tipoDeBaraja;
	private ArrayList<Carta> cartasBaraja;
	
	
	//constructor
	
	public Baraja( TipoDeBaraja tipoDeBaraja) {
		if(tipoDeBaraja == TipoDeBaraja.ESPAÑOLA) {
			this.tipoDeBaraja = tipoDeBaraja;
			
		}
		else {
			this.tipoDeBaraja = tipoDeBaraja;
			}
		crearBaraja();
	}

	
	public void barajar() {
		Collections.shuffle(this.cartasBaraja);
	}
	
	public Carta robarCarta() {
		Carta carta = this.cartasBaraja.get(0);
		this.cartasBaraja.remove(0);
		return carta;
	}
	
	public void crearBaraja() {
		PaloBaraja[] palos;
		int nCartasPorPalo;
		Carta carta;
		if(this.tipoDeBaraja == TipoDeBaraja.ESPAÑOLA) {
			palos = new PaloBaraja[] {PaloBaraja.BASTOS, PaloBaraja.OROS, PaloBaraja.ESPADAS, PaloBaraja.COPAS};
			nCartasPorPalo=12;
			}
		else {
				palos = new PaloBaraja[] {PaloBaraja.PICAS, PaloBaraja.TREBOLES, PaloBaraja.CORAZONES, PaloBaraja.DIAMANTES};
				nCartasPorPalo=13;
			 }
		for (PaloBaraja paloBaraja : palos) {
			for(int i = 0; i<nCartasPorPalo; i++) {
				
				carta = new Carta(i+1 , paloBaraja);
				this.cartasBaraja.add(carta);
				
			}
			
		}
			
		}
	
	
	
	
}
