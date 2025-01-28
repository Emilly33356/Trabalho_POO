package Interface;

public class Dispositivo implements USBConectavel, BluetoothConectavel {

	@Override
    public void conectarViaUSB() {
        System.out.println("Dispositivo conectado via USB.");
    }

    @Override
    public void desconectarViaUSB() {
        System.out.println("Dispositivo desconectado do USB.");
    }

    @Override
    public void conectarViaBluetooth() {
        System.out.println("Dispositivo conectado via Bluetooth.");
    }

    @Override
    public void desconectarViaBluetooth() {
        System.out.println("Dispositivo desconectado do Bluetooth.");
    }
}
