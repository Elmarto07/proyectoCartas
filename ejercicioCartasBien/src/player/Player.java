package player;

import java.util.ArrayList;

import Carta.Carta;

public class Player {
	
	private String name;
	private String surname;
	private String surname2;
	private String alias;
	private boolean maquina;
	private ArrayList<Carta> cartasPlayer;
	private double puntuacionPlayer;

	
	public Player(String name , String surname , String surname2, String alias, boolean maquina) {
		
		this.name = name;
		this.surname = surname;
		this.surname2 = surname2;
		this.alias = alias;
		this.maquina = maquina;
		
	}

	public void mostrarCartasPlayer() {
		System.out.println("Cartas jugador: " + this.name + " " + this.surname + " " + this.surname2);
		System.out.println("------------------------");
		for (Carta carta: this.cartasPlayer) {
			System.out.println(carta.toString());
		}
		System.out.println("------------------------");
	}
	
	public void mostrarResumenCartas() {
		
		
	     	for (Carta carta: this.cartasPlayer) {
	 			System.out.println("Carta: " + carta.toString());
	 		}
	 		System.out.println("------------------------");
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

	public double getPuntuacionPlayer() {
		return puntuacionPlayer;
	}

	public void setPuntuacionPlayer(double puntuacionPlayer) {
		this.puntuacionPlayer = puntuacionPlayer;
	}

	public String getSurname2() {
		return surname2;
	}

	public ArrayList<Carta> getCartasPlayer() {
		return cartasPlayer;
	}

	public void setCartasPlayer(ArrayList<Carta> cartasPlayer) {
		this.cartasPlayer = cartasPlayer;
	}
}
