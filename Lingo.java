package clase;
import java.util.Scanner;
import java.util.Random;
public class Lingo {
	
	static String[]palabras = {"perro", "pared", "lapiz", "jugar", "saber", "mundo", "grupo", "ahora", "campo" };
	static String palabraBuscada;
	static String[][]tabla = new String[5][5];
	static int intento = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void seleccionarPalabra() { //Metodo 1 para elegir una de las palabras dadas.
		Random random = new Random();
		palabraBuscada = palabras[random.nextInt(palabras.length)]; 
	}
	
	public static String comprobarPalabra() { //Metodo 2. Este metodo debe comprobar la palabra.
		
	}
	
	public static void mostrarTabla() { //Metodo 3. Con el se enseña la tabla al jugador.
		System.out.println("Tabla de intentos:");
		for (int i = 0; i<5; i++) {
			for (int j = 0; j<5; j++) {	
			}
		}
	}
	public static String introducirPalabra() { //Metodo 4. El jugador introduce la palabra y se pasa todo a minusculas.
		System.out.println("Introduce una palabra de 5 letras:");
		return sc.nextLine().toLowerCase();
	}
	
	public static void comprobarJuego() { //Metodo 5. En este método se comprueba si la palabra es válida.
		seleccionarPalabra();
		while (intento < 5) {
			String intentoAc = introducirPalabra();
			if (intentoAc.length() !=5) {
				System.out.println("La palabra debe tener 5 letras");
				continue;
			}
			comprobarPalabra(intentoAc);
			mostrarTabla();
			if (intentoAc.equals(palabraBuscada)) {
				System.out.println("¡Felicidades, has ganado!");
				return;
			}
			intento++;
			}
		System.out.println("Has perdido. La palabra es: " + palabraBuscada);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		comprobarJuego();
	}
}
