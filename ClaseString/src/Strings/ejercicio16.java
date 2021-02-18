package Strings;

public class ejercicio16 {

	public static void main(String[] args) {
		
		
		String cadena = "eaifaenfiaefadwadedaedaedeafea";
		String nuevaCadena ="";
		
		if(cadena.length()>20) {
			nuevaCadena = (String) cadena.subSequence(cadena.length()-20, cadena.length());
			System.out.println(nuevaCadena);
		} else {
			System.out.println("La cadena es demasiado corta");
		}

	}

}
