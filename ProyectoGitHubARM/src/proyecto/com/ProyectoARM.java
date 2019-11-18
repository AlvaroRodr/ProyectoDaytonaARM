package proyecto.com;

public class ProyectoARM {

	public static String veredicto(String v1, String v2 ) {		
		if (v1.equals(v2)) {
		    return "Perfecto. Has tenido buen criterio.";
		}
		if (Integer.valueOf(v1) < Integer.valueOf(v2)){
		    return "Has mejorado, o te ha llegado el éxito inesperado.";
		}
		return "Te has confiado. Falta realismo.";
	}
	
	public static void main(String args[]) {
		
		System.out.println("La calificación de " + args[0] + " : ");
		System.out.println(veredicto(args[2],args[1]));
	}
}
