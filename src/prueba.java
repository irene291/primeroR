import java.util.*;
public class prueba {

	public static void main(String[] args) {
		
		
		int numeros [] = new int [8];
		numeros[0]=(13);		numeros[1]=(23);		numeros[2]=(18);		numeros[3]=(10);
		numeros[4]=(2);			numeros[5]=(34);		numeros[6]=(62);		numeros[7]=(3);
		
		
		suma(numeros);

		
		
	}
	
	
	public static int suma (int numeros[]) {
		
		int operacion=0;
		
		for (int i = 0; i < numeros.length; i++) {
			int num = numeros[i];
			if (num<0) {
				while (num<-10) {
					num += 10;
				}
				if (num==-3) {
					operacion += numeros[i];
					System.out.println(numeros[i]);
				}
			} else {
				if (num>0) {
					while (num>10) {
						num -= 10;
					}
					if (num==3) {
						operacion += numeros[i];
					}
				}
			}
			
			
		}
		System.out.println(operacion);
		return operacion;
		
	}
	

}





