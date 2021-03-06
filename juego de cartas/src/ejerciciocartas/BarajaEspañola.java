package baraja;

import Carta.Carta;
import enumerados.PalosBarajaEspaņola;

/**
 * Baraja Espaņola
 * @author Disco Duro de Roer
 */
public class BarajaEspaņola extends Baraja {

   

    public BarajaEspaņola() {
        super();

       

       
            numCartas = 48;
            cartasPorPalo = 12;
        

        crearBaraja(); //Creamos la baraja
        super.barajar(); // barajamos la baraja
    }

    @SuppressWarnings("unchecked")
	@Override
    public void crearBaraja() {

        this.cartas = (Carta<PaloBarajaEspaņola>[]) new Carta[numCartas];

        PaloBarajaEspaņola[] palos = PaloBarajaEspaņola.values();

        //Recorro los palos
        for (int i = 0; i < palos.length; i++) {

            //Recorro los numeros
            for (int j = 0; j < cartasPorPalo; j++) {
            	cartas[((i * cartasPorPalo) + j)] = new Carta(j + 1, palos[i]);
                }

        }

    }

}

