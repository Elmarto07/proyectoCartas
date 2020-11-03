package ejerciciocartas;

public class player {
	
	private String name;
	private String surname;
	private String alias;

	
	public player(String name , String surname , String alias) {
		
		this.name = name;
		this.surname = surname;
		this.alias = alias;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getAlias() {
		return alias;
	}


	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	
	
}
