import javax.swing.JOptionPane;
public class T5_4App {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		String txtRadio = JOptionPane.showInputDialog("Introduce el radio: ");
		double result;
		
		result = PI * (Math.pow(Double.parseDouble(txtRadio), 2));
		
		JOptionPane.showMessageDialog(null, "El area de un circulo de radio " + txtRadio + " es de: " + result );
	}
}
