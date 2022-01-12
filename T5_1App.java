
public class T5_1App {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);	
		
		if(a > b) {
			System.out.println("El numero más grande es:" + a);			
		} else if(b > a) {
			System.out.println("El numero más grande es: " + b);	
		} else {
			System.out.println("Son iguales");	
		}
	}
}
