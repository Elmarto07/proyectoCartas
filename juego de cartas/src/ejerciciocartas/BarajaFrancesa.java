package ejerciciocartas;

import Carta.Carta;

public class BarajaFrancesa extends mazoCartas {

	    public BarajaFrancesa() {
	        super();

	        this.numCartas = 52;
	        this.cartasPorPalo = 13;

	        crearBaraja(); //Creamos la baraja
	        super.barajar(); // barajamos la baraja
	    }

	    @Override
	    public void crearBaraja() {

	        this.cartas = (Carta<PaloBarajaFrancesa>[]) new Carta[numCartas];

	        PaloBarajaFrancesa[] palos = PaloBarajaFrancesa.values();

	        //Recorro los palos
	        for (int i = 0; i < palos.length; i++) {

	            //Recorro los numeros
	            for (int j = 0; j < cartasPorPalo; j++) {
	                cartas[((i * cartasPorPalo) + j)] = new Carta(j + 1, palos[i]);
	            }

	        }

	    }

	    public boolean cartaRoja(Carta<PaloBarajaFrancesa> c) {
	        return c.getPalo() == PaloBarajaFrancesa.CORAZONES || c.getPalo() == PaloBarajaFrancesa.DIAMANTES;
	    }

	    public boolean cartaNegra(Carta<PaloBarajaFrancesa> c) {
	        return c.getPalo() == PaloBarajaFrancesa.TREBOLES || c.getPalo() == PaloBarajaFrancesa.PICAS;
	    }

	}


}
