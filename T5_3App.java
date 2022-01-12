import javax.swing.JOptionPane;
public class T5_3App {	
	
	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
		
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
	}
}
