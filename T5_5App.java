import javax.swing.JOptionPane;
public class T5_5App {

	public static void main(String[] args) {
		String txtNumero = JOptionPane.showInputDialog("Introduce un número: ");
		
		int numero = Integer.parseInt(txtNumero);
		int division = numero % 2;
		
		if(division == 0) {
			JOptionPane.showMessageDialog(null, "Si es divisible entre 2");
		} else {
			JOptionPane.showMessageDialog(null, "No es divisible entre 2");
		}
	}
}
