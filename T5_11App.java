import javax.swing.JOptionPane;

public class T5_11App {

	public static void main(String[] args) {
		String txtDiaSemana = JOptionPane.showInputDialog("Introduce un dia de la Semana:");
		String laboral = "Has introducido un dia laboral";
		String noLaboral = "El dia introducido no es laboral";
		
		switch (txtDiaSemana) {
		case "Lunes":
			JOptionPane.showMessageDialog(null, laboral);
			break;
		case "Martes":
			JOptionPane.showMessageDialog(null, laboral);
			break;
		case "Miercoles":
			JOptionPane.showMessageDialog(null, laboral);
			break;
		case "Jueves":
			JOptionPane.showMessageDialog(null, laboral);
			break;
		case "Viernes":
			JOptionPane.showMessageDialog(null, laboral);
			break;
		case "Sabado":
			JOptionPane.showMessageDialog(null, noLaboral);
			break;
		case "Domingo":
			JOptionPane.showMessageDialog(null, noLaboral);
			break;
		default:
			JOptionPane.showMessageDialog(null, "No has introducido un dia");
			break;
		}
	}
}
