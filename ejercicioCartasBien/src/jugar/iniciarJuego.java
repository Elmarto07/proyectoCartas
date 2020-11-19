package jugar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Carta.Carta;
import baraja.Baraja;
import baraja.TipoDeBaraja;
import player.Player;

public class iniciarJuego {

    private int nJugadores;
    int ganador;
    private Player J1;
    private Player J2;
    private Baraja Bj;

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
        String name, surname, surnames, alias;

        System.out.println("Intrpduce tu nombre: ");
        name = br.readLine();

        System.out.println("Intrpduce tu apellido1  ");
        surname = br.readLine();

        System.out.println("Intrpduce tu apellido2  ");
        surnames = br.readLine();

        System.out.println("Intrpduce tu alias: ");
        alias = br.readLine();

        this.J1 = new Player(name, surname, surnames, alias, false);

        if (this.nJugadores == 1) {
            System.out.println("Introduzca los datos del jugador 2 ");

            System.out.println("Intrpduce tu nombre: ");
            name = br.readLine();

            System.out.println("Intrpduce tu apellido1  ");
            surname = br.readLine();

            System.out.println("Intrpduce tu apellido2  ");
            surnames = br.readLine();

            System.out.println("Intrpduce tu alias: ");
            alias = br.readLine();

            this.J2 = new Player(name, surname, surnames, alias, false);

        } else if (this.nJugadores == 0) {
           this.J2 = new Player("player2", "auto", "generado", "autogen", true);
        }
    }

    public void solicitarTipoBaraja() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Que tipo de baraja desea emplear?: ");
        System.out.println("E para la española y F para la francesa");
        String tipobaraja = br.readLine();
        if (tipobaraja.equals("E")) {
            this.Bj = new Baraja(TipoDeBaraja.ESPAÑOLA);
        } else if (tipobaraja.equals("F")) {
            this.Bj = new Baraja(TipoDeBaraja.FRANCESA);
        }
    }


    public void iniciarGame(Player player ,int i) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Carta cartaRobada;
        Bj.barajar();
        String x = "S";
        
        
       
        
        
        
        System.out.println("Inicio jugada jugador " + i + "-"  + player.getName() + " " + player.getSurname() + " " + player.getSurname2() + " " + player.getAlias());

        // Quieres que el jugador termine de jugar si la puntuación supera el 7.5
        while (x.equals("S") || player.getPuntuacionPlayer() <= 7.5) {
            cartaRobada = Bj.robarCarta();
            player.getCartasPlayer().add(cartaRobada);

            // Actualiza la puntuación del jugador
            if (cartaRobada.getNumero() <= 7) {
                player.setPuntuacionPlayer(player.getPuntuacionPlayer() + 1);
            } else if (cartaRobada.getNumero() > 7) {
                player.setPuntuacionPlayer(player.getPuntuacionPlayer() + 0.5);
            }

            System.out.println("Carta: " + cartaRobada.toString());
            
            if(player.isMaquina() == true) {
            	  int numero = (int)(Math.random()*10+1);       
                  if(numero == 3) {
                	  x = "N";
                  }else if((6.5 <= player.getPuntuacionPlayer()) || (player.getPuntuacionPlayer()  >= 7.5)) {
                	  x = "N";
                  }else {
                	  x = "S";
                  }
            }
                  
           if(player.isMaquina() == false) {
        	   
        	   System.out.println("quiere cojer otra carta? (S) o (N) ");
               x = br.readLine();
               
               if(!x.equals("S") || !x.equals("N")) {
               	
               	System.out.println("Tienes que poner S o N");
               	 System.out.println("quiere cojer otra carta? (S) o (N) ");
                    x = br.readLine();
        	   
               	}
               
           }
            	
        }
        
        	System.out.println("El jugador"  + i +  "se planta con las siguientes cartas ");
            player.mostrarCartasPlayer();
       }
        
       
    
    public void elegirGanador() {
        
        if((J1.getPuntuacionPlayer() < 7.5) && (J2.getPuntuacionPlayer() < 7.5)) {
        
	        if((J1.getPuntuacionPlayer() > J2.getPuntuacionPlayer()) && (J1.getPuntuacionPlayer() < 7.5)) {
	        	
	        	ganador = 1;
	        	
	        }else if((J2.getPuntuacionPlayer() > J1.getPuntuacionPlayer()) && J2.getPuntuacionPlayer() < 7.5) {
	        	
	        	ganador = 2;
	        	
	        }
        
        }
        
        

       

        
       
    }
    
    
    public void finalGame(Player player, int i) {
    	
    	 System.out.println("++++Resumen de la jugada+++");
         System.out.println("Jugador" + i +" con " + player.getPuntuacionPlayer() + "y estas cartas: ");
         player.mostrarResumenCartas();
    	
    }
    
    public void ganadorFinal(Player player1 , Player player2 , int i , int x) {
    	
    	if(ganador == 1) {
    		
    		System.out.println("++++Ganador+++");
    		System.out.println("Ganador "+ player1.getName() + player1.getSurname() + player1.getSurname2() + "("+ player1.getAlias() + ") ¡¡¡Enhorabuena CAMPEÓN!!!");
    		System.out.println("-------------Fin del juego--------------");
    		
    	}else if(ganador == 2) {
    		
    		System.out.println("++++Ganador+++");
    		System.out.println("Ganador "+ player2.getName() + player2.getSurname() + player2.getSurname2() + "("+ player2.getAlias() + ") ¡¡¡Enhorabuena CAMPEÓN!!!");
    		System.out.println("-------------Fin del juego--------------");
    		
    	}
    	
    	
    }
   
  


    public void comienzo() throws IOException {
        mostrarCabeceraJuego();
        solicitarNumeroJugadores();
        solicitarDatosJugador();
        solicitarTipoBaraja();
        iniciarGame(J1, 1);
        iniciarGame(J2, 2);
        finalGame(J1 , 1);
        finalGame(J2 , 2);
        ganadorFinal(J1 , J2 , 1 , 2);
    }
}
	