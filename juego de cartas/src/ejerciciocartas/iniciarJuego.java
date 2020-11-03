package ejerciciocartas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class iniciarJuego {
	
	public void mostrarCabeceraJuego() {
		
		System.out.println("****************************************");
		System.out.println("*********JUEGO DEL SIETE Y MEDIO********");
		System.out.println("****************************************");
	}
	
	public void solicitarNumeroJugadores() throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("diga nº de jugadores: ");
		System.out.println("Player vs IA (0) o PVP local (1)");
		String nJugadores = br.readLine();
	}
	
	public void solicitarDatosJugador() throws IOException {
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.println("Intrpduce tu nombre: ");
			String name = br.readLine();
			
			System.out.println("Intrpduce tu surname: ");
			String surname = br.readLine();
			
			System.out.println("Intrpduce tu alias: ");
			String surname2 = br.readLine();
			
	}
	
	public void solicitarTipoBaraja() throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Que tipo de baraja desea emplear?: ");
		String tipobaraja = br.readLine();
		
	}
	

	
	
	
	

}
