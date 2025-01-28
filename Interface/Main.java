package Interface;

public class Main {

	public static void main(String[] args) {
		
		Dispositivo d1 = new Dispositivo();
		
		d1.conectarViaBluetooth();
		d1.desconectarViaBluetooth();
		d1.conectarViaUSB();
		d1.desconectarViaUSB();

	}

}
