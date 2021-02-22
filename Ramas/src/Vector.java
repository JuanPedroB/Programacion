import java.util.Random;

public class Vector {

	public static void main(String[] args) {
		
		int [] lista = new int[10];
		int media, suma = 0;
		
		for (int i = 0; i < lista.length; i++) {
			int aleatorio = (int) (Math.random()*35000+0);
			System.out.println(aleatorio);
			suma = suma+aleatorio;
		}
		media= suma/lista.length;
	}
	
}
