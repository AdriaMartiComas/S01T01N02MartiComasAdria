package exercici1;

public class SmartPhone extends Telefon implements Camera, Rellotge {

	public SmartPhone(String marca, String model) {
		super(marca, model);
	}

	@Override
	public void alarma() {
		System.out.println("Està sonant l'alarma");	
	}
	

}
