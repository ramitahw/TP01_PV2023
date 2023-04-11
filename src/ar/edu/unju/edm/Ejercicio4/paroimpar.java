package ar.edu.unju.edm.Ejercicio4;

public class paroimpar {
    public static void main(String[] args){
        
        int limInf=1, limSup=10;
        String modo="IMPAR";

            if(modo=="PAR"){
                for(int i=limInf; i<=limSup; i++){
                    if(i%2==0) System.out.println(i);
                }
            }
            else{
                for(int i=limInf; i<=limSup; i++){
                    if(i%2!=0) System.out.println(i);
                }
            }
}
}
