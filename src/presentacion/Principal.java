package presentacion;
import logica.Hombre;
import logica.Mujer;
public class Principal {
	public Principal() {
		Hombre h;
		h = new Hombre(73, 154, 19);
		if(h.cumpleCondiciones()) {
			System.out.println("TMB hombre: " + h.calcularTMB());
		}
		else {
			System.out.println("El hombre no cumple las condiciones");
		}
		Mujer m;
		m = new Mujer(67, 141, 57);
		if(m.cumpleCondiciones()) {
			System.out.println("TMB mujer: " + m.calcularTMB());
		}
		else {
			System.out.println("La mujer no cumple las condiciones");
		}
	}
	public static void main(String[] args) {
		new Principal();
	}
}
