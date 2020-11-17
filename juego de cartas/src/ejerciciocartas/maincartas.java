package ejerciciocartas;

import java.io.IOException;

import jugar.iniciarJuego;

public class maincartas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		iniciarJuego start = new iniciarJuego();
		
		start.mostrarCabeceraJuego();
		start.solicitarNumeroJugadores();
		start.solicitarDatosJugador();
		start.solicitarTipoBaraja();
	}

}
