package Strings;

public class ejercicio15 {

	public static void main(String[] args) {
		
		String cadena = "eaifaenfiaefafeoafaoeifaeiofaefna";
		
		CharSequence nuevaCadena = cadena.subSequence(cadena.length()-20, cadena.length());
		System.out.println(nuevaCadena);
	}
}
