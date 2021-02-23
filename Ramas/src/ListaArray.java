
import java.util.ArrayList;

public class ListaArray {


	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		for (int i = 0; i < lista.size(); i++) {
			int aleatorio = (int) (Math.random()*35000+0);
			lista.add(aleatorio);
			
		}

	}

}
