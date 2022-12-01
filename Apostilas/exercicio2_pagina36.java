package exercicios_pagina36while;

import java.util.Scanner;

public class exercicio2_pagina36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
	    double numero;
	   
	    System.out.println (" escreva o valor de um número: ");
	    numero = leitura.nextDouble();
	    if (numero==0) {
	    	System.out.println ( "número neutro! ");
	    }else if (numero>0) {
	    	System.out.println (" número positivo! ");
	    }else {
	    	System.out.println (" número negativo! ");
	    }
	    
	    leitura.close();

	}

}
