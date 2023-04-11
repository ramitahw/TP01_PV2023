package ar.edu.unju.edm.Ejercicio1;

public class añobisiesto {

	public static void main(String[] args) {
	
		int año = 2020;
		
		if(año < 0){
			System.out.println("No lo sé ):");
			} else { 
				if((año%4)== 0){
					System.out.println("El año es bisiesto");
				} else {
					System.out.println("El año no es bisiesto");
				}
			}
		
	}

}