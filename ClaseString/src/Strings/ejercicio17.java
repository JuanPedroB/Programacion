package Strings;

public class ejercicio17 {

	public static void main(String[] args) {
		
		String cadena = "eaifaenfiaefafeoafaoeifaeiofaefna";
		String nuevaCadena ="";
		
		nuevaCadena = (String) cadena.substring(cadena.length()-20, cadena.length());
		System.out.println(nuevaCadena);

	}

}
