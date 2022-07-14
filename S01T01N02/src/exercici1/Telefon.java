package exercici1;

public class Telefon {
	private String marca;
	private String model;
	
	public Telefon(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}

	public String getMarca() {
		return marca;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "Telefon [marca=" + marca + ", model=" + model + "]";
	}
	
	public void trucar(String numeroTelefon) {
		System.out.println("S'esta trucant al: "+numeroTelefon);
	}
	
	

}
