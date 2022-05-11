import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros [] = new int [8];
		//numeros[0]=(-12);		numeros[1]=(-8);		numeros[2]=(-2);		numeros[3]=(-14);
		//numeros[4]=(-32);		numeros[5]=(-34);	numeros[6]=(-82);	numeros[7]=(-26);
		
		int operacion =0;
		
		suma(numeros);
		pares(numeros);
		
		
	}
	
	
	public static int suma (int numeros[]) {
		
		int operacion=0;
		
		for (int i = 0; i < numeros.length; i++) {
			int num = numeros[i];
			if (num<0) {
				while (num<-10) {
					num += 10;
				}
				if (num==-2) {
					operacion += numeros[i];
					System.out.println(numeros[i]);
				}
			} else {
				if (num>0) {
					while (num>10) {
						num -= 10;
					}
					if (num==2) {
						operacion += numeros[i];
					}
				}
			}
			
			
		}
		System.out.println(operacion);
		return operacion;
		
	}
	
	
	public static int pares(int[] numeros) {
		int suma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			int num = numeros[i];
			if (num!=0) {
				if (num%2 == 0) {
					suma++;
				}
			} else {
				if (num==0) {
			
				}
			}
		}
		
		System.out.println("La cantidad de numeros que son pares son: " + suma);
		return suma;
	}


	
	
}
