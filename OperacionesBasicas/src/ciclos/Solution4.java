package ciclos;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		
//		Solicitar 5 números enteros y mostrar únicamente los números pares desde
	//	el 2 hasta el valor del promedio.
		
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		 
		int promedio=0;
		
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese numero 1");
		num1=entrada.nextInt();
		
		System.out.println("Ingrese numero 1");
		num1=entrada.nextInt();
		
		System.out.println("Ingrese numero 2");
		num2=entrada.nextInt();
		
		System.out.println("Ingrese numero 3");
		num3=entrada.nextInt();
		
		System.out.println("Ingrese numero 4");
		num4=entrada.nextInt();
		
		System.out.println("Ingrese numero 5");
		num5=entrada.nextInt();
		
		promedio=(num1+num2+num3+num4+num5)/5;
		
		System.out.println("El promedio es " + promedio);
		
		
		for(int i=2;i<=promedio;i+=2) {
			
			System.out.println(i);
			
		}
		
		
	
		
		
		
		

	}

}