package Carta;

import baraja.PaloBaraja;

public class Carta{
	
	//Atributos
	
	private int numero;
	private PaloBaraja palo;
	
	
	public int getNumero() {
		return numero;
	}

	public PaloBaraja getPalo() {
        return palo;
    }
	
	public Carta(int numero ,PaloBaraja palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	
@Override
public String toString() {
	return this.numero + " de " + this.palo;
}
    
}
	
	
	
	
	


