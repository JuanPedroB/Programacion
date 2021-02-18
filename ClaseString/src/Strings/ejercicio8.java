package Strings;

public class ejercicio8 {

	public static void main(String[] args) {
		
		String cadena = "hola buenos dias";
		String letra = "o";
		
		int posicion = cadena.lastIndexOf(letra);
		
		while(posicion !=-1) {
			System.out.println(posicion);
			posicion = cadena.lastIndexOf(letra, posicion-1);
		}

	}

}
