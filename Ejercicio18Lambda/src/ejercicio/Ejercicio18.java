package ejercicio;

import java.util.Scanner;


interface primo{
	public Runnable comprobarPrimo(Integer i);
}


public class Ejercicio18 {


	public static void main(String[] args) {
		
		primo p = num -> {
			boolean primo = true;
			for(int i =2; i<num; i++) {
				if(num%i==0) {
					primo = false;
					break;
				}
			}if(primo) {
				System.out.println("Es primo");
			}else {
				System.out.println("No es primo");
			}
			return null;
		};
		
		
		Scanner sc = new Scanner(System.in);
		int numero1;
		System.out.println("Introduce un n�mero para saber si es primo: ");
		numero1 =sc.nextInt();
		Thread t1 = new Thread(p.comprobarPrimo(numero1));
		t1.start();
		
		
		int numero2;
		System.out.println("Introduce un n�mero para saber si es primo: ");
		numero2 =sc.nextInt();
		Thread t2 = new Thread(p.comprobarPrimo(numero2));
		t2.start();
		
		int numero3;
		System.out.println("Introduce un n�mero para saber si es primo: ");
		numero3 =sc.nextInt();
		Thread t3 = new Thread(p.comprobarPrimo(numero3));
		t3.start();
		

	}

}
