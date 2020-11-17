package jugar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Carta.Carta;
import baraja.Baraja;
import baraja.TipoDeBaraja;
import nomina.Nomina;
import player.Player;

public class iniciarJuego {
	
	
	//Atributos
	
	private int nJugadores;
	private Player cartaPropia;
	private Player J1;
	private Player J2;
	private Player M;
	private Baraja Bj;
	private Carta carta;
	
	
	public void comienzo() throws IOException {
		
		mostrarCabeceraJuego();
		solicitarNumeroJugadores();
		solicitarDatosJugador();
		solicitarTipoBaraja();
		iniciarGame1();
	}
	
	
	
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
		this.nJugadores = Integer.parseInt(br.readLine());
	}
	
	public void solicitarDatosJugador() throws IOException {
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.println("Intrpduce tu nombre: ");
			String name = br.readLine();
			
			System.out.println("Intrpduce tu apellido1  ");
			String surname = br.readLine();
			
			System.out.println("Intrpduce tu apellido1  ");
			String surnames = br.readLine();
			
			System.out.println("Intrpduce tu alias: ");
			String alias = br.readLine();
			
			Player J1 = new Player(name, surname , surnames, alias, false);

			
			if(this.nJugadores == 1) {
				System.out.println("Introduzca los datos del jugador 2 ");
				
				System.out.println("Intrpduce tu nombre: ");
				String name2 = br.readLine();
				
				System.out.println("Intrpduce tu apellido1: ");
				String surnames2 = br.readLine();
				
				System.out.println("Intrpduce tu alias: ");
				String alias2 = br.readLine();
				
				Player J2 = new Player(name2, surnames2, surnames2, alias, false);

				}else if(this.nJugadores == 0) {
					
					Player M = Player("player2","auto", "“generado", "autogen" , true);
					
				}
					
					
					
					
	}
	
	
	
	public void solicitarTipoBaraja() throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Que tipo de baraja desea emplear?: ");
		System.out.println("E para la española y F para la francesa");
		String tipobaraja = br.readLine();
		if(tipobaraja == "E") {
			this.Bj = new Baraja(TipoDeBaraja.ESPAÑOLA);
		} else if (tipobaraja == "F") {
			this.Bj = new Baraja(TipoDeBaraja.FRANCESA);
		}
	}
	
	
	
	
	
	public void iniciarGame1() throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		Bj.barajar();
		String x="S";
		
		System.out.println("Inicio jugada jugador 1 -" + " " + J1.getName() + " " + J1.getSurname()+" " + J1.getSurname2()+ " " + J1.getAlias() );
		
		while(x.equals("S")) {
		
		 cartaPropia.getCartasPlayer1().add( Bj.robarCarta());
		 System.out.println("Carta: "+ carta.toString());
		 
		 System.out.println("quiere cojer otra carta? (S) o (N) ");
		 x = br.readLine();
		}
		if(x.equals("N")) {
			System.out.println("El jugador 1 se planta con las siguientes cartas ");
			cartaPropia.mostrarCartas1();
		}
		
		if(this.nJugadores == 1) {
			
			 String y="S";
			 while(y.equals("S")) {
			 System.out.println("Inicio jugada jugador 2 -" + " " + J2.getName() + J2.getSurname() + J2.getSurname2() + J2.getAlias() );
			 
			 cartaPropia.getCartasPlayer2().add( Bj.robarCarta());
			 System.out.println("Carta: "+ carta.toString());
			 
			 System.out.println("quiere cojer otra carta? (S) o (N) ");
			 x = br.readLine();
			 }
			 if(y.equals("N")) {
					System.out.println("El jugador 2 se planta con las siguientes cartas ");
					cartaPropia.mostrarCartas2();
				}
			 
		}else if(this.nJugadores == 0) {
			
			
			int numero = (int)(Math.random()*10+1);
			System.out.println("Inicio jugada jugador 2 -" + " " + M.getName() + M.getSurname() + M.getSurname2() + M.getAlias() );
			
			 cartaPropia.getCartasPlayer2().add( Bj.robarCarta());
			 System.out.println("Carta: "+ carta.toString());
			 
			 }
			if(numero == 3 ) {
				System.out.println("El jugador 2 se planta con las siguientes cartas ");
				cartaPropia.mostrarCartas2();
			}
			
			
		//ya la parte final
			System.out.println("++++Resumen de la jugada+++");
			System.out.println("Jugador 1 con "+ devolverPuntuacion() + "y estas cartas: ");
			System.out.println("Carta: "+ );
		
		
		
		
		
		
	}
	
	
	
	
}
	

	
	
	
	


