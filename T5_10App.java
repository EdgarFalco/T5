import javax.swing.JOptionPane;
public class T5_10App {

	public static void main(String[] args) {
		String txtNumVentas = JOptionPane.showInputDialog("Introduce el numero de ventas que has realizado:");
		int numVentas = Integer.parseInt(txtNumVentas);
		int totalVentas = 0;
		
		for (int i = 1; i <= numVentas; i++) {
			String txtVentas = JOptionPane.showInputDialog("Introduce la " + i + " venta:");
			int ventas = Integer.parseInt(txtVentas);
			totalVentas += ventas;
		}
		JOptionPane.showMessageDialog(null, totalVentas);
	}
}
