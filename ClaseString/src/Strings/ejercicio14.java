package Strings;

public class ejercicio14 {

	public static void main(String[] args) {
		
		String cadena = "abcdeifajafjeanfkjaefkjafaef";
		String nuevaCadena = "";
		
		nuevaCadena = (String) cadena.subSequence(0, 20);
		System.out.println(nuevaCadena);

	}

}
