import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Ejercicio3Test {
		
	static Ejercicio3 tester;
	
	@BeforeAll
	static void testBefore() {
		tester = new Ejercicio3();
	}
	
	@Test
	void testSumaVacio() {
		
		int numeros [] = new int [8];
		
		//Ejercicio3 tester = new Ejercicio3();
		assertEquals("la suma es 0", 0, tester.suma(numeros));
		
	}
	
	@Test
	void testSumaNum2() {
		
		int numeros [] = new int [8];
		numeros[0]=(12);		numeros[1]=(8);		numeros[2]=(2);		numeros[3]=(14);
		numeros[4]=(32);		numeros[5]=(34);	numeros[6]=(82);	numeros[7]=(26);
		
		
		assertEquals("la suma es 128", 128, tester.suma(numeros));

		
	}
	
	@Test
	void testSumaNumNo2() {
		
		int numeros [] = new int [8];
		numeros[0]=(10);		numeros[1]=(8);		numeros[2]=(7);		numeros[3]=(14);
		numeros[4]=(34);		numeros[5]=(34);	numeros[6]=(86);	numeros[7]=(26);
		
		
		assertEquals("la suma es 0", 0, tester.suma(numeros));
		
	}
	
	@Test
	void testSumanegativos() {
		
		int numeros [] = new int [8];
		numeros[0]=(-12);		numeros[1]=(-8);		numeros[2]=(-2);		numeros[3]=(-14);
		numeros[4]=(-32);		numeros[5]=(-34);		numeros[6]=(-82);		numeros[7]=(-26);
		
		
		assertEquals("la suma es -128", -128, tester.suma(numeros));
		
	}
	
	
	//CALCULAR PARES
	@Test
	void testparesVacio() {
		
		int numeros [] = new int [0];
		

		assertEquals("la suma es 0", 0, tester.pares(numeros));
		
	}
	
	@Test
	void testpares() {
		
		int numeros [] = new int [8];
		numeros[0]=(12);		numeros[1]=(5);		numeros[2]=(2);		numeros[3]=(14);
		numeros[4]=(37);		numeros[5]=(34);		numeros[6]=(31);		numeros[7]=(26);
		
		
		assertEquals("Los numeros pares son 5", 5, tester.pares(numeros));
		
	}
	
	@Test
	void testNoPares() {
		
		int numeros [] = new int [8];
		numeros[0]=(17);		numeros[1]=(7);		numeros[2]=(3);		numeros[3]=(15);
		numeros[4]=(31);		numeros[5]=(35);		numeros[6]=(89);		numeros[7]=(21);
		
		
		assertEquals("Los numeros pares son 0", 0, tester.pares(numeros));
		
	}
	
	@Test
	void testparesNegativos() {
		
		int numeros [] = new int [8];
		numeros[0]=(-12);		numeros[1]=(-5);		numeros[2]=(-3);		numeros[3]=(-14);
		numeros[4]=(-37);		numeros[5]=(-34);		numeros[6]=(-82);		numeros[7]=(-23);
		
		
		assertEquals("Los numeros pares son 4", 4, tester.pares(numeros));
		
	}
	
	@Test
	void testNoParesNegativos() {
		
		int numeros [] = new int [8];
		numeros[0]=(-17);		numeros[1]=(-7);		numeros[2]=(-3);		numeros[3]=(-15);
		numeros[4]=(-31);		numeros[5]=(-35);		numeros[6]=(-89);		numeros[7]=(-21);
		
		
		assertEquals("Los numeros pares son 0", 0, tester.pares(numeros));
		
	}
	
	
	
	
}
