package gen.Exercise08;

import java.util.Random;
import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		float res;
		Scanner sc = new Scanner(System.in);
		
	/*	System.out.print("Ingresa el primer numero: ");
		num1 = sc.nextInt();
		System.out.print("Ingresa el segundo numero: ");
		num2 = sc.nextInt();
		System.out.print("Ingresa el segundo numero: ");
		num3 = sc.nextInt();
		System.out.println("Los numeros son: " +num1 +" " +num2 +" " + num3); 
		
		//suma
		res =num1+num2+num3;
		System.out.println("La suma es: " +res);
		
		//media aritmetica
		res = res/3;
		System.out.println("La media aritmetica es: " +res);
		
		//mayor
		if((num3>num1 ) && (num3>num2))
			System.out.println("El numero mayor es: " +num3);
		//menor  ;./<<<<<ç
		if( (num1<num2) && (num1<num3) ) {
			System.out.println("El numero menor es: " +num1);
		}else if( (num2>num1) && (num2<num3) ) {
			System.out.println("la media es: " +num2);
		}
		*/
		
		//matriz transpuesta
		Random r = new Random();
	//	System.out.println(r.nextInt(101));
		int mat1[][] = new int [5][9];
		int mat2[][] = new int[9][5];
		int i;
		int j;
		
		
		
		for(i=0; i<5; i++) {
			for(j=0; j<9; j++) {
				mat1[i][j] = (int)(Math.random()*(100-50))+50;
			}
		}
		for(i=0; i<5; i++) {
			for(j=0; j<9; j++) {
				mat2[j][i] = mat1[i][j];	
			}
		}
		for(i=0; i<5; i++) {
			for(j=0; j<9; j++) {
				System.out.print(mat1[i][j] +" ");
			}
			System.out.println("");
		}
		for(i=0; i<9; i++) {
			for(j=0; j<5; j++) {
				System.out.print(mat2[i][j] +" ");
			}
			System.out.println("");
		}
		
		
	}

}
