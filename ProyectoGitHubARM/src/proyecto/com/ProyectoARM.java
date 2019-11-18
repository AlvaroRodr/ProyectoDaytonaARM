package proyecto.com;
/*@author: Álvaro Rodríguez Martínez 
 *@version: 1.0
*/
public class ProyectoARM {

	private static String veredicto(String v1, String v2 ) {//Al hacer el llamado del método se le deben pasar dos parámetros para su funcionamiento	
		if (v1.equals(v2)) { //Se comparan los parámetros pasados, los cuales han sido agregados a las variables v1 y v2, de forma que si son iguales devuelva esa cadena
		    return "Perfecto. Has tenido buen criterio.";
		}
		if (Integer.valueOf(v1) < Integer.valueOf(v2)){//Se comparan los parámetros pasados, los cuales son convertidos a enteros, de forma que si v1 es menor que v2 se devolverá esa cadena
		    return "Has mejorado, o te ha llegado el éxito inesperado.";
		}
		return "Te has confiado. Falta realismo."; //Si no funciona ninguno de los anteriores algoritmos lógicos, devuelve esta cadena
	}
	
	public static void main(String args[]) {
		
		System.out.println("La calificación de " + args[0] + " : ");
		System.out.println(veredicto(args[2],args[1]));
	}
}
