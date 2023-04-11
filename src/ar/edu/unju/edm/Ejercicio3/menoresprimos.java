package ar.edu.unju.edm.Ejercicio3;

public class menoresprimos {
    
    public static void main(String[] args){
    int n=30;
    
    for(int i=n-1; i>1; i--){
        if (esPrimo(i)){
            System.out.println(i);
        }
        else
        System.out.print("");
    }
}


public static boolean esPrimo(int i)
	{
		// Verificamos si es multiplo de 2
        if(i==2) return true;

		else if(i % 2 == 0) return false;

		// Recorremos todos los numeros impares
		for(int j = 3; j*j <= i; j+=2){
			if(i % j == 0) return false;
		}

		return true;
	}
}