//OBI - Olimpíada Brasileira de Informática 2014 Fase 1 Nível Júnior


import java.io.IOException;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) throws IOException {
		
Scanner teclado=new Scanner (System.in);
		
int a=teclado.nextInt();
		
int b=teclado.nextInt();
	
	
	if (a==1 && b==0) {

System.out.println("B");
		
} else {
		
if ( a==0 && b==0) {
	System.out.println("C");
	
		} else {
		
	if (a==1 && b==1){

	System.out.println("A");

		} else {
	
	if (a==0 && b==1) {
	
		System.out.println("C");
			
		}

	}
	

		}

		
	
}
	
	}
}
