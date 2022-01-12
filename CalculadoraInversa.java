import javax.swing.JOptionPane;
public class CalculadoraInversa {

	public static void main(String[] args) {
		String txtNum1 = JOptionPane.showInputDialog("Introduce el primer numero:");
		String txtOperador = JOptionPane.showInputDialog("Introduce el operador:");
		String txtNum2 = JOptionPane.showInputDialog("Introduce el segundo numero:");
		int num1 = Integer.parseInt(txtNum1);
		int num2 = Integer.parseInt(txtNum2);
		int intResult = 0;
		double doubleResult = 0;
		
		switch (txtOperador) {
		case "+":
			intResult = num1 + num2;
			JOptionPane.showMessageDialog(null, intResult);
			break;
		case "-":
			intResult = num1 - num2;
			JOptionPane.showMessageDialog(null, intResult);
			break;
		case "*":
			intResult = num1 * num2;
			JOptionPane.showMessageDialog(null, intResult);
			break;
		case "/":
			doubleResult = Double.parseDouble(txtNum1) / Double.parseDouble(txtNum2);
			JOptionPane.showMessageDialog(null, doubleResult);
			break;			
		case "^":
			intResult = (int)Math.pow(num1, num2);
			JOptionPane.showMessageDialog(null, intResult);
			break;
		case "%":
			intResult = num1 % num2;
			JOptionPane.showMessageDialog(null, intResult);
			break;
		default:					
			JOptionPane.showMessageDialog(null, "No has introducido un operador disponible");			
			break;
		}
	}
}
