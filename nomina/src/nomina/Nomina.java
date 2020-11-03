package nomina;

public class Nomina {
	
	private String name;
	private String surname;
	private String surname2;
	private double SS = 0.10;
	private double IRPF = 0.20;
	private double bruto;
	
	//Constructores
	
	Nomina(String name , String surname , String surname2 , double bruto){
		 this.name = name;
		 this.surname = surname;
		 this.surname2 = surname2;
		 this.bruto = bruto;
	}
	
	//getters y setters
	
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
	public String getsurname2() {
		return surname2;
	}
	public void setsurname2(String surname2) {
		this.surname2 = surname2;
	}
	public double getbruto() {
		return bruto;
	}
	public void setbruto(double bruto) {
		this.bruto = bruto;
	}
	public double getIRPF() {
		return IRPF;
	}
	public void setIRPF(double IRPF) {
		this.IRPF = IRPF;
	}
	public double getSS() {
		return SS;
	}
	public void setSS(double SS) {
		this.SS = SS;
	}
	
	//Métodos
	
	
	
	public void printNameYSurname() {
		System.out.println(" Nombre y apellidos: " + this.getSurname() + " " + this.getsurname2() + ", " +this.getName());
		
	}
	
	public double devolverIRPF() {
		return this.getbruto()*this.getIRPF();
	}
	
	public double devolverSS() {
		return this.getbruto()*this.getSS();
	}
	
	public double devolverSueldoNeto() {
		return this.getbruto()-this.devolverIRPF()-this.devolverSS();
		
	}
	
	public void printSS() {
		System.out.println("las retenciones a la seguridad social son de: " + devolverSS());
	}
	public void printIRPF() {
		System.out.println("las retenciones por el IRPF son de: "+ devolverIRPF());
	}
	public void printNeto() {
		System.out.println("El sueldo neto es de: "+ devolverSueldoNeto());
	}
	
	
}
