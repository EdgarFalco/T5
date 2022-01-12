import javax.swing.JOptionPane;
public class T5_6App {

	public static void main(String[] args) {
		
		String txtNumero = JOptionPane.showInputDialog("Introduce un precio: ");
		final double IVA = 0.21;
		Double numero = Double.parseDouble(txtNumero);
		
		JOptionPane.showMessageDialog(null, "Precio final: " + (numero + (numero*IVA)));
	}
}
