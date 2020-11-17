package baraja;

import Carta.Carta;
import enumerados.PalosBarajaEspañola;

/**
 * Baraja Española
 * @author Disco Duro de Roer
 */
public class BarajaEspañola extends Baraja {

   

    public BarajaEspañola() {
        super();

       

       
            numCartas = 48;
            cartasPorPalo = 12;
        

        crearBaraja(); //Creamos la baraja
        super.barajar(); // barajamos la baraja
    }

    @SuppressWarnings("unchecked")
	@Override
    public void crearBaraja() {

        this.cartas = (Carta<PaloBarajaEspañola>[]) new Carta[numCartas];

        PaloBarajaEspañola[] palos = PaloBarajaEspañola.values();

        //Recorro los palos
        for (int i = 0; i < palos.length; i++) {

            //Recorro los numeros
            for (int j = 0; j < cartasPorPalo; j++) {
            	cartas[((i * cartasPorPalo) + j)] = new Carta(j + 1, palos[i]);
                }

        }

    }

}

