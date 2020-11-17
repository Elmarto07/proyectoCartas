package player;

import java.util.ArrayList;

import Carta.Carta;

public class Player {
	
	private String name;
	private String surname;
	private String alias;
	private boolean maquina;
	private ArrayList<Carta> cartasPlayer1;
	private ArrayList<Carta> cartasPlayer2;
	private double puntuacionPlayer;
	private String surname2;

	
	public Player(String name , String surname , String surname2, String alias, boolean maquina) {
		
		this.name = name;
		this.surname = surname;
		this.surname2 = surname2;
		this.alias = alias;
		this.maquina = maquina;
		
	}
	
	
	
	//Tengo que sumar los numeros del array de cada mazo propio

	public void devolverPuntuacion() {
		double puntuacion;
		double aux;
		
		
		if(n>=7) {
			aux = 0,5;
		}else if(n<7) {
			aux = n;
		 }
		puntuacion = puntuacion +aux;
		
		
		
	}
	
	
	

	public String getName() {
		return name;
	}


	


	public String getSurname() {
		return surname;
	}


	

	public String getAlias() {
		return alias;
	}


	

	public boolean isMaquina() {
		return maquina;
	}


	public ArrayList<Carta> getCartasPlayer1() {
		return cartasPlayer1;
	}


	public double getPuntuacionPlayer() {
		return puntuacionPlayer;
	}


	public void setPuntuacionPlayer(double puntuacionPlayer) {
		this.puntuacionPlayer = puntuacionPlayer;
	}




	public String getSurname2() {
		return surname2;
	}




	public ArrayList<Carta> getCartasPlayer2() {
		return cartasPlayer2;
	}
	
	
	
		public void mostrarCartas1() {
				
				for(int i = 0; i<cartasPlayer1.size(); i++) {
					System.out.println(cartasPlayer1.get(i).toString());
				}
		}
		
		public void mostrarCartas2() {
			
			for(int i = 0; i<cartasPlayer2.size(); i++) {
				System.out.println(cartasPlayer2.get(i).toString());
			}
		
		}
		
		public void elegirContinuarMaquina() {
			
			
			
		}
	
	
	
	
}
