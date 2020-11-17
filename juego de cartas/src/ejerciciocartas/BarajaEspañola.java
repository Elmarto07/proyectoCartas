package baraja;

import Carta.Carta;
import enumerados.PalosBarajaEspa�ola;

/**
 * Baraja Espa�ola
 * @author Disco Duro de Roer
 */
public class BarajaEspa�ola extends Baraja {

   

    public BarajaEspa�ola() {
        super();

       

       
            numCartas = 48;
            cartasPorPalo = 12;
        

        crearBaraja(); //Creamos la baraja
        super.barajar(); // barajamos la baraja
    }

    @SuppressWarnings("unchecked")
	@Override
    public void crearBaraja() {

        this.cartas = (Carta<PaloBarajaEspa�ola>[]) new Carta[numCartas];

        PaloBarajaEspa�ola[] palos = PaloBarajaEspa�ola.values();

        //Recorro los palos
        for (int i = 0; i < palos.length; i++) {

            //Recorro los numeros
            for (int j = 0; j < cartasPorPalo; j++) {
            	cartas[((i * cartasPorPalo) + j)] = new Carta(j + 1, palos[i]);
                }

        }

    }

}

