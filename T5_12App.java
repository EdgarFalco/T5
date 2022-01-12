import javax.swing.JOptionPane;
public class T5_12App {

	public static void main(String[] args) {
		
		int num = 1;
		String pass = "hola";	
		String passIntroducida;
		
		do {
			String txtPass = JOptionPane.showInputDialog("Introduce la contraseña:");
			passIntroducida = txtPass;
			num++;
			if(pass.equals(passIntroducida)){
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				num = 4;
			}
		} while (num <= 3);			
	}
}
